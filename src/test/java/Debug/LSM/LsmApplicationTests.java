package Debug.LSM;

import Debug.LSM.domain.Viewer;
import Debug.LSM.repository.postgrerepository.ViewerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LsmApplicationTests {


    private final ViewerRepository viewerRepository;

    @Autowired
    public LsmApplicationTests(ViewerRepository viewerRepository) {
        this.viewerRepository = viewerRepository;
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void newViewertest() {
        for (int i = 0; i < 10; i++) {
            Viewer testViewer = new Viewer();
            testViewer.setId("testViewer" + i);
            testViewer.setPw("testPWD" + i);
            testViewer.setSex(true);
            testViewer.setName("testUser" + i);
            testViewer.setBirth("testBirth" + i);
            testViewer.setEmail("testEmail" + i + "@test.com");
            viewerRepository.save(testViewer);
        }
    }



}

package Debug.LSM.domain;

import Debug.LSM.DTO.TopicDTO;
import lombok.*;
import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "BroadCast")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BroadCast {
    @Id
    //BCID
    private String _id;
    private String URI;
    private String Title;
    private String ThumbnailsUrl;
    private String ActualStartTime;
    private String ActualEndTime;
    private Integer HighViewer;
    private Integer LowViewer;

    public int[] All_Emotion3 = new int[3];

    public int[] All_Emotion7 = new int[7];
    private String published;

    public JSONObject Viewer = new JSONObject();


    private TopicDTO topic = null;

    @DBRef
    private User user;
}

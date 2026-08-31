# My Broadcast Partner · Spring API

YouTube, CHZZK, SOOP 방송 데이터를 하나의 서비스에서 다루기 위한 백엔드 API입니다. 방송 채팅과 시청자 데이터를 수집하고, 분석 서버와 연동해 방송 피드백을 제공합니다.

## 주요 기능

- JWT 기반 사용자·시청자 인증과 토큰 재발급
- 방송 URL 분석 및 플랫폼별 방송 식별자 관리
- 실시간 채팅과 시청자 수 저장
- 채팅 피드백과 주요 주제 조회
- 방송별 블랙리스트 등록·해제·조회
- 구매 내역과 마이페이지 데이터 관리
- Flask 분석 서버 및 YouTube API 연동

## 서비스 구성

```text
Broadcast Client
       │
       ▼
Spring Boot API ───── Flask Analysis API
       │
       ├───────────── MongoDB
       └───────────── PostgreSQL
```

## 기술 스택

| 영역 | 기술 |
| --- | --- |
| Backend | Java 17, Spring Boot 3.2, Spring Security |
| Data | Spring Data MongoDB, Spring Data JPA, PostgreSQL |
| Auth & API | JWT, Bean Validation, Swagger/OpenAPI |
| Deployment | GitHub Actions, AWS S3, CodeDeploy, EC2 |

## 실행 방법

1. `src/main/resources/application.properties`에 MongoDB, PostgreSQL, JWT, YouTube API, Flask 서버 연결 정보를 설정합니다.
2. 아래 명령으로 서버를 실행합니다.

```bash
./gradlew bootRun
```

Swagger UI는 실행 환경의 `/swagger-ui/index.html`에서 확인할 수 있습니다.

## 연관 저장소

- [Flask 분석 서버](https://github.com/IMjaeyongpark/MyBroadcastPartner-Flask)
- [프로젝트 문서](https://github.com/IMjaeyongpark/MyBroadcastPartner-Docs)

> 설정 파일과 API 키는 GitHub Actions Secrets 또는 별도의 로컬 설정으로 관리합니다.

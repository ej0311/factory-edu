# factory 예제


# Table of contents

- [사용 SW](#사용-SW)
  - [설치가이드](#설치가이드)
- [애플리케이션 샘플](#애플리케이션-샘플)
  - [마이크로서비스](#마이크로서비스)
  - [모놀리식](#모놀리식)


# 사용 SW
| SW 명 | 버전 | 설명 | 다운로드 URL |
|---|:---:|:---:|:---:|
|JDK|11|자바 개발 도구 오픈소스|https://adoptopenjdk.net/|
| STS | 4.9.0 | 이클립스 기반 스프링 애플리케이션 개발 도구 | https://spring.io/tools |
| Lombok | 1.18.18 | 자바 코드 경량화 라이브러리 | http://projectlombok.org/download.html |

## 설치가이드
- JDK
  - 설치확인 : java -version
- STS
  - 설치 명령어 : $ java –jar [다운받은 jar 파일]
  - workspace 설정 : ~₩factory₩workspace
- Lombok
  - 설치 명령어 : $ java –jar lombok.jar
  - 설치확인 : STS 설치 폴더 내 Lombok 라이브러리 확인

# 애플리케이션 샘플
## 마이크로서비스
- 소스
  - https://github.com/ej0311/factory-edu-microservices
- Key Concept</p>
  ![factory_keyconcept](https://user-images.githubusercontent.com/62231786/113655776-687aa280-96d5-11eb-9847-e72e21c0ee8a.png)
- Domain Model</p>
  ![factory_domain_model](https://user-images.githubusercontent.com/62231786/113655774-67497580-96d5-11eb-81b5-593f7a23d18e.png)

## 모놀리식
- 소스
  - https://github.com/ej0311/factory-edu-monolithic
- ERD</p>
  ![factory_erd](https://user-images.githubusercontent.com/62231786/113655775-687aa280-96d5-11eb-9439-293685fbc2a6.png)


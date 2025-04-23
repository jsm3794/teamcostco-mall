📦 프로젝트 소개

Spring Boot와 Thymeleaf 기반의 서버 사이드 렌더링(e-commerce) 쇼핑몰 플랫폼입니다. 고객은 상품을 검색・조회하고, 장바구니에 담아 주문 및 결제 과정을 진행할 수 있습니다. 로그인・회원 관리 기능과 주문 내역 조회, 배송 조회를 제공하며, WebSocket을 통한 실시간 재고・주문 상태 알림을 지원합니다.

물류 처리는 별도 물류 창고 시스템(팀코스트코 물류 창)에서 관리됩니다. 이 저장소는 고객 인터페이스(웹 애플리케이션)만을 포함합니다.

✨ 주요 기능

회원 관리: 회원 가입, 로그인/로그아웃, 프로필 관리

상품 탐색: 카테고리별 및 키워드 검색, 상품 목록/상세 조회

장바구니: 상품 담기, 수량 변경, 삭제

주문/결제: 주문 생성, 결제 처리 (외부 PG 연동)

주문 내역: 과거 주문 조회, 상세 정보 확인

배송 조회: 운송장 번호 입력 후 배송 상태 확인

실시간 알림: WebSocket을 이용한 재고 및 주문 상태 업데이트

관리자 페이지 (별도 구현 예정): 상품 등록/수정/삭제, 주문/배송 관리

🗂️ 프로젝트 구조

├─ .mvn/               # Maven Wrapper
├─ mvnw, mvnw.cmd      # 빌드 스크립트
├─ pom.xml             # Maven 설정
├─ src/main/java       # 애플리케이션 소스 코드
│   └─ com.ezentwix.teamcostco
│       ├─ controller  # 요청 처리 컨트롤러
│       ├─ service     # 비즈니스 로직
│       └─ mapper      # MyBatis 매퍼 인터페이스
├─ src/main/resources
│   ├─ static/         # CSS, JS, 이미지 등 정적 리소스
│   ├─ templates/      # Thymeleaf 뷰 템플릿
│   ├─ mapper/         # MyBatis XML 매퍼
│   └─ logback-spring.xml, log4jdbc.log4j2.properties 등 설정
└─ src/test/java       # 테스트 코드

🛠️ 기술 스택

언어: Java 17

프레임워크: Spring Boot 3.3.3, Spring Web, Spring WebFlux, Spring Data JDBC

템플릿 엔진: Thymeleaf

데이터베이스: Oracle (ojdbc11), MyBatis

실시간 통신: Spring WebSocket

로깅: log4jdbc-log4j2, Logback

매핑: ModelMapper

메시징: Google Cloud Pub/Sub

직렬화: Jackson (databind, jsr310)

클라우드: AWS (배포, S3, RDS), Spring Cloud AWS

⚙️ 설치 및 실행 방법

레포지토리 클론

git clone https://github.com/jsm3794/teamcostco-mall.git
cd teamcostco-mall/teamcostco

데이터베이스 설정

src/main/resources/application.properties 또는 application.yml에 Oracle 접속 정보 입력

빌드 및 실행

./mvnw clean package
java -jar target/teamcostco-0.0.1-SNAPSHOT.jar

접속

브라우저에서 http://localhost:8080 접속

📋 팀 구성

🧒 전상민 (팀장, 서버/템플릿 엔진)

🧒 김동우 (백엔드, DB 연동)

👧 황지영 (UI/UX 디자인)

📦 프로젝트 소개

Spring Boot와 Thymeleaf 기반의 쇼핑몰 플랫폼입니다.

고객은 상품을 검색,조회하고 장바구니에 담아 주문 및 결제 과정을 진행할 수 있습니다.

로그인, 회원 관리 기능, 주문 내역 조회 배송 조회를 제공합니다.

물류 처리는 별도 물류 창고 시스템(teamcostco-admin)에서 관리됩니다.

✨ 주요 기능

회원 관리: 회원 가입, 로그인/로그아웃, 프로필 관리

상품 탐색: 카테고리별 및 키워드 검색, 상품 목록/상세 조회

장바구니: 상품 담기, 수량 변경, 삭제

주문/결제: 주문 생성, 결제 처리 (외부 PG 연동)

주문 내역: 과거 주문 조회, 상세 정보 확인


🛠️ 기술 스택

언어: Java 17

프레임워크: Spring Boot, Spring Web, Spring WebFlux, Spring Data JDBC

템플릿 엔진: Thymeleaf

데이터베이스: Oracle (ojdbc11), MyBatis

로깅: log4jdbc-log4j2, Logback

매핑: ModelMapper

클라우드: AWS (배포, S3, RDS), Spring Cloud AWS

📋 팀 구성

🧒 전상민 (팀장)

🧒 김동우

👧 황지영

package main.java.이론;

/*
    === JDBC VS JPA VS MyBatis ===
    : Java(Spring Boot)에서 DB와 연동하기 위한 방법

    1) JDBC (JDBC API 기반)
       : Java에서 DB에 접근할 수 있도록 표준으로 제공하는 API
       - SQL문을 문자열로 작성
         >> Connection, PreparedStatement, ResultSet 등의 객체를 통해 직접 DB와 통신

       cf) Spring JDBC
           >> 기본의 JDBC을 간소화하는 스프링 JDBC 추상화 라이브러리 (스프링 제공)

    2) JPA (ORM, Object Relational Mapping 기반)
       : Java Persistenc API
       : 자바 객체와 DB 테이블 간의 매핑을 지원하는 ORM 기술읜 표준
       : SQL을 직접 작성하지 않고도, 자바 코드만으로 DB 연공동 가능

       장점) SQL 작성이 거의 필요 X, '객체 중심의 개발 기능', 유지보수가 쉽고 비즈닉스 로직에 집중 가능
       단점) 성능 튜닝 어려움 (Hiberanate의 동작 이해 필요), 복잡한 코드 작성 시 JPQL, QueryDSL 사용 필

    3) MyBatis (SQL Mapper 기반)
    : SQL을 XML 또는 어노테이션으로 관리할 수 있는 SQLMapper프레임워크
    - JDBC 처럼 SQL을 직접 작성하지만, 객체 매핑을 도와줌

     장점) SQL 작성 자유도 높음, 복잡한 쿼리 작성에 유리
     단점) SQL과 자바 코드가 분리 >> 유지 보수가 어렵고 중복 가능성 존재, 코드량이 많음
 */

// Spring Boot 프로젝트에서 사용 방법
// 1. 기술 중심 설계, 유지보수가 변한 구조가 필요: JPA
// 2. 복잡한 JOIN, 서브쿼리가 많고 SQL 제어가 중요할 경우: Mybatis

public class DBConnection {

}

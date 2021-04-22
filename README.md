# 개인적으로 spring data jpa 테스트를 하는 곳입니다. 


GenerationType.AUTO는 DB에게 키 생성방식을 결정하게 함.
spring boot 1.5에서 2.0으로 되면서 그 키 생성방식이 바뀜.
mysql을 예로 들면 1.5는 autoincrement고 2.0은 table을 만들어 sequence처럼 사용함
이전 방식을 쓰고 싶다면, spring.jpa.properties.hibernate.id.new_generator_mappings: false로 사용하면 됨. (true를 권장함)
false를 쓰면 sequence값이 allocationSize만큼 건너뛰고 들어가는 버그가 있음.


entity마다 SequenceGenerator를 주도록 하고, allocationSize를 지정해주도록 함(default 50)
sequence방식에서 nextval의 성능최적화를 하고 싶으면 allocationSize를 주면 됨.
예를 들어 insert문이 50개라 nextval를 50번 해야할 때 allocationSize가 주어져 있으면 nextval을 1번만 호출해도 됨.


spring data jpa 기본 application.yml 설정

spring:
  datasource:
    driver-class-name: org.h2.Driver
    url: jdbc:h2:tcp://localhost/~/datajpatest
    username: sa
    password:
    
  jpa:
    hibernate:
      ddl-auto: create
    properties:
      hibernate:
        format_sql: true
        generate_statistics: true
        jdbc.batch_size: 10
        order_inserts: true
        id.new_generator_mappings: true

logging:
  level:
    org.hibernate.SQL: debug
    org.hibernate.type.descriptor.sql.BasicBinder: trace

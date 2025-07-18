# kafka-demo

Spring Boot + Kafka 간단 테스트 프로젝트

## 준비 사항
- Java 17 이상
- 로컬 또는 외부 Kafka 서버 (기본: localhost:9092)

## 실행 방법
1. 의존성 설치
   ```
   ./gradlew build
   ```
2. 애플리케이션 실행
   ```
   ./gradlew bootRun
   ```
3. 메시지 전송 테스트
   - 브라우저 또는 curl로 아래와 같이 호출
   ```
   curl "http://localhost:8080/send?message=hello-kafka"
   ```
   - Consumer 로그에서 메시지 수신 확인

## 주요 파일
- `KafkaProducerService.java`: 메시지 전송
- `KafkaConsumerService.java`: 메시지 수신
- `KafkaTestController.java`: REST API 테스트 엔드포인트 
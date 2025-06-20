# Java Monitoring App

## Features
- Spring Boot with Log4j2
- Prometheus metrics at `/actuator/prometheus`
- Access & error logs sent to Splunk HEC
- Ready for Grafana integration
- Endpoints for 2xx, 4xx, 5xx

## Run Locally
```bash
mvn clean package
java -jar target/java-monitoring-splunk.jar
```

Access metrics at: `http://localhost:8080/actuator/prometheus`

# Java Observability

```shell
cd docker-compose

docker-compose up -d

    # Loki status
http://localhost:3100/ready
# Prometheus
http://localhost:9090/graph
http://localhost:8080/actuator/prometheus


# Service
#200
curl http://localhost:8080/api/usecase/account?status=200
#500
http://localhost:8080/api/usecase/account?status=500


# Grafana
http://localhost:3000/
```
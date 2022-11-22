# Java Observability

```shell
cd docker-compose

docker-compose up -d

# Loki status
http://localhost:3100/ready
# Prometheus
http://localhost:9090/graph
http://localhost:8080/actuator/prometheus

# Grafana
http://localhost:3000/

# Import Dashboard docker-compose/Basic-Dashboard.json

# Service
#200
curl http://localhost:8080/api/usecase/account?status=200
#500
http://localhost:8080/api/usecase/account?status=500
#Latency
http://localhost:8080/api/usecase/latency?delay=0
http://localhost:8080/api/usecase/latency?delay=error
```
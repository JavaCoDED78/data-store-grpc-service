# Data store gRPC microservice


This application receives data
from [Data analyser service](https://github.com/JavaCoDED78/data-analyser-grpc-service)
with gRPC.

### Usage

To start an application you need to pass variables to `.env` file.

You can use example `.env.example` file with some predefined environments.

You can find Docker compose file
in [Data analyser gRPC service](https://github.com/JavaCoDED78/data-analyser-grpc-service) `docker/docker-compose.yaml`.

Application is running on port `8083`.

All insignificant features (checkstyle, build check, dto validation) are not
presented.

Just after startup application will try to connect to gRPC server and begin to
fetch batch updates of `BATCH_SIZE` every 10s.

Application has the following endpoint:
* GET `/api/v1//analytics/summary/{sensorId}`
#### Example JSON
```json
{
  "sensorId": 3,
  "values": {
    "TEMPERATURE": [
      {
        "type": "SUM",
        "value": 196.47341243456194,
        "counter": 11
      },
      {
        "type": "AVG",
        "value": 17.861219312232905,
        "counter": 11
      },
      {
        "type": "MAX",
        "value": 19.72574748697943,
        "counter": 11
      },
      {
        "type": "MIN",
        "value": 15.58884202291292,
        "counter": 11
      }
    ]
  }
}
# 05-practice-hystrix-turbine-kafka-dashboard
spring cloud hystrix turbine dashboard kafka

# Step1: start hystrix dashboard server
- this is only run by itself. Just a UI display page to see the result. 
# Step2: start turbine server
- this is used to collect all the metrics from kafka. Kafka binder should be used or rabbmit binder
# Step3: enable microservice hystrix collector
- add spring-cloud-netflix-hystrix-stream, spring-cloud-starter-stream-*, see hello1 and hello2
- this will automatically send the informations into turbine server.

# Step4: copy turbine server's url into hystrix dashboard so that we can see the result

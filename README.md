# 05-practice-hystrix-turbine-kafka-dashboard
spring cloud hystrix turbine dashboard kafka

# Step1: start hystrix dashboard server
- this is only run by itself. Just a UI display page to see the result. 
# Step2: start turbine server
- this is used to collect all the metrics from kafka. Kafka binder should be used or rabbmit binder
# Step3: enable microservice hystrix collector
- add spring-cloud-netflix-hystrix-stream, spring-cloud-starter-stream-*, see hello1 and hello2
- this will automatically send the informations into turbine server which is collected by kafka.

# Test1:
- Object: To see if single hystrix is working.
- 1. open http://localhost:8022 you can see hystrix dashboard there
- 2. put http://localhost:9090/hystrix.stream into the input field and click monitor
![avatar](05-practice-hystrix-turbine-kafka-dashboard/1-single-input.png)
- 3. click again and again http://localhost:9090/hello1(
- 4. see result from dashboard. you can see the single result of a micro service.

# Test2: 
- Object: to see if aggregate is working for turbine
- copy turbine server's url into hystrix dashboard so that we can see the result

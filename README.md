

# Spring cloud:Service-Discovery-Eureka
1. Clone or download zipped bundle from github repository.

   *https://github.com/DevOpsChandraSekhar/Spring-Cloud-Service-Discovery-Eureka.git

2. Create spring boot project & start Eureka Server if you need help how to start Eureka visit below URL.
   *https://csrklive.blogspot.com/2021/01/spring-cloud-eureka.html

3. Create employee service project & if you need help follow instructions with beow url. 
   *https://csrklive.blogspot.com/2021/01/end-service-setup-employee-service.html 
    
    <!-- Add Web and  Eureka Discovery dependencies -->

        <dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>
	</dependencies>
	
4. Again create one more service called client-service with the same dependencies.
   *https://csrklive.blogspot.com/2021/01/client-service-setup-spring-cloud-part3.html 

5. Now start EnableEureka first then employee and finally client service to run and call endpoint. 
   *http://localhost8050/clientService 

6. That's it & you will see the employee details in json response. 
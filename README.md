# RestServices
Collection of services exposed through a REST API

## Prerequisites
JDK8+ and Maven 3.5+

## How to install/run
Very simple, Just follow the steps below and you will have a set of REST Api's up and running!!!

Clone the project
```
git clone https://github.com/nu1silva/RestServices.git
```
Go into the RestServices directory and just hit
```
mvn clean jetty:run
```

## Services Available
### User Management Service
A basic CRUD operation supported API for a user management service.

WARNING: The database is an in-memmory store and may fillup the memmory if misused.

```
[OPTIONS] Available options: "curl -v -X OPTIONS http://localhost:8080/RESTservice/rest/user"
[POST] Create a user: "http://localhost:8080/RESTservice/rest/user/add"
[GET] Search for user: "http://localhost:8080/RESTservice/rest/user/search/{user_id}"
[PUT] Update a user: "http://localhost:8080/RESTservice/rest/user/update"
[DELETE] Delete a user: "http://localhost:8080/RESTservice/rest/user/delete/{user_id}"
```
 
### HTTP Status Service
HTTP response code verification service. Based on the input value it will reply with the status code.

eg:

http://localhost:8080/RESTservice/rest/status/{status_code} 

``` 
http://localhost:8080/RESTservice/rest/status/200 
http://localhost:8080/RESTservice/rest/status/201 
http://localhost:8080/RESTservice/rest/status/500 
```

### Delayed Response Service
A service which will delay the response as per the given value in milliseconds.

eg:

http://localhost:8080/RESTservice/rest/delay/{delay time in miliseconds} 
```
http://localhost:8080/RESTservice/rest/delay/1000 
http://localhost:8080/RESTservice/rest/delay/2000 
http://localhost:8080/RESTservice/rest/delay/4522 
```

### Random Password Generation Service
Random password generation service. Ideal for getting different responses for each request
```
http://localhost:8080/RESTservice/rest/password/generate 
```

### Echo Service
An Echo service that will echo the payload that is sent to the endpoint 

eg: 
```
curl -v -X POST -d '{"message":"Hello World"}' http://localhost:8080/MessageReceiver/echo/message
```
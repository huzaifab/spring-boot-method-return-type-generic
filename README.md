# spring-boot-method-return-type-generic

Requirements
- Java 1.8
- Maven (latest version is good)


How to compile?
- >PATH-TO-PROJECT mvn clean install
- >java -jar target\spring-boot-method-return-type-generic-0.1.0.jar

provide port no using command line while running
- >java -jar target\spring-boot-method-return-type-generic-0.1.0.jar --server.port=8080

How to run?
- from Browser or using Postman Client request(GET) url http://localhost:8080/generic/1
- it will show output as :
  {
    "name": "Train",
    "cars": 8,
    "seats": 42
  }

- GET request url http://localhost:8080/generic/4
- it will show output as :
  [
    {
        "name": "Bus 1",
        "busNum": 125,
        "seats": 36,
        "color": "White"
    },
    {
        "name": "Bus 2",
        "busNum": 254,
        "seats": 36,
        "color": "Black"
    },
    {
        "name": "Bus 3",
        "busNum": 845,
        "seats": 36,
        "color": "Red"
    },
    {
        "name": "Bus 4",
        "busNum": 569,
        "seats": 36,
        "color": "Green"
    }
  ]  

Try with generic/1 till 8 and you will see each id returns a unique different object as response 
 
you are all set
-



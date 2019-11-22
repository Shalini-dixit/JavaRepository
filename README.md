# JavaRepository

This is a Word Processor Api. It consist of 2 Microservices - API Gateway & word count service.


Implemented Api Gateway for multiple microservices using Netflix zuul Proxy which is basically jvm side router & server side Load Balancer ie we have multiple micro services & based on URL pattern, the 
request will go to corrosponding MicroService.It is up on port 8080.

Word count Service is used to count total no of repetetions of all the words in a input String & then sorting these words based on their Occurrences according to sort order.If Sort Order is garbage
value then natural ordering is used ie Ascending order.This service is case Insensitive.HashMap is used for counting purpose & TreeMap alongwith Comparator is used for ordering purpose.It is up on
8081.



http://localhost:8080/wordcount-api/getWordCount/Hej & välkommen till qopla. Vi på QOPLA erbjuder kassalösningar. Hej då/desc

When this Request with /wordcount-api/ url-pattern hit api gateway(8080), it redirects it to wordcount-api Microservice running on 8081 port.

return following result


{"qopla":2,"hej":2,"välkommen":1,"vi":1,"till":1,"på":1,"kassalösningar":1,"erbjuder":1,"då":1,"&":1}

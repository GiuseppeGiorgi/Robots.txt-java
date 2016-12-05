## Robots.txt-java
Robots è un progetto java open source che permette a un crawler web di sapere se una URL è scansionabile 

## Start
Per usare il robots bisogna creare un istanza di RobotClient e come parametri bisogna inserire lo userAgent di cui si vuole controllare le regole es "Googlebot" e la url in cui si trova il file Robots.txt

```java
    /*
    * esempio:
    * user-agent = Googlebot
    * url = http://www.example.com/robots.txt
    */
    RobotClient Robots = new RobotClient(user-agent, url);
    
```



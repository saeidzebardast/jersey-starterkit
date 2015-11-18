# Jersey Starter Kit
Simple RESTful web service using Jersey 2.x and gradle


## Usage
Run Jersey using gradle _jettyRun_ task:
```
$ gradle jettyRun
```

### GET
```
$ curl -i http://127.0.0.1:8080/hello
```

### POST
```
$ curl -d "My Friend" -H "Content-Type: text/plain"  http://127.0.0.1:8080/hello
```

## License
MIT © [Saeid Zebardast](http://zebardast.com)
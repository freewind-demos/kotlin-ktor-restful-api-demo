```
$ http http://localhost:8080/users
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 10
Content-Type: text/plain; charset=UTF-8

get /users
```

```
http POST http://localhost:8080/users
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 11
Content-Type: text/plain; charset=UTF-8

post /users
```

```
$ http http://localhost:8080/users/111
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 14
Content-Type: text/plain; charset=UTF-8

get /users/111
```

```
$
http POST http://localhost:8080/users/111
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 15
Content-Type: text/plain; charset=UTF-8

post /users/111
```

```
http PUT http://localhost:8080/users/111
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 14
Content-Type: text/plain; charset=UTF-8

put /users/111
```

```
$ http DELETE http://localhost:8080/users/111
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 17
Content-Type: text/plain; charset=UTF-8

delete /users/111
```

```
http CUSTOM http://localhost:8080/users/111
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 17
Content-Type: text/plain; charset=UTF-8

CUSTOM /users/111
```
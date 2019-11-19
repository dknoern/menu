## Run service

```
./gradlew bootRun
```

## Create some items:

```
curl localhost:8080/items -X POST -H "Content-Type: application/json" -d '{"name":"Hamburger"}'
curl localhost:8080/items -X POST -H "Content-Type: application/json" -d '{"name":"Coke"}'
curl localhost:8080/items -X POST -H "Content-Type: application/json" -d '{"name":"Fries"}'
```

## Get items

```
curl localhost:8080/items
```

# ktj
kotlin ex handling

Provides human readable error message

Request:

```
curl -X POST \
  http://localhost:8080/books/add \
  -H 'Accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "author": {
    "firstName": null
  }
}'
```


Response: 
```
{"error":"WRONG_JSON","message":"Attribute \"author.firstName\" must not be null"}
```

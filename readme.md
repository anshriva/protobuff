# Protobuf
It is an encoding and decoding format by google. 

Example: 
#### Data in json: 

```json
[
  {
    "id": 1,
    "name": "Anubhav"
  },
  {
    "id": 2,
    "name": "Arun"
  }
]
```

#### Data in protobuf: 

``
10 11 10 7 65 110 117 98 104 97 118
`` \
assuming 1 char = 1 byte, the data sent in protobuf is significantly less.

#### reason for small size data
The reason is that the schema is already available with client as well as server.\
Hence, all thing needed to sent is the data and delimiters. 



### To compile a proto file, run below command
```../protoc -I=../proto --java_out=main/java ../proto/Student.proto```


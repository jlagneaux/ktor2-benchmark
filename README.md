# Ktor benchmark

## Information

Simple project to compare the Ktor client engine performances.

**Benchmark:**

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/cio'

Lifting the server siege...
Transactions:		         176 hits
Availability:		      100.00 %
Elapsed time:		       60.21 secs
Data transferred:	        0.00 MB
Response time:		        0.15 secs
Transaction rate:	        2.92 trans/sec
Throughput:		        0.00 MB/sec
Concurrency:		        0.44
Successful transactions:         176
Failed transactions:	           0
Longest transaction:	        1.01
Shortest transaction:	        0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/apache'

Lifting the server siege...
Transactions:		         233 hits
Availability:		      100.00 %
Elapsed time:		       60.17 secs
Data transferred:	        0.00 MB
Response time:		        0.01 secs
Transaction rate:	        3.87 trans/sec
Throughput:		        0.00 MB/sec
Concurrency:		        0.04
Successful transactions:         233
Failed transactions:	           0
Longest transaction:	        0.37
Shortest transaction:	        0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/okhttp'

Lifting the server siege...
Transactions:		         219 hits
Availability:		      100.00 %
Elapsed time:		       60.52 secs
Data transferred:	        0.00 MB
Response time:		        0.02 secs
Transaction rate:	        3.62 trans/sec
Throughput:		        0.00 MB/sec
Concurrency:		        0.06
Successful transactions:         219
Failed transactions:	           0
Longest transaction:	        0.44
Shortest transaction:	        0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/java'

Lifting the server siege...
Transactions:		         239 hits
Availability:		      100.00 %
Elapsed time:		       60.97 secs
Data transferred:	        0.00 MB
Response time:		        0.01 secs
Transaction rate:	        3.92 trans/sec
Throughput:		        0.00 MB/sec
Concurrency:		        0.05
Successful transactions:         239
Failed transactions:	           0
Longest transaction:	        0.13
Shortest transaction:	        0.00

````


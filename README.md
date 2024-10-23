# Ktor benchmark

## Information

Simple project to compare the Ktor client engine performances.

### Benchmark:

**KTOR 2.2.3**

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

**KTOR 2.3.12**

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/cio'

Lifting the server siege...
Transactions:                    242 hits
Availability:                 100.00 %
Elapsed time:                  60.45 secs
Data transferred:               0.00 MB
Response time:                  0.01 secs
Transaction rate:               4.00 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    0.03
Successful transactions:         242
Failed transactions:               0
Longest transaction:            0.05
Shortest transaction:           0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/apache'

Lifting the server siege...
Transactions:                    255 hits
Availability:                 100.00 %
Elapsed time:                  60.20 secs
Data transferred:               0.00 MB
Response time:                  0.01 secs
Transaction rate:               4.24 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    0.04
Successful transactions:         255
Failed transactions:               0
Longest transaction:            0.48
Shortest transaction:           0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/okhttp'

Lifting the server siege...
Transactions:                    242 hits
Availability:                 100.00 %
Elapsed time:                  60.49 secs
Data transferred:               0.00 MB
Response time:                  0.00 secs
Transaction rate:               4.00 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    0.02
Successful transactions:         242
Failed transactions:               0
Longest transaction:            0.10
Shortest transaction:           0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/java'

Lifting the server siege...
Transactions:                    228 hits
Availability:                 100.00 %
Elapsed time:                  60.14 secs
Data transferred:               0.00 MB
Response time:                  0.01 secs
Transaction rate:               3.79 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    0.02
Successful transactions:         228
Failed transactions:               0
Longest transaction:            0.11
Shortest transaction:           0.00
```

**KTOR 3.0.0**

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/cio'
Transactions:                    245 hits
Availability:                 100.00 %
Elapsed time:                  60.91 secs
Data transferred:               0.00 MB
Response time:                  0.01 secs
Transaction rate:               4.02 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    0.04
Successful transactions:         245
Failed transactions:               0
Longest transaction:            0.03
Shortest transaction:           0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/apache'
Lifting the server siege...
Transactions:                    231 hits
Availability:                 100.00 %
Elapsed time:                  60.86 secs
Data transferred:               0.00 MB
Response time:                  0.01 secs
Transaction rate:               3.80 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    0.02
Successful transactions:         231
Failed transactions:               0
Longest transaction:            0.02
Shortest transaction:           0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/apache5'
Lifting the server siege...
Transactions:                    233 hits
Availability:                 100.00 %
Elapsed time:                  60.16 secs
Data transferred:               0.00 MB
Response time:                  0.01 secs
Transaction rate:               3.87 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    0.02
Successful transactions:         233
Failed transactions:               0
Longest transaction:            0.05
Shortest transaction:           0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/okhttp'
Transactions:                    235 hits
Availability:                 100.00 %
Elapsed time:                  60.64 secs
Data transferred:               0.00 MB
Response time:                  0.01 secs
Transaction rate:               3.88 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    0.02
Successful transactions:         235
Failed transactions:               0
Longest transaction:            0.13
Shortest transaction:           0.00
```

```shell
siege -d 1 -c 2 -t 1M --content-type "application/json" 'http://localhost:8080/java'
Transactions:                    235 hits
Availability:                 100.00 %
Elapsed time:                  60.29 secs
Data transferred:               0.00 MB
Response time:                  0.01 secs
Transaction rate:               3.90 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    0.03
Successful transactions:         235
Failed transactions:               0
Longest transaction:            0.02
Shortest transaction:           0.00
```
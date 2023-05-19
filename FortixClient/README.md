# Sample for DuitNow Retrieve-bank-list SDK implementation

Download our sample implementation and you will easily understand the implemention of DuitNow Retrieve-bank-list SDK with some built-in features below:
- Configurable HTTP
- Caching
- Simplified POJO
- Authentication 
- Versioning support


## Just add the sdk lib into your project
Below is the sample of adding the dependency in the pom.xml

    <dependency>
        <groupId>com.fortix-lab</groupId>
        <artifactId>fortixlab</artifactId>
        <version>1.0.5</version>
    </dependency>

	
## Set your configuration in the fortix.properties
```
#main config
duitnow.version=2

#API Config V2
duitnow.v2.cert.dir=<certdir>
duitnow.v2.header.signaturekey=<yourheadersignaturekey>
duitnow.v2.header.ip=<yourip>
duitnow.v2.header.gps=<yourgpscoordinate; sample: 40.03495, 74.2355>
#Private key for signing, will be use by default
duitnow.v2.cert.privateKey=<privatekey>

#HTTP config, for lite version default is https
http.ip=<duitnowendpoint>
#API Config V2 URI
duitnow.v2.api.uri.retrievebanklist=/merchants/v1/payments/lists/bank

#BIC Config
duitnow.rpp.bic=<rppbiccode>
duitnow.client.bic=<clientbiccode>
#ID 
duitnow.retrievebanklist.originator=O
duitnow.retrievebanklist.channel=BW
duitnow.retrievebanklist.transactiontype=650

#Auth
duitnow.api.token.uri=/auth/token
duitnow.api.token.client-id=<yourclientid>
duitnow.api.token.client-secret=<yourclientsecret>
```
## Build and Run your application
```  
  run mvn clean package
```
## License
Free

For inquiry and more feature requests, contact: sdk-team@fortixlab.com

[url1]: <https://github.com/sdk-team-fortix/fortixlab-lite>
 

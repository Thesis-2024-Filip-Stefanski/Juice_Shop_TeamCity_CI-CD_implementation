# Juice Shop scann report


## Summary of Alerts

| Risk Level | Number of Alerts |
| --- | --- |
| High | 2 |
| Medium | 5 |
| Low | 4 |
| Informational | 0 |




## Alerts

| Name | Risk Level | Number of Instances |
| --- | --- | --- |
| Cloud Metadata Potentially Exposed | High | 1 |
| SQL Injection - SQLite | High | 3 |
| Content Security Policy (CSP) Header Not Set | Medium | 19 |
| Cross-Domain Misconfiguration | Medium | 21 |
| ELMAH Information Leak | Medium | 1 |
| Missing Anti-clickjacking Header | Medium | 27 |
| Session ID in URL Rewrite | Medium | 27 |
| Cross-Domain JavaScript Source File Inclusion | Low | 24 |
| Private IP Disclosure | Low | 1 |
| Timestamp Disclosure - Unix | Low | 5 |
| X-Content-Type-Options Header Missing | Low | 27 |




## Alert Detail



### [ Cloud Metadata Potentially Exposed ](https://www.zaproxy.org/docs/alerts/90034/)



##### High (Low)

### Description

The Cloud Metadata Attack attempts to abuse a misconfigured NGINX server in order to access the instance metadata maintained by cloud service providers such as AWS, GCP and Azure.
All of these providers provide metadata via an internal unroutable IP address '169.254.169.254' - this can be exposed by incorrectly configured NGINX servers and accessed by using this IP address in the Host header field.

* URL: http://localhost:3000/latest/meta-data/%3FEIO=4&transport=polling&t=OrL4by4&sid=34iAG4GjvvSpWqWdAABw
  * Method: `POST`
  * Parameter: ``
  * Attack: `169.254.169.254`
  * Evidence: ``
  * Other Info: `Based on the successful response status code cloud metadata may have been returned in the response. Check the response data to see if any cloud metadata has been returned.
The meta data returned can include information that would allow an attacker to completely compromise the system.`

Instances: 1

### Solution

Do not trust any user data in NGINX configs. In this case it is probably the use of the $host variable which is set from the 'Host' header and can be controlled by an attacker.

### Reference


* [ https://www.nginx.com/blog/trust-no-one-perils-of-trusting-user-input/ ](https://www.nginx.com/blog/trust-no-one-perils-of-trusting-user-input/)



#### Source ID: 1

### [ SQL Injection - SQLite ](https://www.zaproxy.org/docs/alerts/40018/)



##### High (Medium)

### Description

SQL injection may be possible.

* URL: http://localhost:3000/rest/products/search%3Fq=%2527%2528
  * Method: `GET`
  * Parameter: `q`
  * Attack: `'(`
  * Evidence: `SQLITE_ERROR`
  * Other Info: `RDBMS [SQLite] likely, given error message regular expression [SQLITE_ERROR] matched by the HTML results.
The vulnerability was detected by manipulating the parameter to cause a database error message to be returned and recognised`
* URL: http://localhost:3000/api/Challenges/%3Fname=Score%2520Board
  * Method: `GET`
  * Parameter: `name`
  * Attack: `case randomblob(100000) when not null then 1 else 1 end `
  * Evidence: `The query time is controllable using parameter value [case randomblob(100000) when not null then 1 else 1 end ], which caused the request to take [305] milliseconds, parameter value [case randomblob(100000) when not null then 1 else 1 end ], which caused the request to take [305] milliseconds, when the original unmodified query with value [Score Board] took [148] milliseconds.`
  * Other Info: `The query time is controllable using parameter value [case randomblob(100000) when not null then 1 else 1 end ], which caused the request to take [305] milliseconds, parameter value [case randomblob(100000) when not null then 1 else 1 end ], which caused the request to take [305] milliseconds, when the original unmodified query with value [Score Board] took [148] milliseconds.`
* URL: http://localhost:3000/rest/products/search%3Fq=
  * Method: `GET`
  * Parameter: `q`
  * Attack: `' | case randomblob(1000000) when not null then "" else "" end | '`
  * Evidence: `The query time is controllable using parameter value [' | case randomblob(1000000) when not null then "" else "" end | '], which caused the request to take [507] milliseconds, parameter value [' | case randomblob(1000000) when not null then "" else "" end | '], which caused the request to take [507] milliseconds, when the original unmodified query with value [] took [125] milliseconds.`
  * Other Info: `The query time is controllable using parameter value [' | case randomblob(1000000) when not null then "" else "" end | '], which caused the request to take [507] milliseconds, parameter value [' | case randomblob(1000000) when not null then "" else "" end | '], which caused the request to take [507] milliseconds, when the original unmodified query with value [] took [125] milliseconds.`

Instances: 3

### Solution

Do not trust client side input, even if there is client side validation in place.
In general, type check all data on the server side.
If the application uses JDBC, use PreparedStatement or CallableStatement, with parameters passed by '?'
If the application uses ASP, use ADO Command Objects with strong type checking and parameterized queries.
If database Stored Procedures can be used, use them.
Do *not* concatenate strings into queries in the stored procedure, or use 'exec', 'exec immediate', or equivalent functionality!
Do not create dynamic SQL queries using simple string concatenation.
Escape all data received from the client.
Apply an 'allow list' of allowed characters, or a 'deny list' of disallowed characters in user input.
Apply the principle of least privilege by using the least privileged database user possible.
In particular, avoid using the 'sa' or 'db-owner' database users. This does not eliminate SQL injection, but minimizes its impact.
Grant the minimum database access that is necessary for the application.

### Reference


* [ https://cheatsheetseries.owasp.org/cheatsheets/SQL_Injection_Prevention_Cheat_Sheet.html ](https://cheatsheetseries.owasp.org/cheatsheets/SQL_Injection_Prevention_Cheat_Sheet.html)


#### CWE Id: [ 89 ](https://cwe.mitre.org/data/definitions/89.html)


#### WASC Id: 19

#### Source ID: 1

### [ Content Security Policy (CSP) Header Not Set ](https://www.zaproxy.org/docs/alerts/10038/)



##### Medium (High)

### Description

Content Security Policy (CSP) is an added layer of security that helps to detect and mitigate certain types of attacks, including Cross Site Scripting (XSS) and data injection attacks. These attacks are used for everything from data theft to site defacement or distribution of malware. CSP provides a set of standard HTTP headers that allow website owners to declare approved sources of content that browsers should be allowed to load on that page — covered types are JavaScript, CSS, HTML frames, fonts, images and embeddable objects such as Java applets, ActiveX, audio and video files.

* URL: http://localhost:3000
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/.git/assets/public/favicon_js.ico
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/.git/main.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/.git/polyfills.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/.git/runtime.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/.git/vendor.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/.svn/entries
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/.svn/wc.db
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/assets/public/images/hackingInstructor.png
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/ftp
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/sitemap.xml
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4RpG&sid=9ecwW0Eq3wTCvLrNAAAA
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Stu&sid=gGwJsk6BFC7vI5ZOAAAE
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SU4&sid=O16VfhM8Z6RvIAyXAAAC
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TK1&sid=6djhcW4StIW8JIqqAAAG
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Tqi&sid=DKMGzw9n11lbALczAAAI
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UN1&sid=zf9bv1dtHDh6IoXYAAAK
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UsM&sid=ltqX-LrpW5-_vRePAAAM
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``

Instances: 19

### Solution

Ensure that your web server, application server, load balancer, etc. is configured to set the Content-Security-Policy header.

### Reference


* [ https://developer.mozilla.org/en-US/docs/Web/Security/CSP/Introducing_Content_Security_Policy ](https://developer.mozilla.org/en-US/docs/Web/Security/CSP/Introducing_Content_Security_Policy)
* [ https://cheatsheetseries.owasp.org/cheatsheets/Content_Security_Policy_Cheat_Sheet.html ](https://cheatsheetseries.owasp.org/cheatsheets/Content_Security_Policy_Cheat_Sheet.html)
* [ http://www.w3.org/TR/CSP/ ](http://www.w3.org/TR/CSP/)
* [ http://w3c.github.io/webappsec/specs/content-security-policy/csp-specification.dev.html ](http://w3c.github.io/webappsec/specs/content-security-policy/csp-specification.dev.html)
* [ http://www.html5rocks.com/en/tutorials/security/content-security-policy/ ](http://www.html5rocks.com/en/tutorials/security/content-security-policy/)
* [ http://caniuse.com/#feat=contentsecuritypolicy ](http://caniuse.com/#feat=contentsecuritypolicy)
* [ http://content-security-policy.com/ ](http://content-security-policy.com/)


#### CWE Id: [ 693 ](https://cwe.mitre.org/data/definitions/693.html)


#### WASC Id: 15

#### Source ID: 3

### [ Cross-Domain Misconfiguration ](https://www.zaproxy.org/docs/alerts/10098/)



##### Medium (Medium)

### Description

Web browser data loading may be possible, due to a Cross Origin Resource Sharing (CORS) misconfiguration on the web server

* URL: http://localhost:3000
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/.git/assets/public/favicon_js.ico
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/.git/index
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/.git/main.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/.git/polyfills.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/.git/runtime.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/.git/styles.css
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/.git/vendor.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/.svn/entries
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/.svn/wc.db
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/favicon_js.ico
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/ftp
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/main.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/polyfills.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/rest/admin/application-configuration
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/robots.txt
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/runtime.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/sitemap.xml
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/styles.css
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/vendor.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`

Instances: 21

### Solution

Ensure that sensitive data is not available in an unauthenticated manner (using IP address white-listing, for instance).
Configure the "Access-Control-Allow-Origin" HTTP header to a more restrictive set of domains, or remove all CORS headers entirely, to allow the web browser to enforce the Same Origin Policy (SOP) in a more restrictive manner.

### Reference


* [ https://vulncat.fortify.com/en/detail?id=desc.config.dotnet.html5_overly_permissive_cors_policy ](https://vulncat.fortify.com/en/detail?id=desc.config.dotnet.html5_overly_permissive_cors_policy)


#### CWE Id: [ 264 ](https://cwe.mitre.org/data/definitions/264.html)


#### WASC Id: 14

#### Source ID: 3

### [ ELMAH Information Leak ](https://www.zaproxy.org/docs/alerts/40028/)



##### Medium (Low)

### Description

The Error Logging Modules and Handlers (ELMAH [elmah.axd]) HTTP Module was found to be available. This module can leak a significant amount of valuable information.

* URL: http://localhost:3000/elmah.axd
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `HTTP/1.1 200 OK`
  * Other Info: ``

Instances: 1

### Solution

Consider whether or not ELMAH is actually required in production, if it isn't then disable it. If it is then ensure access to it requires authentication and authorization. See also: https://elmah.github.io/a/securing-error-log-pages/

### Reference


* [ https://www.troyhunt.com/aspnet-session-hijacking-with-google/ ](https://www.troyhunt.com/aspnet-session-hijacking-with-google/)
* [ https://www.nuget.org/packages/elmah ](https://www.nuget.org/packages/elmah)
* [ https://elmah.github.io/ ](https://elmah.github.io/)


#### CWE Id: [ 94 ](https://cwe.mitre.org/data/definitions/94.html)


#### WASC Id: 14

#### Source ID: 1

### [ Missing Anti-clickjacking Header ](https://www.zaproxy.org/docs/alerts/10020/)



##### Medium (Medium)

### Description

The response does not include either Content-Security-Policy with 'frame-ancestors' directive or X-Frame-Options to protect against 'ClickJacking' attacks.

* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4RpG&sid=9ecwW0Eq3wTCvLrNAAAA
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Stu&sid=gGwJsk6BFC7vI5ZOAAAE
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SU4&sid=O16VfhM8Z6RvIAyXAAAC
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TK1&sid=6djhcW4StIW8JIqqAAAG
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Tqi&sid=DKMGzw9n11lbALczAAAI
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UN1&sid=zf9bv1dtHDh6IoXYAAAK
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UsM&sid=ltqX-LrpW5-_vRePAAAM
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Vjw&sid=RsjrP2HGqgnYSxj_AAAQ
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4VuS&sid=_tekuTMoNqvJtWdgAAAS
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4VZX&sid=UqmxTtjL59XSTAzbAAAO
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4W3H&sid=bTvCGmKSgRqTGki_AAAU
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4WEw&sid=JDAQkA_AqnM81AH1AAAW
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Wha&sid=EX_vNXE5WbT8GU-uAAAa
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4WKK&sid=5lNebDDXaXzsKYciAAAX
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Wun&sid=skAHIAfGWhhc01I8AAAc
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Xat&sid=41XiSQzeazsqPataAAAj
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4XKd&sid=Jt44Ii_7UcaPxJX3AAAe
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4XPa&sid=17ZKXlwdo3lYd7VAAAAg
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4XZq&sid=_1g8FG-BDpPPQuh5AAAi
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Y3l&sid=6zTVVmsWU6JCBC89AAAm
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Y_8&sid=_ByaZ3rC64vmP_JYAAAv
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4YFO&sid=-ujRZwrf-pE3EA3GAAAo
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Ykb&sid=5FkZICSyVJ2Z7O5EAAAs
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4YTB&sid=7H0k0hGLotuG1XVcAAAq
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4YuL&sid=r8_01s-Z4s2KM8S8AAAu
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Z6I&sid=ClSMmn7AyVgIxUqkAAAz
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Z6Z&sid=q_6H6gxAJ6wVnJ1XAAAy
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``

Instances: 27

### Solution

Modern Web browsers support the Content-Security-Policy and X-Frame-Options HTTP headers. Ensure one of them is set on all web pages returned by your site/app.
If you expect the page to be framed only by pages on your server (e.g. it's part of a FRAMESET) then you'll want to use SAMEORIGIN, otherwise if you never expect the page to be framed, you should use DENY. Alternatively consider implementing Content Security Policy's "frame-ancestors" directive.

### Reference


* [ https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options ](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)


#### CWE Id: [ 1021 ](https://cwe.mitre.org/data/definitions/1021.html)


#### WASC Id: 15

#### Source ID: 3

### [ Session ID in URL Rewrite ](https://www.zaproxy.org/docs/alerts/3/)



##### Medium (High)

### Description

URL rewrite is used to track user session ID. The session ID may be disclosed via cross-site referer header. In addition, the session ID might be stored in browser history or server logs.

* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4RpH&sid=9ecwW0Eq3wTCvLrNAAAA
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `9ecwW0Eq3wTCvLrNAAAA`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4RqW&sid=9ecwW0Eq3wTCvLrNAAAA
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `9ecwW0Eq3wTCvLrNAAAA`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Stv&sid=gGwJsk6BFC7vI5ZOAAAE
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `gGwJsk6BFC7vI5ZOAAAE`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SU5&sid=O16VfhM8Z6RvIAyXAAAC
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `O16VfhM8Z6RvIAyXAAAC`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SUa&sid=O16VfhM8Z6RvIAyXAAAC
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `O16VfhM8Z6RvIAyXAAAC`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SvO&sid=gGwJsk6BFC7vI5ZOAAAE
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `gGwJsk6BFC7vI5ZOAAAE`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TK3&sid=6djhcW4StIW8JIqqAAAG
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `6djhcW4StIW8JIqqAAAG`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TLC&sid=6djhcW4StIW8JIqqAAAG
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `6djhcW4StIW8JIqqAAAG`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Tqk&sid=DKMGzw9n11lbALczAAAI
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `DKMGzw9n11lbALczAAAI`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Trf&sid=DKMGzw9n11lbALczAAAI
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `DKMGzw9n11lbALczAAAI`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UN3&sid=zf9bv1dtHDh6IoXYAAAK
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `zf9bv1dtHDh6IoXYAAAK`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UO9&sid=zf9bv1dtHDh6IoXYAAAK
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `zf9bv1dtHDh6IoXYAAAK`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UsM.0&sid=ltqX-LrpW5-_vRePAAAM
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ltqX-LrpW5-_vRePAAAM`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=6djhcW4StIW8JIqqAAAG
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `6djhcW4StIW8JIqqAAAG`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=9ecwW0Eq3wTCvLrNAAAA
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `9ecwW0Eq3wTCvLrNAAAA`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=DKMGzw9n11lbALczAAAI
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `DKMGzw9n11lbALczAAAI`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=gGwJsk6BFC7vI5ZOAAAE
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `gGwJsk6BFC7vI5ZOAAAE`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=ltqX-LrpW5-_vRePAAAM
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ltqX-LrpW5-_vRePAAAM`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=O16VfhM8Z6RvIAyXAAAC
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `O16VfhM8Z6RvIAyXAAAC`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=zf9bv1dtHDh6IoXYAAAK
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `zf9bv1dtHDh6IoXYAAAK`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4RpG&sid=9ecwW0Eq3wTCvLrNAAAA
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `9ecwW0Eq3wTCvLrNAAAA`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Stu&sid=gGwJsk6BFC7vI5ZOAAAE
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `gGwJsk6BFC7vI5ZOAAAE`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SU4&sid=O16VfhM8Z6RvIAyXAAAC
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `O16VfhM8Z6RvIAyXAAAC`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TK1&sid=6djhcW4StIW8JIqqAAAG
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `6djhcW4StIW8JIqqAAAG`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Tqi&sid=DKMGzw9n11lbALczAAAI
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `DKMGzw9n11lbALczAAAI`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UN1&sid=zf9bv1dtHDh6IoXYAAAK
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `zf9bv1dtHDh6IoXYAAAK`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UsM&sid=ltqX-LrpW5-_vRePAAAM
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ltqX-LrpW5-_vRePAAAM`
  * Other Info: ``

Instances: 27

### Solution

For secure content, put session ID in a cookie. To be even more secure consider using a combination of cookie and URL rewrite.

### Reference


* [ http://seclists.org/lists/webappsec/2002/Oct-Dec/0111.html ](http://seclists.org/lists/webappsec/2002/Oct-Dec/0111.html)


#### CWE Id: [ 200 ](https://cwe.mitre.org/data/definitions/200.html)


#### WASC Id: 13

#### Source ID: 3

### [ Cross-Domain JavaScript Source File Inclusion ](https://www.zaproxy.org/docs/alerts/10017/)



##### Low (Medium)

### Description

The page includes one or more script files from a third-party domain.

* URL: http://localhost:3000
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/assets/public/favicon_js.ico
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/assets/public/favicon_js.ico
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/index
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/index
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/main.js
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/main.js
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/polyfills.js
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/polyfills.js
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/runtime.js
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/runtime.js
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/styles.css
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/styles.css
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/vendor.js
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.git/vendor.js
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.svn/entries
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.svn/entries
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.svn/wc.db
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/.svn/wc.db
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/sitemap.xml
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/sitemap.xml
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``

Instances: 24

### Solution

Ensure JavaScript source files are loaded from only trusted sources, and the sources can't be controlled by end users of the application.

### Reference



#### CWE Id: [ 829 ](https://cwe.mitre.org/data/definitions/829.html)


#### WASC Id: 15

#### Source ID: 3

### [ Private IP Disclosure ](https://www.zaproxy.org/docs/alerts/2/)



##### Low (Medium)

### Description

A private IP (such as 10.x.x.x, 172.x.x.x, 192.168.x.x) or an Amazon EC2 private hostname (for example, ip-10-0-56-78) has been found in the HTTP response body. This information might be helpful for further attacks targeting internal systems.

* URL: http://localhost:3000/rest/admin/application-configuration
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `192.168.99.100:3000`
  * Other Info: `192.168.99.100:3000
192.168.99.100:4200
`

Instances: 1

### Solution

Remove the private IP address from the HTTP response body.  For comments, use JSP/ASP/PHP comment instead of HTML/JavaScript comment which can be seen by client browsers.

### Reference


* [ https://tools.ietf.org/html/rfc1918 ](https://tools.ietf.org/html/rfc1918)


#### CWE Id: [ 200 ](https://cwe.mitre.org/data/definitions/200.html)


#### WASC Id: 13

#### Source ID: 3

### [ Timestamp Disclosure - Unix ](https://www.zaproxy.org/docs/alerts/10096/)



##### Low (Low)

### Description

A timestamp was disclosed by the application/web server - Unix

* URL: http://localhost:3000/main.js
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `1734944650`
  * Other Info: `1734944650, which evaluates to: 2024-12-23 10:04:10`
* URL: http://localhost:3000/rest/admin/application-configuration
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `1969196030`
  * Other Info: `1969196030, which evaluates to: 2032-05-26 16:53:50`
* URL: http://localhost:3000/rest/admin/application-configuration
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `1970691216`
  * Other Info: `1970691216, which evaluates to: 2032-06-13 00:13:36`
* URL: http://localhost:3000/rest/products/search%3Fq=
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `1969196030`
  * Other Info: `1969196030, which evaluates to: 2032-05-26 16:53:50`
* URL: http://localhost:3000/rest/products/search%3Fq=
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `1970691216`
  * Other Info: `1970691216, which evaluates to: 2032-06-13 00:13:36`

Instances: 5

### Solution

Manually confirm that the timestamp data is not sensitive, and that the data cannot be aggregated to disclose exploitable patterns.

### Reference


* [ http://projects.webappsec.org/w/page/13246936/Information%20Leakage ](http://projects.webappsec.org/w/page/13246936/Information%20Leakage)


#### CWE Id: [ 200 ](https://cwe.mitre.org/data/definitions/200.html)


#### WASC Id: 13

#### Source ID: 3

### [ X-Content-Type-Options Header Missing ](https://www.zaproxy.org/docs/alerts/10021/)



##### Low (Medium)

### Description

The Anti-MIME-Sniffing header X-Content-Type-Options was not set to 'nosniff'. This allows older versions of Internet Explorer and Chrome to perform MIME-sniffing on the response body, potentially causing the response body to be interpreted and displayed as a content type other than the declared content type. Current (early 2014) and legacy versions of Firefox will use the declared content type (if one is set), rather than performing MIME-sniffing.

* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4RlK
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4RpH&sid=9ecwW0Eq3wTCvLrNAAAA
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4RqW&sid=9ecwW0Eq3wTCvLrNAAAA
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Sqj
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SRA
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Stv&sid=gGwJsk6BFC7vI5ZOAAAE
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SU5&sid=O16VfhM8Z6RvIAyXAAAC
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SUa&sid=O16VfhM8Z6RvIAyXAAAC
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SvO&sid=gGwJsk6BFC7vI5ZOAAAE
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TGz
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TK3&sid=6djhcW4StIW8JIqqAAAG
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TLC&sid=6djhcW4StIW8JIqqAAAG
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TnB
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Tqk&sid=DKMGzw9n11lbALczAAAI
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Trf&sid=DKMGzw9n11lbALczAAAI
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UIh
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UN3&sid=zf9bv1dtHDh6IoXYAAAK
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UO9&sid=zf9bv1dtHDh6IoXYAAAK
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UpN
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UsM.0&sid=ltqX-LrpW5-_vRePAAAM
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4RpG&sid=9ecwW0Eq3wTCvLrNAAAA
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Stu&sid=gGwJsk6BFC7vI5ZOAAAE
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4SU4&sid=O16VfhM8Z6RvIAyXAAAC
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4TK1&sid=6djhcW4StIW8JIqqAAAG
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4Tqi&sid=DKMGzw9n11lbALczAAAI
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UN1&sid=zf9bv1dtHDh6IoXYAAAK
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL4UsM&sid=ltqX-LrpW5-_vRePAAAM
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`

Instances: 27

### Solution

Ensure that the application/web server sets the Content-Type header appropriately, and that it sets the X-Content-Type-Options header to 'nosniff' for all web pages.
If possible, ensure that the end user uses a standards-compliant and modern web browser that does not perform MIME-sniffing at all, or that can be directed by the web application/web server to not perform MIME-sniffing.

### Reference


* [ http://msdn.microsoft.com/en-us/library/ie/gg622941%28v=vs.85%29.aspx ](http://msdn.microsoft.com/en-us/library/ie/gg622941%28v=vs.85%29.aspx)
* [ https://owasp.org/www-community/Security_Headers ](https://owasp.org/www-community/Security_Headers)


#### CWE Id: [ 693 ](https://cwe.mitre.org/data/definitions/693.html)


#### WASC Id: 15

#### Source ID: 3



# Juice Shop scann report


## Summary of Alerts

| Risk Level | Number of Alerts |
| --- | --- |
| High | 0 |
| Medium | 4 |
| Low | 4 |
| Informational | 0 |




## Alerts

| Name | Risk Level | Number of Instances |
| --- | --- | --- |
| Content Security Policy (CSP) Header Not Set | Medium | 50 |
| Cross-Domain Misconfiguration | Medium | 41 |
| Missing Anti-clickjacking Header | Medium | 40 |
| Session ID in URL Rewrite | Medium | 159 |
| Cross-Domain JavaScript Source File Inclusion | Low | 20 |
| Private IP Disclosure | Low | 1 |
| Timestamp Disclosure - Unix | Low | 5 |
| X-Content-Type-Options Header Missing | Low | 159 |




## Alert Detail



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
* URL: http://localhost:3000/.git/index
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
* URL: http://localhost:3000/.git/styles.css
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
* URL: http://localhost:3000/assets/public/images/hackingInstructor.png
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69Nu&sid=wbLdn0BM8HLGLsZMAAOh
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69s2&sid=4Is98Y-O0rui62QvAAOj
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6AIH&sid=51bU_j4kLcMn0Gd-AAOl
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Alu&sid=UDBdkq5Bo4JDK79NAAOn
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BLv&sid=8o0UZpDQGirok7F9AAOp
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Bxv&sid=TfINduwbbvo36TlXAAOr
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ccu&sid=dWvWGJBtCieMnzfKAAOz
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CKM&sid=o4ZbVaitb3boxlMUAAOt
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CLE&sid=ORB4Gz_NRaUF8Q2kAAOu
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNo&sid=ygptOd6jYiZ3YnPBAAOw
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CvZ&sid=cdc4NT9W5d4MtKkdAAO1
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOj&sid=l9-kMbayu326SACWAAO3
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOL&sid=pREp2MIk7zHbgFc1AAO4
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOz&sid=NgjGdriJOQYoqjhbAAO5
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DP7&sid=68H9aiFrmKN0iZ9FAAO6
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DvJ&sid=hdFGHPvjzC9ITcpnAAO_
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6E-t&sid=Vt2ywTpL4bSItLQDAAPP
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EEm&sid=pvsOxNKunrKiBtnBAAPB
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EGT&sid=px43s8vle1Y1TtXIAAPC
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EhM&sid=q8jh0YDvmhsJyL-CAAPJ
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EHn&sid=EMHYZ9It5owbZlUEAAPD
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ekh&sid=lSRd39JyAsgoHYEHAAPK
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ENN&sid=8-gB_t-CE8u-lYn4AAPH
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Evu&sid=KWBje_AhqfGWLFKqAAPN
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ewc&sid=CWDqN7UcL7SeYpzVAAPO
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F5Y&sid=g-IsKzTBY6-3RnfJAAPT
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F9B&sid=OJqozdCqOqeId4uSAAPU
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Feg&sid=lf9XWxCmx-tPJiBhAAPg
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fgp&sid=WYCTEIYgm4gzVJzeAAPf
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FO3&sid=TpzCu3Xqh3ejl9t0AAPX
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FRO&sid=LAU0vjfE_MA-c_csAAPZ
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FTJ&sid=LkT4VpSgUFmkD4bUAAPY
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FuD&sid=GDkuxBITVrmOJPaQAAPj
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FV5&sid=8Hc1YKux45hIuVVCAAPa
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fvz&sid=5wSumci1bYR6fG4aAAPm
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FwX&sid=33YHm_zVf3M0WAxbAAPl
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FzR&sid=Q9UHEQqQbYefvcj5AAPk
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6A&sid=J8on5AquFi6zi9CkAAPr
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6x&sid=3-tzZo6dO2kVmpYmAAPs
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GBh&sid=hem5h8SQxMM9MxXxAAPt
  * Method: `POST`
  * Parameter: ``
  * Attack: ``
  * Evidence: ``
  * Other Info: ``

Instances: 50

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
* URL: http://localhost:3000/api/Challenges/%3Fname=Score%2520Board
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/api/Quantitys/
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/i18n/en.json
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
* URL: http://localhost:3000/assets/public/images/hackingInstructor.png
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/JuiceShop_Logo.png
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/apple_juice.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/apple_pressings.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/artwork2.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/banana_juice.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/carrot_juice.jpeg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/eggfruit_juice.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/fan_facemask.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/fruit_press.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/green_smoothie.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/lemon_juice.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/melon_bike.jpeg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/assets/public/images/products/permafrost.jpg
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/font-mfizz.woff
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
* URL: http://localhost:3000/MaterialIcons-Regular.woff2
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
* URL: http://localhost:3000/rest/admin/application-version
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/rest/captcha/
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/rest/languages
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/rest/products/search%3Fq=
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/rest/user/whoami
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
* URL: http://localhost:3000/styles.css
  * Method: `GET`
  * Parameter: ``
  * Attack: ``
  * Evidence: `Access-Control-Allow-Origin: *`
  * Other Info: `The CORS misconfiguration on the web server permits cross-domain read requests from arbitrary third party domains, using unauthenticated APIs on this domain. Web browser implementations do not permit arbitrary third parties to read the response from authenticated APIs, however. This reduces the risk somewhat. This misconfiguration could be used by an attacker to access data that is available in an unauthenticated manner, but which uses some other form of security, such as IP address white-listing.`
* URL: http://localhost:3000/tutorial.js
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

Instances: 41

### Solution

Ensure that sensitive data is not available in an unauthenticated manner (using IP address white-listing, for instance).
Configure the "Access-Control-Allow-Origin" HTTP header to a more restrictive set of domains, or remove all CORS headers entirely, to allow the web browser to enforce the Same Origin Policy (SOP) in a more restrictive manner.

### Reference


* [ https://vulncat.fortify.com/en/detail?id=desc.config.dotnet.html5_overly_permissive_cors_policy ](https://vulncat.fortify.com/en/detail?id=desc.config.dotnet.html5_overly_permissive_cors_policy)


#### CWE Id: [ 264 ](https://cwe.mitre.org/data/definitions/264.html)


#### WASC Id: 14

#### Source ID: 3

### [ Missing Anti-clickjacking Header ](https://www.zaproxy.org/docs/alerts/10020/)



##### Medium (Medium)

### Description

The response does not include either Content-Security-Policy with 'frame-ancestors' directive or X-Frame-Options to protect against 'ClickJacking' attacks.

* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69Nu&sid=wbLdn0BM8HLGLsZMAAOh
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69s2&sid=4Is98Y-O0rui62QvAAOj
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6AIH&sid=51bU_j4kLcMn0Gd-AAOl
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Alu&sid=UDBdkq5Bo4JDK79NAAOn
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BLv&sid=8o0UZpDQGirok7F9AAOp
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Bxv&sid=TfINduwbbvo36TlXAAOr
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ccu&sid=dWvWGJBtCieMnzfKAAOz
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CKM&sid=o4ZbVaitb3boxlMUAAOt
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CLE&sid=ORB4Gz_NRaUF8Q2kAAOu
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNo&sid=ygptOd6jYiZ3YnPBAAOw
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CvZ&sid=cdc4NT9W5d4MtKkdAAO1
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOj&sid=l9-kMbayu326SACWAAO3
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOL&sid=pREp2MIk7zHbgFc1AAO4
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOz&sid=NgjGdriJOQYoqjhbAAO5
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DP7&sid=68H9aiFrmKN0iZ9FAAO6
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DvJ&sid=hdFGHPvjzC9ITcpnAAO_
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6E-t&sid=Vt2ywTpL4bSItLQDAAPP
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EEm&sid=pvsOxNKunrKiBtnBAAPB
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EGT&sid=px43s8vle1Y1TtXIAAPC
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EhM&sid=q8jh0YDvmhsJyL-CAAPJ
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EHn&sid=EMHYZ9It5owbZlUEAAPD
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ekh&sid=lSRd39JyAsgoHYEHAAPK
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ENN&sid=8-gB_t-CE8u-lYn4AAPH
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Evu&sid=KWBje_AhqfGWLFKqAAPN
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ewc&sid=CWDqN7UcL7SeYpzVAAPO
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F5Y&sid=g-IsKzTBY6-3RnfJAAPT
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F9B&sid=OJqozdCqOqeId4uSAAPU
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Feg&sid=lf9XWxCmx-tPJiBhAAPg
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fgp&sid=WYCTEIYgm4gzVJzeAAPf
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FO3&sid=TpzCu3Xqh3ejl9t0AAPX
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FRO&sid=LAU0vjfE_MA-c_csAAPZ
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FTJ&sid=LkT4VpSgUFmkD4bUAAPY
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FuD&sid=GDkuxBITVrmOJPaQAAPj
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FV5&sid=8Hc1YKux45hIuVVCAAPa
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fvz&sid=5wSumci1bYR6fG4aAAPm
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FwX&sid=33YHm_zVf3M0WAxbAAPl
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FzR&sid=Q9UHEQqQbYefvcj5AAPk
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6A&sid=J8on5AquFi6zi9CkAAPr
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6x&sid=3-tzZo6dO2kVmpYmAAPs
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GBh&sid=hem5h8SQxMM9MxXxAAPt
  * Method: `POST`
  * Parameter: `x-frame-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: ``

Instances: 40

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

* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69Nu.0&sid=wbLdn0BM8HLGLsZMAAOh
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `wbLdn0BM8HLGLsZMAAOh`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69P1&sid=wbLdn0BM8HLGLsZMAAOh
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `wbLdn0BM8HLGLsZMAAOh`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69s4&sid=4Is98Y-O0rui62QvAAOj
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `4Is98Y-O0rui62QvAAOj`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69sm&sid=4Is98Y-O0rui62QvAAOj
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `4Is98Y-O0rui62QvAAOj`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6AII&sid=51bU_j4kLcMn0Gd-AAOl
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `51bU_j4kLcMn0Gd-AAOl`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6AIy&sid=51bU_j4kLcMn0Gd-AAOl
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `51bU_j4kLcMn0Gd-AAOl`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Alv&sid=UDBdkq5Bo4JDK79NAAOn
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `UDBdkq5Bo4JDK79NAAOn`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Amq&sid=UDBdkq5Bo4JDK79NAAOn
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `UDBdkq5Bo4JDK79NAAOn`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BLw&sid=8o0UZpDQGirok7F9AAOp
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8o0UZpDQGirok7F9AAOp`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BMb&sid=8o0UZpDQGirok7F9AAOp
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8o0UZpDQGirok7F9AAOp`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Bxw&sid=TfINduwbbvo36TlXAAOr
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `TfINduwbbvo36TlXAAOr`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Bym&sid=TfINduwbbvo36TlXAAOr
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `TfINduwbbvo36TlXAAOr`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ccv&sid=dWvWGJBtCieMnzfKAAOz
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `dWvWGJBtCieMnzfKAAOz`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CfB&sid=dWvWGJBtCieMnzfKAAOz
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `dWvWGJBtCieMnzfKAAOz`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CKN&sid=o4ZbVaitb3boxlMUAAOt
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `o4ZbVaitb3boxlMUAAOt`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CLF&sid=ORB4Gz_NRaUF8Q2kAAOu
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ORB4Gz_NRaUF8Q2kAAOu`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNo&sid=o4ZbVaitb3boxlMUAAOt
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `o4ZbVaitb3boxlMUAAOt`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNp&sid=ygptOd6jYiZ3YnPBAAOw
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ygptOd6jYiZ3YnPBAAOw`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNx&sid=ORB4Gz_NRaUF8Q2kAAOu
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ORB4Gz_NRaUF8Q2kAAOu`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CQh&sid=ygptOd6jYiZ3YnPBAAOw
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ygptOd6jYiZ3YnPBAAOw`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Cvb&sid=cdc4NT9W5d4MtKkdAAO1
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `cdc4NT9W5d4MtKkdAAO1`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Cw5&sid=cdc4NT9W5d4MtKkdAAO1
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `cdc4NT9W5d4MtKkdAAO1`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DO_&sid=NgjGdriJOQYoqjhbAAO5
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `NgjGdriJOQYoqjhbAAO5`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOl&sid=l9-kMbayu326SACWAAO3
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `l9-kMbayu326SACWAAO3`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOM&sid=pREp2MIk7zHbgFc1AAO4
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `pREp2MIk7zHbgFc1AAO4`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DP8&sid=68H9aiFrmKN0iZ9FAAO6
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `68H9aiFrmKN0iZ9FAAO6`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DvK&sid=hdFGHPvjzC9ITcpnAAO_
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `hdFGHPvjzC9ITcpnAAO_`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Dw6&sid=hdFGHPvjzC9ITcpnAAO_
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `hdFGHPvjzC9ITcpnAAO_`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DWc&sid=68H9aiFrmKN0iZ9FAAO6
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `68H9aiFrmKN0iZ9FAAO6`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DWJ&sid=pREp2MIk7zHbgFc1AAO4
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `pREp2MIk7zHbgFc1AAO4`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DWL&sid=l9-kMbayu326SACWAAO3
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `l9-kMbayu326SACWAAO3`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DWW&sid=NgjGdriJOQYoqjhbAAO5
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `NgjGdriJOQYoqjhbAAO5`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6E-v&sid=Vt2ywTpL4bSItLQDAAPP
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `Vt2ywTpL4bSItLQDAAPP`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6E_x&sid=Vt2ywTpL4bSItLQDAAPP
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `Vt2ywTpL4bSItLQDAAPP`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EEn&sid=pvsOxNKunrKiBtnBAAPB
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `pvsOxNKunrKiBtnBAAPB`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EGU&sid=px43s8vle1Y1TtXIAAPC
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `px43s8vle1Y1TtXIAAPC`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EHG&sid=pvsOxNKunrKiBtnBAAPB
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `pvsOxNKunrKiBtnBAAPB`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EhN&sid=q8jh0YDvmhsJyL-CAAPJ
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `q8jh0YDvmhsJyL-CAAPJ`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EHo&sid=EMHYZ9It5owbZlUEAAPD
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `EMHYZ9It5owbZlUEAAPD`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EJA&sid=px43s8vle1Y1TtXIAAPC
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `px43s8vle1Y1TtXIAAPC`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EJR&sid=EMHYZ9It5owbZlUEAAPD
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `EMHYZ9It5owbZlUEAAPD`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ek7&sid=q8jh0YDvmhsJyL-CAAPJ
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `q8jh0YDvmhsJyL-CAAPJ`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Eki&sid=lSRd39JyAsgoHYEHAAPK
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `lSRd39JyAsgoHYEHAAPK`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ElF&sid=lSRd39JyAsgoHYEHAAPK
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `lSRd39JyAsgoHYEHAAPK`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ENO&sid=8-gB_t-CE8u-lYn4AAPH
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8-gB_t-CE8u-lYn4AAPH`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EOF&sid=8-gB_t-CE8u-lYn4AAPH
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8-gB_t-CE8u-lYn4AAPH`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Evw&sid=KWBje_AhqfGWLFKqAAPN
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `KWBje_AhqfGWLFKqAAPN`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ewd&sid=CWDqN7UcL7SeYpzVAAPO
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `CWDqN7UcL7SeYpzVAAPO`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ExR&sid=KWBje_AhqfGWLFKqAAPN
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `KWBje_AhqfGWLFKqAAPN`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EyC&sid=CWDqN7UcL7SeYpzVAAPO
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `CWDqN7UcL7SeYpzVAAPO`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F5-&sid=g-IsKzTBY6-3RnfJAAPT
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `g-IsKzTBY6-3RnfJAAPT`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F5Z&sid=g-IsKzTBY6-3RnfJAAPT
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `g-IsKzTBY6-3RnfJAAPT`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F9C&sid=OJqozdCqOqeId4uSAAPU
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `OJqozdCqOqeId4uSAAPU`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FAA&sid=OJqozdCqOqeId4uSAAPU
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `OJqozdCqOqeId4uSAAPU`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Feh&sid=lf9XWxCmx-tPJiBhAAPg
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `lf9XWxCmx-tPJiBhAAPg`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fgp.0&sid=WYCTEIYgm4gzVJzeAAPf
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `WYCTEIYgm4gzVJzeAAPf`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fgx&sid=lf9XWxCmx-tPJiBhAAPg
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `lf9XWxCmx-tPJiBhAAPg`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fhf&sid=WYCTEIYgm4gzVJzeAAPf
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `WYCTEIYgm4gzVJzeAAPf`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FO5&sid=TpzCu3Xqh3ejl9t0AAPX
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `TpzCu3Xqh3ejl9t0AAPX`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FRP&sid=LAU0vjfE_MA-c_csAAPZ
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `LAU0vjfE_MA-c_csAAPZ`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FRu&sid=TpzCu3Xqh3ejl9t0AAPX
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `TpzCu3Xqh3ejl9t0AAPX`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FTK&sid=LkT4VpSgUFmkD4bUAAPY
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `LkT4VpSgUFmkD4bUAAPY`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FuO&sid=GDkuxBITVrmOJPaQAAPj
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `GDkuxBITVrmOJPaQAAPj`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FV6&sid=8Hc1YKux45hIuVVCAAPa
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8Hc1YKux45hIuVVCAAPa`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fv_&sid=5wSumci1bYR6fG4aAAPm
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `5wSumci1bYR6fG4aAAPm`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FWi&sid=LAU0vjfE_MA-c_csAAPZ
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `LAU0vjfE_MA-c_csAAPZ`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FWx&sid=LkT4VpSgUFmkD4bUAAPY
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `LkT4VpSgUFmkD4bUAAPY`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FwZ&sid=33YHm_zVf3M0WAxbAAPl
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `33YHm_zVf3M0WAxbAAPl`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FX9&sid=8Hc1YKux45hIuVVCAAPa
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8Hc1YKux45hIuVVCAAPa`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FzS&sid=Q9UHEQqQbYefvcj5AAPk
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `Q9UHEQqQbYefvcj5AAPk`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G1B&sid=GDkuxBITVrmOJPaQAAPj
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `GDkuxBITVrmOJPaQAAPj`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G1o&sid=5wSumci1bYR6fG4aAAPm
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `5wSumci1bYR6fG4aAAPm`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G2r&sid=Q9UHEQqQbYefvcj5AAPk
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `Q9UHEQqQbYefvcj5AAPk`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6B&sid=J8on5AquFi6zi9CkAAPr
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `J8on5AquFi6zi9CkAAPr`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6y&sid=3-tzZo6dO2kVmpYmAAPs
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `3-tzZo6dO2kVmpYmAAPs`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GAl&sid=J8on5AquFi6zi9CkAAPr
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `J8on5AquFi6zi9CkAAPr`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GBj&sid=hem5h8SQxMM9MxXxAAPt
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `hem5h8SQxMM9MxXxAAPt`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GC0&sid=3-tzZo6dO2kVmpYmAAPs
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `3-tzZo6dO2kVmpYmAAPs`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GEX&sid=hem5h8SQxMM9MxXxAAPt
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `hem5h8SQxMM9MxXxAAPt`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=3-tzZo6dO2kVmpYmAAPs
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `3-tzZo6dO2kVmpYmAAPs`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=33YHm_zVf3M0WAxbAAPl
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `33YHm_zVf3M0WAxbAAPl`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=4Is98Y-O0rui62QvAAOj
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `4Is98Y-O0rui62QvAAOj`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=51bU_j4kLcMn0Gd-AAOl
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `51bU_j4kLcMn0Gd-AAOl`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=5wSumci1bYR6fG4aAAPm
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `5wSumci1bYR6fG4aAAPm`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=68H9aiFrmKN0iZ9FAAO6
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `68H9aiFrmKN0iZ9FAAO6`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=8-gB_t-CE8u-lYn4AAPH
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8-gB_t-CE8u-lYn4AAPH`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=8Hc1YKux45hIuVVCAAPa
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8Hc1YKux45hIuVVCAAPa`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=8o0UZpDQGirok7F9AAOp
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8o0UZpDQGirok7F9AAOp`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=cdc4NT9W5d4MtKkdAAO1
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `cdc4NT9W5d4MtKkdAAO1`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=CWDqN7UcL7SeYpzVAAPO
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `CWDqN7UcL7SeYpzVAAPO`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=dWvWGJBtCieMnzfKAAOz
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `dWvWGJBtCieMnzfKAAOz`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=EMHYZ9It5owbZlUEAAPD
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `EMHYZ9It5owbZlUEAAPD`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=g-IsKzTBY6-3RnfJAAPT
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `g-IsKzTBY6-3RnfJAAPT`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=GDkuxBITVrmOJPaQAAPj
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `GDkuxBITVrmOJPaQAAPj`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=hdFGHPvjzC9ITcpnAAO_
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `hdFGHPvjzC9ITcpnAAO_`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=hem5h8SQxMM9MxXxAAPt
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `hem5h8SQxMM9MxXxAAPt`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=J8on5AquFi6zi9CkAAPr
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `J8on5AquFi6zi9CkAAPr`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=KWBje_AhqfGWLFKqAAPN
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `KWBje_AhqfGWLFKqAAPN`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=l9-kMbayu326SACWAAO3
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `l9-kMbayu326SACWAAO3`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=LAU0vjfE_MA-c_csAAPZ
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `LAU0vjfE_MA-c_csAAPZ`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=lf9XWxCmx-tPJiBhAAPg
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `lf9XWxCmx-tPJiBhAAPg`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=LkT4VpSgUFmkD4bUAAPY
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `LkT4VpSgUFmkD4bUAAPY`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=lSRd39JyAsgoHYEHAAPK
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `lSRd39JyAsgoHYEHAAPK`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=NgjGdriJOQYoqjhbAAO5
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `NgjGdriJOQYoqjhbAAO5`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=o4ZbVaitb3boxlMUAAOt
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `o4ZbVaitb3boxlMUAAOt`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=OJqozdCqOqeId4uSAAPU
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `OJqozdCqOqeId4uSAAPU`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=ORB4Gz_NRaUF8Q2kAAOu
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ORB4Gz_NRaUF8Q2kAAOu`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=pREp2MIk7zHbgFc1AAO4
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `pREp2MIk7zHbgFc1AAO4`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=pvsOxNKunrKiBtnBAAPB
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `pvsOxNKunrKiBtnBAAPB`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=px43s8vle1Y1TtXIAAPC
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `px43s8vle1Y1TtXIAAPC`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=q8jh0YDvmhsJyL-CAAPJ
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `q8jh0YDvmhsJyL-CAAPJ`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=Q9UHEQqQbYefvcj5AAPk
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `Q9UHEQqQbYefvcj5AAPk`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=TfINduwbbvo36TlXAAOr
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `TfINduwbbvo36TlXAAOr`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=TpzCu3Xqh3ejl9t0AAPX
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `TpzCu3Xqh3ejl9t0AAPX`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=UDBdkq5Bo4JDK79NAAOn
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `UDBdkq5Bo4JDK79NAAOn`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=Vt2ywTpL4bSItLQDAAPP
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `Vt2ywTpL4bSItLQDAAPP`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=wbLdn0BM8HLGLsZMAAOh
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `wbLdn0BM8HLGLsZMAAOh`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=WYCTEIYgm4gzVJzeAAPf
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `WYCTEIYgm4gzVJzeAAPf`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=websocket&sid=ygptOd6jYiZ3YnPBAAOw
  * Method: `GET`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ygptOd6jYiZ3YnPBAAOw`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69Nu&sid=wbLdn0BM8HLGLsZMAAOh
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `wbLdn0BM8HLGLsZMAAOh`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69s2&sid=4Is98Y-O0rui62QvAAOj
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `4Is98Y-O0rui62QvAAOj`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6AIH&sid=51bU_j4kLcMn0Gd-AAOl
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `51bU_j4kLcMn0Gd-AAOl`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Alu&sid=UDBdkq5Bo4JDK79NAAOn
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `UDBdkq5Bo4JDK79NAAOn`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BLv&sid=8o0UZpDQGirok7F9AAOp
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8o0UZpDQGirok7F9AAOp`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Bxv&sid=TfINduwbbvo36TlXAAOr
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `TfINduwbbvo36TlXAAOr`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ccu&sid=dWvWGJBtCieMnzfKAAOz
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `dWvWGJBtCieMnzfKAAOz`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CKM&sid=o4ZbVaitb3boxlMUAAOt
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `o4ZbVaitb3boxlMUAAOt`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CLE&sid=ORB4Gz_NRaUF8Q2kAAOu
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ORB4Gz_NRaUF8Q2kAAOu`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNo&sid=ygptOd6jYiZ3YnPBAAOw
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `ygptOd6jYiZ3YnPBAAOw`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CvZ&sid=cdc4NT9W5d4MtKkdAAO1
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `cdc4NT9W5d4MtKkdAAO1`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOj&sid=l9-kMbayu326SACWAAO3
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `l9-kMbayu326SACWAAO3`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOL&sid=pREp2MIk7zHbgFc1AAO4
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `pREp2MIk7zHbgFc1AAO4`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOz&sid=NgjGdriJOQYoqjhbAAO5
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `NgjGdriJOQYoqjhbAAO5`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DP7&sid=68H9aiFrmKN0iZ9FAAO6
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `68H9aiFrmKN0iZ9FAAO6`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DvJ&sid=hdFGHPvjzC9ITcpnAAO_
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `hdFGHPvjzC9ITcpnAAO_`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6E-t&sid=Vt2ywTpL4bSItLQDAAPP
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `Vt2ywTpL4bSItLQDAAPP`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EEm&sid=pvsOxNKunrKiBtnBAAPB
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `pvsOxNKunrKiBtnBAAPB`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EGT&sid=px43s8vle1Y1TtXIAAPC
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `px43s8vle1Y1TtXIAAPC`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EhM&sid=q8jh0YDvmhsJyL-CAAPJ
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `q8jh0YDvmhsJyL-CAAPJ`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EHn&sid=EMHYZ9It5owbZlUEAAPD
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `EMHYZ9It5owbZlUEAAPD`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ekh&sid=lSRd39JyAsgoHYEHAAPK
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `lSRd39JyAsgoHYEHAAPK`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ENN&sid=8-gB_t-CE8u-lYn4AAPH
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8-gB_t-CE8u-lYn4AAPH`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Evu&sid=KWBje_AhqfGWLFKqAAPN
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `KWBje_AhqfGWLFKqAAPN`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ewc&sid=CWDqN7UcL7SeYpzVAAPO
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `CWDqN7UcL7SeYpzVAAPO`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F5Y&sid=g-IsKzTBY6-3RnfJAAPT
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `g-IsKzTBY6-3RnfJAAPT`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F9B&sid=OJqozdCqOqeId4uSAAPU
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `OJqozdCqOqeId4uSAAPU`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Feg&sid=lf9XWxCmx-tPJiBhAAPg
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `lf9XWxCmx-tPJiBhAAPg`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fgp&sid=WYCTEIYgm4gzVJzeAAPf
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `WYCTEIYgm4gzVJzeAAPf`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FO3&sid=TpzCu3Xqh3ejl9t0AAPX
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `TpzCu3Xqh3ejl9t0AAPX`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FRO&sid=LAU0vjfE_MA-c_csAAPZ
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `LAU0vjfE_MA-c_csAAPZ`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FTJ&sid=LkT4VpSgUFmkD4bUAAPY
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `LkT4VpSgUFmkD4bUAAPY`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FuD&sid=GDkuxBITVrmOJPaQAAPj
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `GDkuxBITVrmOJPaQAAPj`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FV5&sid=8Hc1YKux45hIuVVCAAPa
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `8Hc1YKux45hIuVVCAAPa`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fvz&sid=5wSumci1bYR6fG4aAAPm
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `5wSumci1bYR6fG4aAAPm`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FwX&sid=33YHm_zVf3M0WAxbAAPl
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `33YHm_zVf3M0WAxbAAPl`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FzR&sid=Q9UHEQqQbYefvcj5AAPk
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `Q9UHEQqQbYefvcj5AAPk`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6A&sid=J8on5AquFi6zi9CkAAPr
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `J8on5AquFi6zi9CkAAPr`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6x&sid=3-tzZo6dO2kVmpYmAAPs
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `3-tzZo6dO2kVmpYmAAPs`
  * Other Info: ``
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GBh&sid=hem5h8SQxMM9MxXxAAPt
  * Method: `POST`
  * Parameter: `sid`
  * Attack: ``
  * Evidence: `hem5h8SQxMM9MxXxAAPt`
  * Other Info: ``

Instances: 159

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
* URL: http://localhost:3000/assets/public/images/hackingInstructor.png
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js"></script>`
  * Other Info: ``
* URL: http://localhost:3000/assets/public/images/hackingInstructor.png
  * Method: `GET`
  * Parameter: `//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js`
  * Attack: ``
  * Evidence: `<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>`
  * Other Info: ``

Instances: 20

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

* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69Ke
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69Nu.0&sid=wbLdn0BM8HLGLsZMAAOh
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69P1&sid=wbLdn0BM8HLGLsZMAAOh
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69pN
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69s4&sid=4Is98Y-O0rui62QvAAOj
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69sm&sid=4Is98Y-O0rui62QvAAOj
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6AFO
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6AII&sid=51bU_j4kLcMn0Gd-AAOl
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Aiu
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6AIy&sid=51bU_j4kLcMn0Gd-AAOl
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Alv&sid=UDBdkq5Bo4JDK79NAAOn
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Amq&sid=UDBdkq5Bo4JDK79NAAOn
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BHH
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BLw&sid=8o0UZpDQGirok7F9AAOp
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BMb&sid=8o0UZpDQGirok7F9AAOp
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BuW
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Bxw&sid=TfINduwbbvo36TlXAAOr
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Bym&sid=TfINduwbbvo36TlXAAOr
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ccv&sid=dWvWGJBtCieMnzfKAAOz
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CfB&sid=dWvWGJBtCieMnzfKAAOz
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CHK
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CIU
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CKN&sid=o4ZbVaitb3boxlMUAAOt
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CKx
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CLF&sid=ORB4Gz_NRaUF8Q2kAAOu
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNo&sid=o4ZbVaitb3boxlMUAAOt
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNp&sid=ygptOd6jYiZ3YnPBAAOw
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNx&sid=ORB4Gz_NRaUF8Q2kAAOu
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CQh&sid=ygptOd6jYiZ3YnPBAAOw
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CqK
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Cvb&sid=cdc4NT9W5d4MtKkdAAO1
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Cw5&sid=cdc4NT9W5d4MtKkdAAO1
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CXs
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DJa
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DKJ
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DKw
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DLK
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DO_&sid=NgjGdriJOQYoqjhbAAO5
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOl&sid=l9-kMbayu326SACWAAO3
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOM&sid=pREp2MIk7zHbgFc1AAO4
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DP8&sid=68H9aiFrmKN0iZ9FAAO6
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ds7
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DvK&sid=hdFGHPvjzC9ITcpnAAO_
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Dw6&sid=hdFGHPvjzC9ITcpnAAO_
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DWc&sid=68H9aiFrmKN0iZ9FAAO6
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DWJ&sid=pREp2MIk7zHbgFc1AAO4
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DWL&sid=l9-kMbayu326SACWAAO3
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DWW&sid=NgjGdriJOQYoqjhbAAO5
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6E-v&sid=Vt2ywTpL4bSItLQDAAPP
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6E7M
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6E_x&sid=Vt2ywTpL4bSItLQDAAPP
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ECB
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EcG
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ECs
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Eei
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EEn&sid=pvsOxNKunrKiBtnBAAPB
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EGU&sid=px43s8vle1Y1TtXIAAPC
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EHG&sid=pvsOxNKunrKiBtnBAAPB
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EhN&sid=q8jh0YDvmhsJyL-CAAPJ
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EHo&sid=EMHYZ9It5owbZlUEAAPD
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EIZ
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EJA&sid=px43s8vle1Y1TtXIAAPC
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EJR&sid=EMHYZ9It5owbZlUEAAPD
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ek7&sid=q8jh0YDvmhsJyL-CAAPJ
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Eki&sid=lSRd39JyAsgoHYEHAAPK
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ElF&sid=lSRd39JyAsgoHYEHAAPK
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ENO&sid=8-gB_t-CE8u-lYn4AAPH
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EOF&sid=8-gB_t-CE8u-lYn4AAPH
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Eox
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Epj
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Evd
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Evw&sid=KWBje_AhqfGWLFKqAAPN
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ewd&sid=CWDqN7UcL7SeYpzVAAPO
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ExR&sid=KWBje_AhqfGWLFKqAAPN
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EyC&sid=CWDqN7UcL7SeYpzVAAPO
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F3C
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F5-&sid=g-IsKzTBY6-3RnfJAAPT
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F5T
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F5Z&sid=g-IsKzTBY6-3RnfJAAPT
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F9C&sid=OJqozdCqOqeId4uSAAPU
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FAA&sid=OJqozdCqOqeId4uSAAPU
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fan
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FaY
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Feh&sid=lf9XWxCmx-tPJiBhAAPg
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fgp.0&sid=WYCTEIYgm4gzVJzeAAPf
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fgx&sid=lf9XWxCmx-tPJiBhAAPg
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fhf&sid=WYCTEIYgm4gzVJzeAAPf
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FIh
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FLA
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FMK
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FMm
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FO5&sid=TpzCu3Xqh3ejl9t0AAPX
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fp2
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fqe
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fqg
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FRP&sid=LAU0vjfE_MA-c_csAAPZ
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FRu&sid=TpzCu3Xqh3ejl9t0AAPX
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FrV
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FTK&sid=LkT4VpSgUFmkD4bUAAPY
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FuO&sid=GDkuxBITVrmOJPaQAAPj
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FV6&sid=8Hc1YKux45hIuVVCAAPa
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fv_&sid=5wSumci1bYR6fG4aAAPm
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FWi&sid=LAU0vjfE_MA-c_csAAPZ
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FWx&sid=LkT4VpSgUFmkD4bUAAPY
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FwZ&sid=33YHm_zVf3M0WAxbAAPl
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FX9&sid=8Hc1YKux45hIuVVCAAPa
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FzS&sid=Q9UHEQqQbYefvcj5AAPk
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G11
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G1B&sid=GDkuxBITVrmOJPaQAAPj
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G1o&sid=5wSumci1bYR6fG4aAAPm
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G2r&sid=Q9UHEQqQbYefvcj5AAPk
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G46
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G5w
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6B&sid=J8on5AquFi6zi9CkAAPr
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6y&sid=3-tzZo6dO2kVmpYmAAPs
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GAl&sid=J8on5AquFi6zi9CkAAPr
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GBj&sid=hem5h8SQxMM9MxXxAAPt
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GC0&sid=3-tzZo6dO2kVmpYmAAPs
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GEX&sid=hem5h8SQxMM9MxXxAAPt
  * Method: `GET`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69Nu&sid=wbLdn0BM8HLGLsZMAAOh
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL69s2&sid=4Is98Y-O0rui62QvAAOj
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6AIH&sid=51bU_j4kLcMn0Gd-AAOl
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Alu&sid=UDBdkq5Bo4JDK79NAAOn
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6BLv&sid=8o0UZpDQGirok7F9AAOp
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Bxv&sid=TfINduwbbvo36TlXAAOr
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ccu&sid=dWvWGJBtCieMnzfKAAOz
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CKM&sid=o4ZbVaitb3boxlMUAAOt
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CLE&sid=ORB4Gz_NRaUF8Q2kAAOu
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CNo&sid=ygptOd6jYiZ3YnPBAAOw
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6CvZ&sid=cdc4NT9W5d4MtKkdAAO1
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOj&sid=l9-kMbayu326SACWAAO3
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOL&sid=pREp2MIk7zHbgFc1AAO4
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DOz&sid=NgjGdriJOQYoqjhbAAO5
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DP7&sid=68H9aiFrmKN0iZ9FAAO6
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6DvJ&sid=hdFGHPvjzC9ITcpnAAO_
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6E-t&sid=Vt2ywTpL4bSItLQDAAPP
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EEm&sid=pvsOxNKunrKiBtnBAAPB
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EGT&sid=px43s8vle1Y1TtXIAAPC
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EhM&sid=q8jh0YDvmhsJyL-CAAPJ
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6EHn&sid=EMHYZ9It5owbZlUEAAPD
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ekh&sid=lSRd39JyAsgoHYEHAAPK
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6ENN&sid=8-gB_t-CE8u-lYn4AAPH
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Evu&sid=KWBje_AhqfGWLFKqAAPN
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Ewc&sid=CWDqN7UcL7SeYpzVAAPO
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F5Y&sid=g-IsKzTBY6-3RnfJAAPT
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6F9B&sid=OJqozdCqOqeId4uSAAPU
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Feg&sid=lf9XWxCmx-tPJiBhAAPg
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fgp&sid=WYCTEIYgm4gzVJzeAAPf
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FO3&sid=TpzCu3Xqh3ejl9t0AAPX
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FRO&sid=LAU0vjfE_MA-c_csAAPZ
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FTJ&sid=LkT4VpSgUFmkD4bUAAPY
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FuD&sid=GDkuxBITVrmOJPaQAAPj
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FV5&sid=8Hc1YKux45hIuVVCAAPa
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6Fvz&sid=5wSumci1bYR6fG4aAAPm
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FwX&sid=33YHm_zVf3M0WAxbAAPl
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6FzR&sid=Q9UHEQqQbYefvcj5AAPk
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6A&sid=J8on5AquFi6zi9CkAAPr
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6G6x&sid=3-tzZo6dO2kVmpYmAAPs
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`
* URL: http://localhost:3000/socket.io/%3FEIO=4&transport=polling&t=OrL6GBh&sid=hem5h8SQxMM9MxXxAAPt
  * Method: `POST`
  * Parameter: `x-content-type-options`
  * Attack: ``
  * Evidence: ``
  * Other Info: `This issue still applies to error type pages (401, 403, 500, etc.) as those pages are often still affected by injection issues, in which case there is still concern for browsers sniffing pages away from their actual content type.
At "High" threshold this scan rule will not alert on client or server error responses.`

Instances: 159

### Solution

Ensure that the application/web server sets the Content-Type header appropriately, and that it sets the X-Content-Type-Options header to 'nosniff' for all web pages.
If possible, ensure that the end user uses a standards-compliant and modern web browser that does not perform MIME-sniffing at all, or that can be directed by the web application/web server to not perform MIME-sniffing.

### Reference


* [ http://msdn.microsoft.com/en-us/library/ie/gg622941%28v=vs.85%29.aspx ](http://msdn.microsoft.com/en-us/library/ie/gg622941%28v=vs.85%29.aspx)
* [ https://owasp.org/www-community/Security_Headers ](https://owasp.org/www-community/Security_Headers)


#### CWE Id: [ 693 ](https://cwe.mitre.org/data/definitions/693.html)


#### WASC Id: 15

#### Source ID: 3



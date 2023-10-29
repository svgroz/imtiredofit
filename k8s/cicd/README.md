### How to
* Get secret certificate: ```kubectl -n cicd get secret/jenkins-sa-secret -o yaml``` 
* Get secret token: ```kubectl -n cicd describe serviceaccount jenkins-sa```
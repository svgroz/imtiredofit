### How to
* Install registry ```helm install cicd-registry ./registry -n cicd```
* Get secret certificate: ```kubectl -n cicd get secret/jenkins-sa-secret -o yaml``` 
* Get secret token: ```kubectl -n cicd describe secret jenkins-sa-secret```
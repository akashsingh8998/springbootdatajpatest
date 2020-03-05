pipeline {
  agent any
  stages {
	stage('Unit Test') {
	   steps {
	       bat label: 'Test running', script: '''mvn test'''
	       echo 'Hello Testing done'
       }
   	}
   	stage('Jacoco Coverage Report') {
           steps {
               jacoco()
           }
       }
 	stage('SonarQube'){
       steps{
           bat label: '', script: '''mvn sonar:sonar \
		 -Dsonar.host.url=http://localhost:9000 \
 		-Dsonar.login=ef79b58c8954bb8dd07d2903b4cc4eb7e9f4d2e7'''
       }
   }
	stage('Maven Build'){
		steps{
				bat label:'Maven Build of war file', script:'''
					mvn clean install -DskipTests=false
					mvn package
				'''
		}
	}    
    
  }
}
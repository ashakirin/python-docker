pipeline {
    agent any
    stages {
        stage('build sample project') {
            steps {
                git 'https://github.com/ashakirin/python-docker.git'
                docker build --rm --pull -f "Dockerfile" -t "hello-python:latest" "/Users/ashakirin/Projects/python/hello"
                docker image push ashakirin/python:hello-python
            }
        }s
    }
}
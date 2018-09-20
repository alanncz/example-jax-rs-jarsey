#!/bin/bash
mvn clean package
sudo docker build -t image/server .
sudo docker run -d -t -p 8080:8080 --name server --link database:database image/server


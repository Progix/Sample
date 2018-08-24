#!/bin/bash

echo "Killing previous instance"
ps -ef | grep demo | grep -v grep | awk '{print $2}' | xargs kill -9  || true

echo "Previous instance is killed"
nohup java -jar target/demo-0.0.1-SNAPSHOT.jar &
echo "Deployment is done"

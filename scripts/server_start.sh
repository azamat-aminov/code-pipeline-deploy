#!/usr/bin/env bash
cd /home/ec2-user/server
sudo java -jar code-pipeline-deploy-0.0.1-SNAPSHOT.jar > /dev/null 2> /dev/null < /dev/null &
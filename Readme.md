Getting started with DevOps!

1. Build the image
docker build -t <imagename:version> e.g, docker build -t samshu/microservices:1.0

2. Run the container
docker run -p 80:8080 -v "$HOME/.m2":/root/.m2 <imagename:version>

3. After the first run, you can either just start/stop the container instead of running a new one.
docker start <container id/name>

Using docker-compose
---------------------
1. Start all the services defined in the docker-compose.yml file using docker-compose up
2. Stop all the services defined in the docker-compose.yml usng docker-compose stop
3. Remove all created containers - docker-compose rm

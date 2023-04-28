# spring-boot-mongodb

A sample spring boot application using spring-data-mongodb

The tests expect mongodb to be available. mongodb can be installed inside docker container as follows.

## Mongo DB in Docker using docker-compose.yml
docker-compose.yml file can be used to build and manage multiple services in Docker containers. It currently has mongodb

- https://docs.docker.com/compose/reference/overview/
- docker-compose up -d (-d for detached mode)
- docker-compose -f abc-compose.yml up -d (docker-compose.yml is default but another file can be used this way)
- docker-compose down (to stop and delete containers)

Once mongo db is started in docker, gradle will be able to build and test will be successful.
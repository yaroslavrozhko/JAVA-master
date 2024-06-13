# database/Dockerfile

FROM mysql:8.0

ENV MYSQL_ROOT_PASSWORD=password
ENV MYSQL_DATABASE=masterclass_platform

COPY schema.sql /docker-entrypoint-initdb.d/

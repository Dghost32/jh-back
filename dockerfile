# Use the official MySQL image from Docker Hub
FROM mysql

# Set the environment variables for MySQL
ENV MYSQL_ROOT_PASSWORD=rootpassword
ENV MYSQL_DATABASE=tasks
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=password

# Copy any initialization scripts if needed (optional)
# COPY ./init.sql /docker-entrypoint-initdb.d/

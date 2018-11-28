# Build
mvn clean package && docker build -t dmit2015/soap-client .

# RUN

docker rm -f soap-client || true && docker run -d -p 8080:8080 -p 4848:4848 --name soap-client dmit2015/soap-client 
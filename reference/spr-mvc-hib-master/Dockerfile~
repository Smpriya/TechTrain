# FROM tomcat
# MAINTAINER ardy.dedase@gmail.com

# ADD sample.war /usr/local/tomcat/webapps/

# CMD ["catalina.sh", "run"]


FROM java
MAINTAINER Raj

RUN curl -O http://archive.apache.org/dist/tomcat/tomcat-8/v8.0.1/bin/apache-tomcat-8.0.1.tar.gz





RUN tar xzf apache-tomcat-8.0.1.tar.gz
ADD target/spr-mvc-hib.war apache-tomcat-8.0.1/webapps/
CMD apache-tomcat-8.0.1/bin/startup.sh && tail -f apache-tomcat-8.0.1/logs/catalina.out
EXPOSE 8080

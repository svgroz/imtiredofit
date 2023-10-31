FROM amazoncorretto:17

COPY build/libs/imtiredofit-*.jar /opt/imtiredofit.jar

ENTRYPOINT ["java", "-jar", "/opt/imtiredofit.jar"]
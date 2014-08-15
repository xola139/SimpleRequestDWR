SimpleRequestDWR
================
![Settings Window](https://github.com/xola139/SimpleRequestDWR/blob/master/SimpleRequestDWR/WebContent/images/review.png
)


Proyecto de prueba para mostrar funcionamiento DWR, Consultando información de un socket y otra por consulta de un query hacia una base datos oracle.

Para realizar la prueba es necesario descargar y colocarlo en el IDE favorito y modificar 

SimpleRequestDWR/rsc/monitor.properties
    
      #datos
      ipOrigen=127.0.0.1
      
      puertoOrigen=8001
      puertoLoadIni=8004



SimpleRequestDWR/SimpleRequestDWR/WebContent/WEB-INF/spring-servlet.xml
  
      <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
    		<property name="driverClassName" value="oracle.jdbc.driver.OracleDriver" />
    		<property name="url" value="jdbc:oracle:thin:@127.0.0.1:1526:MYDATABASE" />
    		<property name="username" value="usuario" />
    		<property name="password" value="mypass" />
    	</bean>

Esta es la tabla
    
    CREATE TABLE USUARIO
    (
       ID decimal(2),
       FIRSTNAME varchar2(10),
       LASTNAME varchar2(50),
       EMAIL varchar2(50),
       PASSWORD varchar2(10)
    );
    
      INSERT INTO USUARIO (ID,FIRSTNAME,LASTNAME,EMAIL,PASSWORD) VALUES (1,'PEPE','ARBOLEDAS','pepe@pepe.com','password');
      INSERT INTO USUARIO (ID,FIRSTNAME,LASTNAME,EMAIL,PASSWORD) VALUES (2,'QUIQUE','APELLIDO','quique@quique.com','quique');


Saludos.

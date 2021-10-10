DROP TABLE IF EXISTS asistente;

 CREATE TABLE asistente (
  asi_login CHAR(20) primary key,
  asi_nombre CHAR(20),
  asi_apellido CHAR(20),
  asi_email CHAR(30),
  asi_celular BIGINT,
  asi_clave CHAR(20),
  asi_fecha_nto DATE
);
INSERT INTO asistente VALUES("rortiz","Roberto","Ortiz","rortiz@gmail.com",33244452,01,'1996-09-24' );
INSERT INTO asistente VALUES("pabloper","Pablo","Perez","paploper@gmail.com",34246452,02,'1958-08-14' );
INSERT INTO asistente VALUES("nataper","Natali","Perez","nataper@gmail.com",24125783,03,'2012-07-05');
INSERT INTO asistente VALUES("jaironi","Jairo","Nieto","jaironi@gmail.com",24125783,04,'2005-03-22');
INSERT INTO asistente VALUES("jairve","Jair","Velasco","Jairve@gmail.com",26125783,05,'2008-06-30');
INSERT INTO asistente VALUES("luisco","Luis","Cortez","luisco@gmail.com",27345783,06,'2011-08-11');
INSERT INTO asistente VALUES("renego","Rene","Gómez","renego@gmail.com",24124583,07,'2015-05-12');
INSERT INTO asistente VALUES("camiru","Camilo","Rueda","camiru@gmail.com",34625783,08,'1995-04-01');

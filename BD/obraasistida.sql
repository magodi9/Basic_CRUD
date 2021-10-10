DROP TABLE  IF EXISTS obraasistida;
CREATE TABLE obraasistida (
   oa_id int primary Key,
   oa_user CHAR(40),
   oa_obra int  ,
   oa_fecha DATETIME,
   FOREIGN KEY(oa_user) REFERENCES asistente(asi_login)  ON DELETE CASCADE,
   FOREIGN KEY (oa_obra) REFERENCEs obra(ob_id)
 
 );
INSERT INTO obraasistida VALUES (01,"rortiz",1,'2021/08/10 20:00');
INSERT INTO obraasistida VALUES (02,"rortiz",4,'2021/08/15 18:30');
INSERT INTO obraasistida VALUES (03,"rortiz",9,'2021/08/20 20:30');
INSERT INTO obraasistida VALUES (04,"pabloper",1,'2021/08/10 20:30');
INSERT INTO obraasistida VALUES (05,"nataper",2,'2021/08/14 20:30');
INSERT INTO obraasistida VALUES (06,"nataper",3,'2018/08/15 21:30');
INSERT INTO obraasistida VALUES (07,"nataper",6,'2021/08/14 15:30');
INSERT INTO obraasistida VALUES (08,"jaironi",6,'2021/08/14 15:30');
INSERT INTO obraasistida VALUES (09,"jaironi",7,'2021/08/13 18:30');
INSERT INTO obraasistida VALUES (10,"jairve",8,'2021/08/16 20:30');
INSERT INTO obraasistida VALUES (11,"jairve",9,'2021/08/14  18:30:20');
INSERT INTO obraasistida VALUES (12,"jairve",12,'2021/08/14 18:30');
INSERT INTO obraasistida VALUES (13,"renego",11,'2021/08/12 21:30');
INSERT INTO obraasistida VALUES (14,"camiru",2,'2021/08/13 17:30');
INSERT INTO obraasistida VALUES (15,"camiru",4,'2021/08/15 18:30');
INSERT INTO obraasistida VALUES (16,"camiru",5,'2021/08/16 18:30');
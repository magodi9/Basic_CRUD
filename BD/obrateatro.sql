DROP TABLE  IF EXISTS obrateatro;
Create Table obrateatro (
 ot_id int primary key,
 ob_id int,
 ot_resumen char(250),
 ot_anio int,
 ot_compañia int ,
 FOREIGN KEY(ob_id) REFERENCES  obra(ob_id),
 FOREIGN KEY(ot_compañia) REFERENCES  compañia(com_id)
);
INSERT INTO obrateatro(ot_id,ob_id,ot_resumen ,ot_anio,ot_compañia) VALUES (
1001,
1,
"Mujeres y niñas son víctimas  de la violencia sexual",
2021,
101
);
INSERT INTO obrateatro(ot_id,ob_id,ot_resumen ,ot_anio,ot_compañia) VALUES (
1002,
2,
"Homenaje a las mujeres excepcionales",
2020,
102
);
INSERT INTO obrateatro(ot_id,ob_id,ot_resumen ,ot_anio,ot_compañia) VALUES (
1003,
3,
"En la Atenas del rey Agamenón se convoca una guerra",
2021,
103);
INSERT INTO obrateatro(ot_id,ob_id,ot_resumen ,ot_anio,ot_compañia) VALUES (
1004,
4,
"Una familia exiliada durante la dictadura chilena",
2020,
104);
INSERT INTO obrateatro(ot_id,ob_id,ot_resumen ,ot_anio,ot_compañia) VALUES (
1005,
5,
"Granja de Piratas lleva su característico estilo roquero",
2021,
105);

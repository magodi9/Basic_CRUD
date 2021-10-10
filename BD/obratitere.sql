DROP TABLE IF EXISTS obratitere;
Create Table obratitere (
 oti_id int primary key references obra(ob_id),
 oti_presentaciones int,
 oti_duracion int
 );
 
INSERT INTO obratitere VALUES (6,5,120);
INSERT INTO obratitere VALUES (7,6,60);
INSERT INTO obratitere VALUES (8,7,40);
INSERT INTO obratitere VALUES (9,8,45);
INSERT INTO obratitere VALUES (10,9,60);
INSERT INTO obratitere VALUES (11,3,70);
INSERT INTO obratitere VALUES (12,4,80);
INSERT INTO obratitere VALUES (13,5,90);
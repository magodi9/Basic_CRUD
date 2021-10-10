SELECT "Consulta 1";
SELECT ob_titulo FROM obra GROUP BY  ob_titulo ;
SELECT "Consulta 2";
SELECT ob_titulo,ot_resumen,ot_anio FROM obra NATURAL JOIN obrateatro   WHERE ot_anio > 2000 GROUP BY ob_titulo;
SELECT "Consulta 3";
SELECT ob_titulo FROM obrateatro NATURAL JOIN obra JOIN compañia on com_id=ot_compañia WHERE com_nombre = "Colectivo granjas" ;
SELECT "Consulta 4";
SELECT b.ob_titulo,b.ob_id,ot_anio,ot_compañia,ot_resumen,oti_presentaciones FROM  obrateatro  JOIN obra b ON obrateatro.ot_id = b.ob_id JOIN  obra a Join obratitere on obratitere.oti_id=a.ob_id  ;
SELECT "Consulta 5";

-- database: ../DataBase/DuckHunt.sqlite

INSERT INTO Nivel
 ( Descripcion )  VALUES
 ( 'Nivel 1')
,( 'Nivel 2')
,( 'Nivel 3')
,( 'Nivel 4')
,( 'Nivel 5');

INSERT INTO UserLogin
 ( IdNivel  ,Nombre         ,Puntaje    ,Tiempo )  VALUES
 ( '1'      ,'TEST'    ,'0'     ,'0');
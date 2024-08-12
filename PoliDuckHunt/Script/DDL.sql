-- database: ../DataBase/DuckHunt.sqlite

DROP TABLE IF EXISTS UserLogin;
DROP TABLE IF EXISTS Nivel;

CREATE TABLE UserLogin (
     IdUserLogin    INTEGER     NOT NULL PRIMARY KEY AUTOINCREMENT
    ,IdNivel        INTEGER     REFERENCES Nivel (IdNivel)
    ,Nombre         VARCHAR(20) NOT NULL 
    ,Puntaje        VARCHAR(90)  
    ,Tiempo         TIME        

    ,Estado         VARCHAR(1)  NOT NULL DEFAULT('A')
    ,FechaCreacion  DATETIME    DEFAULT(datetime('now','localtime'))
    ,FechaModifica  DATETIME
); 

CREATE TABLE Nivel (
     IdNivel        INTEGER     NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Descripcion    VARCHAR(90)  

    ,Estado         VARCHAR(1)  NOT NULL DEFAULT('A')
    ,FechaCreacion  DATETIME    DEFAULT(datetime('now','localtime'))
    ,FechaModifica  DATETIME
); 
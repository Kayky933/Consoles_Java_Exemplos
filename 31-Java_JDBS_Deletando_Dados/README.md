# Como usar o projeto
Neste projeto foi ultilizado um banco de dados local o MySql, para usar esse projeto deixei um scrip do banco de dados neste readme.md que você eta vendo agora, nele contem as tabelas e os dados para que o projeto funcione, copie ele e execute no MySql workbench, dentro dessa mesma pasta em que o arquivo readme.md esta ha uma chamada db.properties, nela estão so dados de conexão, caso queira criar um banco de dados diferente e um usuario diferente com uma senha diferente tudo bem mas não se esqueça de alterar no db.proprierties, nesse aquivo estão os dados de conexão do seu projeto.

## Script MySql:

create database coursejdbc;<br><br>
use coursejdbc;<br><br>
CREATE TABLE department (<br>
  Id int(11) NOT NULL AUTO_INCREMENT,<br>
  Name varchar(60) DEFAULT NULL,<br>
  PRIMARY KEY (Id)<br>
);<br><br>

CREATE TABLE seller (<br>
  Id int(11) NOT NULL AUTO_INCREMENT,<br>
  Name varchar(60) NOT NULL,<br>
  Email varchar(100) NOT NULL,<br>
  BirthDate datetime NOT NULL,<br>
  BaseSalary double NOT NULL,<br>
  DepartmentId int(11) NOT NULL,<br>
  PRIMARY KEY (Id),<br>
  FOREIGN KEY (DepartmentId) REFERENCES department (id)<br>
);<br><br>

INSERT INTO department (Name) VALUES <br>
  ('Computers'),<br>
  ('Electronics'),<br>
  ('Fashion'),<br>
  ('Books'),<br>
   ('tools'),<br>
   ('toys');<br><br>

INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES <br>
  ('Bob Brown','bob@gmail.com','1998-04-21 00:00:00',1000,1),<br>
  ('Maria Green','maria@gmail.com','1979-12-31 00:00:00',3500,2),<br>
  ('Alex Grey','alex@gmail.com','1988-01-15 00:00:00',2200,1),<br>
  ('Martha Red','martha@gmail.com','1993-11-30 00:00:00',3000,4),<br>
  ('Donald Blue','donald@gmail.com','2000-01-09 00:00:00',4000,3),<br>
  ('Alex Pink','bob@gmail.com','1997-03-04 00:00:00',3000,2);<br>
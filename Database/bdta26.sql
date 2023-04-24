CREATE DATABASE IF NOT EXISTS bdta26;
USE bdta26;

##### TABLAS EJERCICIO 1 #####

CREATE TABLE piezas (
	id int NOT NULL AUTO_INCREMENT,
    nombre varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE proveedores (
	id char(4) NOT NULL,
	nombre varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE suministra (
	id int NOT NULL AUTO_INCREMENT,
    pieza_id int DEFAULT NULL,
    proveedor_id char(4) DEFAULT NULL,
    precio int DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT suministra_FK1 FOREIGN KEY (pieza_id) REFERENCES piezas (id) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT suministra_FK2 FOREIGN KEY (proveedor_id) REFERENCES proveedores (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO piezas (nombre) VALUES 
('Intermitente'),
('Bujia'),
('Disco freno'),
('Pneumatico'),
('Bloque motor');

INSERT INTO proveedores (id, nombre) VALUES 
('yam1', 'Yamaha'),
('hnd1', 'Honda'),
('apr1', 'Aprilia'),
('szk1', 'Suzuki');

INSERT INTO suministra (pieza_id, proveedor_id, precio) VALUES
(1, 'apr1', 25),
(2, 'szk1', 50),
(3, 'hnd1', 200),
(4, 'apr1', 250),
(5, 'yam1', 540),
(5, 'hnd1', 630);


##### TABLAS EJERCICIO 2 #####

CREATE TABLE proyectos (
	id varchar(4) NOT NULL,
	nombre varchar(255),
	horas int,
    PRIMARY KEY (id)
);
	
CREATE TABLE cientificos (
	id varchar(8) NOT NULL,
	nom_apels varchar(255),
    PRIMARY KEY (id)
);
	
CREATE TABLE asignado (
	id varchar(4) NOT NULL,
	proyecto_id varchar(4) DEFAULT NULL,
	cientifico_id varchar(8) DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT asignado_fk1 FOREIGN KEY (proyecto_id) REFERENCES proyectos (id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT asignado_fk2 FOREIGN KEY (cientifico_id) REFERENCES cientificos (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO proyectos (id, nombre, horas) VALUES 
	('a23r', 'Rayo Mortal X', 125),
	('b112', 'Rayo No Mortal Y', 2000),
	('y67j', 'Escudo de fotones', 800),
	('fr33', 'Jetpack Neutronico', 340),
	('ip00', 'Tenedor Cuantico', 575);
	
INSERT INTO cientificos (id, nom_apels) VALUES 
	('33275849', 'Lasien Tyffika'),
	('84738291', 'Profesor Frink'),
	('99826474', 'Victor Frankenstein'),
	('12674893', 'Fausto El Portugues'),
	('45637829', 'Hubert Farnsworth');
    
INSERT INTO asignado (id, proyecto_id, cientifico_id) VALUES
	('a1', 'a23r', '84738291'),
	('a2', 'b112', '33275849'),
	('a3', 'y67j', '45637829'),
	('a4', 'fr33', '99826474'),
	('a5', 'ip00', '12674893');

select * from asignado;

##### TABLAS EJERCICIO 3 #####

CREATE TABLE productos (
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100),
	precio int,
    PRIMARY KEY (id)
);

CREATE TABLE maquinas_registradoras (
	id int NOT NULL AUTO_INCREMENT,
	piso int,
    PRIMARY KEY (id)
);

CREATE TABLE cajeros (
	id int NOT NULL AUTO_INCREMENT,
	nom_apels varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE venta (
	id int NOT NULL AUTO_INCREMENT,
	cajero_id int DEFAULT NULL,
    maquina_id int DEFAULT NULL,
    producto_id int DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT venta_fk1 FOREIGN KEY (cajero_id) REFERENCES cajeros (id) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT venta_fk2 FOREIGN KEY (maquina_id) REFERENCES maquinas_registradoras (id) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT venta_fk3 FOREIGN KEY (producto_id) REFERENCES productos (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO productos (nombre, precio) VALUES
('PS5', 540),
('Cafetera', 127),
('Freidora', 80),
('Cargador mobil', 25),
('Auriculares Bluetooth', 43);

INSERT INTO maquinas_registradoras (piso) VALUES
(4),
(1),
(3),
(1),
(5);

INSERT INTO cajeros (nom_apels) VALUES
('Javier Martinez Soler'),
('Emp Leado Delmes'),
('Celia Herrera Flores'),
('Yolanda Saez Montero'),
('Sergio Mora Martin');

INSERT INTO venta (cajero_id, maquina_id, producto_id) VALUES
(1, 5, 1),
(1, 5, 5),
(2, 4, 4),
(3, 1, 2),
(5, 2, 3);


##### TABLAS EJERCICIO 4 #####

CREATE TABLE facultades (
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100),
    PRIMARY KEY (id)
);

CREATE TABLE investigadores (
	id varchar(8) NOT NULL,
    nom_apels varchar(255) DEFAULT NULL,
    facultad_id int DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT investigadores_fk1 FOREIGN KEY (facultad_id) REFERENCES facultades (id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE equipos (
	id char(4) NOT NULL,
    nombre varchar(100) DEFAULT NULL,
    facultad_id int DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT equipos_fk1 FOREIGN KEY (facultad_id) REFERENCES facultades (id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE reserva (
	id int NOT NULL AUTO_INCREMENT,
    comienzo date,
    fin date,
    investigador_id varchar(8) DEFAULT NULL,
    equipo_id char(4) DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT reserva_fk1 FOREIGN KEY (investigador_id) REFERENCES investigadores (id) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT reserva_fk2 FOREIGN KEY (equipo_id) REFERENCES equipos (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO facultades (nombre) VALUES 
	('Universidad de Girona'), 
	('Universidad Rovira i Virgili'), 
	('Universidad Politecnica de Barcelona');

INSERT INTO investigadores VALUES
	('75132883', 'Simona Rosado', 1),
	('48784301', 'Tomas Pons', 2),
	('53188299', 'Maria Gamero', 3),
	('37902631', 'Miriam Estrada', 1),
	('87112941', 'Amadeo Sabater', 3);

INSERT INTO equipos VALUES 
	('123','Agitador', 3),
	('324','Microscopio optico', 2),
	('554','Criostato', 3),
	('678','Campana extractora', 1),
	('973','Destilador', 3),
	('258','Microscopio electronico', 2),
	('885','Medidor fotovoltaico', 2),
	('113','Ordenador', 1),
	('394','Espectrofotometro', 1),
	('457','Bomba de vacio', 3);

INSERT INTO reserva (comienzo, fin, investigador_id, equipo_id) VALUES 
	('2023-04-14', '2023-04-16', '75132883', '678'),
	('2023-06-30', '2023-07-02', '37902631', '457'),
	('2023-05-21', '2023-05-29', '53188299', '973'),
	('2023-06-01', '2023-06-05', '87112941', '324'),
	('2023-07-07', '2023-07-09', '48784301', '258');
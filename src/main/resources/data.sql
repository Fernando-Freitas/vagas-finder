DROP TABLE IF EXISTS vaga;

CREATE TABLE vaga (
  id INT PRIMARY KEY,
  latitude VARCHAR(250) NOT NULL,
  longitude VARCHAR(250) NOT NULL,
  id_dispositivo VARCHAR(250) NOT NULL
);

INSERT INTO vaga (id, latitude, longitude, id_dispositivo) VALUES
  (1, '32156', '23424', '87fb603c6e17'),
  (2, '32148', '23424', '87fb603c6e17'),
  (3, '78498', '24532', '54tc789c6r54');
  
DROP TABLE IF EXISTS dispositivo;

CREATE TABLE dispositivo (
  id INT PRIMARY KEY,
  latitude VARCHAR(250) NOT NULL,
  longitude VARCHAR(250) NOT NULL
);
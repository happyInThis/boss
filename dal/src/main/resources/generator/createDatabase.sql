create database sail;
CREATE USER 'sail'@'%' IDENTIFIED BY 'sailDev';
GRANT all privileges ON sail.* TO 'sail'@'%';
flush privileges;
drop database if exists spark;
create database spark CHARACTER SET utf8 COLLATE utf8_general_ci;

show databases;

--create user fish@'localhost' identified by 'peace4';

grant all privileges on spark.* to fish;
grant all privileges on spark_security.* to fish;
grant all privileges on moon.* to fish;
grant all privileges on moon_security.* to fish;
grant all privileges on rain.* to fish;
grant all privileges on rain_security.* to fish;

SHOW VARIABLES LIKE 'character%'; --check the db encoding
SHOW CREATE TABLE moon.user_tbl;
SHOW CREATE TABLE moon.user_credential_tbl;
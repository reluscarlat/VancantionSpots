CREATE DATABASE IF NOT EXISTS `vacantionspotsdb`;

CREATE TABLE IF NOT EXISTS `spot` (
   `id` bigint(20) NOT NULL AUTO_INCREMENT,
   `name` varchar(100) NOT NULL,
   `city` varchar(100) NOT NULL,
   `daily_price` float NOT NULL,
   `activities` varchar(100) NOT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1
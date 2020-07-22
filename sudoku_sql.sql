/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 10.3.22-MariaDB-1ubuntu1 : Database - sudoku
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sudoku` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `sudoku`;

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values 
(26);

/*Table structure for table `sudoku` */

DROP TABLE IF EXISTS `sudoku`;

CREATE TABLE `sudoku` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `to_solve` varchar(500) DEFAULT NULL,
  `solution` varchar(500) DEFAULT NULL,
  `is_solved` tinyint(4) DEFAULT 0,
  `created_at` datetime DEFAULT current_timestamp(),
  `updated_at` datetime DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4;

/*Data for the table `sudoku` */

insert  into `sudoku`(`id`,`user_id`,`to_solve`,`solution`,`is_solved`,`created_at`,`updated_at`) values 
(24,NULL,'null,null,null,4,null,null,1,9,null,null,3,null,null,null,null,8,6,null,null,null,7,null,8,3,5,null,null,null,null,null,null,null,8,6,null,null,8,null,5,1,null,null,null,null,null,null,2,null,null,null,null,3,5,null,null,8,1,null,4,null,null,null,null,null,null,null,null,7,null,null,null,null,null,4,null,2,5,null,null,null,null','null,null,null,4,null,null,1,9,null,null,3,null,null,null,null,8,6,null,null,null,7,null,8,3,5,null,null,null,null,null,null,null,8,6,null,null,8,null,5,1,null,null,null,null,null,null,2,null,null,null,null,3,5,null,null,8,1,null,4,null,null,null,null,null,null,null,null,7,null,null,null,null,null,4,null,2,5,null,null,null,null',0,'2020-07-21 20:54:00','2020-07-21 20:54:00'),
(25,NULL,'null,8,5,null,null,null,null,null,9,7,null,4,5,8,null,1,null,null,null,null,null,null,null,null,null,3,8,null,2,6,8,1,null,null,null,5,8,null,null,null,null,4,7,2,null,null,7,null,null,null,null,null,9,1,null,null,null,9,null,null,null,null,null,null,null,null,null,7,null,9,1,null,1,9,null,6,null,null,null,5,null','null,8,5,null,null,null,null,null,9,7,null,4,5,8,null,1,null,null,null,null,null,null,null,null,null,3,8,null,2,6,8,1,null,null,null,5,8,null,null,null,null,4,7,2,null,null,7,null,null,null,null,null,9,1,null,null,null,9,null,null,null,null,null,null,null,null,null,7,null,9,1,null,1,9,null,6,null,null,null,5,null',0,'2020-07-21 21:54:03','2020-07-21 21:54:03');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `created_at` datetime DEFAULT current_timestamp(),
  `nickname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_n4swgcf30j6bmtb4l4cjryuym` (`nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

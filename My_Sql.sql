-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: testing
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Department`
--
DROP TABLE IF EXISTS `Department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
DROP TABLE IF EXISTS `Department`(
  `DepartmentName` char(50) NOT NULL,
  `DepartmentLocation` char(100) NOT NULL,
  `CourseNumber`  char(20) NOT NULL,
  PRIMARY KEY(`DepartmentName`,`DepartmentLocation`)
)ENGINE=MariaDB DEFAULT CHARSET=utf8;
 /*!40101 SET character_set_client = @saved_cs_client */;
 --
 -- Dumping data for table `Department`
 --
 LOCK TABLES `Department` WRITE;
 /*!40000 ALTER TABLE `Department` DISABLE KEYS */;
 INSERT INTO `Department` VALUES ('It','Floor01',3),('IDS','Floor02',1),('CM','Floor03',4);
 /*!40000 ALTER TABLE `Department` ENABLE KEYS */;
 UNLOCK TABLES;
--
--Table structure for table `Department`
--
DROP TABLE IF EXISTS `Student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE  `Student`(
   `Id` int(10) NOT NULL AUTO_INCREMENT,
   `Studentname` char(50) NOT NULL,
   `Year` int(6) NOT NULL,
   PRIMARY KEY(`Id`)
) ENGINE=MariaDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
 --
 -- Dumping data for table `Student`
 --
 LOCK TABLES `Student` WRITE;
 /*!40000 ALTER TABLE `Student` DISABLE KEYS */;
 INSERT INTO `Student` VALUES ('sanka','2nd'),('milind','2nd'),('hasan','3rd');
 /*!40000 ALTER TABLE `Student` ENABLE KEYS */;
 UNLOCK TABLES;
 --
 --Table structure for table `Department`
 --
 DROP TABLE IF EXISTS `Course`;
 /*!40101 SET @saved_cs_client     = @@character_set_client */;
 /*!40101 SET character_set_client = utf8 */;
 CREATE TABLE  `Course`(
    `CourseName` char(50) NOT NULL ,
    `Period` int(6) NOT NULL,
    `DepartmentName` char(50) NOT NULL,
    PRIMARY KEY(`CourseName`,`DepartmentName`)
 ) ENGINE=MariaDB DEFAULT CHARSET=utf8;
 /*!40101 SET character_set_client = @saved_cs_client */;
  --
  -- Dumping data for table `Student`
  --
  LOCK TABLES `Course` WRITE;
  /*!40000 ALTER TABLE `Course` DISABLE KEYS */;
  INSERT INTO `Course` VALUES ('IN2200',2,'It'),('IS2100',3,'CM'),('CM2120',2,'');
  /*!40000 ALTER TABLE `Course` ENABLE KEYS */;
  UNLOCK TABLES;
  --
  -- Table structure for table `version`
  --

  DROP TABLE IF EXISTS `version`;
  /*!40101 SET @saved_cs_client     = @@character_set_client */;
  /*!40101 SET character_set_client = utf8 */;
  CREATE TABLE `version` (
    `text` char(10) NOT NULL,
    PRIMARY KEY (`text`)
  ) ENGINE=MariaDB DEFAULT CHARSET=latin1;
  /*!40101 SET character_set_client = @saved_cs_client */;

  --
  -- Dumping data for table `version`
  --

  LOCK TABLES `version` WRITE;
  /*!40000 ALTER TABLE `version` DISABLE KEYS */;
  INSERT INTO `version` VALUES ('v1.0.0'),('v1.0.2'),('v1.1.0'),('v1.7.9'),('v1.8'),('v1.8.9'),('v2'),('v2.2'),('v2.9'),('v2.9.9');
  /*!40000 ALTER TABLE `version` ENABLE KEYS */;
  UNLOCK TABLES;
  /*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

  /*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
  /*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
  /*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
  /*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
  /*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
  /*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
  /*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

  -- Dump completed on 2017-11-14 12:20:20

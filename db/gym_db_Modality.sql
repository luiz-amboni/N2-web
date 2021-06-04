CREATE DATABASE  IF NOT EXISTS `gym_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gym_db`;
-- MySQL dump 10.13  Distrib 8.0.25, for macos11 (x86_64)
--
-- Host: localhost    Database: gym_db
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Modality`
--

DROP TABLE IF EXISTS `Modality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Modality` (
  `id` bigint NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `lastSync` datetime DEFAULT NULL,
  `timeCreation` datetime DEFAULT NULL,
  `timeModification` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Modality`
--

LOCK TABLES `Modality` WRITE;
/*!40000 ALTER TABLE `Modality` DISABLE KEYS */;
INSERT INTO `Modality` VALUES (5,'ZUMBA FITNESS','2021-05-26 01:13:53','2021-05-26 01:13:53','2021-05-26 01:13:53'),(6,'Yôga','2021-05-26 01:14:05','2021-05-26 01:14:05','2021-05-26 01:14:05'),(7,'SPINNING','2021-05-26 01:14:12','2021-05-26 01:14:12','2021-05-26 01:14:12'),(8,'POWER LOCAL','2021-05-26 01:14:18','2021-05-26 01:14:18','2021-05-26 01:14:18'),(9,'POWER JUMP','2021-05-26 01:14:31','2021-05-26 01:14:31','2021-05-26 01:14:31'),(10,'PILATES','2021-05-26 01:14:35','2021-05-26 01:14:35','2021-05-26 01:14:35'),(11,'Musculação','2021-05-26 01:14:40','2021-05-26 01:14:40','2021-05-26 01:14:40'),(12,'MUAY-THAI','2021-05-26 01:14:46','2021-05-26 01:14:46','2021-05-26 01:14:46');
/*!40000 ALTER TABLE `Modality` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-26 21:02:54
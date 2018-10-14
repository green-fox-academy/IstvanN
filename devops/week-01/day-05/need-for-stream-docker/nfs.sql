-- MySQL dump 10.13  Distrib 5.7.23, for Linux (x86_64)
--
-- Host: localhost    Database: need-for-sequel
-- ------------------------------------------------------
-- Server version	5.7.23-0ubuntu0.16.04.1

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
-- Table structure for table `video_game`
--

DROP TABLE IF EXISTS `video_game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `video_game` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `company` varchar(255) DEFAULT NULL,
  `income` int(11) NOT NULL,
  `sold_copy` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `video_game`
--

LOCK TABLES `video_game` WRITE;
/*!40000 ALTER TABLE `video_game` DISABLE KEYS */;
INSERT INTO `video_game` VALUES (1,3,'CD Projekt Red',211,87,'The Witcher III: Wild Hunt'),(2,19,'EA Sports',56,5,'FIFA 99'),(3,17,'BioWare',12,1,'Neverwinter Nights'),(4,5,'Rockstar Games',315,125,'GTA V'),(5,18,'Maxis',62,27,'The Sims'),(6,18,'3DO',48,19,'Heroes of Might And Magic III'),(7,16,'3DO',34,4,'Heroes of Might And Magic IV'),(8,9,'BioWare',57,34,'Dragon Age: Origins'),(9,7,'BioWare',42,22,'Dragon Age II'),(10,18,'Black Isle Studios',34,11,'Icewind Dale'),(11,15,'Electronic Arts',39,15,'Need For Speed:Underground'),(12,14,'Rockstar Games',45,24,'GTA San Andreas'),(13,11,'CD Projekt Red',27,5,'The Witcher'),(14,13,'Microsoft Studios',9,1,'Dungeon Siege II'),(15,17,'Valve Corporation',29,19,'Counter-Strike 1.6'),(16,6,'Valve Corporation',255,140,'Counter-Strike: Global Offensive'),(17,3,'Psyonix',68,27,'Rocket League'),(18,3,'Dontnod Entertainment',57,26,'Life Is Strange'),(19,23,'Electronic Arts',4,1,'Mortal Kombat'),(20,22,'Midway Games',16,8,'Mortal Kombat 3'),(21,18,'Black Isle Studios',54,19,'Baldur\'s Gate II'),(22,16,'Bethesda Softworks',47,18,'The Elder Scrolls III: Morrowind'),(23,14,'Blizzard Entertainment',358,141,'World of Warcraft'),(24,12,'Bethesda Softworks',61,21,'The Elder Scrolls IV: Oblivion'),(25,7,'Bethesda Softworks',241,125,'The Elder Scrolls V: Skyrim'),(26,19,'Acclaim Studios',18,6,'Re-Volt'),(27,17,'Blizzard Entertainment',81,43,'Diablo II: Lord of Destruction'),(28,13,'2K Games',59,19,'Sid Meier\'s Civilization IV'),(29,18,'Valve Corporation',39,12,'Portal'),(30,11,'Valve Corporation',45,18,'Portal 2'),(31,25,'id Software',71,47,'Doom'),(32,16,'Rockstar Games',27,11,'GTA Vice City'),(33,14,'Maxis',128,64,'The Sims 2'),(34,22,'Activision Blizzard',109,64,'Quake'),(35,14,'Troika Games',24,9,'Vampire The Masquerade: Bloodlines'),(36,11,'Valve Corporation',114,71,'Team Fortress 2'),(37,21,'Eidos Interactive',19,7,'Tomb Raider II'),(38,21,'EA Sports',21,9,'FIFA World Cup \'98'),(39,22,'Microsoft',15,6,'Microsoft Soccer'),(40,18,'Neversoft',58,24,'Tony Hawk\'s Pro Skater 2'),(41,14,'Obsidian Entertainment',41,19,'Star Wars: Knights of the Old Republic II'),(42,2,'Blizzard Entertainment',194,84,'Overwatch');
/*!40000 ALTER TABLE `video_game` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-12 22:22:53

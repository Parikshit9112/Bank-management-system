-- MySQL dump 10.13  Distrib 5.1.58, for Win64 (unknown)
--
-- Host: localhost    Database: bank
-- ------------------------------------------------------
-- Server version	5.1.58-community

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `Account_Number` varchar(20) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Father_Name` varchar(20) DEFAULT NULL,
  `Date_Of_birth` varchar(20) DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Mobile_Number` varchar(11) DEFAULT NULL,
  `Adhar_Card_Number` varchar(15) DEFAULT NULL,
  `Balance` float DEFAULT NULL,
  `Pin_Number` varchar(20) DEFAULT NULL,
  `Nomination` varchar(20) DEFAULT NULL,
  `Card_Number` varchar(20) DEFAULT NULL,
  `Date_Of_Joining` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES ('101','Parikshit','Mr.Suresh ','02/02/2002','HNo.=306,Bakhtawarpur,Delhi=36','Male','8130660416','325974613854',250070,'2119','Mrs.Sunita','9RHHJ531KH','12/06/2019'),('102','Rohit','Mr.Prakash','05/01/2000','HNo.=309,Amrit Vihar,Delhi=84','Male','8447067145','595974613824',100000,'123','Mrs.Rekha','2RLHJ531KU','27/06/2019'),('103','Ashin','Mr.John ','15/01/2002','HNo.=309,Model Town,Delhi=09','Male','9773825846','465974613879',200086,'456','Ms.Rani Mary','5RLAJ531KJ','28/06/2019'),('104','Sanchit','Mr.Hemkant','31/05/2000','HNo.=897,Burari,Delhi=84','Male','9910404791','985974613886',90006,'789','Mr.Hemkant','8RLsJ531SH','01/07/2019'),('101','Dhruv','Mr.Rakesh','26/02/2003','HNo.=666,Bakhtawarpur,Delhi=36','Male','8506801220','665974613666',600005,'666','Mrs.Pinki','6RHHJ531DG','15/07/2019');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `user_id` varchar(20) DEFAULT NULL,
  `password` char(10) NOT NULL,
  PRIMARY KEY (`password`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('Dhruv','goel696'),('Ashin','John456'),('Parikshit','rajput2119'),('Rohit','rawat123'),('Sanchit','sharma789');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `Transaction_ID` varchar(10) NOT NULL,
  `Date` varchar(20) DEFAULT NULL,
  `Payee_Name` varchar(20) DEFAULT NULL,
  `Reciever_ID` varchar(20) DEFAULT NULL,
  `Amount` float DEFAULT NULL,
  PRIMARY KEY (`Transaction_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES ('201','21/06/2019','Parikshit','102',23),('202','24/06/2019','Parikshit','103',253),('203','24/06/2019','Parikshit','102',5),('204','24/06/2019','Parikshit','102',5);
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `withdraw`
--

DROP TABLE IF EXISTS `withdraw`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `withdraw` (
  `Withdrawal_ID` varchar(10) NOT NULL,
  `Date` varchar(20) DEFAULT NULL,
  `User_ID` varchar(20) DEFAULT NULL,
  `User_Name` varchar(20) DEFAULT NULL,
  `Amount` float DEFAULT NULL,
  PRIMARY KEY (`Withdrawal_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `withdraw`
--

LOCK TABLES `withdraw` WRITE;
/*!40000 ALTER TABLE `withdraw` DISABLE KEYS */;
INSERT INTO `withdraw` VALUES ('201','21/06/2019','101','Parikshit',23),('202','24/06/2019','101','Parikshit',253),('203','24/06/2019','103','Rishu',255),('204','24/06/2019','101','Parikshit',5);
/*!40000 ALTER TABLE `withdraw` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-18 20:12:59

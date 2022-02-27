CREATE DATABASE  IF NOT EXISTS `nutrihelp` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `nutrihelp`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: nutrihelp
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
-- Table structure for table `alimentos`
--

DROP TABLE IF EXISTS `alimentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alimentos` (
  `id_comidad` int NOT NULL AUTO_INCREMENT,
  `mineral1` double DEFAULT NULL,
  `mineral2` double DEFAULT NULL,
  `mineral3` double DEFAULT NULL,
  `mineral4` double DEFAULT NULL,
  `mineral5` double DEFAULT NULL,
  `vitamina1` double DEFAULT NULL,
  `vitamina2` double DEFAULT NULL,
  `vitamina3` double DEFAULT NULL,
  `vitamina4` double DEFAULT NULL,
  `vitamina5` double DEFAULT NULL,
  `vitamina6` double DEFAULT NULL,
  `vitamina7` double DEFAULT NULL,
  `vitamina8` double DEFAULT NULL,
  `vitamina9` double DEFAULT NULL,
  `vitamina10` double DEFAULT NULL,
  `vitamina11` double DEFAULT NULL,
  `vitamina12` double DEFAULT NULL,
  `fibra` double DEFAULT NULL,
  `carbohidratos` double DEFAULT NULL,
  `proteinas` double DEFAULT NULL,
  `lipidos` double DEFAULT NULL,
  PRIMARY KEY (`id_comidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alimentos`
--

LOCK TABLES `alimentos` WRITE;
/*!40000 ALTER TABLE `alimentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `alimentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ap_cardiovascular`
--

DROP TABLE IF EXISTS `ap_cardiovascular`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ap_cardiovascular` (
  `entumecimiento` varchar(45) DEFAULT NULL,
  `edema` varchar(45) DEFAULT NULL,
  `venas_varicosas` varchar(45) DEFAULT NULL,
  `taquicardias` varchar(45) DEFAULT NULL,
  `disnea` varchar(45) DEFAULT NULL,
  `mareos` varchar(45) DEFAULT NULL,
  `vertigo` varchar(45) DEFAULT NULL,
  `ta_semana` varchar(45) DEFAULT NULL,
  `ideval_clinica` int NOT NULL,
  KEY `fk_ap_cardiovascular_eval_clinica_id_idx` (`ideval_clinica`),
  CONSTRAINT `fk_ap_cardiovascular_eval_clinica_id` FOREIGN KEY (`ideval_clinica`) REFERENCES `eval_clinica` (`ideval_clinica`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ap_cardiovascular`
--

LOCK TABLES `ap_cardiovascular` WRITE;
/*!40000 ALTER TABLE `ap_cardiovascular` DISABLE KEYS */;
/*!40000 ALTER TABLE `ap_cardiovascular` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aspectos_ginec`
--

DROP TABLE IF EXISTS `aspectos_ginec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aspectos_ginec` (
  `embarazo_actual` varchar(45) DEFAULT NULL,
  `sdg` int DEFAULT NULL,
  `cesareas` int DEFAULT NULL,
  `abortos` int DEFAULT NULL,
  `partos` int DEFAULT NULL,
  `anticonceptivos_orales` varchar(45) DEFAULT NULL,
  `climaterio` varchar(45) DEFAULT NULL,
  `climaterio_fecha` date DEFAULT NULL,
  `ideval_clinica` int NOT NULL,
  KEY `fk_aspectos_gin_eval_clinica_id_idx` (`ideval_clinica`),
  CONSTRAINT `fk_aspectos_gin_eval_clinica_id` FOREIGN KEY (`ideval_clinica`) REFERENCES `eval_clinica` (`ideval_clinica`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aspectos_ginec`
--

LOCK TABLES `aspectos_ginec` WRITE;
/*!40000 ALTER TABLE `aspectos_ginec` DISABLE KEYS */;
/*!40000 ALTER TABLE `aspectos_ginec` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calculo_dietetico`
--

DROP TABLE IF EXISTS `calculo_dietetico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calculo_dietetico` (
  `id_calc` int NOT NULL AUTO_INCREMENT,
  `id_paciente` int DEFAULT NULL,
  `peso` double DEFAULT NULL,
  `talla` double DEFAULT NULL,
  `act_fisica` varchar(30) DEFAULT NULL,
  `GEB` double DEFAULT NULL,
  `ETA` double DEFAULT NULL,
  `AF` double DEFAULT NULL,
  `GT` double DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id_calc`),
  KEY `id_paciente_idx` (`id_paciente`),
  CONSTRAINT `id_paciente` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calculo_dietetico`
--

LOCK TABLES `calculo_dietetico` WRITE;
/*!40000 ALTER TABLE `calculo_dietetico` DISABLE KEYS */;
INSERT INTO `calculo_dietetico` VALUES (8,27,75,150,'Sedentario',1687.1,168.71,50613,50781.71,'2021-05-06');
/*!40000 ALTER TABLE `calculo_dietetico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eval_antro`
--

DROP TABLE IF EXISTS `eval_antro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eval_antro` (
  `ideval_antro` int NOT NULL AUTO_INCREMENT,
  `peso_actual` decimal(10,0) NOT NULL,
  `estatura` decimal(10,0) NOT NULL,
  `pliegue_cut_tricipital` decimal(10,0) NOT NULL,
  `pliegue_cut_bicipital` decimal(10,0) NOT NULL,
  `pliegue_cut_subescapular` decimal(10,0) NOT NULL,
  `pliegue_cut_suprailiaco` decimal(10,0) NOT NULL,
  `circunferencia_cefalica` decimal(10,0) NOT NULL,
  `circunferencia_toracica` decimal(10,0) NOT NULL,
  `circunferencia_brazo` decimal(10,0) NOT NULL,
  `circunferencia_munieca` decimal(10,0) NOT NULL,
  `circunferencia_cintura` decimal(10,0) NOT NULL,
  `circunferencia_cadera` decimal(10,0) NOT NULL,
  `circunferencia_abdominal` decimal(10,0) NOT NULL,
  `circunferencia_muslo` decimal(10,0) NOT NULL,
  `circunferencia_pantorrilla` decimal(10,0) NOT NULL,
  `idPaciente` int NOT NULL,
  PRIMARY KEY (`ideval_antro`),
  KEY `fk_eval_antro_paciente_id_idx` (`idPaciente`),
  CONSTRAINT `fk_eval_antro_paciente_id` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eval_antro`
--

LOCK TABLES `eval_antro` WRITE;
/*!40000 ALTER TABLE `eval_antro` DISABLE KEYS */;
/*!40000 ALTER TABLE `eval_antro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eval_clinica`
--

DROP TABLE IF EXISTS `eval_clinica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eval_clinica` (
  `ideval_clinica` int NOT NULL AUTO_INCREMENT,
  `diabetes` varchar(45) DEFAULT NULL,
  `hipertension_arterial` varchar(45) DEFAULT NULL,
  `obesidad` varchar(45) DEFAULT NULL,
  `cardiopatia` varchar(45) DEFAULT NULL,
  `enfermedad_renal` varchar(45) DEFAULT NULL,
  `enfermedad_epatica` varchar(45) DEFAULT NULL,
  `hipo_hipertiroidismo` varchar(45) DEFAULT NULL,
  `cancer` varchar(45) DEFAULT NULL,
  `otros` varchar(45) DEFAULT NULL,
  `idPaciente` int NOT NULL,
  PRIMARY KEY (`ideval_clinica`),
  KEY `fk_eval_clinica_paciente_id_idx` (`idPaciente`),
  CONSTRAINT `fk_eval_clinica_paciente_id` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eval_clinica`
--

LOCK TABLES `eval_clinica` WRITE;
/*!40000 ALTER TABLE `eval_clinica` DISABLE KEYS */;
/*!40000 ALTER TABLE `eval_clinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eval_quimica`
--

DROP TABLE IF EXISTS `eval_quimica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eval_quimica` (
  `ideval_quimica` int NOT NULL AUTO_INCREMENT,
  `archivo` varchar(200) NOT NULL,
  `idPaciente` int NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`ideval_quimica`),
  KEY `fk_eval_quimica_paciente_id_idx` (`idPaciente`),
  CONSTRAINT `fk_eval_quimica_paciente_id` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eval_quimica`
--

LOCK TABLES `eval_quimica` WRITE;
/*!40000 ALTER TABLE `eval_quimica` DISABLE KEYS */;
/*!40000 ALTER TABLE `eval_quimica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `infante`
--

DROP TABLE IF EXISTS `infante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `infante` (
  `idpaciente` int NOT NULL,
  `peso` double DEFAULT NULL,
  `talla` double DEFAULT NULL,
  `IMC` double DEFAULT NULL,
  `observaciones` varchar(150) DEFAULT NULL,
  `coordenadaTE` varchar(15) DEFAULT NULL,
  `comentarioTE` varchar(60) DEFAULT NULL,
  `coordenadaPE` varchar(15) DEFAULT NULL,
  `comentarioPE` varchar(60) DEFAULT NULL,
  `coordenadaPT` varchar(15) DEFAULT NULL,
  `comentarioPT` varchar(60) DEFAULT NULL,
  UNIQUE KEY `idpaciente_UNIQUE` (`idpaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `infante`
--

LOCK TABLES `infante` WRITE;
/*!40000 ALTER TABLE `infante` DISABLE KEYS */;
/*!40000 ALTER TABLE `infante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `idPaciente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `edad` int NOT NULL,
  `estado_civil` varchar(20) NOT NULL,
  `ocupacion` varchar(45) NOT NULL,
  `tel_casa` varchar(10) DEFAULT NULL,
  `domicilio` varchar(45) DEFAULT NULL,
  `celular` varchar(10) NOT NULL,
  `motivo_consulta` varchar(100) DEFAULT NULL,
  `eliminacion_logica` tinyint DEFAULT NULL,
  PRIMARY KEY (`idPaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,'Aldahir Santiago Carrillo','Masculino',21,'Soltero','Estudiante',NULL,NULL,'9513033059',NULL,NULL),(2,'Erwin Parada Martinez','Masculino',20,'Soltero','Estudiante',NULL,NULL,'9514670463',NULL,NULL),(3,'Nicolas Pacheco Edgar Modesto','Masculino',21,'Soltero','Estudiante','9514569725','Mirador del fortin #106, col Del Fortin','9512659584','Bajo peso',NULL),(27,'Juan Perez Perez','hombre',23,'asdasd','asdasd','124123412','asdasd','12314124','',0);
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro24h`
--

DROP TABLE IF EXISTS `registro24h`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro24h` (
  `numero_registro` int NOT NULL AUTO_INCREMENT,
  `id_paciente` int NOT NULL,
  `fecha` date NOT NULL,
  `eliminacion_logica` tinyint DEFAULT NULL,
  `lunes` varchar(100) DEFAULT NULL,
  `martes` varchar(100) DEFAULT NULL,
  `miercoles` varchar(100) DEFAULT NULL,
  `jueves` varchar(100) DEFAULT NULL,
  `viernes` varchar(100) CHARACTER SET armscii8 COLLATE armscii8_general_ci DEFAULT NULL,
  `carbohidratos` int DEFAULT NULL,
  `proteinas` int DEFAULT NULL,
  `lipidos` int DEFAULT NULL,
  `observaciones` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`numero_registro`),
  KEY `fk_registro24h_paciente_id_idx` (`id_paciente`),
  CONSTRAINT `fk_registro24h_paciente_id` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro24h`
--

LOCK TABLES `registro24h` WRITE;
/*!40000 ALTER TABLE `registro24h` DISABLE KEYS */;
INSERT INTO `registro24h` VALUES (11,27,'2021-05-06',0,'','','','','',0,0,0,'Obesidad');
/*!40000 ALTER TABLE `registro24h` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sist_digest`
--

DROP TABLE IF EXISTS `sist_digest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sist_digest` (
  `problem_masticar` varchar(45) DEFAULT NULL,
  `ausencia_pzdental` varchar(45) DEFAULT NULL,
  `dificult_deglutir` varchar(45) DEFAULT NULL,
  `reflujo` varchar(45) DEFAULT NULL,
  `pirosis` varchar(45) DEFAULT NULL,
  `colitis` varchar(45) DEFAULT NULL,
  `gastritis` varchar(45) DEFAULT NULL,
  `meteorismo` varchar(45) DEFAULT NULL,
  `diarrea` varchar(45) DEFAULT NULL,
  `dolor_ardor_despComer` varchar(45) DEFAULT NULL,
  `num_evacDiaYcolor` varchar(45) DEFAULT NULL,
  `estrenimiento` varchar(45) DEFAULT NULL,
  `laxantes` varchar(45) DEFAULT NULL,
  `diureticos` varchar(45) DEFAULT NULL,
  `antiacidos` varchar(45) DEFAULT NULL,
  `sist_digestcol` varchar(45) DEFAULT NULL,
  `ideval_clinica` int NOT NULL,
  KEY `fk_sist_digest_eval_clinica_id_idx` (`ideval_clinica`),
  CONSTRAINT `fk_sist_digest_eval_clinica_id` FOREIGN KEY (`ideval_clinica`) REFERENCES `eval_clinica` (`ideval_clinica`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sist_digest`
--

LOCK TABLES `sist_digest` WRITE;
/*!40000 ALTER TABLE `sist_digest` DISABLE KEYS */;
/*!40000 ALTER TABLE `sist_digest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sist_nerv`
--

DROP TABLE IF EXISTS `sist_nerv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sist_nerv` (
  `ansiedad` varchar(45) DEFAULT NULL,
  `depresion` varchar(45) DEFAULT NULL,
  `estres` varchar(45) DEFAULT NULL,
  `problem_ingestaAlimentos` varchar(45) DEFAULT NULL,
  `anorexia` varchar(45) DEFAULT NULL,
  `mialgias` varchar(45) DEFAULT NULL,
  `artralgias` varchar(45) DEFAULT NULL,
  `cirugias` varchar(45) DEFAULT NULL,
  `hospitalizaciones_prev` varchar(100) DEFAULT NULL,
  `alergias_medicamentos` varchar(100) DEFAULT NULL,
  `padecimiento_actual` varchar(100) DEFAULT NULL,
  `prescripcion_medica` varchar(100) DEFAULT NULL,
  `ideval_clinica` int NOT NULL,
  KEY `fk_sist_nerv_eval_clinica_id_idx` (`ideval_clinica`),
  CONSTRAINT `fk_sist_nerv_eval_clinica_id` FOREIGN KEY (`ideval_clinica`) REFERENCES `eval_clinica` (`ideval_clinica`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sist_nerv`
--

LOCK TABLES `sist_nerv` WRITE;
/*!40000 ALTER TABLE `sist_nerv` DISABLE KEYS */;
/*!40000 ALTER TABLE `sist_nerv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sist_renal`
--

DROP TABLE IF EXISTS `sist_renal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sist_renal` (
  `color_orina` varchar(45) DEFAULT NULL,
  `dolor_ardor_miccion` varchar(45) DEFAULT NULL,
  `dolor_areaRenal` varchar(45) DEFAULT NULL,
  `infecciones_recurrentes` varchar(45) DEFAULT NULL,
  `ideval_clinica` int NOT NULL,
  KEY `fk_sist_renal_eval_clinica_id_idx` (`ideval_clinica`),
  CONSTRAINT `fk_sist_renal_eval_clinica_id` FOREIGN KEY (`ideval_clinica`) REFERENCES `eval_clinica` (`ideval_clinica`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sist_renal`
--

LOCK TABLES `sist_renal` WRITE;
/*!40000 ALTER TABLE `sist_renal` DISABLE KEYS */;
/*!40000 ALTER TABLE `sist_renal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'nutrihelp'
--

--
-- Dumping routines for database 'nutrihelp'
--
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_calculo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_calculo`(IN id_p int,IN geb double, IN eta double,IN af double,IN gt double)
BEGIN
	UPDATE calculo_dietetico SET GEB=geb,ETA=eta,AF=af,GT=gt
    where id_paciente=id_p;  
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_datos_infante` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_datos_infante`(IN id_paciente int,IN p double,IN t double,IN i double)
BEGIN
	UPDATE infante SET peso=p,talla=t,imc=i 
    where infante.idpaciente=id_paciente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_observaciones` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_observaciones`(IN id_paciente int,IN obser varchar(150))
BEGIN
	UPDATE infante SET infante.observaciones=obser
    where infante.idpaciente=id_paciente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_tabla1` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_tabla1`(IN id_paciente int,IN coor varchar(15),IN comen varchar(60))
BEGIN
	UPDATE infante SET coordenadaTE=coor,comentarioTE=comen
    where infante.idpaciente=id_paciente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_tabla2` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_tabla2`(IN id_paciente int,IN coor varchar(15),IN comen varchar(60))
BEGIN
	UPDATE infante SET coordenadaPE=coor,comentarioPE=comen
    where infante.idpaciente=id_paciente and id_calc=max(id_calc);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_tabla3` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_tabla3`(IN id_paciente int,IN coor varchar(15),IN comen varchar(60))
BEGIN
	UPDATE infante SET coordenadaPT=coor,comentarioPT=comen
    where infante.idpaciente=id_paciente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Consultar_calculo1` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_calculo1`(IN id_p int)
BEGIN
	SELECT peso,talla,act_fisica FROM calculo_dietetico
    WHERE calculo_dietetico.id_paciente=id_p;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Consultar_calculo2` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_calculo2`(IN id_p int)
BEGIN
	SELECT 	GEB,ETA,AF,GT FROM calculo_dietetico
    WHERE calculo_dieteico.id_paciente=id_p and fecha=max(fecha);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Consultar_Paciente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_Paciente`(IN n VARCHAR(45))
BEGIN
	SELECT *
    FROM paciente
    WHERE nombre=n;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Consultar_quimica` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_quimica`(IN paciente int)
BEGIN
	SELECT archivo
    FROM eval_quimica
    WHERE idPaciente=paciente AND fecha=max(fecha);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Consultar_registro24h` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_registro24h`(IN paciente int)
BEGIN
	SELECT *
    FROM registro24h
    WHERE id_paciente=paciente AND fecha=max(fecha);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_calculo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_calculo`(IN id_p int,IN peso double,IN talla double,IN actividad varchar(30),IN fecha date)
BEGIN
	INSERT INTO calculo_dietetico (id_paciente,peso,talla,act_fisica,fecha) 
    VALUES (id_p,peso,talla,actividad,fecha);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_infante` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_infante`(IN id_p int)
BEGIN
	INSERT INTO infante (idpaciente) VALUES (id_p);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_Paciente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Paciente`(IN nombre VARCHAR(45),IN sexo varchar(15),IN edad int,IN estado_civil varchar(20),IN ocupacion varchar(45),IN tel_casa varchar(10),IN domicilio varchar(45),IN celular varchar(10),IN motivo varchar(100))
BEGIN
	INSERT INTO paciente (nombre,sexo,edad,estado_civil,ocupacion,tel_casa,domicilio,celular,motivo_consulta,eliminacion_logica) VALUES (nombre,sexo,edad,estado_civil,ocupacion,tel_casa,domicilio,celular,motivo,0);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_quimica` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_quimica`(IN direccion VARCHAR(200),IN paciente int,IN fecha DATE)
BEGIN
	INSERT INTO eval_quimica(archivo,idPaciente,fecha) VALUES (direccion,paciente,fecha);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_registro24h` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_registro24h`(IN paciente int,IN fecha DATE,IN lunes varchar(100),IN martes varchar(100),IN miercoles varchar(100),IN jueves varchar(100),IN viernes varchar(100),IN carbo int,IN proteinas int,IN lipidos int,observaciones varchar(100))
BEGIN
	INSERT INTO registro24h(id_paciente,fecha,eliminacion_logica,lunes,martes,miercoles,jueves,viernes,carbohidratos,proteinas,lipidos,observaciones) 
    VALUES (paciente,fecha,0,lunes,martes,miercoles,jueves,viernes,carbo,proteinas,lipidos,observaciones);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `retorno_id` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `retorno_id`(IN nombre varchar(45),IN edad int)
BEGIN
	SELECT idPaciente from paciente where paciente.nombre=nombre && paciente.edad=edad;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-26 13:45:39

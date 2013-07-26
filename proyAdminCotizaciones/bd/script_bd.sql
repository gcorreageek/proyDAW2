CREATE DATABASE  IF NOT EXISTS `bd_cotizacion` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bd_cotizacion`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
-- gustavo
-- gustavimoo1
-- gustavimoo2
-- Host: 127.0.0.1    Database: bd_cotizacion
-- ------------------------------------------------------
-- Server version	5.5.9

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
-- Table structure for table `cargo`
--

DROP TABLE IF EXISTS `cargo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cargo` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargo`
--

LOCK TABLES `cargo` WRITE;
/*!40000 ALTER TABLE `cargo` DISABLE KEYS */;
INSERT INTO `cargo` VALUES (1,'Vendedor');
/*!40000 ALTER TABLE `cargo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `razon_social` varchar(200) DEFAULT NULL,
  `tipo_identificacion` tinyint(4) DEFAULT NULL,
  `numero_identificacion` varchar(200) DEFAULT NULL,
  `correo` varchar(200) DEFAULT NULL,
  `telefonos` varchar(200) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `id_ubigeo` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_ubigeo` (`id_ubigeo`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_ubigeo`) REFERENCES `ubigeo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cotizacion`
--

DROP TABLE IF EXISTS `cotizacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cotizacion` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nro_cotizacion` varchar(200) DEFAULT NULL,
  `tipo_cotizacion` tinyint(4) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `version` tinyint(4) DEFAULT NULL,
  `id_cliente` tinyint(4) DEFAULT NULL,
  `id_usuario` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `cotizacion_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `cotizacion_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cotizacion`
--

LOCK TABLES `cotizacion` WRITE;
/*!40000 ALTER TABLE `cotizacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `cotizacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_cotizacion`
--

DROP TABLE IF EXISTS `detalle_cotizacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_cotizacion` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `precio` double DEFAULT NULL,
  `cantidad` tinyint(4) DEFAULT NULL,
  `id_cotizacion` tinyint(4) DEFAULT NULL,
  `id_producto_proveedor` tinyint(4) DEFAULT NULL,
  `id_producto_detalle` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cotizacion` (`id_cotizacion`),
  KEY `id_producto_proveedor` (`id_producto_proveedor`),
  KEY `id_producto_detalle` (`id_producto_detalle`),
  CONSTRAINT `detalle_cotizacion_ibfk_1` FOREIGN KEY (`id_cotizacion`) REFERENCES `cotizacion` (`id`),
  CONSTRAINT `detalle_cotizacion_ibfk_2` FOREIGN KEY (`id_producto_proveedor`) REFERENCES `producto_proveedor` (`id`),
  CONSTRAINT `detalle_cotizacion_ibfk_3` FOREIGN KEY (`id_producto_detalle`) REFERENCES `producto_detalle` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_cotizacion`
--

LOCK TABLES `detalle_cotizacion` WRITE;
/*!40000 ALTER TABLE `detalle_cotizacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_cotizacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marca` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `icono` varchar(200) DEFAULT NULL,
  `tipo_menu` tinyint(4) DEFAULT NULL,
  `id_submenu` tinyint(4) DEFAULT NULL,
  `orden` tinyint(4) DEFAULT NULL,
  `iniciofin` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'Mant.Marca','jsf/mantenimientos/mainMarca.jsf','icon-list',1,1,2,0),(2,'Transacciones','#','icon-edit',1,2,4,0),(3,'Cotizaciones','#','icon-calendar',1,3,5,0),(4,'Inicio','#','icon-desktop',1,4,1,0);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opciones`
--

DROP TABLE IF EXISTS `opciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opciones` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `id_menu` tinyint(4) DEFAULT NULL,
  `id_cargo` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_menu` (`id_menu`),
  KEY `id_cargo` (`id_cargo`),
  CONSTRAINT `opciones_ibfk_1` FOREIGN KEY (`id_menu`) REFERENCES `menu` (`id`),
  CONSTRAINT `opciones_ibfk_2` FOREIGN KEY (`id_cargo`) REFERENCES `cargo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opciones`
--

LOCK TABLES `opciones` WRITE;
/*!40000 ALTER TABLE `opciones` DISABLE KEYS */;
INSERT INTO `opciones` VALUES (1,1,1),(2,2,1),(3,3,1),(4,4,1);
/*!40000 ALTER TABLE `opciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_detalle`
--

DROP TABLE IF EXISTS `producto_detalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto_detalle` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `id_producto_marca` tinyint(4) DEFAULT NULL,
  `id_umedida` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_producto_marca` (`id_producto_marca`),
  KEY `id_umedida` (`id_umedida`),
  CONSTRAINT `producto_detalle_ibfk_1` FOREIGN KEY (`id_producto_marca`) REFERENCES `producto_marca` (`id`),
  CONSTRAINT `producto_detalle_ibfk_2` FOREIGN KEY (`id_umedida`) REFERENCES `umedida` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_detalle`
--

LOCK TABLES `producto_detalle` WRITE;
/*!40000 ALTER TABLE `producto_detalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto_detalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_marca`
--

DROP TABLE IF EXISTS `producto_marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto_marca` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `id_producto` tinyint(4) DEFAULT NULL,
  `id_marca` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_producto` (`id_producto`),
  KEY `id_marca` (`id_marca`),
  CONSTRAINT `producto_marca_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`),
  CONSTRAINT `producto_marca_ibfk_2` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_marca`
--

LOCK TABLES `producto_marca` WRITE;
/*!40000 ALTER TABLE `producto_marca` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto_marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_proveedor`
--

DROP TABLE IF EXISTS `producto_proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto_proveedor` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `id_producto_detalle` tinyint(4) DEFAULT NULL,
  `id_proveedor` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_producto_detalle` (`id_producto_detalle`),
  KEY `id_proveedor` (`id_proveedor`),
  CONSTRAINT `producto_proveedor_ibfk_1` FOREIGN KEY (`id_producto_detalle`) REFERENCES `producto_detalle` (`id`),
  CONSTRAINT `producto_proveedor_ibfk_2` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_proveedor`
--

LOCK TABLES `producto_proveedor` WRITE;
/*!40000 ALTER TABLE `producto_proveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto_proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedor` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `razon_social` varchar(200) DEFAULT NULL,
  `tipo_identificacion` tinyint(4) DEFAULT NULL,
  `numero_identificacion` varchar(200) DEFAULT NULL,
  `telefonos` varchar(200) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `id_ubigeo` tinyint(4) DEFAULT NULL,
  `correo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_ubigeo` (`id_ubigeo`),
  CONSTRAINT `proveedor_ibfk_1` FOREIGN KEY (`id_ubigeo`) REFERENCES `ubigeo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ubigeo`
--

DROP TABLE IF EXISTS `ubigeo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ubigeo` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `id_departamento` tinyint(4) DEFAULT NULL,
  `id_provincia` tinyint(4) DEFAULT NULL,
  `id_distrito` tinyint(4) DEFAULT NULL,
  `nombre` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubigeo`
--

LOCK TABLES `ubigeo` WRITE;
/*!40000 ALTER TABLE `ubigeo` DISABLE KEYS */;
/*!40000 ALTER TABLE `ubigeo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `umedida`
--

DROP TABLE IF EXISTS `umedida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `umedida` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `umedida`
--

LOCK TABLES `umedida` WRITE;
/*!40000 ALTER TABLE `umedida` DISABLE KEYS */;
/*!40000 ALTER TABLE `umedida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(200) DEFAULT NULL,
  `usuario` varchar(200) DEFAULT NULL,
  `pass` varchar(200) DEFAULT NULL,
  `correo` varchar(200) DEFAULT NULL,
  `tipo_usuario` tinyint(4) DEFAULT NULL,
  `id_cliente` tinyint(4) DEFAULT NULL,
  `id_proveedor` tinyint(4) DEFAULT NULL,
  `id_cargo` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_proveedor` (`id_proveedor`),
  KEY `id_cargo` (`id_cargo`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id`),
  CONSTRAINT `usuario_ibfk_3` FOREIGN KEY (`id_cargo`) REFERENCES `cargo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Gus','gus','gus','g',1,NULL,NULL,1),(2,'David','david','david',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-17  1:20:38

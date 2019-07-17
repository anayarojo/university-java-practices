-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 18-05-2011 a las 05:35:30
-- Versión del servidor: 5.5.8
-- Versión de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `empleado`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_personales`
--

DROP TABLE IF EXISTS `datos_personales`;
CREATE TABLE IF NOT EXISTS `datos_personales` (
  `id_emp` int(11) NOT NULL AUTO_INCREMENT,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) NOT NULL,
  `nombre1` varchar(50) NOT NULL,
  `nombre2` varchar(50) NOT NULL,
  `fecha_nac` date NOT NULL,
  `genero` char(1) NOT NULL,
  PRIMARY KEY (`id_emp`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `datos_personales`
--

INSERT INTO `datos_personales` (`id_emp`, `apellido1`, `apellido2`, `nombre1`, `nombre2`, `fecha_nac`, `genero`) VALUES
(2, 'DIAZ', 'PEÑALOZA', 'HAROLD', 'MARIO', '1984-09-10', 'M'),
(3, 'HERNANDEZ', 'TESILLO', 'EMIR', 'JOSE', '1983-09-18', 'M'),
(4, 'HERNANDEZ', 'TESIL', 'HAROLD', 'JOSE', '1985-05-27', 'M');

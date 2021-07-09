-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-07-2021 a las 23:53:48
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `carro_ju`
--
CREATE DATABASE IF NOT EXISTS `carro_ju` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `carro_ju`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carril`
--

DROP TABLE IF EXISTS `carril`;
CREATE TABLE `carril` (
  `numero_carril` bigint(20) NOT NULL,
  `placa_carro` varchar(6) NOT NULL,
  `numero_pista` varchar(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carril`
--

INSERT INTO `carril` (`numero_carril`, `placa_carro`, `numero_pista`) VALUES
(1, 'QJL390', 'LGG'),
(2, 'ESB546', 'LGG'),
(3, 'IJV565', 'LGG');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carro`
--

DROP TABLE IF EXISTS `carro`;
CREATE TABLE `carro` (
  `placa` varchar(6) NOT NULL,
  `avance` bigint(20) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `posicion` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carro`
--

INSERT INTO `carro` (`placa`, `avance`, `descripcion`, `posicion`) VALUES
('QJL390', 5100, 'verde', 1),
('ESB546', 3800, 'azul', 3),
('IJV565', 4100, 'azul', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor`
--

DROP TABLE IF EXISTS `conductor`;
CREATE TABLE `conductor` (
  `nombre` varchar(12) NOT NULL,
  `no_veces_ganado` int(11) DEFAULT NULL,
  `placa_carro` varchar(6) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `conductor`
--

INSERT INTO `conductor` (`nombre`, `no_veces_ganado`, `placa_carro`) VALUES
('Juan', 1, 'QJL390'),
('Alex', 0, 'ESB546'),
('Dylann', 0, 'IJV565');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juego`
--

DROP TABLE IF EXISTS `juego`;
CREATE TABLE `juego` (
  `numero_juego` bigint(20) NOT NULL,
  `id_pista` varchar(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `juego`
--

INSERT INTO `juego` (`numero_juego`, `id_pista`) VALUES
(4, 'LGG');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juego_jugador`
--

DROP TABLE IF EXISTS `juego_jugador`;
CREATE TABLE `juego_jugador` (
  `id_juego` bigint(20) NOT NULL,
  `id_jugador` varchar(12) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `juego_jugador`
--

INSERT INTO `juego_jugador` (`id_juego`, `id_jugador`) VALUES
(4, 'Alex'),
(4, 'Dylann'),
(4, 'Juan');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

DROP TABLE IF EXISTS `jugador`;
CREATE TABLE `jugador` (
  `nombre` varchar(12) NOT NULL,
  `turno` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`nombre`, `turno`) VALUES
('Juan', 1),
('Alex', 2),
('Dylann', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pista`
--

DROP TABLE IF EXISTS `pista`;
CREATE TABLE `pista` (
  `id` varchar(5) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tamano_pista` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pista`
--

INSERT INTO `pista` (`id`, `nombre`, `tamano_pista`) VALUES
('LGG', 'AHZ', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `podio`
--

DROP TABLE IF EXISTS `podio`;
CREATE TABLE `podio` (
  `codigo_podio` int(11) NOT NULL,
  `puesto` int(11) DEFAULT NULL,
  `nombre_jugador` varchar(12) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `podio`
--

INSERT INTO `podio` (`codigo_podio`, `puesto`, `nombre_jugador`) VALUES
(1, 1, 'Juan'),
(1, 2, 'Dylann'),
(1, 3, 'Alex');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sequence`
--

DROP TABLE IF EXISTS `sequence`;
CREATE TABLE `sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sequence`
--

INSERT INTO `sequence` (`next_val`) VALUES
(1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carril`
--
ALTER TABLE `carril`
  ADD PRIMARY KEY (`numero_carril`),
  ADD UNIQUE KEY `UK_jsjnf7xnn028fsqgofdcjfksc` (`placa_carro`),
  ADD KEY `FK7rwwf8rdwaeeohv3djw8os5ay` (`numero_pista`);

--
-- Indices de la tabla `carro`
--
ALTER TABLE `carro`
  ADD PRIMARY KEY (`placa`);

--
-- Indices de la tabla `conductor`
--
ALTER TABLE `conductor`
  ADD PRIMARY KEY (`nombre`),
  ADD UNIQUE KEY `UK_o74j3mqmy64wmu37bh1673r1s` (`placa_carro`);

--
-- Indices de la tabla `juego`
--
ALTER TABLE `juego`
  ADD PRIMARY KEY (`numero_juego`),
  ADD KEY `FKgjq8akwpuqnjs0ovqpb66g6wx` (`id_pista`);

--
-- Indices de la tabla `juego_jugador`
--
ALTER TABLE `juego_jugador`
  ADD PRIMARY KEY (`id_juego`,`id_jugador`),
  ADD KEY `FKs597ok1nvmvd31pqxxtdkscdi` (`id_jugador`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `pista`
--
ALTER TABLE `pista`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `podio`
--
ALTER TABLE `podio`
  ADD PRIMARY KEY (`codigo_podio`,`nombre_jugador`),
  ADD UNIQUE KEY `UK_3encx2igcekuwj6uas4m54fr3` (`nombre_jugador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-02-2017 a las 21:40:41
-- Versión del servidor: 5.5.39
-- Versión de PHP: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `toolsmgdb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aplicaciones`
--

CREATE TABLE IF NOT EXISTS `aplicaciones` (
  `IdAplicacion` int(11) NOT NULL,
  `Descripcion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `basedeconocimientos`
--

CREATE TABLE IF NOT EXISTS `basedeconocimientos` (
  `Identificador` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `Analisis` text COLLATE latin1_spanish_ci NOT NULL,
  `Solucion` text COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casos`
--

CREATE TABLE IF NOT EXISTS `casos` (
  `IdCaso` int(11) NOT NULL,
  `Descripcion` text COLLATE latin1_spanish_ci NOT NULL,
  `IdEstado` int(11) NOT NULL,
  `IdSeveridad` int(11) NOT NULL,
  `IdUsuario` int(11) NOT NULL,
  `FechaRegistro` date NOT NULL,
  `FechaCierre` date NOT NULL,
  `IdSoporte` int(11) NOT NULL,
  `IdTipoCaso` int(11) NOT NULL,
  `SolicitadoPor` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `Identificador` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `IdModulo` int(11) NOT NULL,
  `IdAplicacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cierrescaso`
--

CREATE TABLE IF NOT EXISTS `cierrescaso` (
  `IdCierreCaso` int(11) NOT NULL,
  `Descripcion` int(11) NOT NULL,
  `IdTipoCaso` int(11) NOT NULL,
  `Habilitado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE IF NOT EXISTS `comentarios` (
  `IdCaso` int(11) NOT NULL,
  `Descripcion` text COLLATE latin1_spanish_ci NOT NULL,
  `IdUsuario` int(11) NOT NULL,
  `Fecha` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadoscaso`
--

CREATE TABLE IF NOT EXISTS `estadoscaso` (
  `IdEstado` int(11) NOT NULL,
  `Descripcion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modulos`
--

CREATE TABLE IF NOT EXISTS `modulos` (
  `IdModulo` int(11) NOT NULL,
  `IdAplicacion` int(11) NOT NULL,
  `Descripcion` varchar(30) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pantallas`
--

CREATE TABLE IF NOT EXISTS `pantallas` (
`id` int(10) unsigned NOT NULL,
  `nombre` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `url` varchar(255) COLLATE latin1_spanish_ci NOT NULL,
  `posicion` int(11) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `pantallas`
--

INSERT INTO `pantallas` (`id`, `nombre`, `url`, `posicion`) VALUES
(1, 'ABM Casos', 'aplicacion/modulos/abm-casos/views/viewAbmCasos.html', 1),
(2, 'ABM Incidentes', 'aplicacion/modulos/abm-incidentes/views/viewABMIncidentes.html', 2),
(3, 'ABM Pantallas', 'aplicacion/modulos/abm-pantallas/views/viewABMPantallas.html', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `soportes`
--

CREATE TABLE IF NOT EXISTS `soportes` (
  `IdSoporte` int(11) NOT NULL,
  `Descripcion` text COLLATE latin1_spanish_ci NOT NULL,
  `Telefono` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `Correo` varchar(50) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `IdUsuario` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `IS_STK` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `Jornada` int(11) NOT NULL,
  `Habillitado` tinyint(1) NOT NULL,
  `Password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aplicaciones`
--
ALTER TABLE `aplicaciones`
 ADD PRIMARY KEY (`IdAplicacion`);

--
-- Indices de la tabla `basedeconocimientos`
--
ALTER TABLE `basedeconocimientos`
 ADD PRIMARY KEY (`Identificador`);

--
-- Indices de la tabla `casos`
--
ALTER TABLE `casos`
 ADD PRIMARY KEY (`IdCaso`);

--
-- Indices de la tabla `cierrescaso`
--
ALTER TABLE `cierrescaso`
 ADD PRIMARY KEY (`IdCierreCaso`);

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
 ADD PRIMARY KEY (`IdCaso`);

--
-- Indices de la tabla `estadoscaso`
--
ALTER TABLE `estadoscaso`
 ADD PRIMARY KEY (`IdEstado`);

--
-- Indices de la tabla `modulos`
--
ALTER TABLE `modulos`
 ADD PRIMARY KEY (`IdModulo`);

--
-- Indices de la tabla `pantallas`
--
ALTER TABLE `pantallas`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `soportes`
--
ALTER TABLE `soportes`
 ADD PRIMARY KEY (`IdSoporte`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
 ADD PRIMARY KEY (`IdUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pantallas`
--
ALTER TABLE `pantallas`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-04-2021 a las 22:59:08
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia_usuario`
--

CREATE TABLE `historia_usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `numero` int(3) NOT NULL,
  `fecha` date NOT NULL,
  `valor` int(5) NOT NULL,
  `tiempo_d` int(2) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `observaciones` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `emailUsuario` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`id`, `nombre`, `descripcion`, `emailUsuario`) VALUES
(1, 'Proyecto X', 'Primer proyecto de prueba 1.', 'admin@correo.com'),
(2, 'Proyecto Y', 'Proyecto de prueba 2 asiudgahsdhasdlñkasdñjsalkdasñldsadasd', 'admin@correo.com'),
(3, 'Proyecto A', 'Proyecto de prueba para otro usuario', 'david@correo.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjeta_crc`
--

CREATE TABLE `tarjeta_crc` (
  `id` int(11) NOT NULL,
  `clase` varchar(50) NOT NULL,
  `lista_super` varchar(50) NOT NULL,
  `lista_sub` varchar(50) NOT NULL,
  `res1` varchar(50) NOT NULL,
  `res2` varchar(50) NOT NULL,
  `res3` varchar(50) NOT NULL,
  `res4` varchar(50) NOT NULL,
  `res5` varchar(50) NOT NULL,
  `res6` varchar(50) NOT NULL,
  `res7` varchar(50) NOT NULL,
  `res8` varchar(50) NOT NULL,
  `colab1` varchar(50) NOT NULL,
  `colab2` varchar(50) NOT NULL,
  `colab3` varchar(50) NOT NULL,
  `colab4` varchar(50) NOT NULL,
  `colab5` varchar(50) NOT NULL,
  `colab6` varchar(50) NOT NULL,
  `colab7` varchar(50) NOT NULL,
  `colab8` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `email`, `password`) VALUES
(1, 'admin@correo.com', 'admin'),
(2, 'david@correo.com', '1234');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `historia_usuario`
--
ALTER TABLE `historia_usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `numero` (`numero`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tarjeta_crc`
--
ALTER TABLE `tarjeta_crc`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `pass` (`password`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `historia_usuario`
--
ALTER TABLE `historia_usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tarjeta_crc`
--
ALTER TABLE `tarjeta_crc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

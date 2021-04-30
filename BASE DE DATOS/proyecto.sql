-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2021 at 05:58 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyecto`
--

-- --------------------------------------------------------

--
-- Table structure for table `historia_usuario`
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

--
-- Dumping data for table `historia_usuario`
--

INSERT INTO `historia_usuario` (`id`, `nombre`, `numero`, `fecha`, `valor`, `tiempo_d`, `descripcion`, `observaciones`) VALUES
(1, 'ETESECH', 1, '2021-04-15', 44, 22, 'IDFHIOUASDHFPAIUSODHFPASUHDF[OSHDF[OHjsdhflkasjdhflkjashdlkfhsdklfhas\r\nasdjkfhaslkjdfhlaksjdhflkjash', 'IDFHIOUASDHFPAIUSODHFPASUHDF[OSHDF[OHjsdhflkasjdhflkjashdlkfhsdklfhas\r\nasdjkfhaslkjdfhlaksjdhflkjash'),
(2, 'Jorgito', 2, '2021-04-27', 55, 4, 'IDFHIOUASDHFPAIUSODHFPASUHDF[OSHDF[OHjsdhflkasjdhflkjashdlkfhsdklfhas\r\nasdjkfhaslkjdfhlaksjdhflkjash', 'IDFHIOUASDHFPAIUSODHFPASUHDF[OSHDF[OHjsdhflkasjdhflkjashdlkfhsdklfhas\r\nasdjkfhaslkjdfhlaksjdhflkjash');

-- --------------------------------------------------------

--
-- Table structure for table `proyecto`
--

CREATE TABLE `proyecto` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `emailUsuario` varchar(50) NOT NULL,
  `id_elemento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `proyecto`
--

INSERT INTO `proyecto` (`id`, `nombre`, `descripcion`, `emailUsuario`, `id_elemento`) VALUES
(1, 'Proyecto X', 'Primer proyecto de prueba 1.', 'admin@correo.com', 0),
(2, 'Proyecto Y', 'Proyecto de prueba 2 asiudgahsdhasdlñkasdñjsalkdasñldsadasd', 'admin@correo.com', 0),
(3, 'Proyecto A', 'Proyecto de prueba para otro usuario', 'david@correo.com', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tabla_crc`
--

CREATE TABLE `tabla_crc` (
  `id` int(11) NOT NULL,
  `responsabilidad` varchar(50) NOT NULL,
  `colaborador` varchar(50) NOT NULL,
  `id_proyecto` int(30) NOT NULL,
  `id_usuario` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabla_crc`
--

INSERT INTO `tabla_crc` (`id`, `responsabilidad`, `colaborador`, `id_proyecto`, `id_usuario`) VALUES
(1, 'RRRR', 'RRRR', 3, 1),
(2, 'RTFWERT', 'WC3C3CD', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tarjeta_crc`
--

CREATE TABLE `tarjeta_crc` (
  `id` int(11) NOT NULL,
  `clase` varchar(50) NOT NULL,
  `lista_super` varchar(50) NOT NULL,
  `lista_sub` varchar(50) NOT NULL,
  `id_tabla` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tarjeta_crc`
--

INSERT INTO `tarjeta_crc` (`id`, `clase`, `lista_super`, `lista_sub`, `id_tabla`) VALUES
(1, 'Prueba', 'Clase S, Clase 3, Clase X, Clase Y', 'Clase 6,Clase 6,Clase 7,Clase 7,Clase 7', 1),
(2, 'Aura', 'Clase T,Clase A,Clase R', 'Clase T,Clase A,Clase V,Clase E,', 2);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `email`, `password`) VALUES
(1, 'admin@correo.com', 'admin'),
(2, 'david@correo.com', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `historia_usuario`
--
ALTER TABLE `historia_usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `numero` (`numero`);

--
-- Indexes for table `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabla_crc`
--
ALTER TABLE `tabla_crc`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_proyecto` (`id_proyecto`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indexes for table `tarjeta_crc`
--
ALTER TABLE `tarjeta_crc`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_tabla` (`id_tabla`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `pass` (`password`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `historia_usuario`
--
ALTER TABLE `historia_usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `proyecto`
--
ALTER TABLE `proyecto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tabla_crc`
--
ALTER TABLE `tabla_crc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tarjeta_crc`
--
ALTER TABLE `tarjeta_crc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tabla_crc`
--
ALTER TABLE `tabla_crc`
  ADD CONSTRAINT `id_proyecto` FOREIGN KEY (`id_proyecto`) REFERENCES `proyecto` (`id`),
  ADD CONSTRAINT `id_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Constraints for table `tarjeta_crc`
--
ALTER TABLE `tarjeta_crc`
  ADD CONSTRAINT `id_tabla` FOREIGN KEY (`id_tabla`) REFERENCES `tabla_crc` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

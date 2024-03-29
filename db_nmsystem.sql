-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-12-2019 a las 19:02:53
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_nmsystem`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gastos`
--

CREATE TABLE `gastos` (
  `idgasto` int(11) NOT NULL,
  `descripcion` text NOT NULL,
  `gastado` double(10,2) NOT NULL,
  `fecha_gasto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `gastos`
--

INSERT INTO `gastos` (`idgasto`, `descripcion`, `gastado`, `fecha_gasto`) VALUES
(1, 'SE GASTO EN COMPRAR LA CERVEZA', 3711.00, '15/03/2017'),
(2, '1 KILO DE CAMARON ', 224.00, '17/03/2017'),
(3, 'VERDURA Y SALSA', 360.00, '17/03/2017'),
(4, 'TOSTADAS', 57.00, '17/03/2017'),
(5, 'SALSAS, PLATOS, LIMONES, SAL', 270.00, '17/03/2017'),
(6, 'VERDURA\nMARISCOS\nPLASTICOS\nTOSTADAS\nGASOLINA\nSPOT', 1321.00, '18/03/2017'),
(7, 'AGUACATES', 20.00, '18/03/2017'),
(8, 'TOSTADAS\nMARISCOS\nTOSTADAS\nBAÑO\nCATSUP', 987.00, '19/03/2017'),
(9, 'CUCHILLOS', 90.00, '19/03/2017'),
(10, 'QUESO	', 24.00, '19/03/2017'),
(11, 'BOLSAS\nPLATOS\nBOTELLAS INDIO\nTOSTADAS\nLAVADA DEL CARRO\nGASOLINA\nVERDURA\nCAMARÓN\nJAVÓN\nPERIFONEO', 1250.00, '24/03/2017'),
(12, 'CAMARÓN\nVERDURA\nAGUAS\nPERIFONEO\nPLASTICOS\nGASOLINA\nTOSTADAS', 1240.00, '25/03/2017'),
(13, 'CAMARÓN\nVERDURA\nAGUCATES\nJAVÓN Y BOLSAS\nDESAYUNO\nTOSTADAS', 675.00, '26/03/2017'),
(14, 'VASOS\nSALSAS\nTOSTADAS Y TOTOPOS', 222.00, '31/03/2017'),
(15, 'CERVEZA', 1726.00, '31/03/2017'),
(18, 'CAMARON Y VERDURA', 900.00, '01/04/2017'),
(19, 'PAQUETES DE PANES', 5000.00, '20/12/2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text NOT NULL,
  `tipoproducto` varchar(100) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `stock` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajadores`
--

CREATE TABLE `trabajadores` (
  `idtrabajador` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idusuario` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `tipousuario` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idusuario`, `usuario`, `password`, `tipousuario`) VALUES
(1, 'admin', '12345678', 'ADMINISTRADOR'),
(2, 'user', '12345678', 'NORMAL'),
(4, 'juana', '123456789', 'NORMAL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `idventa` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `total` double(10,2) NOT NULL,
  `fecha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`idventa`, `id_producto`, `cantidad`, `total`, `fecha`) VALUES
(2, 12, 12, 240.00, '19/03/2017'),
(2, 16, 1, 15.00, '19/03/2017'),
(4, 8, 1, 175.00, '19/03/2017'),
(5, 11, 4, 60.00, '19/03/2017'),
(5, 12, 3, 60.00, '19/03/2017'),
(5, 13, 3, 60.00, '19/03/2017'),
(5, 14, 1, 15.00, '19/03/2017'),
(5, 17, 1, 15.00, '19/03/2017'),
(6, 24, 3, 240.00, '19/03/2017'),
(6, 16, 4, 60.00, '19/03/2017'),
(7, 6, 1, 145.00, '19/03/2017'),
(8, 8, 1, 175.00, '19/03/2017'),
(9, 4, 1, 65.00, '19/03/2017'),
(10, 19, 6, 90.00, '19/03/2017'),
(10, 1, 2, 90.00, '19/03/2017'),
(10, 4, 2, 130.00, '19/03/2017'),
(10, 18, 1, 18.00, '19/03/2017'),
(10, 23, 1, 10.00, '19/03/2017'),
(11, 3, 1, 45.00, '19/03/2017'),
(11, 23, 2, 20.00, '19/03/2017'),
(12, 16, 1, 15.00, '19/03/2017'),
(13, 21, 5, 100.00, '19/03/2017'),
(14, 16, 1, 15.00, '19/03/2017'),
(15, 23, 1, 10.00, '19/03/2017'),
(16, 16, 1, 15.00, '19/03/2017'),
(17, 16, 1, 15.00, '19/03/2017'),
(17, 17, 1, 15.00, '19/03/2017'),
(18, 21, 2, 40.00, '19/03/2017'),
(19, 19, 1, 15.00, '24/03/2017'),
(20, 16, 8, 120.00, '24/03/2017'),
(20, 1, 1, 45.00, '24/03/2017'),
(21, 16, 5, 75.00, '24/03/2017'),
(21, 21, 1, 20.00, '24/03/2017'),
(21, 10, 1, 175.00, '24/03/2017'),
(22, 20, 1, 17.00, '24/03/2017'),
(22, 10, 1, 175.00, '24/03/2017'),
(22, 23, 2, 20.00, '24/03/2017'),
(22, 16, 3, 45.00, '24/03/2017'),
(23, 23, 1, 10.00, '24/03/2017'),
(23, 16, 1, 15.00, '24/03/2017'),
(23, 2, 1, 65.00, '24/03/2017'),
(23, 1, 1, 45.00, '24/03/2017'),
(24, 4, 1, 65.00, '24/03/2017'),
(24, 16, 1, 15.00, '24/03/2017'),
(25, 16, 2, 30.00, '24/03/2017'),
(26, 2, 2, 130.00, '24/03/2017'),
(26, 1, 3, 135.00, '24/03/2017'),
(26, 6, 1, 145.00, '24/03/2017'),
(26, 16, 1, 15.00, '24/03/2017'),
(27, 16, 1, 15.00, '24/03/2017'),
(28, 24, 1, 80.00, '25/03/2017'),
(29, 7, 1, 175.00, '25/03/2017'),
(30, 7, 1, 175.00, '25/03/2017'),
(30, 23, 1, 10.00, '25/03/2017'),
(30, 11, 1, 15.00, '25/03/2017'),
(31, 12, 3, 60.00, '25/03/2017'),
(31, 27, 3, 60.00, '25/03/2017'),
(32, 24, 1, 80.00, '25/03/2017'),
(33, 9, 1, 145.00, '25/03/2017'),
(33, 23, 1, 10.00, '25/03/2017'),
(33, 16, 1, 15.00, '25/03/2017'),
(34, 16, 6, 90.00, '25/03/2017'),
(34, 12, 2, 40.00, '25/03/2017'),
(35, 16, 3, 45.00, '25/03/2017'),
(35, 4, 1, 65.00, '25/03/2017'),
(36, 17, 9, 135.00, '25/03/2017'),
(37, 14, 1, 15.00, '25/03/2017'),
(37, 27, 1, 20.00, '25/03/2017'),
(37, 17, 2, 30.00, '25/03/2017'),
(37, 5, 1, 65.00, '25/03/2017'),
(38, 17, 1, 15.00, '25/03/2017'),
(38, 21, 1, 20.00, '25/03/2017'),
(39, 23, 1, 10.00, '25/03/2017'),
(40, 2, 4, 260.00, '25/03/2017'),
(40, 1, 5, 225.00, '25/03/2017'),
(41, 8, 1, 175.00, '25/03/2017'),
(42, 2, 1, 65.00, '25/03/2017'),
(42, 25, 1, 65.00, '25/03/2017'),
(43, 17, 2, 30.00, '25/03/2017'),
(44, 17, 12, 180.00, '25/03/2017'),
(45, 23, 1, 10.00, '26/03/2017'),
(46, 19, 4, 60.00, '26/03/2017'),
(47, 1, 1, 45.00, '25/03/2017'),
(48, 16, 2, 30.00, '26/03/2017'),
(49, 1, 2, 90.00, '26/03/2017'),
(49, 23, 1, 10.00, '26/03/2017'),
(50, 7, 1, 175.00, '26/03/2017'),
(50, 6, 1, 145.00, '26/03/2017'),
(51, 6, 1, 145.00, '26/03/2017'),
(51, 8, 1, 175.00, '26/03/2017'),
(52, 2, 1, 65.00, '26/03/2017'),
(52, 25, 1, 65.00, '26/03/2017'),
(53, 16, 3, 45.00, '26/03/2017'),
(54, 17, 1, 15.00, '26/03/2017'),
(55, 24, 4, 320.00, '26/03/2017'),
(55, 2, 1, 65.00, '26/03/2017'),
(55, 17, 1, 15.00, '26/03/2017'),
(55, 23, 1, 10.00, '26/03/2017'),
(55, 20, 2, 34.00, '26/03/2017'),
(56, 1, 2, 90.00, '26/03/2017'),
(56, 2, 2, 130.00, '26/03/2017'),
(56, 4, 1, 65.00, '26/03/2017'),
(57, 17, 2, 30.00, '26/03/2017'),
(58, 16, 1, 15.00, '26/03/2017'),
(59, 24, 3, 240.00, '26/03/2017'),
(60, 17, 3, 45.00, '26/03/2017'),
(60, 21, 2, 40.00, '26/03/2017'),
(61, 1, 4, 180.00, '31/03/2017'),
(61, 25, 1, 65.00, '31/03/2017'),
(62, 16, 6, 90.00, '31/03/2017'),
(62, 21, 1, 20.00, '31/03/2017'),
(62, 20, 1, 17.00, '31/03/2017'),
(63, 4, 4, 260.00, '31/03/2017'),
(63, 2, 1, 65.00, '31/03/2017'),
(63, 25, 2, 130.00, '31/03/2017'),
(63, 7, 1, 175.00, '31/03/2017'),
(64, 12, 9, 180.00, '31/03/2017'),
(64, 11, 3, 45.00, '31/03/2017'),
(65, 24, 4, 320.00, '31/03/2017'),
(67, 16, 2, 30.00, '31/03/2017'),
(68, 21, 30, 600.00, '31/03/2017'),
(69, 19, 2, 30.00, '01/04/2017'),
(70, 17, 5, 75.00, '01/04/2017'),
(70, 2, 1, 65.00, '01/04/2017'),
(71, 1, 1, 45.00, '01/04/2017'),
(71, 2, 5, 325.00, '01/04/2017'),
(72, 1, 4, 180.00, '01/04/2017'),
(72, 2, 3, 195.00, '01/04/2017'),
(73, 7, 2, 350.00, '01/04/2017'),
(74, 3, 2, 90.00, '01/04/2017'),
(75, 24, 4, 320.00, '01/04/2017'),
(76, 19, 2, 36.00, '01/04/2017'),
(76, 21, 1, 20.00, '01/04/2017'),
(77, 17, 7, 105.00, '01/04/2017'),
(77, 19, 1, 18.00, '01/04/2017'),
(77, 21, 1, 20.00, '01/04/2017'),
(77, 2, 1, 65.00, '01/04/2017'),
(78, 19, 1, 18.00, '01/04/2017'),
(79, 17, 3, 45.00, '01/04/2017'),
(80, 19, 6, 108.00, '02/04/2017'),
(80, 7, 1, 175.00, '02/04/2017'),
(81, 17, 2, 30.00, '08/04/2017'),
(82, 16, 2, 30.00, '08/04/2017'),
(83, 18, 2, 36.00, '08/04/2017'),
(84, 16, 4, 60.00, '08/04/2017'),
(85, 17, 17, 255.00, '08/04/2017'),
(85, 2, 2, 130.00, '08/04/2017'),
(85, 16, 1, 15.00, '08/04/2017'),
(86, 11, 1, 15.00, '09/04/2017'),
(86, 12, 1, 20.00, '09/04/2017'),
(87, 17, 2, 30.00, '09/04/2017'),
(88, 2, 1, 65.00, '09/04/2017'),
(89, 20, 5, 85.00, '02/06/2017'),
(89, 19, 6, 108.00, '02/06/2017'),
(90, 17, 2, 30.00, '22/09/2017'),
(91, 17, 2, 30.00, '20/12/2019'),
(91, 20, 2, 34.00, '20/12/2019'),
(92, 16, 4, 60.00, '20/12/2019'),
(92, 2, 5, 325.00, '20/12/2019'),
(92, 7, 6, 1050.00, '20/12/2019'),
(93, 18, 5, 90.00, '20/12/2019');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `gastos`
--
ALTER TABLE `gastos`
  ADD PRIMARY KEY (`idgasto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`);

--
-- Indices de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  ADD PRIMARY KEY (`idtrabajador`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `gastos`
--
ALTER TABLE `gastos`
  MODIFY `idgasto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idproducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  MODIFY `idtrabajador` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

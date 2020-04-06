-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 16, 2018 at 07:47 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `QLQuanAo`
--

-- --------------------------------------------------------

--
-- Table structure for table `Invoice`
--

CREATE TABLE `Invoice` (
  `InvoiceID` int(5) NOT NULL,
  `UsrName` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `Total` int(9) NOT NULL,
  `Status` varchar(16) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Invoice`
--

INSERT INTO `Invoice` (`InvoiceID`, `UsrName`, `Total`, `Status`) VALUES
(1, 'beyeu', 3220000, 'Đã Thanh Toán'),
(2, 'conmeo', 970000, 'Đã Thanh Toán'),
(4, 'conmeo', 0, 'Chưa Thanh Toán'),
(5, 'minmin', 0, 'Chưa Thanh Toán');

-- --------------------------------------------------------

--
-- Table structure for table `InvoiceDetails`
--

CREATE TABLE `InvoiceDetails` (
  `InvoiceID` int(5) NOT NULL,
  `ProductID` int(10) NOT NULL,
  `Quantities` int(3) NOT NULL,
  `SubTotal` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `InvoiceDetails`
--

INSERT INTO `InvoiceDetails` (`InvoiceID`, `ProductID`, `Quantities`, `SubTotal`) VALUES
(1, 1, 3, 300000),
(1, 5, 2, 1520000),
(1, 20, 2, 1400000),
(2, 20, 1, 700000),
(2, 21, 2, 270000);

-- --------------------------------------------------------

--
-- Table structure for table `Product`
--

CREATE TABLE `Product` (
  `ProductID` int(10) NOT NULL,
  `ProductName` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ProductType` int(2) NOT NULL,
  `Gender` int(1) NOT NULL,
  `Size` int(1) NOT NULL,
  `Price` int(9) NOT NULL,
  `Quantity` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Product`
--

INSERT INTO `Product` (`ProductID`, `ProductName`, `ProductType`, `Gender`, `Size`, `Price`, `Quantity`) VALUES
(1, 'Áo Khoác Xanh', 2, 1, 1, 100000, 90),
(2, 'Áo Khoác Đen Nam Tính', 2, 1, 4, 876000, 76),
(3, 'Áo Khoác Hello Kitty', 2, 2, 2, 780000, 14),
(4, 'Áo Khoác Đen', 2, 3, 2, 810000, 45),
(5, 'Áo Đầm Chấm Bi', 3, 2, 3, 760000, 13),
(6, 'Quần Jean Cá Tính', 4, 3, 3, 670000, 15),
(7, 'Áo Đầm Bé Yêu', 3, 2, 2, 780000, 27),
(8, 'Áo Khoác Xanh', 2, 1, 4, 320000, 32),
(9, 'Áo Khoác Bé Yêu', 2, 2, 2, 760000, 9),
(10, 'Đầm Ngủ Dễ Thương', 3, 2, 2, 149000, 7),
(11, 'Quần Jean Ngắn', 4, 2, 3, 310000, 7),
(12, 'Quần Thể Thao Nam Tính', 4, 1, 3, 651000, 21),
(13, 'Áo Thun Thể Thao', 1, 1, 2, 100000, 7),
(14, 'Đầm Hồng Rực Rỡ', 3, 2, 4, 91000, 31),
(15, 'Quần Jean Ngắn Sexy', 4, 2, 1, 400000, 22),
(16, 'Áo Khoác ROAR', 2, 3, 2, 650000, 12),
(17, 'Áo Khoác Thể Thao', 2, 3, 3, 810000, 5),
(18, 'Quần Hồng Dễ Thương', 4, 2, 1, 130000, 31),
(19, 'Áo Thun', 1, 3, 3, 89000, 6),
(20, 'Áo Hello Bé Yêu', 1, 2, 3, 700000, 7),
(21, 'Quần Thể Thao SGU', 4, 3, 3, 135000, 20),
(22, 'Left Shark', 1, 3, 4, 1300000, 14);

-- --------------------------------------------------------

--
-- Table structure for table `ProductType`
--

CREATE TABLE `ProductType` (
  `ProductTypeID` int(10) NOT NULL,
  `ProductTypeName` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `ProductType`
--

INSERT INTO `ProductType` (`ProductTypeID`, `ProductTypeName`) VALUES
(1, 'Áo'),
(2, 'Khoác'),
(3, 'Đầm'),
(4, 'Quần'),
(5, 'Váy');

-- --------------------------------------------------------

--
-- Table structure for table `User`
--

CREATE TABLE `User` (
  `UsrName` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `Name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `Phone` varchar(13) COLLATE utf8_unicode_ci NOT NULL,
  `Address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Status` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `User`
--

INSERT INTO `User` (`UsrName`, `Name`, `Password`, `Phone`, `Address`, `Status`) VALUES
('beyeu', 'Bé Yêu', '012345678', '0122348128', '123 Đường Làng', 'Bình Thường'),
('concho', 'Con Chó', '1234567', '0918293123', '273 An Dương Vương', 'Bình Thường'),
('conmeo', 'Con Mèo', '1234567', '0981237123', '69 Đường Thủy', 'Bình Thường'),
('min', 'Min', '123', '09182839421', '8/9/10 Đường Mật', 'Bình Thường'),
('minmin', 'Min Min', '012345678', '0124453975', '32 Đường Bộ', 'Bình Thường');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Invoice`
--
ALTER TABLE `Invoice`
  ADD PRIMARY KEY (`InvoiceID`);

--
-- Indexes for table `InvoiceDetails`
--
ALTER TABLE `InvoiceDetails`
  ADD PRIMARY KEY (`InvoiceID`,`ProductID`);

--
-- Indexes for table `Product`
--
ALTER TABLE `Product`
  ADD PRIMARY KEY (`ProductID`);

--
-- Indexes for table `ProductType`
--
ALTER TABLE `ProductType`
  ADD PRIMARY KEY (`ProductTypeID`);

--
-- Indexes for table `User`
--
ALTER TABLE `User`
  ADD PRIMARY KEY (`UsrName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Invoice`
--
ALTER TABLE `Invoice`
  MODIFY `InvoiceID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `Product`
--
ALTER TABLE `Product`
  MODIFY `ProductID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `ProductType`
--
ALTER TABLE `ProductType`
  MODIFY `ProductTypeID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

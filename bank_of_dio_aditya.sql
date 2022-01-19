-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 19, 2022 at 10:56 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank_of_dio_aditya`
--
CREATE DATABASE IF NOT EXISTS `bank_of_dio_aditya` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bank_of_dio_aditya`;

-- --------------------------------------------------------

--
-- Table structure for table `account`
--
-- Creation: Jan 03, 2022 at 01:53 PM
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(10) NOT NULL,
  `customer_id` varchar(10) NOT NULL,
  `account_type` varchar(10) NOT NULL,
  `balance` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `account`:
--

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `account_id`, `customer_id`, `account_type`, `balance`) VALUES
(3, 'A0001', 'CS001', 'Current', 95000),
(4, 'A002', 'CS002', 'Saving', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--
-- Creation: Jan 04, 2022 at 09:19 AM
--

DROP TABLE IF EXISTS `branch`;
CREATE TABLE IF NOT EXISTS `branch` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `branch_name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `branch`:
--

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`id`, `branch_name`) VALUES
(1, 'Rawamangun'),
(2, 'Kelapa Gading'),
(3, 'Pulo Gading'),
(4, 'Pondok Gede'),
(5, 'Pondok Indah');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--
-- Creation: Jan 03, 2022 at 10:02 AM
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` varchar(10) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  `city` varchar(100) NOT NULL,
  `branch` varchar(100) NOT NULL,
  `phone_number` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `customer`:
--

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `customer_id`, `firstname`, `lastname`, `address`, `city`, `branch`, `phone_number`) VALUES
(4, 'CS001', 'abu muhammad', 'abdullah', 'jl. perintis kemangi', 'Jakarta Timur', 'Pondok Gede', 81231241),
(5, 'CS002', 'abu abdillah', 'ubaidillah', 'jl. penggangsaan ilir', 'slipi', 'Pulo Gading', 81231231);

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--
-- Creation: Jan 05, 2022 at 09:47 AM
--

DROP TABLE IF EXISTS `deposit`;
CREATE TABLE IF NOT EXISTS `deposit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(10) NOT NULL,
  `customer_id` varchar(10) NOT NULL,
  `date` varchar(15) NOT NULL,
  `balance` int(11) NOT NULL,
  `deposit_amount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `deposit`:
--

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`id`, `account_id`, `customer_id`, `date`, `balance`, `deposit_amount`) VALUES
(7, 'A0001', 'CS001', '2022/01/09', 50000, 5000),
(8, 'A002', 'CS002', '2022/01/09', 100000, 50000);

-- --------------------------------------------------------

--
-- Table structure for table `transfer`
--
-- Creation: Jan 07, 2022 at 07:22 AM
--

DROP TABLE IF EXISTS `transfer`;
CREATE TABLE IF NOT EXISTS `transfer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `from_account` varchar(10) NOT NULL,
  `to_account` varchar(10) NOT NULL,
  `transfer_amount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `transfer`:
--

--
-- Dumping data for table `transfer`
--

INSERT INTO `transfer` (`id`, `from_account`, `to_account`, `transfer_amount`) VALUES
(2, 'A002', 'A0001', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--
-- Creation: Jan 09, 2022 at 07:25 AM
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `user`:
--

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'ubaidillah', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `withdraw`
--
-- Creation: Jan 05, 2022 at 09:53 AM
--

DROP TABLE IF EXISTS `withdraw`;
CREATE TABLE IF NOT EXISTS `withdraw` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(10) NOT NULL,
  `customer_id` varchar(10) NOT NULL,
  `date` varchar(15) NOT NULL,
  `balance` int(11) NOT NULL,
  `withdraw_amount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

--
-- RELATIONSHIPS FOR TABLE `withdraw`:
--

--
-- Dumping data for table `withdraw`
--

INSERT INTO `withdraw` (`id`, `account_id`, `customer_id`, `date`, `balance`, `withdraw_amount`) VALUES
(3, 'A0001', 'CS001', '2022/01/09', 55000, 10000),
(4, 'A002', 'CS002', '2022/01/09', 150000, 50000);


--
-- Metadata
--
USE `phpmyadmin`;

--
-- Metadata for table account
--

--
-- Metadata for table branch
--

--
-- Metadata for table customer
--

--
-- Metadata for table deposit
--

--
-- Metadata for table transfer
--

--
-- Metadata for table user
--

--
-- Metadata for table withdraw
--

--
-- Metadata for database bank_of_dio_aditya
--
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

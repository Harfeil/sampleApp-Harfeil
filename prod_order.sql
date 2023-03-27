-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 27, 2023 at 05:09 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `producttable`
--

-- --------------------------------------------------------

--
-- Table structure for table `prod_order`
--

CREATE TABLE `prod_order` (
  `ctm_id` int(20) NOT NULL,
  `prod_id` int(20) NOT NULL,
  `order_quantity` int(11) NOT NULL,
  `order_price` int(11) NOT NULL,
  `oder_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prod_order`
--

INSERT INTO `prod_order` (`ctm_id`, `prod_id`, `order_quantity`, `order_price`, `oder_date`) VALUES
(112, 3, 23, 435, '2023-03-08');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `prod_order`
--
ALTER TABLE `prod_order`
  ADD KEY `test` (`ctm_id`),
  ADD KEY `test2` (`prod_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `prod_order`
--
ALTER TABLE `prod_order`
  ADD CONSTRAINT `test` FOREIGN KEY (`ctm_id`) REFERENCES `prod_customer` (`ctm_id`),
  ADD CONSTRAINT `test2` FOREIGN KEY (`prod_id`) REFERENCES `prod_table` (`prod_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

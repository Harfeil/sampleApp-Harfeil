-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 26, 2023 at 08:47 AM
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
-- Table structure for table `prod_supplier`
--

CREATE TABLE `prod_supplier` (
  `sup_id` int(50) NOT NULL,
  `sup_name` varchar(50) NOT NULL,
  `sup_phone` varchar(50) NOT NULL,
  `sup_address` varchar(50) NOT NULL,
  `sup_email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prod_supplier`
--

INSERT INTO `prod_supplier` (`sup_id`, `sup_name`, `sup_phone`, `sup_address`, `sup_email`) VALUES
(111, 'JImjim', '9123123', 'asdasdf', 'asdfasdfasd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `prod_supplier`
--
ALTER TABLE `prod_supplier`
  ADD PRIMARY KEY (`sup_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `prod_supplier`
--
ALTER TABLE `prod_supplier`
  MODIFY `sup_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10000;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

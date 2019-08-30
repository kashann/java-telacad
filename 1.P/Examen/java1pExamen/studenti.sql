-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 03 May 2017 la 19:10
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `java1pexamen`
--

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `studenti`
--

CREATE TABLE IF NOT EXISTS `studenti` (
`id` int(11) NOT NULL,
  `nume` varchar(20) NOT NULL,
  `prenume` varchar(20) NOT NULL,
  `cnp` text NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Salvarea datelor din tabel `studenti`
--

INSERT INTO `studenti` (`id`, `nume`, `prenume`, `cnp`) VALUES
(3, 'ionel', 'Popescu', '1234567891011'),
(7, 'sdgsddfa', 'asdafdzx', '234567');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studenti`
--
ALTER TABLE `studenti`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studenti`
--
ALTER TABLE `studenti`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2015 at 02:23 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sisfotu`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `Username` varchar(24) NOT NULL DEFAULT '',
  `Password` varchar(24) DEFAULT NULL,
  `Nama` varchar(40) NOT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Password`, `Nama`) VALUES
('admin', '1234', 'sari');

-- --------------------------------------------------------

--
-- Table structure for table `dsp`
--

CREATE TABLE IF NOT EXISTS `dsp` (
  `No_pembayaran` varchar(28) NOT NULL,
  `NIS` varchar(28) NOT NULL DEFAULT '',
  `Tagihan` int(11) NOT NULL,
  `Total_Pemabyaran` int(11) NOT NULL,
  `Tgl_pembayaran` date NOT NULL,
  PRIMARY KEY (`No_pembayaran`),
  UNIQUE KEY `NIS` (`NIS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE IF NOT EXISTS `kelas` (
  `Kelas` varchar(30) NOT NULL DEFAULT '',
  `JumlahSiswa` int(11) NOT NULL,
  `WaliKelas` varchar(40) NOT NULL,
  `Jurusan` varchar(30) NOT NULL,
  `Angkatan` int(11) NOT NULL,
  PRIMARY KEY (`Kelas`),
  UNIQUE KEY `Kelas` (`Kelas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE IF NOT EXISTS `siswa` (
  `Nama` varchar(30) NOT NULL,
  `Kelas` varchar(30) NOT NULL,
  `Angkatan` int(11) NOT NULL,
  `Jurusan` varchar(30) NOT NULL,
  `NIS` varchar(28) NOT NULL,
  PRIMARY KEY (`NIS`),
  UNIQUE KEY `Kelas` (`Kelas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `spp`
--

CREATE TABLE IF NOT EXISTS `spp` (
  `No_pembayaran` varchar(28) NOT NULL,
  `NIS` varchar(28) DEFAULT NULL,
  `Bulan` varchar(30) NOT NULL,
  `Total` int(11) NOT NULL,
  `Iuran` int(11) NOT NULL,
  `Tgl_pembayarab` date NOT NULL,
  PRIMARY KEY (`No_pembayaran`),
  UNIQUE KEY `NIS` (`NIS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dsp`
--
ALTER TABLE `dsp`
  ADD CONSTRAINT `dsp_ibfk_1` FOREIGN KEY (`NIS`) REFERENCES `siswa` (`NIS`) ON DELETE CASCADE;

--
-- Constraints for table `siswa`
--
ALTER TABLE `siswa`
  ADD CONSTRAINT `siswa_ibfk_1` FOREIGN KEY (`Kelas`) REFERENCES `kelas` (`Kelas`) ON DELETE CASCADE;

--
-- Constraints for table `spp`
--
ALTER TABLE `spp`
  ADD CONSTRAINT `spp_ibfk_1` FOREIGN KEY (`NIS`) REFERENCES `siswa` (`NIS`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

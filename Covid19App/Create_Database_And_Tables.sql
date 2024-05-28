/*=============================================================
FileName: Create_Database_And_Tables.sql
Programmer: Danielle Jae Ormerod
Description: This file will create the database and tables with the necessary constraints.
=============================================================*/

USE master
GO
/*
--If this database exist, we will delete it first
IF EXISTS(SELECT name FROM master.dbo.sysdatabases
	       WHERE name = 'covid19_app')
BEGIN
	DROP DATABASE covid19_app
	PRINT 'The Database has been deleted!'
END */

--Creating the database
CREATE DATABASE covid19_app
/*ON PRIMARY
(
	NAME = 'covid19_app_data',
	FILENAME = 'C:\TSQL Databases\covid19_app.mdf',
	SIZE = 5MB,
	FILEGROWTH = 10%
)
LOG ON
(
	NAME = 'covid19_app_log',
	FILENAME = 'C:\TSQL Databases\covid19_app_log.ldf',
	SIZE = 5MB,
	FILEGROWTH = 10%
) */
GO

PRINT'The Database has been successfully created!'
GO

USE covid19_app
GO

-- Create tables for the database
CREATE TABLE CovidCases (
	provincialID INT PRIMARY KEY IDENTITY(1,1),
	province VARCHAR(50) NOT NULL,
	totalCases INT NOT NULL,
	percentageTotal DECIMAL(5,1)
)
GO

PRINT'The CovidCases table has been successfully created!'


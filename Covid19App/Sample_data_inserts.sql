/*=============================================================
FileName: Sample_data_inserts.sql
Programmer: Danielle Jae Ormerod
Description: This file will insert sample data in the table
=============================================================*/

USE covid19_app
GO

INSERT INTO CovidCases (province, totalCases, percentageTotal)
VALUES 
    ('Eastern Cape', 90686, 13.1),
    ('Free State', 50552, 7.3),
    ('Gauteng', 222745, 32.2),
    ('KwaZulu-Natal', 120295, 17.4),
    ('Limpopo', 16233, 2.3),
    ('Mpumalanga', 28115, 4.1),
    ('North West', 30715, 4.4),
    ('Northern Cape', 18888, 2.7),
    ('Western Cape', 112667, 16.3),
    ('Total', 690896, 100.0)
GO

PRINT'Data has been inserted successfully into the CovidCases table!'

SELECT * FROM CovidCases
GO
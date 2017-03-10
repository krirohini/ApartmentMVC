CREATE TABLE `apt_admin` (
  `ID` int(9) NOT NULL AUTO_INCREMENT COMMENT 'SuperAdmin/SupportAdmin/ReportAdmin',
  `ADMIN_TYPE` varchar(20) DEFAULT NULL,
  `FIRST_NAME` varchar(20) DEFAULT NULL,
  `MIDDLE_NAME` varchar(20) DEFAULT NULL,
  `LAST_NAME` varchar(20) DEFAULT NULL,
  `SEX` char(10) CHARACTER SET latin1 DEFAULT NULL,
  `AGE` varchar(11) DEFAULT NULL,
  `PHONE` varchar(20) DEFAULT NULL,
  `EMAIL_ID` varchar(20) DEFAULT NULL,
  `IDENTIFICATION_DOCUMENT_ID` varchar(20) DEFAULT NULL COMMENT 'Green Card No./ Driving Licence No./ SSN/ TIN No./ Passprot No./',
  `IDENTIFICATION_DOCUMENT_EXPIRY_DATE` varchar(20) DEFAULT NULL,
  `OCCUPATION` varchar(20) DEFAULT NULL,
  `ANNUAL_INCOME` varchar(20) DEFAULT NULL,
  `PERMANENT_ADDRESS` varchar(50) DEFAULT NULL,
  `DESCRIPTION` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
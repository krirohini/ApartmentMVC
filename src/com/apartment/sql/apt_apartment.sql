CREATE TABLE `apt_apartment` (
  `ID` int(11) NOT NULL,
  `BUILDING_NO` varchar(11) DEFAULT NULL COMMENT 'Block/ Building ',
  `NO_OF_OCCUPANTS` int(11) DEFAULT NULL,
  `CURRENT_RENT` varchar(12) DEFAULT NULL,
  `MODEL_ID` varchar(6) DEFAULT NULL,
  `TENANT_ID` int(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `apt_apartment_ibfk_1` (`TENANT_ID`),
  KEY `apt_apartment_ibfk_2` (`MODEL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

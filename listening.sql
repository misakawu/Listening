/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80032
Source Host           : localhost:3306
Source Database       : listening

Target Server Type    : MYSQL
Target Server Version : 80032
File Encoding         : 65001

Date: 2023-07-02 14:18:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for like
-- ----------------------------
DROP TABLE IF EXISTS `like`;
CREATE TABLE `like` (
  `LikeID` int NOT NULL,
  `MusicID` int NOT NULL,
  `UserID` int NOT NULL,
  PRIMARY KEY (`LikeID`),
  KEY `MusicID` (`MusicID`),
  KEY `UserID` (`UserID`),
  CONSTRAINT `like_ibfk_1` FOREIGN KEY (`MusicID`) REFERENCES `music` (`MusicID`),
  CONSTRAINT `like_ibfk_2` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of like
-- ----------------------------
INSERT INTO `like` VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for music
-- ----------------------------
DROP TABLE IF EXISTS `music`;
CREATE TABLE `music` (
  `MusicID` int NOT NULL,
  `MusicName` varchar(255) NOT NULL,
  `MusicianName` varchar(255) NOT NULL,
  `MusicBackground` varchar(255) NOT NULL,
  `MusicData` varchar(255) NOT NULL,
  `Like` int NOT NULL,
  PRIMARY KEY (`MusicID`),
  UNIQUE KEY `不可重复` (`MusicName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of music
-- ----------------------------
INSERT INTO `music` VALUES ('1', '服务费', '发放', 'awwffef', 'awrgar', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserID` int NOT NULL,
  `UserName` varchar(255) NOT NULL,
  `UserPassword` varchar(255) NOT NULL,
  `UserOffline` int NOT NULL,
  `Manager` int NOT NULL,
  PRIMARY KEY (`UserID`),
  UNIQUE KEY `不可重复` (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'qwe', 'asd', '1', '0');
INSERT INTO `user` VALUES ('2', 'wer', 'sdf', '0', '1');

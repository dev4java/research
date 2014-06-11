/*
Navicat MySQL Data Transfer

Source Server         : local_root_1234QWERasdf
Source Server Version : 50616
Source Host           : localhost:3306
Source Database       : test_pro

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2014-05-12 00:22:15
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `sc_sys_usr`
-- ----------------------------
DROP TABLE IF EXISTS `sc_sys_usr`;
CREATE TABLE `sc_sys_usr` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(200) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `login_status` int(1) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sc_sys_usr
-- ----------------------------
INSERT INTO sc_sys_usr VALUES ('1', 'admin', '21232f297a57a5a743894a0e4a801fc3', '0', '1', '1');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO student VALUES ('1', '我改我改我改改改', '1', 'dsa');
INSERT INTO student VALUES ('297ec1ad45cd089e0145cd08a3df0000', 'test11111', '23', '男');
INSERT INTO student VALUES ('297ec1ad45e5a61c0145e5a62c180000', '13dedde', '23', '男');

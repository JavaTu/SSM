/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : gh

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 10/06/2019 22:46:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '客户名称',
  `mobile` varchar(255) NOT NULL COMMENT '手机号',
  `addr` varchar(255) NOT NULL COMMENT '地址',
  `flag` tinyint(2) NOT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='客户表';

-- ----------------------------
-- Table structure for dict
-- ----------------------------
DROP TABLE IF EXISTS `dict`;
CREATE TABLE `dict` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '字典名称',
  `type_id` int(11) NOT NULL COMMENT '字典类型',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_date` datetime NOT NULL COMMENT '更新日期',
  `flag` tinyint(2) NOT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='字典表';

-- ----------------------------
-- Table structure for flower
-- ----------------------------
DROP TABLE IF EXISTS `flower`;
CREATE TABLE `flower` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) NOT NULL COMMENT '花型名称',
  `image` varchar(255) NOT NULL DEFAULT '' COMMENT '图片',
  `color_ids` varchar(255) NOT NULL COMMENT '颜色ids，用逗号隔开',
  `size_ids` varchar(255) NOT NULL COMMENT '尺码ids，用逗号隔开',
  `flag` tinyint(2) NOT NULL COMMENT '状态',
  `unit_price` decimal(12,2) NOT NULL COMMENT '单价',
  `rem` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='花型表';

-- ----------------------------
-- Table structure for sales_order
-- ----------------------------
DROP TABLE IF EXISTS `sales_order`;
CREATE TABLE `sales_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `customer_id` bigint(20) NOT NULL COMMENT '客户id',
  `pro_date` datetime NOT NULL COMMENT '发生日期',
  `update_date` datetime NOT NULL COMMENT '最后更新日期',
  `flag` tinyint(2) NOT NULL COMMENT '状态',
  `rem` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='销售单';

-- ----------------------------
-- Table structure for sales_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `sales_order_detail`;
CREATE TABLE `sales_order_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` bigint(20) NOT NULL COMMENT '销售单id',
  `flower_id` bigint(20) NOT NULL COMMENT '花型id',
  `size_id` bigint(20) NOT NULL COMMENT '尺码',
  `color_id` bigint(20) NOT NULL COMMENT '颜色',
  `num` int(11) NOT NULL COMMENT '件数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='销售单明细';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登陆时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

SET FOREIGN_KEY_CHECKS = 1;

/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80037 (8.0.37)
 Source Host           : localhost:3306
 Source Schema         : wjh_system

 Target Server Type    : MySQL
 Target Server Version : 80037 (8.0.37)
 File Encoding         : 65001

 Date: 18/06/2024 14:22:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department_master
-- ----------------------------
DROP TABLE IF EXISTS `department_master`;
CREATE TABLE `department_master`  (
  `department_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '部门ID',
  `department_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门名称',
  `insert_user_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建者',
  `insert_time` timestamp(6) NULL DEFAULT NULL COMMENT '创建时间',
  `update_user_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '最近更新者',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '最近更新时间',
  `sort` bigint NULL DEFAULT NULL COMMENT '排序表示符',
  `is_deleted` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '逻辑删除标识符',
  PRIMARY KEY (`department_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '部门主档表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department_master
-- ----------------------------
INSERT INTO `department_master` VALUES ('1798735869175824385', '管理部', '1798249182800871425', '2024-06-06 23:17:04.747000', '1798249182800871425', '2024-06-06 23:17:05', 0, '0');

-- ----------------------------
-- Table structure for menu_master
-- ----------------------------
DROP TABLE IF EXISTS `menu_master`;
CREATE TABLE `menu_master`  (
  `menu_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '菜单ID',
  `parent_menu_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '父类菜单ID',
  `menu_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `router` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '菜单路由',
  `insert_user_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建者',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_user_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '最近更新者',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '最近更新时间',
  `sort` bigint NULL DEFAULT NULL COMMENT '排序标识符',
  `is_deleted` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '逻辑删除标识符',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '菜单主档表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu_master
-- ----------------------------
INSERT INTO `menu_master` VALUES ('1798735869175824311', '0', '首页', 'content', '1798249182800871425', '2024-06-07 13:00:14', '1798249182800871425', '2024-06-07 13:00:09', 0, '0');
INSERT INTO `menu_master` VALUES ('1798735869175824386', '0', '系统管理', '0', '1798249182800871425', '2024-06-07 13:01:18', '1798249182800871425', '2024-06-07 13:01:21', 1, '0');
INSERT INTO `menu_master` VALUES ('1798735869175824387', '1798735869175824386', '菜单管理', 'menu', '1798249182800871425', '2024-06-07 13:03:18', '1798249182800871425', '2024-06-07 13:03:22', 2, '0');
INSERT INTO `menu_master` VALUES ('1798735869175824388', '1798735869175824386', '部门管理', 'department', '1798249182800871425', '2024-06-07 13:04:10', '1798249182800871425', '2024-06-07 13:04:14', 3, '0');
INSERT INTO `menu_master` VALUES ('1798735869175824389', '1798735869175824386', '角色管理', 'role', '1798249182800871425', '2024-06-07 13:04:52', '1798249182800871425', '2024-06-07 13:04:56', 4, '0');
INSERT INTO `menu_master` VALUES ('1798735869175824391', '1798735869175824386', '账号管理', 'account', '1798249182800871425', '2024-06-07 13:06:11', '1798249182800871425', '2024-06-07 13:06:13', 5, '0');

-- ----------------------------
-- Table structure for menu_permission_content
-- ----------------------------
DROP TABLE IF EXISTS `menu_permission_content`;
CREATE TABLE `menu_permission_content`  (
  `id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '主键',
  `menu_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '菜单ID',
  `role_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '角色ID',
  `department_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '菜单权限从表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu_permission_content
-- ----------------------------
INSERT INTO `menu_permission_content` VALUES ('1798983261611679746', '1798735869175824389', '1', '1798735869175824385');
INSERT INTO `menu_permission_content` VALUES ('1799007255459057666', '1798735869175824386', '1', '1798735869175824385');
INSERT INTO `menu_permission_content` VALUES ('1799007255459057667', '1798735869175824386', '1799005811288899585', '1798735869175824385');
INSERT INTO `menu_permission_content` VALUES ('1799007283804164098', '1798735869175824387', '1', '1798735869175824385');
INSERT INTO `menu_permission_content` VALUES ('1799010394056781826', '1798735869175824388', '1', '1798735869175824385');
INSERT INTO `menu_permission_content` VALUES ('1799010394056781827', '1798735869175824388', '1799005811288899585', '1798735869175824385');
INSERT INTO `menu_permission_content` VALUES ('1799010432694710274', '1798735869175824391', '1799005811288899585', '1798735869175824385');
INSERT INTO `menu_permission_content` VALUES ('1799010432766013442', '1798735869175824391', '1', '1798735869175824385');
INSERT INTO `menu_permission_content` VALUES ('1799012785086816258', '1798735869175824311', '1', '1798735869175824385');
INSERT INTO `menu_permission_content` VALUES ('1799012785116176386', '1798735869175824311', '1799005811288899585', '1798735869175824385');

-- ----------------------------
-- Table structure for role_master
-- ----------------------------
DROP TABLE IF EXISTS `role_master`;
CREATE TABLE `role_master`  (
  `role_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '主键',
  `role_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色名称',
  `department_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门ID',
  `sort` bigint NULL DEFAULT NULL COMMENT '排序标识符',
  `is_deleted` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '逻辑删除标识符',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `insert_user_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建人ID',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '最近修改时间',
  `update_user_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '最近修改人ID',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '角色主档表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_master
-- ----------------------------
INSERT INTO `role_master` VALUES ('1', '超级管理员', '1798735869175824385', 0, '0', '2024-06-06 12:13:03', '1798249182800871425', '2024-06-06 12:13:17', '1798249182800871425');
INSERT INTO `role_master` VALUES ('1799005811288899585', '测试角色', '1798735869175824385', 1, '0', '2024-06-07 17:09:44', '1798249182800871425', '2024-06-07 17:09:44', '1798249182800871425');

-- ----------------------------
-- Table structure for server_token
-- ----------------------------
DROP TABLE IF EXISTS `server_token`;
CREATE TABLE `server_token`  (
  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户id',
  `server_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '服务类型 10管理後套/20客戶後臺/30代理后台',
  `token` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'token',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = 'token通用表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of server_token
-- ----------------------------
INSERT INTO `server_token` VALUES ('1798249182800871425', '10', '051ae1a5d92e886f386fc4371bfd7a01');
INSERT INTO `server_token` VALUES ('1799007025829302274', '10', '1b52afb5e8d83918e45abbef5b1043d9');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `user_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户ID',
  `login_id` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '登录id',
  `user_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用戶名',
  `telephone` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '电话',
  `google_key` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '谷歌验证码',
  `email` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `is_deleted` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '逻辑删除标识符（1：删除，0：正常）',
  `insert_user_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建者',
  `update_user_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '更新者',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `salt` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '加密盐',
  `department_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门ID',
  `role_id` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '角色ID',
  `initial_password` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '初始密码',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户主表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1798249182800871425', 'wjh', '王剑辉', '13161204301', 'ESXEPLDFHEYIBYQE', 'p.qjxl@qq.com', '485e76a848fb62ac0818cae8ce2ee3dee6337bdb08ff47cfedcf68c77cd4a75c', '0', 'wjy', 'wjh', '2024-06-05 15:03:10', '2024-06-18 13:14:18', 'pkSHEuQJGN7k9y8Uexsl', '1798735869175824385', '1', '123456');
INSERT INTO `sys_user` VALUES ('1799007025829302274', 'wjy', '王竞一', '13161204301', 'H5V43MLAHIUEE3UJ', 'p.qjxl@qq.com', '61eb1f40f68bbab29c6ec5d5e5914c9f5ee4f56ad76e20789a58c11a43e5ffdd', '0', '1798249182800871425', 'wjy', '2024-06-07 17:14:34', '2024-06-18 13:14:08', 'LptN5wCCKZc15bQTT3Cr', '1798735869175824385', '1799005811288899585', '123456');

-- ----------------------------
-- Table structure for sys_user_token
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_token`;
CREATE TABLE `sys_user_token`  (
  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '主键',
  `token` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'token',
  `type` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '1登陸Token 0臨時Token',
  `expire_time` timestamp NULL DEFAULT NULL COMMENT '过期时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '系统用户token' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_token
-- ----------------------------
INSERT INTO `sys_user_token` VALUES ('1798249182800871425', '051ae1a5d92e886f386fc4371bfd7a01', '1', '2024-06-18 14:14:18', '2024-06-18 13:14:18');
INSERT INTO `sys_user_token` VALUES ('1799007025829302274', '1b52afb5e8d83918e45abbef5b1043d9', '1', '2024-06-18 14:14:08', '2024-06-18 13:14:08');

SET FOREIGN_KEY_CHECKS = 1;

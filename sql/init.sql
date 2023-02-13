# 用户
DROP DATABASE IF EXISTS  `ums`;

# 题库
DROP DATABASE IF EXISTS  `qms`;

# 学习
DROP DATABASE IF EXISTS  `sms`;

# 内容
DROP DATABASE IF EXISTS  `cms`;

# 渠道
DROP DATABASE IF EXISTS  `chms`;

DROP DATABASE IF EXISTS  `auth`;

DROP DATABASE IF EXISTS  `admin`;

CREATE DATABASE `ums` CHARACTER SET utf8mb4 COLLATE  utf8mb4_general_ci;
CREATE DATABASE `qms` CHARACTER SET utf8mb4 COLLATE  utf8mb4_general_ci;
CREATE DATABASE `sms` CHARACTER SET utf8mb4 COLLATE  utf8mb4_general_ci;
CREATE DATABASE `cms` CHARACTER SET utf8mb4 COLLATE  utf8mb4_general_ci;
CREATE DATABASE `chms` CHARACTER SET utf8mb4 COLLATE  utf8mb4_general_ci;
CREATE DATABASE `auth` CHARACTER SET utf8mb4 COLLATE  utf8mb4_general_ci;
CREATE DATABASE `admin` CHARACTER SET utf8mb4 COLLATE  utf8mb4_general_ci;


USE ums;

DROP TABLE IF EXISTS ums_member;
CREATE  TABLE ums_member
(
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    mini_openid INT COMMENT '小程序 openid',
    mp_openid VARCHAR(64) COMMENT '服务号 openid',
    unionid VARCHAR(64) COMMENT '微信 unionid',
    level_id BIGINT COMMENT '会员等级',
    user_id VARCHAR(64) COMMENT '用户账号名',
    use_name CHAR(64) COMMENT  '用户名',
    PASSWORD VARCHAR(64) COMMENT '密码',
    nickname VARCHAR(64) COMMENT '昵称',
    phone VARCHAR(20) COMMENT '手机号',
    email VARCHAR(64),
    avatar VARCHAR(500),
    gender TINYINT,
    birth DATE,
    city VARCHAR(500) COMMENT '所在城市',
    source_type TINYINT COMMENT '用户来源 0:扫描, 1:搜索, 2:分享',
    integration INT COMMENT '积分',
    register_time DATETIME COMMENT '注册时间',
    del_flag TINYINT(1) DEFAULT 0 COMMENT '删除标记==1?被删:正常',
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (id)
) COMMENT '用户-会员表';

DROP TABLE IF EXISTS ums_growth_change_history;
CREATE TABLE ums_growth_change_history
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    member_id BIGINT,
    change_count INT COMMENT '改变值, 正负计数',
    note VARCHAR(500) COMMENT 'P.S.',
    source_type TINYINT COMMENT  '0:扫描, 1:搜索, 2:分享',
    del_flag TINYINT(1) DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) COMMENT '用户-积分值变化历史';

USE cms;

DROP TABLE IF EXISTS cms_banner;
CREATE TABLE cms_banner
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    img_url VARCHAR(500),
    title VARCHAR(500),
    display_order INT,
    ENABLE TINYINT COMMENT '是否显示',
    render_type TINYINT COMMENT '跳转类型',
    del_flag TINYINT(1) DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) COMMENT '内容-横幅广告表';


DROP TABLE IF EXISTS cms_news;
CREATE TABLE cms_new
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    image_url VARCHAR(500),
    title VARCHAR(500),
    display_order INT,
    render_url VARCHAR(500) COMMENT '跳转路径',
    ENABLE TINYINT COMMENT '是否显示',
    del_flag TINYINT(1) DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) COMMENT '内容-咨询表';

USE qms;
DROP TABLE IF EXISTS qms_question;
CREATE TABLE qms_question
(
    id BIGINT  NOT NULL AUTO_INCREMENT,
    title VARCHAR(500),
    answer VARCHAR(15000),
    LEVEL TINYINT COMMENT '难度',
    display_order INT COMMENT '排序',
    sub_title VARCHAR(500),
    TYPE BIGINT COMMENT '题目类型',
    ENABLE TINYINT COMMENT '是否显示',
    del_flag TINYINT(1) DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) COMMENT '题库-题目';

DROP TABLE IF EXISTS qms_type;

CREATE TABLE qms_type
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    type_name CHAR(64) COMMENT '类型名称',
    comments CHAR(64) COMMENT 'P.S.',
    logo_url VARCHAR(500),
    del_flag TINYINT(1) DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) COMMENT '题库-题目类型';

USE sms;

DROP TABLE IF EXISTS sms_study_time;

/*==============================================================*/
/* Table: sms_study_time                                        */
/*==============================================================*/
CREATE TABLE sms_study_time
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   ques_type            BIGINT COMMENT '题目类型id',
   member_id            BIGINT COMMENT '用户id',
   total_time           INT COMMENT '学习时常（分）',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
) COMMENT '学习-用户学习时常表';

DROP TABLE IF EXISTS sms_view_log;

/*==============================================================*/
/* Table: sms_view_log                                          */
/*==============================================================*/
CREATE TABLE sms_view_log
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   ques_id              BIGINT COMMENT '题目id',
   ques_type            BIGINT COMMENT '题目类型id',
   member_id            BIGINT COMMENT '用户id',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
) COMMENT '学习-用户学习浏览记录表';


USE chms;

DROP TABLE IF EXISTS chms_channel;

/*==============================================================*/
/* Table: chms_channel                                          */
/*==============================================================*/
CREATE TABLE chms_channel
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   NAME                 VARCHAR(100) COMMENT '渠道名称',
   appid                VARCHAR(100) COMMENT '渠道appid',
   appsecret            VARCHAR(500) COMMENT '渠道appsecret',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE chms_channel COMMENT '渠道-渠道表';


DROP TABLE IF EXISTS chms_access_token;

/*==============================================================*/
/* Table: chms_access_token                                     */
/*==============================================================*/
CREATE TABLE chms_access_token
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
   access_token         VARCHAR(500) COMMENT 'access_token',
   expire_time          DATETIME COMMENT '到期时间',
   channel_id           BIGINT COMMENT '渠道id',
   del_flag             TINYINT(1) DEFAULT 0 COMMENT '删除标记（0-正常，1-删除）',
   create_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   update_time          DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (id)
);

ALTER TABLE chms_access_token COMMENT '渠道-认证表';

USE auth;

/*==============================================================*/
/* Table: sys_user                                          */
/*==============================================================*/

DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
                            `username` varchar(50) NOT NULL,
                            `password` varchar(255) DEFAULT NULL,
                            `org_id` int DEFAULT NULL,
                            `enabled` bit(1) DEFAULT NULL,
                            `phone` varchar(20) DEFAULT NULL,
                            `email` varchar(50) DEFAULT NULL,
                            `create_time` datetime DEFAULT NULL,
                            `update_time` datetime DEFAULT NULL,
                            `id` int NOT NULL AUTO_INCREMENT,
                            `user_id` varchar(64) NOT NULL,
                            PRIMARY KEY (`id`,`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
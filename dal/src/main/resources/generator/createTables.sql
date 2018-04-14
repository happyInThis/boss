SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `sail_user`;
CREATE TABLE `sail_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gmt_create` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '修改时间',
  `creator` varchar(255) NOT NULL default 'system' COMMENT '创建人',
  `modifier` varchar(255) NOT NULL default 'system'  COMMENT '修改人',
  `user_name` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `phone` varchar(255) NOT NULL COMMENT '手机号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='用户表';
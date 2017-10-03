
create table menu
(
	mid int(8) null,
	father_id int(8) null,
	mname varchar(150) null,
	url varchar(150) null
)
;



INSERT INTO menu (mid, father_id, mname, url) VALUES (10000001, 10000000, '会员管理', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (10000002, 10000000, '安全设置', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (10000003, 10000000, '日志管理', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (10000004, 10000000, '互动管理', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (10000005, 10000000, '经纪业务', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (10000006, 10000000, '资金管理', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (10000007, null, '用户管理', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (12000001, 10000001, '会员信息查看', 'member/member_list.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (12000002, 10000001, '会员信息修改', 'member/member_list.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (12000003, 10000001, '新增会员', 'member/to_add_member_page');
INSERT INTO menu (mid, father_id, mname, url) VALUES (12000004, 10000001, '会员删除', 'member/member_list.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (12000005, 10000001, '服务人员变更申请', 'user/mcht_trans_apply.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (12000006, 10000001, '托管申请', 'func/bizfunc/collocation_apply.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (13000001, 10000002, '修改手机号码', 'user/modify_mobile.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (13000002, 10000002, '修改邮箱', 'user/modify_email.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (13000003, 10000002, '手机认证', 'auth/mobile_init.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (13000004, 10000002, '邮箱认证', 'auth/email_init.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (13000005, 10000002, '实名认证', 'auth/idcard_init.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (14000001, 10000003, '操作日志', 'log/operator_log.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (15000001, 10000004, '用户推广', 'custm/user/user_promote_list.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (16000001, 10000005, '代开户新增', 'user/extend/go_add_open_mcht.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (16000002, 10000005, '代开户管理', 'custm/user/open_mcht_list.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (16100001, 16000002, '查看', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (17000001, 10000006, '银行卡绑定', 'user/bank_card_bind.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18000001, 10000007, '我的操作员管理', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18000002, 10000007, '操作员权限组管理', 'func/query.htm');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18100001, 18200016, '增加', 'users/addUserPage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18100002, 18200016, '注销', 'users/userManage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18100003, 18200016, '权限组分配', 'users/userManage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18100004, 18200016, '启用', 'users/userManage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18100005, 18200016, '修改', 'users/userManage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18100006, 18200016, '禁用', 'users/userManage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18100007, 18000001, 'ukey绑定', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18100008, 18000001, 'ukey解绑', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200001, 18200015, '添加', 'role/addRolePage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200002, 18200015, '修改', 'role/roleManage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200003, 18200015, '删除', 'role/roleManage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200004, 18200015, '权限设置', 'role/roleManage');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200015, 10000000, '角色管理', null);
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200016, null, '操作员管理', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200017, null, '操作员', null);
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200018, 18200017, '操作员1', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200019, null, '操作员11', null);
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200020, 18200017, '操作员2', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200021, 18200019, '操作员22', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200022, 18200021, '操作员333', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200023, 18200021, '擦欧欧最远', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200024, 18200019, '操作员55', '');
INSERT INTO menu (mid, father_id, mname, url) VALUES (18200025, 18200024, '操作员65', '');
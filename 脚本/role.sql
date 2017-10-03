
create table role
(
	role_id int(8) null,
	role_name varchar(150) null
)
;



INSERT INTO role (role_id, role_name) VALUES (10000001, '超级管理员');
INSERT INTO role (role_id, role_name) VALUES (10000002, '普通管理员');
INSERT INTO role (role_id, role_name) VALUES (10000003, '测试管理员');
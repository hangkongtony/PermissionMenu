
create table users
(
	id int auto_increment
		primary key,
	loginName varchar(20) null,
	password varchar(20) null,
	role_Id int null,
	state int null
)
;



INSERT INTO users (logginname, password, role_Id, state) VALUES ('root', '123', 10000001, 1);
INSERT INTO users (logginname, password, role_Id, state) VALUES ('a', null, 10000003, null);
INSERT INTO users (logginname, password, role_Id, state) VALUES ('aa', '123', 10000002, 2);
INSERT INTO users (logginname, password, role_Id, state) VALUES ('aaa', '123', 10000003, 1);
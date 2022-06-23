create table users (
	id int8 not null primary key auto_increment,
	name varchar(255),
	user_permission_id int8 not null
);

insert into users (name, user_permission_id) values ('quang', 1);
insert into users (name, user_permission_id) values ('tuan', 2);
insert into users (name, user_permission_id) values ('manh', 3);


create table permission (
	id int8 not null primary key auto_increment,
	name varchar(255)
);

insert into permission (name) values ('admin');
insert into permission (name) values ('user');
insert into permission (name) values ('dev');

create table user_permission (
	id int8 not null primary key auto_increment,
	user_id int8 not null,
	permission_id int8 not null
);

insert into user_permission (user_id, permission_id) values (1, 1);
insert into user_permission (user_id, permission_id) values (2, 2);
insert into user_permission (user_id, permission_id) values (3, 3);
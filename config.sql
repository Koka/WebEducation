drop table if exists user_group;
drop table if exists user_role;
drop table if exists role_premission;
drop table if exists users;
drop table if exists groups;
drop table if exists roles;
drop table if exists premissions;


create table users (
  id    SERIAL primary key,
  name varchar(20) not null
);

create table groups (
  id    SERIAL primary key,
  name VARCHAR(20) NOT NULL

);

create table roles (
  id    SERIAL primary key,
  name VARCHAR(20) NOT NULL

);

create table premissions (
  id    SERIAL primary key AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL

);

create table user_group (
  user_id SERIAL REFERENCES users,
  group_id SERIAL REFERENCES groups
);

create table user_role (
  user_id SERIAL REFERENCES users,
  role_id SERIAL REFERENCES roles
);

create table role_premission (
  role_id SERIAL REFERENCES roles,
  premission_id SERIAL REFERENCES premissions
);





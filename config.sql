drop table if exists user_group;
drop table if exists user_role;
drop table if exists role_premission;
drop table if exists users;
drop table if exists groups;
drop table if exists roles;
drop table if exists premissions;


create table users (
  id    serial primary key,
  name varchar(20) not null
);

create table groups (
  id    serial primary key,
  name VARCHAR(20) NOT NULL

);

create table roles (
  id    serial primary key,
  name VARCHAR(20) NOT NULL

);

create table premissions (
  id    serial primary key,
  name VARCHAR(20) NOT NULL

);

create table user_group (
  user_id serial REFERENCES users,
  group_id serial REFERENCES groups
);

create table user_role (
  user_id serial REFERENCES users,
  role_id serial REFERENCES roles
);

create table role_premission (
  role_id serial REFERENCES roles,
  premission_id serial REFERENCES premissions
);





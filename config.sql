drop table if exists user_group;
drop table if exists user_role;
drop table if exists role_premission;
drop table if exists users;
drop table if exists groups;
drop table if exists roles;
drop table if exists premissions;


create table users (
  id    bigserial primary key,
  name varchar(20) not null
);

create table groups (
  id    bigserial primary key,
  name VARCHAR(20) NOT NULL

);

create table roles (
  id    bigserial primary key,
  name VARCHAR(20) NOT NULL

);

create table premissions (
  id    bigserial primary key,
  name VARCHAR(20) NOT NULL

);

create table user_group (
  user_id bigserial REFERENCES users,
  group_id bigserial REFERENCES groups
);

create table user_role (
  user_id bigserial REFERENCES users,
  role_id bigserial REFERENCES roles
);

create table role_premission (
  role_id bigserial REFERENCES roles,
  premission_id bigserial REFERENCES premissions
);





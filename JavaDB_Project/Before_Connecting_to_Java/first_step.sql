show databases;
use mysql;
show tables;

select user from user;

-- 새로운 사용자 추가하기
create user 'javaUser'@localhost identified by 'java1234';

-- 데이터베이스를 만들고 권한 부여하기
create database javaDB;
grant all privileges on javaDB.* to javaUser@localhost;

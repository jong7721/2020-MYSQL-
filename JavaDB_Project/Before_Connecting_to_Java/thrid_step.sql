use javadb;

-- 샘플 데이터를 생성하기 위해 table에 항목 생성하기
create table mytable
(
	No int primary key auto_increment,
    name char(5) not null,
    subjectName varchar(20) null
);

-- 테스트용 데이터(레코드) 삽입
insert into mytable(name, subjectName)
	value('홍길동', '조선실록1');
    
-- 삽입된 데이터 확인
select * from mytable;
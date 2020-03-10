drop table if exists employee;

create table employee(id int auto_increment primary key,name varchar(50) not null,
dob Date default not null);

insert into employee (name,dob) values('anitha',sysdate),('harika',sysdate),('rajiv',sysdate);




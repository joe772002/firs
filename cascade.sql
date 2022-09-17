drop database student;
create database student;
use student;
create table studentinfo(
    id int,
    name varchar(10),
    constraint studentinfo_pk primary key(id)
);
create table studentdegree(
    id int,
    degree float,
    constraint studentdegree_fk
     foreign key (id) 
     references studentinfo(id)
     on delete cascade
     on update cascade
);

insert into studentinfo (id,name)
values (
    1,
    'yousef'
);
insert into studentdegree (id,degree)
values (
    1,
    80
);
insert into studentdegree (id,degree)
values (
    1,
    99
);
insert into studentdegree (id,degree)
values (
    1,
    66
);
insert into studentdegree (id,degree)
values (
    1,
    78
);
select * from studentinfo;
select * from studentdegree;


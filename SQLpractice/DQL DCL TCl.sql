
insert into employee values(1, "Meher" , 18000),
(2, "Krishna" , 19500),
(3, "Prasanna" , 20000),
(4, "Varaha" , 24000);

select * from employee;

select name from employee;

select name , salary from employee;

set autocommit = 0;

insert into employee values(5, "Meher krishna", 23000);

set sql_safe_updates = 0;

update employee set id = 5 where salary = 23000;

commit;

rollback;

delete from employee;

insert into employee values(6,"Satya", 15000);
savepoint insert1;

insert into employee values(7,"Devanshi", 170000);
savepoint insert2;

rollback to insert1;

rollback to insert2;


create table fast_food(
id integer,
name Varchar(15),
packed_on date
);

insert into fast_food values(1, "Lays", '2025-09-10');


insert into fast_food values(2, "Boom Boom", '2025-06-11'),
(3, "Kurkure", '2025-012-6'),
(4, "Bingo", '2026-07-19'),
(5, "Little hearts", '2026-01-17');

select * from fast_food;

alter table fast_food rename to snacks;

select * from snacks;

truncate snacks;

create user 'testuser'@'localhost' identified by 'root1';

Grant select on snacks to 'testuser'@'localhost';

Grant insert on snacks to 'testuser'@'localhost';


revoke insert on snacks from 'testuser'@'localhost';










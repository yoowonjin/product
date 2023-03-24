drop table product;

create table product(
    pid  number(10),
    pname       varchar(30),
    quantity    number(10),
    price       number(10)
);
--�⺻Ű
alter table product add constraint product_pid_pk primary key(pid);

--����������
drop sequence pid_seq;
create sequence pid_seq;

--��ü��ȸ-
select pid,pname,quantity,price from product;

commit;


alter table PERMISSION disable all triggers;
prompt Disabling triggers for ROLE...
alter table ROLE disable all triggers;
prompt Disabling triggers for ROLE_PERMISSION...
alter table ROLE_PERMISSION disable all triggers;
prompt Disabling triggers for USER_INFO...
alter table USER_INFO disable all triggers;
prompt Disabling triggers for USER_ROLE...
alter table USER_ROLE disable all triggers;
prompt Deleting USER_ROLE...
delete from USER_ROLE;
commit;
prompt Deleting USER_INFO...
delete from USER_INFO;
commit;
prompt Deleting ROLE_PERMISSION...
delete from ROLE_PERMISSION;
commit;
prompt Deleting ROLE...
delete from ROLE;
commit;
prompt Deleting PERMISSION...
delete from PERMISSION;
commit;
prompt Loading PERMISSION...
insert into PERMISSION (id, source, code, handle)
values ('1', 'user', 'user:list', 'list');
insert into PERMISSION (id, source, code, handle)
values ('2', 'user', 'user:add', 'add');
insert into PERMISSION (id, source, code, handle)
values ('3', 'user', 'user:update', 'update');
insert into PERMISSION (id, source, code, handle)
values ('4', 'user', 'user:delete', 'delete');
insert into PERMISSION (id, source, code, handle)
values ('5', 'role', 'role:list', 'list');
insert into PERMISSION (id, source, code, handle)
values ('6', 'role', 'role:add', 'add');
insert into PERMISSION (id, source, code, handle)
values ('7', 'role', 'role:update', 'update');
insert into PERMISSION (id, source, code, handle)
values ('8', 'role', 'role:delete', 'delete');
commit;
prompt 8 records loaded
prompt Loading ROLE...
insert into ROLE (id, name)
values ('1', 'ROLE_ADMIN');
insert into ROLE (id, name)
values ('2', 'ROLE_USER');
insert into ROLE (id, name)
values ('3', 'ROLE_TEST');
commit;
prompt 3 records loaded
prompt Loading ROLE_PERMISSION...
insert into ROLE_PERMISSION (role_id, permission_id)
values ('3', '1');
insert into ROLE_PERMISSION (role_id, permission_id)
values ('3', '5');
commit;
prompt 2 records loaded
prompt Loading USER_INFO...
insert into USER_INFO (id, email, username, password, avatar, resume, register_time, login_time, state)
values ('1', 'admin@qq.com', 'admin', '3ef7164d1f6167cb9f2658c07d3c2f0a', 'https://www.tupianku.com/view/large/13862/640.jpeg', 'IT', to_date('01-02-2018', 'dd-mm-yyyy'), to_date('01-02-2018', 'dd-mm-yyyy'), 0);
insert into USER_INFO (id, email, username, password, avatar, resume, register_time, login_time, state)
values ('2', 'user@qq.com', 'user', '3ef7164d1f6167cb9f2658c07d3c2f0a', 'https://www.tupianku.com/view/large/13862/640.jpeg', 'A normal user', to_date('01-02-2018', 'dd-mm-yyyy'), to_date('01-02-2018', 'dd-mm-yyyy'), 0);
insert into USER_INFO (id, email, username, password, avatar, resume, register_time, login_time, state)
values ('3', 'test@qq.com', 'test', '3ef7164d1f6167cb9f2658c07d3c2f0a', 'https://www.tupianku.com/view/large/13862/640.jpeg', 'To Test', to_date('01-02-2018', 'dd-mm-yyyy'), to_date('01-02-2018', 'dd-mm-yyyy'), 0);
commit;
prompt 3 records loaded
prompt Loading USER_ROLE...
insert into USER_ROLE (user_id, role_id)
values ('1', '1');
insert into USER_ROLE (user_id, role_id)
values ('2', '2');
insert into USER_ROLE (user_id, role_id)
values ('3', '3');
commit;
prompt 3 records loaded
prompt Enabling triggers for PERMISSION...
alter table PERMISSION enable all triggers;
prompt Enabling triggers for ROLE...
alter table ROLE enable all triggers;
prompt Enabling triggers for ROLE_PERMISSION...
alter table ROLE_PERMISSION enable all triggers;
prompt Enabling triggers for USER_INFO...
alter table USER_INFO enable all triggers;
prompt Enabling triggers for USER_ROLE...
alter table USER_ROLE enable all triggers;

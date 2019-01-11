prompt
prompt Creating table PERMISSION
prompt =========================
prompt
create table YOUNG.PERMISSION
(
  id     VARCHAR2(32) not null,
  source VARCHAR2(256),
  code   VARCHAR2(256),
  handle VARCHAR2(256)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table YOUNG.PERMISSION
  is 'Ȩ����Ϣ��';
comment on column YOUNG.PERMISSION.id
  is 'Ȩ����Ϣid';
comment on column YOUNG.PERMISSION.source
  is 'Ȩ�޶�Ӧ����Դ';
comment on column YOUNG.PERMISSION.code
  is 'Ȩ�޴���/ͨ���';
comment on column YOUNG.PERMISSION.handle
  is '��Ӧ����Դ����';
alter table YOUNG.PERMISSION
  add constraint PK_PERMISSION primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table ROLE
prompt ===================
prompt
create table YOUNG.ROLE
(
  id   VARCHAR2(32) not null,
  name VARCHAR2(64) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table YOUNG.ROLE
  is '��ɫ��';
comment on column YOUNG.ROLE.id
  is '��ɫid';
comment on column YOUNG.ROLE.name
  is '��ɫname';
alter table YOUNG.ROLE
  add constraint PK_ROLE primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table ROLE_PERMISSION
prompt ==============================
prompt
create table YOUNG.ROLE_PERMISSION
(
  role_id       VARCHAR2(32) not null,
  permission_id VARCHAR2(32) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table YOUNG.ROLE_PERMISSION
  is '�û����ɫ��Ӧ��ϵ��';
comment on column YOUNG.ROLE_PERMISSION.role_id
  is '��ɫid';
comment on column YOUNG.ROLE_PERMISSION.permission_id
  is 'Ȩ��id';
alter table YOUNG.ROLE_PERMISSION
  add constraint PK_ROLE_PERMISSION primary key (PERMISSION_ID, ROLE_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table USER_INFO
prompt ========================
prompt
create table YOUNG.USER_INFO
(
  id            VARCHAR2(32) not null,
  email         VARCHAR2(64) not null,
  username      VARCHAR2(32) not null,
  password      VARCHAR2(1024) not null,
  avatar        VARCHAR2(1024),
  resume        VARCHAR2(512),
  register_time DATE default SYSDATE,
  login_time    DATE,
  state         NUMBER default 0
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table YOUNG.USER_INFO
  is '��¼�û���Ϣ��';
comment on column YOUNG.USER_INFO.id
  is '�û�id';
comment on column YOUNG.USER_INFO.email
  is '�û�email';
comment on column YOUNG.USER_INFO.username
  is '�û�username';
comment on column YOUNG.USER_INFO.password
  is '�û�����';
comment on column YOUNG.USER_INFO.state
  is '0:������1������';
alter table YOUNG.USER_INFO
  add constraint PK_USER_INFO primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table USER_ROLE
prompt ========================
prompt
create table YOUNG.USER_ROLE
(
  user_id VARCHAR2(32) not null,
  role_id VARCHAR2(32) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table YOUNG.USER_ROLE
  is '�û����ɫ��Ӧ��ϵ��';
comment on column YOUNG.USER_ROLE.user_id
  is '�û�id';
comment on column YOUNG.USER_ROLE.role_id
  is '��ɫid';
alter table YOUNG.USER_ROLE
  add constraint PK_USER_ROLE primary key (USER_ID, ROLE_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );


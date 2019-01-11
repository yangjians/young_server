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
  is '权限信息表';
comment on column YOUNG.PERMISSION.id
  is '权限信息id';
comment on column YOUNG.PERMISSION.source
  is '权限对应的资源';
comment on column YOUNG.PERMISSION.code
  is '权限代码/通配符';
comment on column YOUNG.PERMISSION.handle
  is '对应的资源操作';
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
  is '角色表';
comment on column YOUNG.ROLE.id
  is '角色id';
comment on column YOUNG.ROLE.name
  is '角色name';
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
  is '用户与角色对应关系表';
comment on column YOUNG.ROLE_PERMISSION.role_id
  is '角色id';
comment on column YOUNG.ROLE_PERMISSION.permission_id
  is '权限id';
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
  is '登录用户信息表';
comment on column YOUNG.USER_INFO.id
  is '用户id';
comment on column YOUNG.USER_INFO.email
  is '用户email';
comment on column YOUNG.USER_INFO.username
  is '用户username';
comment on column YOUNG.USER_INFO.password
  is '用户密码';
comment on column YOUNG.USER_INFO.state
  is '0:正常，1：冻结';
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
  is '用户与角色对应关系表';
comment on column YOUNG.USER_ROLE.user_id
  is '用户id';
comment on column YOUNG.USER_ROLE.role_id
  is '角色id';
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


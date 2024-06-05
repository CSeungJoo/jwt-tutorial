insert into USERS(USER_ID, USERNAME, PASSWORD, NICKNAME, ACTIVATED) values (1, 'admin', 'as', 'nickname', true);

insert into AUTHORITY (AUTHORITY_NAME) values ('ROLE_USER');
insert into AUTHORITY (AUTHORITY_NAME) values ('ROLE_ADMIN');

insert into USER_AUTHORITY(USER_ID, AUTHORITY_NAME) values (1, 'ROLE_USER');
insert into USER_AUTHORITY(USER_ID, AUTHORITY_NAME) values (1, 'ROLE_ADMIN');
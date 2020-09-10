INSERT INTO USERS(username, password, enabled) values ('dinujames', 'pass123', true);
INSERT INTO USERS(username, password, enabled) values ('admin', 'admin123', true);
INSERT INTO AUTHORITIES(username, authority) values ('dinujames', 'ROLE_USER');
INSERT INTO AUTHORITIES(username, authority) values ('admin', 'ROLE_ADMIN');

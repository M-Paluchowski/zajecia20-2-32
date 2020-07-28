INSERT INTO user(username, password, enabled) VALUES ('admin', '{noop}admin', true);
INSERT INTO user(username, password, enabled) VALUES ('user', '{noop}user', true);

INSERT INTO user_role(username, role) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO user_role(username, role) VALUES ('user', 'ROLE_USER');
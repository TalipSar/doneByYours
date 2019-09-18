insert into Ouvriers(id, name, profession, ville) values(1, 'Greg', 'Electricien', 'Bruxelles');
insert into Ouvriers(id, name, profession, ville) values(2,'Bob', 'Plombier', 'Anvers');
insert into Ouvriers(id, name, profession, ville) values(3, 'Sylvain', 'Electricien', 'Bruxelles');
insert into Ouvriers(id, name, profession, ville) values(4,'Paul', 'Carreleur', 'Liège');
insert into Ouvriers(id, name, profession, ville) values(5,'John', 'Electricien', 'Bruxelles');
insert into Ouvriers(id, name, profession, ville) values(6, 'Stef', 'Peintre', 'Anvers');
insert into Ouvriers(id, name, profession, ville) values(7, 'Momo', 'Carreleur', 'Anvers');


insert into Projet(id, name, adress, date) values(1, 'Entretien Plomberie','Bruxelles', 20191001);
insert into Projet(id, name, adress, date) values(2, 'Réparation toit','Gand', 20191015);
insert into Projet(id, name, adress, date) values(3, 'Carrelage','Bruxelles', 20190912);

insert  into OUVRIERS_PROJET(ouvrier_id, projet_id) values(1,1);
insert  into OUVRIERS_PROJET(ouvrier_id, projet_id) values(2,1);

insert  into OUVRIERS_PROJET(ouvrier_id, projet_id) values(3,2);
insert  into OUVRIERS_PROJET(ouvrier_id, projet_id) values(5,2);





INSERT INTO USER (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'admin@admin.com', 1, PARSEDATETIME('01-01-2019', 'dd-MM-yyyy'));
INSERT INTO USER (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', 1, PARSEDATETIME('01-01-2019','dd-MM-yyyy'));
INSERT INTO USER (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (3, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', 0, PARSEDATETIME('01-01-2019','dd-MM-yyyy'));

INSERT INTO AUTHORITY (ID, NAME) VALUES (1, 'ROLE_USER');
INSERT INTO AUTHORITY (ID, NAME) VALUES (2, 'ROLE_ADMIN');

INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 1);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 2);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (2, 1);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (3, 1);
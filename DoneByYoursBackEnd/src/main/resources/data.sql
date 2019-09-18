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
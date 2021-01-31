insert into utilizador(utilizador_nome, utilizador_bd_date, utilizador_sexo, utilizador_local) values('Alice Santos',str_to_date('1995.01.01','%Y.%m.%d'),'F', 'Lisboa');
insert into utilizador(utilizador_nome, utilizador_bd_date, utilizador_sexo, utilizador_local) values('Ângela Pires',str_to_date('1990.11.21','%Y.%m.%d'),'F', 'Porto');
insert into utilizador(utilizador_nome, utilizador_bd_date, utilizador_sexo, utilizador_local) values('Fátima Santos',str_to_date('1986.04.30','%Y.%m.%d'),'F', 'Guimarães');
insert into utilizador(utilizador_nome, utilizador_bd_date, utilizador_sexo, utilizador_local) values('Albano Pereira',str_to_date('1998.05.07','%Y.%m.%d'),'M', 'Braga');

insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (1, 'micro-ondas', 750);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (1, 'máquina de lavar a loiça', 2400);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (1, 'máquina de lavar a roupa', 2300);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (1, 'torradeira', 1030);

insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (2, 'micro-ondas', 1000);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (2, 'máquina de lavar a loiça', 2250);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (2, 'máquina de lavar a roupa', 2000);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (2, 'torradeira', 1400);

insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (3, 'micro-ondas', 900);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (3, 'máquina de lavar a loiça', 2100);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (3, 'máquina de lavar a roupa', 1850);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (3, 'torradeira', 1670);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (3, 'máquina de secar a roupa', 1000);

insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (4, 'micro-ondas', 800);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (4, 'máquina de lavar a loiça', 1950);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (4, 'máquina de lavar a roupa', 1700);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (4, 'torradeira', 1100);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (4, 'máquina de secar a roupa', 850);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (4, 'robô de cozinha', 1500);
insert into eletrodomestico(eletro_utilizador_id, eletro_nome, eletro_potencia) values (4, 'frigorífico', 200);

insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 1, "2020-10-10", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 2, "2020-10-10", 10);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 3, "2020-10-10", 8);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 4, "2020-10-10", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 1, "2020-10-17", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 2, "2020-10-17", 8);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 3, "2020-10-17", 6);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 4, "2020-10-17", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 1, "2020-10-24", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 2, "2020-10-24", 9);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 3, "2020-10-24", 8);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 4, "2020-10-24", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 1, "2020-10-31", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 2, "2020-10-31", 10);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 3, "2020-10-31", 4);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (1, 4, "2020-10-31", 1);

insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 1, "2020-1-5", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 2, "2020-1-5", 6);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 3, "2020-1-5", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 4, "2020-1-5", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 1, "2020-1-12", 4);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 2, "2020-1-12", 6);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 3, "2020-1-12", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 4, "2020-1-12", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 1, "2020-1-19", 3);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 2, "2020-1-19", 8);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 3, "2020-1-19", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 4, "2020-1-19", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 1, "2020-1-26", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 2, "2020-1-26", 7);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 3, "2020-1-26", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (2, 4, "2020-1-26", 1);

insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 1, "2020-2-8", 5);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 2, "2020-2-8", 5);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 3, "2020-2-8", 6);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 4, "2020-2-8", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 5, "2020-2-8", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 1, "2020-2-15", 5);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 2, "2020-2-15", 3);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 3, "2020-2-15", 4);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 4, "2020-2-15", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 5, "2020-2-15", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 1, "2020-2-22", 3);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 2, "2020-2-22", 5);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 3, "2020-2-22", 4);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 4, "2020-2-22", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 5, "2020-2-22", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 1, "2020-2-29", 3);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 2, "2020-2-29", 3);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 3, "2020-2-29", 5);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 4, "2020-2-29", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (3, 5, "2020-2-29", 5);

insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 1, "2020-7-4", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 2, "2020-7-4", 4);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 3, "2020-7-4", 3);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 4, "2020-7-4", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 5, "2020-7-4", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 6, "2020-7-4", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 7, "2020-7-4", 168);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 1, "2020-7-11", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 2, "2020-7-11", 4);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 3, "2020-7-11", 3);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 4, "2020-7-11", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 5, "2020-7-11", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 6, "2020-7-11", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 7, "2020-7-11", 168);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 1, "2020-7-18", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 2, "2020-7-18", 4);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 3, "2020-7-18", 3);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 4, "2020-7-18", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 5, "2020-7-18", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 6, "2020-7-18", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 7, "2020-7-18", 168);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 1, "2020-7-25", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 2, "2020-7-25", 4);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 3, "2020-7-25", 3);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 4, "2020-7-25", 1);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 5, "2020-7-25", 0);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 6, "2020-7-25", 2);
insert into consumo(consumo_utilizador_id, consumo_eletro_id, consumo_data, consumo_tempo_on) values (4, 7, "2020-7-25", 168);

insert into objetivo(objetivo_meta) values (25); #1
insert into objetivo(objetivo_meta) values (15); #2
insert into objetivo(objetivo_meta) values (15); #3
insert into objetivo(objetivo_meta) values (25); #4

insert into objetivoconta(objetivoconta_utilizador_id, objetivoconta_conta_id, objetivoconta_objetivo_id) values (1, 1, 1); #tem de existir primeiro um valor na tabela conta
#insert into objetivoconta(objetivoconta_utilizador_id, objetivoconta_conta_id, objetivoconta_objetivo_id) values (2, 2, 2); 
#insert into objetivoconta(objetivoconta_utilizador_id, objetivoconta_conta_id, objetivoconta_objetivo_id) values (3, 3, 3); 
#insert into objetivoconta(objetivoconta_utilizador_id, objetivoconta_conta_id, objetivoconta_objetivo_id) values (4, 4, 4); 
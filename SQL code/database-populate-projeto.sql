insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Alice Santos',str_to_date('1995.01.01','%Y.%m.%d'),'F', 'Lisboa', 1, 1);
insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Ângela Pires',str_to_date('1990.11.21','%Y.%m.%d'),'F', 'Porto', 2, 2);
insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Fátima Santos',str_to_date('1986.04.30','%Y.%m.%d'),'F', 'Guimarães', 3, 3);
insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Albano Pereira',str_to_date('1998.05.07','%Y.%m.%d'),'M', 'Braga', 4, 4);
insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Eduardo Silva',str_to_date('1982.01.31','%Y.%m.%d'),'M', 'Lisboa', 5, 5);
insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Sérgio Pinto',str_to_date('1991.10.23','%Y.%m.%d'),'M', 'Faro', 6, 6);
insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Vera Esteves',str_to_date('1999.03.27','%Y.%m.%d'),'F', 'Porto', 7, 7);
insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Bianca Tavares',str_to_date('1979.02.20','%Y.%m.%d'),'F', 'Cascais', 8, 8);
insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Carlos Costa',str_to_date('1983.07.10','%Y.%m.%d'),'M', 'Braga', 9, 9);
insert into utilizador(user_nome, user_idade, user_sexo, user_local, consumo_sem, conta_utilizador) values('Filipe Almeida',str_to_date('1988.09.06','%Y.%m.%d'),'M', 'Cascais', 10, 10);

insert into consumo(consumo_data, consumo_quantidade, tipo, eletro_id) values ("2020-10-31", 43.4, 'eletricidade', 1);
insert into consumo(consumo_data, consumo_quantidade, tipo, eletro_id) values ("2020-07-03", 33.6, 'eletricidade', 2);
insert into consumo(consumo_data, consumo_quantidade, tipo, eletro_id) values ("2020-02-12", 756, 'eletricidade', 3);
insert into consumo(consumo_data, consumo_quantidade, tipo, eletro_id) values ("2020-01-05", 16.8, 'gás', 4);
insert into consumo(consumo_data, consumo_quantidade, tipo, eletro_id) values ("2020-04-03", 49, 'gás', 5);

insert into tipo_consumo(tipo, eletricidade, gas) values (1, true, false);
insert into tipo_consumo(tipo, eletrecidade, gas) values (2, false, true);

insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 46.69, 50);
insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 30.24, 37.5);
insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 38.64, 42.3);
insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 45.10, 53);
insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 40.08, 49.6);
insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 40.07, 35);
insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 30.72, 25);
insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 35.05, 29.5);
insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 40.01, 33.2);
insert into conta(conta_mes, conta_custo, conta_objetivo, plan_conta) values (5, 37.23, 34.7);

insert into plano() values ();

insert into eletrodomestico(eletro_nome, consumo, tempo_on, tipo) values ('micro-ondas', 3.1, 2, 'eletricidade');
insert into eletrodomestico(eletro_nome, consumo, tempo_on, tipo) values ('máquina de lavar a roupa', 2.4, 2, 'eletricidade');
insert into eletrodomestico(eletro_nome, consumo, tempo_on, tipo) values ('frigorífico', 4.5, 24, 'eletricidade');
insert into eletrodomestico(eletro_nome, consumo, tempo_on, tipo) values ('fogão', 1.2, 2, 'gás');
insert into eletrodomestico(eletro_nome, consumo, tempo_on, tipo) values ('esquentador', 3, 4, 'gás');

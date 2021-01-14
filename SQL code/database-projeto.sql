create database projeto;

use projeto;

create table utilizador(user_id int not null auto_increment,
						user_nome varchar(60),
                        user_idade date not null,
                        user_sexo char(1) not null,
                        user_local varchar(30),
                        consumo_sem double,
                        conta_utilizador double not null,
                        primary key(user_id));
                        
create table consumo(consumo_id int not null auto_increment,
                     consumo_data date not null,
                     consumo_quantidade double,
                     eletro_id varchar(30),
                     primary key(consumo_id));
                          
create table conta(conta_id int not null auto_increment,
				   conta_mes int,
				   conta_objetivo double,
                   conta_custo double,
                   plan_conta varchar(20),#
                   primary key(conta_id));
                   
create table plano(plan_id varchar(20),#
				   horario integer,
				   custo double,
                   primary key(plan_id));
                     
create table eletrodomestico(eletro_id int not null auto_increment,
                             eletro_nome varchar(30),
                             consumo double not null,
                             tempo_on double not null,
                             isEletrico boolean,
                             primary key(eletro_id));
                             
-- foreign keys

alter table utilizador add constraint utilizador_fk_consumo
            foreign key(consumo_sem) references consumo(consumo_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table utilizador add constraint utilizador_fk_consumo
            foreign key(conta_utilizador) references conta(conta_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table conta add constraint conta_fk_plano
            foreign key(plan_conta) references plano(plan_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table consumo add constraint consumo_fk_eletrodomestico
            foreign key(tipo) references eletrodomestico(tipo)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table consumo add constraint consumo_fk_eletrodomestico
            foreign key(eletro_id) references eletrodomestico(eletro_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;

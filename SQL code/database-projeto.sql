create database projeto;

use projeto;

create table utilizador(utilizador_id int not null auto_increment,
						utilizador_nome varchar(60),
                        utilizador_bd_date date not null,
                        utilizador_sexo char(1) not null,
                        utilizador_local varchar(30),
                        primary key(utilizador_id));
                        
create table consumo(consumo_id int not null auto_increment,
                     consumo_data date not null,
                     consumo_quantidade double,
                     consumo_eletro_id int,
                     consumo_utilizador_id int,
                     primary key(consumo_id));
                          
create table objetivo(objetivo_id int not null auto_increment,
				      objetivo_mes int,
				      objetivo double,
                      objetivo_custo double,
                      objetivo_utilizador_id int,
                      primary key(objetivo_id));

create table objetivoplano(objetivoplano_id int not null,
                           objplan_mes int not null,
                           primary key(objetivoplano_id));

create table plano(plan_id int not null auto_increment,
				   nome varchar(50),
				   custo double,
                   primary key(plan_id));
                     
create table eletrodomestico(eletro_id int not null auto_increment,
                             eletro_nome varchar(30),
                             eletro_consumo double not null,
                             eletro_tempo_on int not null,
                             eletro_isEletrico boolean,
                             eletro_utilizador_id int,
                             primary key(eletro_id));
                             
-- foreign keys

alter table consumo add constraint consumo_fk_utilizador
            foreign key(consumo_utilizador_id) references utilizador(utilizador_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table consumo add constraint consumo_fk_eletrodomestico
            foreign key(consumo_eletro_id) references eletrodomestico(eletro_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table objetivo add constraint objetivo_fk_utilizador
            foreign key(objetivo_utilizador_id) references utilizador(utilizador_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table eletrodomestico add constraint eletrodomestico_fk_utilizador
            foreign key(eletro_utilizador_id) references utilizador(utilizador_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table objetivoplano add constraint objetivoplano_fk_objetivo
            foreign key(objetivoplano_id) references objetivo(objetivo_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table objetivoplano add constraint objetivoplano_fk_plano
            foreign key(objetivoplano_id) references plano(plan_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
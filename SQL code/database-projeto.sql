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
                     consumo_energia double,
		     consumo_tempo_on int,
                     consumo_eletro_id int,
                     consumo_utilizador_id int,
                     primary key(consumo_id));
                          
create table objetivo(objetivo_id int not null auto_increment,
				      objetivo_meta double,
                      primary key(objetivo_id));

create table objetivoconta(objetivoconta_id int,
                           objetivoconta_utilizador_id int,
                           objetivoconta_conta_id int,
                           objetivoconta_objetivo_id int,
                           primary key(objetivoconta_id)); 

create table conta(conta_id int not null auto_increment,
				   conta_mes varchar(20),
                   conta_custo double,
                   conta_utilizador_id int,
                   primary key(conta_id));
                     
create table eletrodomestico(eletro_id int not null auto_increment,
                             eletro_nome varchar(30),
                             eletro_potencia double not null,
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
            
alter table conta add constraint conta_fk_utilizador
            foreign key(conta_utilizador_id) references utilizador(utilizador_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table eletrodomestico add constraint eletrodomestico_fk_utilizador
            foreign key(eletro_utilizador_id) references utilizador(utilizador_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table objetivoconta add constraint objetivoconta_fk_objetivo
            foreign key(objetivoconta_objetivo_id) references objetivo(objetivo_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table objetivoconta add constraint objetivoconta_fk_conta
            foreign key(objetivoconta_conta_id) references conta(conta_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table objetivoconta add constraint objetivoconta_fk_utilizador
            foreign key(objetivoconta_utilizador_id) references utilizador(utilizador_id)
            ON DELETE NO ACTION ON UPDATE NO ACTION;

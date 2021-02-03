DELIMITER //
Create procedure getEnergia()
begin
select consumo_tempo_on, consumo_data, eletro_nome, (eletro_potencia*consumo_tempo_on/1000) as Energia, consumo_id
from consumo inner join eletrodomestico
on eletrodomestico.eletro_id = consumo.consumo_eletro_id 
where consumo_utilizador_id = 1;
end //
DELIMITER ;

DELIMITER //
Create procedure getCusto()
begin
insert into conta (conta_custo, conta_mes, conta_utilizador_id) values( (select SUM(eletro_potencia * consumo_tempo_on / 1000) * 0.14160 AS Custo 
FROM consumo INNER JOIN eletrodomestico ON eletrodomestico.eletro_id = consumo.consumo_eletro_id 
WHERE consumo_utilizador_id = 1 AND date_format(consumo_data, '%M') = 'October'), 'October', 1);
end //
DELIMITER ;

insert into objetivoconta(objetivoconta_id, objetivoconta_utilizador_id, objetivoconta_conta_id, objetivoconta_objetivo_id) values (1, 1, 1, 1);

select conta_id, conta_custo, conta_mes
from conta
where conta_utilizador_id = 1;

#-------------------------------------------------------

select count(*) eletro_nome
from eletrodomestico
where eletro_utilizador_id = 4;
# número de eletrodomésticos do utilizador 4

select count(*) eletro_nome
from eletrodomestico;
# numero de eletrodoméstico registados

select count(*) consumo_tempo_on
from consumo
where consumo_tempo_on > '8';
# número de eletrodomésticos que estiveram mais de 8 horas ligados

select eletro_utilizador_id as Utilizador, eletro_nome as Eletrodoméstico
from eletrodomestico
where eletro_potencia > '1500';
# eletrodomésticos onde a potencia é superior a 1500 W

select distinct (utilizador_nome) as Nome, count(distinct eletro_id) as "Número de Eletrodomésticos"
from eletrodomestico 
inner join utilizador
ON eletro_utilizador_id = utilizador_id  
group by utilizador_id;
# nomes dos utilizadores e os seus eletrodomésticos

select distinct (utilizador_nome) as Nome, count(distinct eletro_id) as "Número de Eletrodomésticos", count(consumo_tempo_on)
from eletrodomestico 
inner join utilizador
inner join consumo
ON eletro_utilizador_id = utilizador_id  
group by utilizador_id
order by utilizador_nome asc;
# nomes dos utilizadores por ordem alfabética, os seus eletrodomésticos e o número de horas que os eletrodomésticos estiveram ligados

select *
from utilizador;
# todas os valores associados a cada um dos utilizadores

select * 
from utilizador
where utilizador_sexo = 'F';
# utlizadores do sexo feminino

select utilizador_nome as 'Nome', utilizador_bd_date as Birthdate, timestampdiff(YEAR,utilizador_bd_date,sysdate()) as Age 
from utilizador;
# idade dos utilizadores

select * 
from utilizador
where year(utilizador_bd_date) > '1990';
# utilizadores que nasceram depois de 1990

create index ordem_consumos
on consumo (consumo_energia, consumo_data);

show indexes 
from consumo;

create index ordem_eletrodomesticos
on eletrodomestico (eletro_potencia, eletro_nome);

show indexes 
from eletrodomestico;
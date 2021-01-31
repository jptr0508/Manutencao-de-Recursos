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

select conta_custo, conta_mes
from conta;

#-------------------------------------------------------

select *
from utilizador;

select * 
from utilizador
where utilizador_sexo = 'F';

select utilizador_nome as 'Nome', utilizador_bd_date as Birthdate, timestampdiff(YEAR,user_idade,sysdate()) as Age 
from utilizador;

select * 
from utilizador
where utilizador_sexo = 'M' and year(utilizador_bd_date) > '1990';
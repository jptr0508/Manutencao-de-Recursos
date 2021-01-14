select consumo*tempo_on*7 as 'Consumo', stud_name
from eletrodomestico;

select *
from utilizador;

select * 
from utilizador
where user_sexo = 'F';

select *
from consumo
where tipo = 'eletricidade';

select *
from consumo
where tipo = 'gás';

select user_nome as 'Nome', user_idade as Birthdate, timestampdiff(YEAR,user_idade,sysdate()) as Age 
from utilizador;

select * 
from utilizador
where user_sexo = 'M' and year(user_idade) > '1990' and consumo_sem > 5;
                                                                   

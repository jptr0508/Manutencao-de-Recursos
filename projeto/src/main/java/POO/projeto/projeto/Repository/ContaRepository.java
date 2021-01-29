package POO.projeto.projeto.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import POO.projeto.projeto.Models.Conta;
import POO.projeto.projeto.View.ContaView;

public interface ContaRepository extends CrudRepository<Conta, Integer> {
    
    String addContaQuery = "insert into conta (conta_custo, conta_mes, conta_utilizador_id) values( (select SUM(eletro_potencia * consumo_tempo_on / 1000) * 0.14160 AS Custo FROM consumo INNER JOIN eletrodomestico ON eletrodomestico.eletro_id = consumo.consumo_eletro_id WHERE consumo_utilizador_id = :utilizador_id AND date_format(consumo_data, '%M') = :contaMes), :contaMes, :utilizador_id )";
    @Modifying @Transactional @Query(value=addContaQuery, nativeQuery=true)
    
    int addContaUser(@Param("utilizador_id") int utilizador_id, @Param("contaMes") String contaMes);

    String mostrarContaQuery = "select conta_mes, conta_custo from conta where conta_utilizador_id= :utilizador_id";
    @Query(value = mostrarContaQuery, nativeQuery = true)
    Iterable<ContaView> mostrarContaUser(@Param("utilizador_id") int utilizador_id);

}

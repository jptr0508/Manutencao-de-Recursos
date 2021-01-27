package POO.projeto.projeto.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import POO.projeto.projeto.Models.Consumo;
import POO.projeto.projeto.View.ConsumoView;

public interface ConsumoRepository extends CrudRepository<Consumo, Integer>{

    String consumoQuery = "select consumo_tempo_on, consumo_data, eletro_nome, (eletro_potencia*consumo_tempo_on/1000) as consumo_energia, consumo_id from consumo inner join eletrodomestico on eletrodomestico.eletro_id = consumo.consumo_eletro_id where consumo_utilizador_id =:utilizador_id";
    
    @Query(value=consumoQuery, nativeQuery=true)
    Iterable<ConsumoView> findUserConsumo(@Param("utilizador_id") int utilizador_id);
    
  }

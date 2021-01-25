package POO.projeto.projeto.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import POO.projeto.projeto.Models.Consumo;
import POO.projeto.projeto.View.ConsumoView;

public interface ConsumoRepository extends CrudRepository<Consumo, Integer>{

    String consumoQuery = "SELECT consumo_id, consumo_data, consumo_tempo_on, consumo_energia from consumo where consumo_utilizador_id = :utilizador_id";
    
    @Query(value=consumoQuery, nativeQuery=true)
    Iterable<ConsumoView> findUserConsumo(@Param("utilizador_id") int utilizador_id);
    
  }

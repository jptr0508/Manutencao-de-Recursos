package POO.projeto.projeto.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import POO.projeto.projeto.Models.Eletrodomestico;
import POO.projeto.projeto.View.EletrodomesticoView;

public interface EletrodomesticoRepository extends CrudRepository<Eletrodomestico, Integer>{
    
  String eletrodomesticoQuery = "SELECT eletro_id, eletro_nome, eletro_potencia from eletrodomestico where eletro_utilizador_id = :utilizador_id";
    

  @Query(value=eletrodomesticoQuery, nativeQuery=true)
    Iterable<EletrodomesticoView> findUserEletro(@Param("utilizador_id") int utilizador_id);

  
  
}

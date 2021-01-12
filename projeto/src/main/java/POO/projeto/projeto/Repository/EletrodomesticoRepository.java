package POO.projeto.projeto.Repository;

import org.springframework.data.repository.CrudRepository;

import POO.projeto.projeto.Models.Eletrodomestico;

public interface EletrodomesticoRepository extends CrudRepository<Eletrodomestico, Integer>{
    
    Iterable<Eletrodomestico> findByName(String eletro_nome);
    Iterable<Eletrodomestico> findByTempo_onLike(double tempo_on);
 
    
    
}

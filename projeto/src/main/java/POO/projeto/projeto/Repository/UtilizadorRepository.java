package POO.projeto.projeto.Repository;

import org.springframework.data.repository.CrudRepository;

import POO.projeto.projeto.Models.Utilizador;

public interface UtilizadorRepository extends CrudRepository<Utilizador, Integer> {
   // Iterable<Utilizador> findByName(String user_nome);
  
}

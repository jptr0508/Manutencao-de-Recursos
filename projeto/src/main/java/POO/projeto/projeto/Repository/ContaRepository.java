package POO.projeto.projeto.Repository;

import org.springframework.data.repository.CrudRepository;

import POO.projeto.projeto.Models.Conta;

public interface ContaRepository extends CrudRepository<Conta, Integer> {
    
}

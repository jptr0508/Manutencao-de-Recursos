package POO.projeto.projeto.Controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import POO.projeto.projeto.Exceptions.NotFoundException;
import POO.projeto.projeto.Models.Utilizador;
import POO.projeto.projeto.Repository.UtilizadorRepository;

@RestController
@RequestMapping(path="/api/utilizador")
public class UtilizadorController {
    private Logger logger = LoggerFactory.getLogger(EletrodomesticoController.class);
    @Autowired
    private UtilizadorRepository utilizadorRepository;

    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Utilizador getTipo(@PathVariable int user_id) {
        logger.info("Sending eletrodomesticos that correspont to the id "+user_id);
        Optional<Utilizador> _utilizador= utilizadorRepository.findById(user_id);
        if (_utilizador.isEmpty()) throw
        new NotFoundException(""+user_id,"Utilizador","id");
        else 
        return _utilizador.get();
    }
}
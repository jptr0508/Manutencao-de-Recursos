package POO.projeto.projeto.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import POO.projeto.projeto.Models.Consumo;
import POO.projeto.projeto.Repository.ConsumoRepository;
import POO.projeto.projeto.View.ConsumoView;

@RestController
@RequestMapping(path="/api/consumos")
public class ConsumoController {
    private Logger logger = LoggerFactory.getLogger(ConsumoController.class);
    
    @Autowired
    private ConsumoRepository ConsumoRepository;
    
    @GetMapping(path ="/{utilizador_id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ConsumoView> findUserConsumo(@PathVariable int utilizador_id) {
        logger.info("Sending Consumos that belongs to the user with the id" + utilizador_id);
        return ConsumoRepository.findUserConsumo(utilizador_id);
    }

    @PostMapping(path="", produces=MediaType.APPLICATION_JSON_VALUE)
    public Consumo saveConsumo(@RequestBody Consumo consumo){
    logger.info("Saving consumos with id "+consumo.getConsumo_id());
    Consumo savedConsumo = ConsumoRepository.save(consumo);
    return savedConsumo;
}
}

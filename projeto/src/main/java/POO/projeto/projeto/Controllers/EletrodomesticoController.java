package POO.projeto.projeto.Controllers;

import java.util.Optional;

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

import POO.projeto.projeto.Exceptions.NotFoundException;
import POO.projeto.projeto.Models.Eletrodomestico;
import POO.projeto.projeto.Repository.EletrodomesticoRepository;


    @RestController
@RequestMapping(path="/api/eletrodomesticos")
public class EletrodomesticoController {
private Logger logger = LoggerFactory.getLogger(EletrodomesticoController.class);
@Autowired
private EletrodomesticoRepository EletrodomesticoRepository;
@GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
public Iterable<Eletrodomestico> getEletrodomesticos() {
logger.info("Sending all Eletrodomesticos");
return EletrodomesticoRepository.findAll();
} //works

@GetMapping(path ="/{eletro_id:[1-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
public Eletrodomestico getId(@PathVariable int eletro_id) {
    logger.info("Sending eletrodomesticos that correspont to the id "+eletro_id);
    Optional<Eletrodomestico> _eletrodomestico= EletrodomesticoRepository.findById(eletro_id);
    if (_eletrodomestico.isEmpty()) throw
    new NotFoundException(""+eletro_id,"Eletrodomestico","tipo");
    else 
    return _eletrodomestico.get();

}//works

/*@GetMapping(path ="/{tipo:[false,true]+}", produces= MediaType.APPLICATION_JSON_VALUE)
public Eletrodomestico getTipo(@PathVariable boolean tipo) {
    logger.info("Sending eletrodomesticos that are powered by electricity "+tipo);
    Iterable<Eletrodomestico> eletrodomestico= EletrodomesticoRepository.findByTipo(tipo);
    if (eletrodomestico.isEmpty()) throw
    new NotFoundException(""+tipo,"Eletrodomestico","tipo");
    else 
    return eletrodomestico.get();
//erro no return
}*/
@PostMapping(path="", produces=MediaType.APPLICATION_JSON_VALUE)
public Eletrodomestico saveEletrodomestico(@RequestBody Eletrodomestico eletrodomestico){
    Eletrodomestico savedEletrodomestico = EletrodomesticoRepository.save(eletrodomestico);
    
logger.info("Saving eletrodomestico with id "+savedEletrodomestico.getEletro_id());
return savedEletrodomestico;
}

}
    


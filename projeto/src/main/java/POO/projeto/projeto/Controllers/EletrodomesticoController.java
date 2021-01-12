package POO.projeto.projeto.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
}
    


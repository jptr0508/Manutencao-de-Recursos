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

import POO.projeto.projeto.Models.Conta;
import POO.projeto.projeto.Repository.ContaRepository;
import POO.projeto.projeto.View.ContaView;

@RestController
@RequestMapping(path="/api/custos")
public class ContaController {
    private Logger logger = LoggerFactory.getLogger(ContaController.class);
    @Autowired
    private ContaRepository ContaRepository;
    @GetMapping(path ="/{utilizador_id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ContaView> mostrarContaUser(@PathVariable int utilizador_id) {
        logger.info("Sending Custos that belongs to the user with the id" + utilizador_id);
        return ContaRepository.mostrarContaUser(utilizador_id);
    }

    @PostMapping(path="/{utilizador_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public int addContaUser(@PathVariable int utilizador_id, @RequestBody Conta contaMes){
        logger.info("Saving eletrodomestico with for the month"+ contaMes.toString());
        return ContaRepository.addContaUser(utilizador_id, contaMes);
    }
}

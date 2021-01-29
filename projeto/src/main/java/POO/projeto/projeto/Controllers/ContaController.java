package POO.projeto.projeto.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import POO.projeto.projeto.Models.Conta;
import POO.projeto.projeto.Repository.ContaRepository;

@RestController
@RequestMapping(path="/api/custos/{utilizador_id}/")
public class ContaController {
    private Logger logger = LoggerFactory.getLogger(ContaController.class);
    @Autowired
    private ContaRepository ContaRepository;
    

    @PostMapping(path="{contaMes}", produces = MediaType.APPLICATION_JSON_VALUE)
    public int addContaUser(@PathVariable int utilizador_id, @PathVariable String contaMes){
        logger.info("Saving eletrodomestico with for the month"+ contaMes);
        return ContaRepository.addContaUser(utilizador_id, contaMes);
    
    }
}

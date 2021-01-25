package POO.projeto.projeto.Controllers;

import java.lang.reflect.Array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import POO.projeto.projeto.Models.Consumo;
import POO.projeto.projeto.Models.Eletrodomestico;
import POO.projeto.projeto.Repository.ContaRepository;

@RestController
@RequestMapping(path="/api/custos/{utilizador_id}")
public class ContaController {
    private Logger logger = LoggerFactory.getLogger(ContaController.class);
    @Autowired
    private ContaRepository ContaRepository;
    

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getCustoSemana(){}

   






}

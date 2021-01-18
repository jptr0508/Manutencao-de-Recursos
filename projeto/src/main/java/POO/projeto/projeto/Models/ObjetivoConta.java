package POO.projeto.projeto.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "objetivoconta")
public class ObjetivoConta {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name = "objetivoconta_conta_id") int objetivoconta_conta_id;
    @ManyToOne @JoinColumn(name = "objetivoconta_utilizador_id")
    private List<Utilizador> utilizador;
    @ManyToOne @JoinColumn(name = "objetivoconta_conta_id")
    private List<Conta> conta;
    @ManyToOne @JoinColumn(name = "objetivoconta_objetivo_id")
    private List<Objetivo> objetivo;

    public ObjetivoConta(){

    }

    public int getObjetivoConta() {
        return objetivoconta_conta_id;
    }

    public void setObjetivoConta(int objetivoconta_conta_id) {
        this.objetivoconta_conta_id = objetivoconta_conta_id;
    }
}

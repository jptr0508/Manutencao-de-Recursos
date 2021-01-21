package POO.projeto.projeto.Models;



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
    @Column(name = "objetivoconta_id") int objetivoconta_conta_id;
    @ManyToOne @JoinColumn(name = "objetivoconta_utilizador_id")
    private Utilizador utilizador;
    @ManyToOne @JoinColumn(name = "objetivoconta_conta_id")
    private Conta conta;
    @ManyToOne @JoinColumn(name = "objetivoconta_objetivo_id")
    private Objetivo objetivo;

    public ObjetivoConta(){}

  

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public int getObjetivoconta_conta_id() {
        return objetivoconta_conta_id;
    }

    public void setObjetivoconta_conta_id(int objetivoconta_conta_id) {
        this.objetivoconta_conta_id = objetivoconta_conta_id;
    }

   
}

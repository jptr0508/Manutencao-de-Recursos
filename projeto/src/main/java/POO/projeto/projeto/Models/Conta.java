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
@Table(name = "conta")
public class Conta {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
   @Column(name = "conta_id") private int conta_id;
   @Column(name = "conta_mes") private String conta_mes;
   @Column(name = "conta_custo") private Double conta_custo;
   @ManyToOne @JoinColumn(name = "conta_utilizador_id")
    private Utilizador utilizador;
   
    public Conta() {
    }

    public int getConta_id() {
        return conta_id;
    }
    public Utilizador getUtilizador() {
        return utilizador;
    }
    public String getConta_mes() {
        return conta_mes;
    }
    public Double getConta_custo() {
        return conta_custo;
    }

}

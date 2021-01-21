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
@Table(name = "conta")
public class Conta {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
   @Column(name = "conta_id") private int conta_id;
   @Column(name = "conta_mes") private String conta_mes;
   @Column(name = "conta_custo") private double conta_custo;
   @ManyToOne @JoinColumn(name = "conta_utilizador_id")
    private Utilizador utilizador;
//enrollment
    public Conta() {
    }

    public int getConta_id() {
        return conta_id;
    }

    public void setConta_id(int conta_id) {
        this.conta_id = conta_id;
    }

    public String getConta_mes() {
        return conta_mes;
    }

    public void setConta_mes(String conta_mes) {
        this.conta_mes = conta_mes;
    }

    public double getConta_custo() {
        return conta_custo;
    }

    public void setConta_custo(double conta_custo) {
        this.conta_custo = conta_custo;
    }

    
    
}

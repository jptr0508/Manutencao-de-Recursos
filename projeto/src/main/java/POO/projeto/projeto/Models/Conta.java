package POO.projeto.projeto.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Conta {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
   @Column(name = "conta_id") private int conta_id;
   @Column(name = "conta_mes") private int conta_mes;
   @Column(name = "conta_objetivo") private double conta_objetivo;
   @Column(name = "conta_custo") private double conta_custo;
    @OneToMany @JoinColumn(name = "plan_id")
    private List<Plano> planos;

    public Conta() {
    }

    public int getConta_id() {
        return conta_id;
    }

    public void setConta_id(int conta_id) {
        this.conta_id = conta_id;
    }

    public int getConta_mes() {
        return conta_mes;
    }

    public void setConta_mes(int conta_mes) {
        this.conta_mes = conta_mes;
    }

    public double getConta_objetivo() {
        return conta_objetivo;
    }

    public void setConta_objetivo(double conta_objetivo) {
        this.conta_objetivo = conta_objetivo;
    }

    public double getConta_custo() {
        return conta_custo;
    }

    public void setConta_custo(double conta_custo) {
        this.conta_custo = conta_custo;
    }

    
    
}

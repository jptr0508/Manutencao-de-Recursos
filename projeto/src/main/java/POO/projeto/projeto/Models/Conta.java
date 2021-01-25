package POO.projeto.projeto.Models;

import java.sql.Date;

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
   @Column(name = "conta_semana") private Date conta_semana;
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

    public double getConta_custo() {
        return conta_custo;
    }

    public void setConta_custo(double conta_custo) {
        this.conta_custo = conta_custo;
    }

    public Date getConta_semana() {
        return conta_semana;
    }

    public void setConta_semana(Date conta_semana) {
        this.conta_semana = conta_semana;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
}

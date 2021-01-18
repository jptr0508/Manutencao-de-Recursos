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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "eletrodomestico")
public class Eletrodomestico {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name = "eletro_id") int eletro_id;
    @Column(name = "eletro_nome") private String eletro_nome;
    @Column(name = "eletro_potencia") private double eletro_potencia;
    @JsonIgnore
    @Column(name = "eletro_isEletrico") private boolean eletro_isEletrico;
    @ManyToOne @JoinColumn(name = "eletro_utilizador_id")
    private List<Utilizador> utilizador;

    public Eletrodomestico() {}

    public int getEletro_id() {
        return eletro_id;
    }

    public void setEletro_id(int eletro_id) {
        this.eletro_id = eletro_id;
    }

    public String getEletro_nome() {
        return eletro_nome;
    }

    public void setEletro_nome(String eletro_nome) {
        this.eletro_nome = eletro_nome;
    }

    public double getEletro_potencia() {
        return eletro_potencia;
    }

    public void setEletro_potencia(double eletro_potencia) {
        this.eletro_potencia = eletro_potencia;
    }

    public boolean getEletro_isEletrico() {
        return eletro_isEletrico;
    }

    public void setEletro_isEletrico(boolean eletro_isEletrico) {
        this.eletro_isEletrico = eletro_isEletrico;
    }    
}
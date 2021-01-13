package POO.projeto.projeto.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "eletrodomestico")
public class Eletrodomestico {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name = "eletro_id") int eletro_id;
    @Column(name = "eletro_nome") private String eletro_nome;
    @Column(name = "consumo") private double eletro_consumo;
    @Column(name = "tempo_on") private double tempo_on;
    @JsonIgnore
    @Column(name = "tipo") private boolean tipo;

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

    public double getEletro_consumo() {
        return eletro_consumo;
    }

    public void setEletro_consumo(double eletro_consumo) {
        this.eletro_consumo = eletro_consumo;
    }

    public double getTempo_on() {
        return tempo_on;
    }

    public void setTempo_on(double tempo_on) {
        this.tempo_on = tempo_on;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

 

    
}

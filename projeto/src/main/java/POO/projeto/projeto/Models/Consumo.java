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
@Table(name="consumo")
public class Consumo {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name = "consumo_id") int consumo_id;
    @Column(name = "consumo_data") Date consumo_data;
    @Column(name = "consumo_tempo_on") double consumo_tempo_on;
    @Column(name = "consumo_energia") double consumo_energia;
    @ManyToOne @JoinColumn(name = "consumo_eletro_id")
    private Eletrodomestico eletrodomestico;
    @ManyToOne @JoinColumn(name = "consumo_utilizador_id")
    private Utilizador utilizador;

    public Consumo() {}
    
    public int getConsumo_id() {
        return consumo_id;
    }

    public Date getConsumo_data() {
        return consumo_data;
    }

    public void setConsumo_data(Date consumo_data) {
        this.consumo_data = consumo_data;
    }

    public double getConsumo_tempo_on() {
        return consumo_tempo_on;
    }

    public void setConsumo_tempo_on(double consumo_tempo_on) {
        this.consumo_tempo_on = consumo_tempo_on;
    }

    public double getConsumo_energia() {
        return consumo_energia;
    }

    public void setConsumo_energia(double consumo_energia) {
        this.consumo_energia = consumo_energia;
    }

    public Eletrodomestico getEletrodomestico() {
        return eletrodomestico;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
    
    
    
}

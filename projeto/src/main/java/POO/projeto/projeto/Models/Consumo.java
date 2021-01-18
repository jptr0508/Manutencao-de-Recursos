package POO.projeto.projeto.Models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="consumo")
public class Consumo {
    @Id@GeneratedValue
    @Column(name = "consumo_id") private int consumo_id;
    @Column(name = "consumo_data") Date consumo_data;
    @Column(name = "consumo_tempo_on") double consumo_tempo_on;
    @Column(name = "consumo_energia") double consumo_energia;
    @OneToMany @JoinColumn(name = "consumo_eletro_id")
    private List<Eletrodomestico> eletrodomestico;
    @OneToMany @JoinColumn(name = "consumo_utilizador_id")
    private List<Utilizador> utilizador;

    public Consumo() {}
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getConsumo_id() {
        return consumo_id;
    }

    public void setConsumo_id(int consumo_id) {
        this.consumo_id = consumo_id;
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
    
    
    
}

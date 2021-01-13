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
    @Column(name = "consumo_quantidade") double consumo_quantidade;
    @Column(name = "tipo") boolean tipo;
    @OneToMany @JoinColumn(name = "eletro_id")
    private List<Eletrodomestico> eletrodomestico;

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

    public double getConsumo_quantidade() {
        return consumo_quantidade;
    }

    public void setConsumo_quantidade(double consumo_quantidade) {
        this.consumo_quantidade = consumo_quantidade;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    
    
    
}

package POO.projeto.projeto.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "objetivo")
public class Objetivo {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name = "objetivo_id") int objetivo_id;
    @Column(name = "objetivo_meta") double objetivo_meta;

    public Objetivo() {
    }

    public double getObjetivo_meta() {
        return objetivo_meta;
    }

    public void setObjetivo_meta(double objetivo_meta) {
        this.objetivo_meta = objetivo_meta;
    }

    public int getObjetivo_id() {
        return objetivo_id;
    }

    public void setObjetivo_id(int objetivo_id) {
        this.objetivo_id = objetivo_id;
    }

}

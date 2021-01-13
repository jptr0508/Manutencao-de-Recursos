package POO.projeto.projeto.Models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Plano {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id") String plan_id;
    @Column(name = "horario") int horario;
    @Column(name = "custo") double custo;

    public Plano() {
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }

}

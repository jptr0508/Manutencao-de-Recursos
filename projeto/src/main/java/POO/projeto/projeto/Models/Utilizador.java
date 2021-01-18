package POO.projeto.projeto.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="utilizador")
public class Utilizador {
    @Id @GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name = "utilizador_id") int utilizador_id;
    @Column(name = "utilizador_nome") String utilizador_nome;
    @Column(name = "utilizador_bd_date" ) Date utilizador_bd_date;
    @Column(name = "utilizador_sexo") char utilizador_sexo;
    @Column(name = "utilizador_local") String utilizador_local;

  public Utilizador() {  }

    public String getUser_nome() {
        return utilizador_nome;
    }

    public void setUser_nome(String utilizador_nome) {
        this.utilizador_nome = utilizador_nome;
    }

    public Date getUser_date() {
        return utilizador_bd_date;
    }

    public void setUser_idade(Date utilizador_bd_date) {
        this.utilizador_bd_date = utilizador_bd_date;
    }

    public char getUser_sexo() {
        return utilizador_sexo;
    }

    public void setUser_sexo(char utilizador_sexo) {
        this.utilizador_sexo = utilizador_sexo;
    }

    public String getUser_local() {
        return utilizador_local;
    }

    public void setUser_local(String utilizador_local) {
        this.utilizador_local = utilizador_local;
    }

    public int getUser_id() {
        return utilizador_id;
    }

    public void setUser_id(int utilizador_id) {
        this.utilizador_id = utilizador_id;
    }

    
    
  
    
    


    
}

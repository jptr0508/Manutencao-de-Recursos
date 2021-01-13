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
    @Column(name = "user_id") int user_id;
    @Column(name = "user_nome") String user_nome;
    @Column(name = "user_idade" ) Date user_idade;
    @Column(name = "user_sexo") char user_sexo;
    @Column(name = "user_local") String user_local;

  public Utilizador() {  }

    public String getUser_nome() {
        return user_nome;
    }

    public void setUser_nome(String user_nome) {
        this.user_nome = user_nome;
    }

    public Date getUser_idade() {
        return user_idade;
    }

    public void setUser_idade(Date user_idade) {
        this.user_idade = user_idade;
    }

    public char getUser_sexo() {
        return user_sexo;
    }

    public void setUser_sexo(char user_sexo) {
        this.user_sexo = user_sexo;
    }

    public String getUser_local() {
        return user_local;
    }

    public void setUser_local(String user_local) {
        this.user_local = user_local;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
    
  
    
    


    
}

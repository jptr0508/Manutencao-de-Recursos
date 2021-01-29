package POO.projeto.projeto.View;

import java.sql.Date;


public interface ConsumoView {
    int getConsumo_id();
    Date getConsumo_data();
    double getConsumo_tempo_on();
    double getConsumo_energia();
    String getEletro_nome();
}
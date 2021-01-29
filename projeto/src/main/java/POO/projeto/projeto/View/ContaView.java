package POO.projeto.projeto.View;

import java.sql.Date;

public interface ContaView {
    int getConta_id();
    Date getConta_mes();
    int getConsumo_id();
    Date getConsumo_data();
    double getConsumo_tempo_on();
    String getEletro_id();
    
}

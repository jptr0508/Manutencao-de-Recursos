package POO.projeto.projeto.Models;

public enum Tipo {
    ELETRICIDADE(1), GAS(2);
    private int tipo_elet;
    
;

private Tipo(int tipo_elet) {
    this.tipo_elet = tipo_elet;
}

public int isTipo(){
    return tipo_elet;
}

}

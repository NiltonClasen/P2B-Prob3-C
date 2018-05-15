package com.Problema3;

import com.Exceptions.TipoEntregaInvalido;

public class EncomendaPAC extends StrategyPedidos {
    private static EncomendaPAC e;

    private EncomendaPAC() {
    }
    
    public static EncomendaPAC getInstance(){
        if(e == null){
            e = new EncomendaPAC();
        }
        return e;
    }

    @Override
    public double getValorEntrega(Pedido p) {

        double peso = getPesoTotal(p);

        if (peso <= 1) {
            return 10.00;
        } else if (peso > 1 && peso <= 2) {
            return 15.00;
        } else if (peso > 2 && peso <= 3) {
            return 20.00;
        } else if (peso > 3 && peso <= 5) {
            return 30.00;
        } else {
            throw new TipoEntregaInvalido();
        }

    }

}

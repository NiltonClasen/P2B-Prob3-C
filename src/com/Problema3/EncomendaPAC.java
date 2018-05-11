package com.Problema3;

import com.Exceptions.TipoEntregaInvalido;

public class EncomendaPAC implements Entrega {

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

    private double getPesoTotal(Pedido p) {

        double peso = 0;

        if (p == null) {
            throw new IllegalArgumentException("Nenhum pedido");

        }

        for (ItemPedido item : p.getItens()) {

            peso += item.getProduto().getPeso() * item.getQuantidade();

        }
        return peso / 1000;
    }

}

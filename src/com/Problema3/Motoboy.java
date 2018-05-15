/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Problema3;

import com.Exceptions.TipoEntregaInvalido;

/**
 *
 * @author daniel
 */
public class Motoboy extends StrategyPedidos {
    
    private static Motoboy m;

    private Motoboy() {
        
    }
    
    public static Motoboy getInstance() {
        if (m == null) {
            m = new Motoboy();
        }
        return m;
    }
    
    @Override
    public double getValorEntrega(Pedido p) {

        double peso = getPesoTotal(p);

        if (peso > 25 || getQtdItens(p.getItens()) > 30) {
            throw new TipoEntregaInvalido();
        } 
        
        return 7.0;
        
    }
    
}

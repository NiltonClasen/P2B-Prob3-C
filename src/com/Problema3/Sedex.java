/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Problema3;

import com.Exceptions.TipoEntregaInvalido;

/**
 *
 * @author casa
 */
public class Sedex implements Entrega{

    @Override
    public double getValorEntrega(Pedido p) {
        
        double peso = getPesoTotal(p);
        
        if(peso <= 500){
            return 12.50;
        } else if (peso > 500 && peso <= 750) {
            return 20;
        } else if (peso > 751 && peso <= 1200) {
            return 30;
        } else if (peso > 1201 && peso <= 2000) {
            return 45;
        } else if (peso > 2000) {
            peso -= 2000;
            double adicional = 0;
            while (peso > 0) {                
                adicional += 1.50;
                peso -= 100;
            }
            return 45+adicional;
        } else {
            return 0;
        }
        
    }
    
    private double getPesoTotal(Pedido p){
   
        double peso = 0;
        
        if(p == null){
            throw new TipoEntregaInvalido("Isso não é valido!");
        
        }
            
        for (ItemPedido item : p.getItens()) {
            
            peso += item.getProduto().getPeso() * item.getQuantidade();

        }
        
        return peso/2;
    }
    
}

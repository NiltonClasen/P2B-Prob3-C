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
        
        if(peso == 1){
            
        }
        
        return 0;
        
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

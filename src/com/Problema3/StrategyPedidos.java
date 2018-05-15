/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Problema3;

import com.Exceptions.TipoEntregaInvalido;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public abstract class StrategyPedidos {
    
    public abstract double getValorEntrega(Pedido p);
    
    public double getPesoTotal(Pedido p){
   
        double peso = 0;
        
        if(p == null){
            throw new TipoEntregaInvalido("Isso não é valido!");
        
        }
            
        for (ItemPedido item : p.getItens()) {
            
            peso += item.getProduto().getPeso() * item.getQuantidade();

        }
        
        return peso/2;
    }
    
    public int getQtdItens(ArrayList<ItemPedido> i) {
        int count = 0;
        for (ItemPedido itemPedido : i) {
            count+=itemPedido.getQuantidade();
        }
        return count;
    }
    
}

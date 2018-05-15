/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Principal;

import com.Problema3.EncomendaPAC;
import com.Problema3.Pedido;
import com.Problema3.Produto;
import com.Problema3.RetiradaLocal;
import com.Problema3.StrategyPedidos;

/**
 *
 * @author daniel
 */
public class Principal {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.setNumero(0);
        p.setNomeCliente("fulano de tal");
        p.setEndereco("alguma coisa");
        p.setEntrega(EncomendaPAC.getInstance());
//        p.setData("02/02/2018");

        Produto pt = new Produto("produto legal", 1, 1);
        
        p.incluirItem(pt, 2);
        
        System.out.println(p.getValorEntrega());
        System.out.println(p.getValorTotal());
        
        
        p.setEntrega(new RetiradaLocal());
        System.out.println(p.getValorEntrega());
        System.out.println(p.getValorTotal());
        
        
    }
}

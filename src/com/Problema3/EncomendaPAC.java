package com.Problema3;


public class EncomendaPAC implements Entrega {
    
    @Override
    public double getValorEntrega(Pedido p) {
          
        double peso = getPesoTotal(p);
        
        if(peso == 1){
            
        }
        
    }
    
    private double getPesoTotal(Pedido p){
   
        double peso = 0;
        
        if(p == null){
            throw new IllegalArgumentException("Nenhum pedido");
        
        }
            
        for (ItemPedido item : p.getItens()) {
            
            peso += item.getProduto().getPeso() * item.getQuantidade();

        }
        return peso/2;
    }
    
   

}

package com.Problema3;

import java.util.ArrayList;
import java.util.Date;
import com.Problema3.ItemPedido;
import com.Problema3.Produto;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;
    private StrategyPedidos entrega;

    public Pedido() {
        
        itens = new ArrayList<ItemPedido>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void incluirItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));
    }

    public double getValorPedido() {
        double valorTotal = 0;
        for (ItemPedido ip : this.itens) {
            valorTotal += (ip.getValorItem());
        }
        return valorTotal;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setEntrega(StrategyPedidos entrega) {
        this.entrega = entrega;
    }

    public double getValorEntrega() {
        return entrega.getValorEntrega(this);
    }

    public double getValorTotal() {
        return this.getValorPedido() + getValorEntrega();
    }
}

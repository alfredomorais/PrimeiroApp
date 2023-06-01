package com.sistemaweb.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.sistemaweb.model.ItemVenda;
import com.sistemaweb.model.Venda;

@Named @RequestScoped
public class VendaBean {
	
	
	private Venda venda;
	private List<Venda> vendas;
	private List<ItemVenda> itens;
	
	public VendaBean() {
		this.venda = new Venda();
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public List<Venda> getVendas() {
		
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	
	}
}
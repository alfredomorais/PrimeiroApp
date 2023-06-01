package com.sistemaweb.beans;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;




@Named ("mensagemBean")
@RequestScoped
public class MensagemBean implements Serializable {
	private static final long serialVersionUID = 1286797308356856466L;
	
	private Date data;
	private String saudacao;

	public MensagemBean() {
    this.data = new Date();
    this.saudacao = "Seja Bem-Vindo!";
    }

	@PostConstruct
    public void init() {
		System.out.println("\\nBacking Bean MensagemBean executado!");
    }

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String saudacao() {
		return this.saudacao;
	}
}

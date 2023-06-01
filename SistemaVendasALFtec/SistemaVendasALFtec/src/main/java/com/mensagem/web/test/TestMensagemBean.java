package com.mensagem.web.test;

import org.junit.jupiter.api.Test;

import com.sistemaweb.beans.MensagemBean;

import junit.framework.TestCase;

public class TestMensagemBean extends TestCase {



	@Test
	void testMensagemBean() {

		String saudacao = "Seja Bem-Vindo!";

		MensagemBean mensagemBean = new MensagemBean();

		assertTrue(mensagemBean != null);

		assertTrue(mensagemBean.saudacao() != null && mensagemBean.saudacao().length() > 0);

		assertTrue(mensagemBean.getData() != null);

		assertEquals(saudacao, mensagemBean.saudacao());

	}
}

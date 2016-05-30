package br.com.testes.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Teste {
	Boolean variavelQual = Boolean.FALSE;

	@Before
	public void up() {

	}

	@Test
	public void testeHello() {

		Assert.assertEquals(Boolean.FALSE, variavelQual);
	}
	@After
	public void down() {

	}
}

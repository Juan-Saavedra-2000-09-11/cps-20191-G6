package com.tecsup.lab10.Operadores_math;

import org.junit.Assert;
import org.junit.Test;


public class RestarTest {
	
	@Test
	public void testRestar() {
		int Valor_esperado=6;
		int a=18;
		int b=12;
		
		Restar r=new Restar();
		int v= r.RestadeNumeros(a,b);
		Assert.assertEquals(Valor_esperado, v);	} 
}

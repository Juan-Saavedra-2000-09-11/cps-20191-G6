package com.tecsup.lab10.Operadores_math;



import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MultiplicacionTest {
	@Test
	public void multiplicacionPositivos() {
	      System.out.println("Multiplicando dos números positivos ...");
	       Multiplicacion m=new Multiplicacion(2, 3);
	       assertTrue(m.multiplicar() == 6);
	}
	
	@Test
	   public void multiplicacionNegativos() {
	       System.out.println("Multiplicando dos números negativos ...");
	       Multiplicacion m=new Multiplicacion(-2, -3);
	       assertTrue(m.multiplicar() == 6);
	   }
	
	@Test
	   public void multipliacionPositivoNegativo() {
	       System.out.println("Multiplicando un número positivo y un número negativo ...");
	       Multiplicacion m=new Multiplicacion(2, -3);
	       assertTrue(m.multiplicar()== -6);
	   }

}

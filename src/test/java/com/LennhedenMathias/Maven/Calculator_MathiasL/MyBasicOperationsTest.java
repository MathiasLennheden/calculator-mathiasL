package com.LennhedenMathias.Maven.Calculator_MathiasL;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class MyBasicOperationsTest extends TestCase {

	CalculatorMathiasLennhedenMain calculator = new CalculatorMathiasLennhedenMain();

	double random1 = 0;
	double random2 = 0;
	double förväntat = 0;
	Random ran = new Random();
	public static final Logger LOG = Logger.getLogger(CalculatorMathiasLennhedenMain.class.getName()); //en logg

	@Test
	public void testAddititon() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextDouble()*100;
			random2 = ran.nextDouble()*100;
			förväntat = random1+random2;
			LOG.info("Testar metoden addition: " + random1 + " + " + random2 + " = " + förväntat);
			assertEquals(calculator.addition(random1, random2), förväntat, 0);
		}
	}
	
	@Test
	public void testSubtraktion() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextDouble()*100;
			random2 = ran.nextDouble()*100;
			förväntat = random1-random2;
			LOG.info("Testar metoden subtraktion: " + random1 + " - " + random2 + " = " + förväntat);
			assertEquals(calculator.subtraktion(random1, random2), förväntat, 0);
		}
	}
	
	@Test
	public void testMultiplikation() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextDouble()*10;
			random2 = ran.nextDouble()*10;
			förväntat = random1*random2;
			LOG.info("Testar metoden multiplikation: " + random1 + " * " + random2 + " = " + förväntat);
			assertEquals(calculator.multiplikation(random1, random2), förväntat, 0);
		}
	}
	
	@Test
	public void testDivision() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextDouble()*100;
			random2 = ran.nextDouble()*100;
			förväntat = random1 / random2;
			LOG.info("Testar metoden division: " + random1 + " / " + random2 + " = " + förväntat);
			assertEquals(calculator.division(random1, random2),förväntat, 0);
		}
	}
	
}

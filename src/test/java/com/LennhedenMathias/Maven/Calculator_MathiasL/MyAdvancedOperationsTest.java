package com.LennhedenMathias.Maven.Calculator_MathiasL;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class MyAdvancedOperationsTest {

	CalculatorMathiasLennhedenMain advanced = new CalculatorMathiasLennhedenMain();
	
	double random1 = 0;
	double random2 = 0;
	double förväntat = 0;
	Random ran = new Random();
	public static final Logger LOG = Logger.getLogger(CalculatorMathiasLennhedenMain.class.getName()); //en logg

	@Test
	public void testModulus() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextDouble()*10;
			random2 = ran.nextDouble()*10;
			förväntat = random1%random2;
			LOG.info("Testar metoden modulus: " + random1 + " + " + random2 + " = " + förväntat);
			assertEquals(advanced.modulus(random1, random2), förväntat, 0);
		}
}
	
	@Test
	public void testRotenUr() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextInt(100);
			förväntat = Math.sqrt(random1);
			LOG.info("Testar metoden rotenUr: Roten ur " + random1 + " = " + förväntat);
			assertEquals(advanced.rotenUr(random1), förväntat, 0);
		}
}
	
	@Test
	public void testUpphöjtTill2() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextInt(100);
			förväntat = random1*random1;
			LOG.info("Testar metoden upphöjtTill2: " + random1 +  " = " + förväntat);
			assertEquals(advanced.upphöjtTill2(random1, random1), förväntat, 0);
		}
}
	
	@Test
	public void testUpphöjtTill3() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextInt(20);
			förväntat = random1*random1*random1;
			LOG.info("Testar metoden upphöjtTill3: " + random1 +  " = " + förväntat);
			assertEquals(advanced.upphöjtTill3(random1, random1), förväntat, 0);
		}
}
	
	@Test
	public void testXUpphöjtMedX() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextInt(10);
			random2 = ran.nextInt(10);
			förväntat = Math.pow(random1, random2);
			LOG.info("Testar metoden xUpphöjtMedX: " + random1 + " ^ " + "random2" + " = " + förväntat);
			assertEquals(advanced.xUpphöjtMedX(random1, random2), förväntat, 0);
		}
}
	
	@Test
	public void testEttDelatMedX() throws Exception {

		for (int i = 0; i < 50; i++) {
			random1 = ran.nextInt(100);
			förväntat = 1/(double)random1;
			LOG.info("Testar metoden ettDelatMedX: 1/" +random1 +  " = " + förväntat);
			assertEquals(advanced.ettDelatMedX(1, random1), förväntat, 0);
		}
}
}

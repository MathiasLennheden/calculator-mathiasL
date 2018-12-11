package com.LennhedenMathias.Maven.Calculator_MathiasL;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//Implementera interface
public class CalculatorMathiasLennhedenMain extends Exception implements CalculatorAdvancedOperationsInterface, CalculatorBasicOperationsInterface  {

	private JFrame frmMathiasKalkylator;
	private JTextField textFält;

	//skapa variabler
	double siffra1;  //första inmatade tal
	double siffra2;  //andra inmatade tal
	double senasteSiffra = 0; 
	double föregåendeSiffra = 0;  //siffran som är inmatad innan senasteSiffra
	double resultat;
	
	String senasteRäknesätt; 	// t.ex. 4 + 3 - 9. Senaste räknesätt är - (minus)
	String föregåendeRäknesätt;    // t.ex. 4 + 3 - 9. Föregående räknesätt är alltså + (plus)
	double summa = 0;
	String inmatatTal;  //String för det som ska skrivas i textfältet beroende på vilket nummer som anges


	/**
	 * Kör miniräknar-programmet
	 * @author Mathias Lenneheden
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorMathiasLennhedenMain window = new CalculatorMathiasLennhedenMain();
					window.frmMathiasKalkylator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Anropa initialize-metoden för att skapa miniräknaren
	 */
	public CalculatorMathiasLennhedenMain() {
		initialize();
	}

	/**
	 * Allt innehåll för miniräknaren när det gäller det grafiska. GUI
	 */
	private void initialize() {
		frmMathiasKalkylator = new JFrame();
		frmMathiasKalkylator.setTitle("Kalkylator a la Mathias L || Kvalit18");
		frmMathiasKalkylator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frmMathiasKalkylator.setBounds(100, 100, 430, 481);
		frmMathiasKalkylator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMathiasKalkylator.getContentPane().setLayout(null);

		textFält = new JTextField();
		textFält.setHorizontalAlignment(SwingConstants.RIGHT);
		textFält.setBounds(12, 13, 353, 39);
		textFält.setFont(new Font("Tahoma", Font.BOLD, 24));  //sätter storleken på texten som skrivs i textfältet
		frmMathiasKalkylator.getContentPane().add(textFält);
		textFält.setColumns(10);

		//*************************************************************************************
		//*  Button 0
		//*************************************************************************************
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button0.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}			
			}
		});

		button0.setFont(new Font("Tahoma", Font.BOLD, 18));
		button0.setBounds(12, 322, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button0);


		//*************************************************************************************
		//*  Button 1
		//*************************************************************************************
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button1.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button1.setBounds(12, 259, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button1);


		//*************************************************************************************
		//*  Button 2
		//*************************************************************************************
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button2.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button2.setBounds(82, 259, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button2);


		//*************************************************************************************
		//*  Button 3
		//*************************************************************************************
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button3.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button3.setBounds(154, 259, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button3);


		//*************************************************************************************
		//*  Button 4
		//*************************************************************************************
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button4.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button4.setBounds(12, 196, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button4);

		//*************************************************************************************
		//*  Button 5
		//*************************************************************************************
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button5.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button5.setBounds(84, 196, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button5);

		//*************************************************************************************
		//*  Button 6
		//*************************************************************************************
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button6.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button6.setBounds(157, 196, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button6);

		//*************************************************************************************
		//*  Button 7
		//*************************************************************************************
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button7.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button7.setBounds(12, 133, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button7);

		//*************************************************************************************
		//*  Button 8
		//*************************************************************************************
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button8.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button8.setBounds(85, 133, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button8);

		//*************************************************************************************
		//*  Button 9
		//*************************************************************************************
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + button9.getText();
				textFält.setText(inmatatTal );
				föregåendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFält.getText());
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button9.setBounds(157, 133, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button9);

		//*************************************************************************************
		//*  Räknesätt +
		//*************************************************************************************
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				beräkning();
				if (!textFält.getText().equalsIgnoreCase("Syntax Error")) {
					textFält.setText("");
				}

				senasteRäknesätt = "+";
				föregåendeRäknesätt = "+";
			}
		});
		buttonPlus.setBackground(Color.ORANGE);
		buttonPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonPlus.setBounds(229, 133, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonPlus);

		//*************************************************************************************
		//*  Räknesätt -
		//*************************************************************************************
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				beräkning();
				if (!textFält.getText().equalsIgnoreCase("Syntax Error")) {
					textFält.setText("");
				}

				senasteRäknesätt = "-";
				föregåendeRäknesätt = "-";
			}
		});
		buttonMinus.setBackground(Color.ORANGE);
		buttonMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonMinus.setBounds(229, 196, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonMinus);

		//*************************************************************************************
		//*  Räknesätt *
		//*************************************************************************************
		JButton buttonGånger = new JButton("*");
		buttonGånger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				beräkning();
				if (!textFält.getText().equalsIgnoreCase("Syntax Error")) {
					textFält.setText("");
				}

				senasteRäknesätt = "*";
				föregåendeRäknesätt = "*";
			}
		});
		buttonGånger.setBackground(Color.ORANGE);
		buttonGånger.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonGånger.setBounds(226, 259, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonGånger);

		//*************************************************************************************
		//*  Räknesätt /
		//*************************************************************************************
		JButton buttonDelat = new JButton("/");
		buttonDelat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				beräkning();
				if (!textFält.getText().equalsIgnoreCase("Syntax Error")) {
					textFält.setText("");
				}

				senasteRäknesätt = "/";
				föregåendeRäknesätt = "/";
			}
		});
		buttonDelat.setBackground(Color.ORANGE);
		buttonDelat.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonDelat.setBounds(229, 70, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonDelat);


		//*************************************************************************************
		//*  Backspace
		//*************************************************************************************
		JButton buttonBackspace = new JButton("\uF0E7");  //backspace
		buttonBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String backspace = null;

				if(textFält.getText().length() > 0){
					StringBuilder strb = new StringBuilder(textFält.getText());
					strb.deleteCharAt(textFält.getText().length()-1);
					backspace = strb.toString();
					textFält.setText(backspace);	
				}
			}
		});
		buttonBackspace.setBackground(Color.ORANGE);
		buttonBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		buttonBackspace.setBounds(12, 70, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonBackspace);

		//*************************************************************************************
		//*  Punkt
		//*************************************************************************************
		JButton buttonPunkt = new JButton(".");
		buttonPunkt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFält.getText() + buttonPunkt.getText();
				textFält.setText(inmatatTal );
			}
		});
		buttonPunkt.setBackground(Color.ORANGE);
		buttonPunkt.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonPunkt.setBounds(82, 322, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonPunkt);

		//*************************************************************************************
		//*  PlusMinus +-
		//*************************************************************************************
		JButton buttonPlusMinus = new JButton("+-");
		buttonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double plusminus;
				try {
					plusminus = Double.parseDouble(String.valueOf(textFält.getText()));
					plusminus = plusminus * (-1);
					textFält.setText(String.valueOf(plusminus));
					senasteSiffra = plusminus;
				} catch (NumberFormatException e1) {
					textFält.setText("Syntax Error");
				}

			}
		});
		buttonPlusMinus.setBackground(Color.ORANGE);
		buttonPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonPlusMinus.setBounds(154, 322, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonPlusMinus);

		
		//*************************************************************************************
		//*  Clear
		//*************************************************************************************
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				summa = 0;
				textFält.setText(null);
				senasteRäknesätt = null;
				föregåendeRäknesätt = null;
				senasteSiffra = 0;
			}
		});
		buttonC.setBackground(Color.ORANGE);
		buttonC.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonC.setBounds(85, 70, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonC);

		//*************************************************************************************
		//*  Modulus
		//*************************************************************************************
		JButton buttonModulus = new JButton("Mod");
		buttonModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textFält.setText("");
				senasteRäknesätt = "%";
			}
		});
		buttonModulus.setBackground(Color.ORANGE);
		buttonModulus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonModulus.setBounds(157, 70, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonModulus);

		//*************************************************************************************
		//*  Roten Ur
		//*************************************************************************************
		JButton buttonSqrt = new JButton("\u221A");
		buttonSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				summa = rotenUr(senasteSiffra);
				textFält.setText(textFält.getText() + "\u221A");   
				senasteRäknesätt = "sqrt";
				föregåendeRäknesätt = "sqrt";
			}
		});
		buttonSqrt.setBackground(Color.ORANGE);
		buttonSqrt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonSqrt.setBounds(301, 70, 65, 50);
		frmMathiasKalkylator.getContentPane().add(buttonSqrt);

		//*************************************************************************************
		//*  Upphöjt med 2
		//*************************************************************************************
		JButton buttonX2 = new JButton("x2");
		buttonX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				summa = upphöjtTill2(summa, senasteSiffra);
				textFält.setText(textFält.getText() + "^2");   
				senasteRäknesätt = "x2";
				föregåendeRäknesätt = "x2";


			}
		});
		buttonX2.setBackground(Color.ORANGE);
		buttonX2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonX2.setBounds(301, 133, 65, 50);
		frmMathiasKalkylator.getContentPane().add(buttonX2);

		//*************************************************************************************
		//*  Upphöjt med 3
		//*************************************************************************************
		JButton buttonX3 = new JButton("x3");
		buttonX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				summa = upphöjtTill3(summa, senasteSiffra);
				//textFält.setText("");
				textFält.setText(textFält.getText() + "^3");
				senasteRäknesätt = "x3";
				föregåendeRäknesätt = "x3";
			}
		});
		buttonX3.setBackground(Color.ORANGE);
		buttonX3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonX3.setBounds(301, 196, 65, 50);
		frmMathiasKalkylator.getContentPane().add(buttonX3);

		//*************************************************************************************
		//*  Ett Delat med x
		//*************************************************************************************
		JButton button1delatMedX = new JButton("1/x");
		button1delatMedX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				summa = ettDelatMedX(summa, senasteSiffra);
				textFält.setText("");
			}
		});
		button1delatMedX.setBackground(Color.ORANGE);
		button1delatMedX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button1delatMedX.setBounds(298, 259, 65, 50);
		frmMathiasKalkylator.getContentPane().add(button1delatMedX);

		//*************************************************************************************
		//*  X upphöjt med x
		//*************************************************************************************
		JButton buttonXx = new JButton("X^x");
		buttonXx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textFält.setText("");
				senasteRäknesätt = "X^x";
			}
		});
		buttonXx.setBackground(Color.ORANGE);
		buttonXx.setFont(new Font("Tahoma", Font.PLAIN, 17));		
		buttonXx.setBounds(298, 322, 65, 50);
		frmMathiasKalkylator.getContentPane().add(buttonXx);
		
		
		//*************************************************************************************
		//*  Likamed =
		//*************************************************************************************
				JButton buttonSumma = new JButton("=");
				buttonSumma.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						String slutsumma;
			
						try {
							if (föregåendeRäknesätt == "+"){ 
								if (senasteRäknesätt == "%") {
									summa = modulus(föregåendeSiffra, senasteSiffra);
								}
								else if (senasteRäknesätt == "X^x") {
									summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
								}
								else {							 
									summa = addition(summa, Double.parseDouble(textFält.getText()));
								}						
							}
							else if (föregåendeRäknesätt == "-"){
								if (senasteRäknesätt == "%") {
									summa = modulus(föregåendeSiffra, senasteSiffra);
								}
								else if (senasteRäknesätt == "X^x") {
									summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
								}
								else {
									summa = subtraktion(summa, Double.parseDouble(textFält.getText()));
								}
							} 
							else if (föregåendeRäknesätt == "*"){
								if (senasteRäknesätt == "%") {
									summa = modulus(föregåendeSiffra, senasteSiffra);
								}
								else if (senasteRäknesätt == "X^x") {
									summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
								}
								else {
									summa = multiplikation(summa, Double.parseDouble(textFält.getText()));
								}
							} 
							else if (föregåendeRäknesätt == "/"){
								if (senasteRäknesätt == "%") {
									summa = modulus(föregåendeSiffra, senasteSiffra);
								}
								else if (senasteRäknesätt == "X^x") {
									summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
								}
								else {
									summa = division(summa, Double.parseDouble(textFält.getText()));
								}
							} 

							// Om senaste räknesättet är % eller X^x, och ingenting finns i föregående räknesätt
							// behöver vi göra beräkningen av % och X^x här.
							if (föregåendeRäknesätt == null) {
								if (senasteRäknesätt=="%") {
									summa = modulus(föregåendeSiffra, senasteSiffra);
								}
								else if (senasteRäknesätt == "X^x") {
									summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
								}
							}


							slutsumma = String.format(Locale.US, "%.2f", summa);
							textFält.setText(slutsumma);
							senasteRäknesätt = "=";
						} catch (Exception e1) {
							textFält.setText("Syntax Error");

						}									
					}
				});
				buttonSumma.setBackground(Color.GREEN);
				buttonSumma.setFont(new Font("Tahoma", Font.BOLD, 18));
				buttonSumma.setBounds(226, 322, 60, 50);
				frmMathiasKalkylator.getContentPane().add(buttonSumma);	
	}

	/**
	 * Metoden adderar två tal   t.ex 3 + 4
	 * @param double summa
	 * @param double siffra2
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*  Addition
	//*************************************************************************************
	public double addition(double summa, double siffra2) throws Exception {
		resultat = summa + siffra2;
		return resultat;
	}

	/**
	 * Metoden subtraherar två tal  t.ex 3 - 4
	 * 
	 * @param double summa
	 * @param double siffra2
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*  Subtraktion
	//*************************************************************************************
	public double subtraktion(double summa, double siffra2) throws Exception {
		resultat = summa - siffra2;
		return resultat;
	}

	/**
	 * Metoden multiplicerar två tal t.ex 3 * 4 
	 * 
	 * @param double summa
	 * @param double siffra2
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*  Multiplikation
	//*************************************************************************************
	public double multiplikation(double summa, double siffra2) throws Exception{
		resultat = summa * siffra2;
		return resultat;
	}

	/**
	 * Metoden dividerar två tal  t.ex 9 / 2
	 * 
	 * @param double summa
	 * @param double siffra2
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*  Division
	//*************************************************************************************
	public double division(double summa, double siffra2)throws Exception {
		resultat = summa / siffra2;
		return resultat;
	}

	/**
	 * Metoden använder modulus och skriver ut "rest" som blir kvar
	 * @param double siffra1
	 * @param double siffra2
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*  Modulus
	//*************************************************************************************
	public double modulus(double siffra1,double siffra2) {
		
		if (föregåendeRäknesätt == "+") {
			resultat = summa + (siffra1 % siffra2);
		}
		else if (föregåendeRäknesätt == "-") {
			resultat = summa - (siffra1 % siffra2);
		}
		else if (föregåendeRäknesätt == "*") {
			resultat = summa * (siffra1 % siffra2);
		}
		else if (föregåendeRäknesätt == "/") {
			resultat = summa / (siffra1 % siffra2);
		}
		else {
			resultat = siffra1 % siffra2;
		}
		föregåendeRäknesätt = "%";
		return resultat;
	}
	
	/**
	 * Metoden beräknar squareRoot(roten ur) av ett tal
	 * @param double senasteSiffra
	 * @return double resultat 
	 */
	@Override
	//*************************************************************************************
	//*  Roten ur / SquareRoot
	//*************************************************************************************
	public double rotenUr(double senasteSiffra) {
	
		if (föregåendeRäknesätt == "+") {
			resultat = summa + Math.sqrt(senasteSiffra);
		}
		else if (föregåendeRäknesätt == "-") {
			resultat = summa - Math.sqrt(senasteSiffra);
		}
		else if (föregåendeRäknesätt == "*") {
			resultat = summa * Math.sqrt(senasteSiffra);
		}
		else if (föregåendeRäknesätt == "/") {
			resultat = summa / Math.sqrt(senasteSiffra);
		}
		else {
			resultat = Math.sqrt(senasteSiffra);
		}
		föregåendeRäknesätt = "sqrt";
		return resultat;
	}
	
	/**
	 * Metoden får in ett tal och multiplicerar talet med sig självt 1 gång. t.ex. (inmatat tal) = 9 
	 * då får man tillbaka 9 * 9,  alltså multiplicerat med sig själv 1 gång
	 * 
	 * @param double summa
	 * @param double senasteSiffra
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*  x upphöjt i 2 || x^2
	//*************************************************************************************
	public double upphöjtTill2(double summa, double senasteSiffra) {
		if (föregåendeRäknesätt == "+") {
			resultat = summa + (senasteSiffra*senasteSiffra);                   
		}
		else if (föregåendeRäknesätt == "-") {
			resultat = summa  - (senasteSiffra*senasteSiffra);
		}
		else if (föregåendeRäknesätt == "*") {
			resultat = summa * (senasteSiffra*senasteSiffra);
		}
		else if (föregåendeRäknesätt == "/") {
			resultat = summa / (senasteSiffra*senasteSiffra);
		}
		else {
			resultat = senasteSiffra*senasteSiffra;
		}
		föregåendeRäknesätt = "x2";                                               
		return resultat;
	}
	
	/**
	 * Metoden får in ett tal och multiplicerar talet med sig självt 2 gånger. t.ex. (inmatat tal) = 9 
	 * då får man tillbaka 9 * 9 * 9,  alltså multiplicerat med sig själv 2 gånger
	 * 
	 * @param double summa
	 * @param double senasteSiffra
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*   x upphöjt i 3 || x^3
	//*************************************************************************************
	public double upphöjtTill3(double summa, double senasteSiffra) {
		if (föregåendeRäknesätt == "+") {
			resultat = summa + (senasteSiffra*senasteSiffra*senasteSiffra);
		}
		else if (föregåendeRäknesätt == "-") {
			resultat = summa - (senasteSiffra*senasteSiffra*senasteSiffra);
		}
		else if (föregåendeRäknesätt == "*") {
			resultat = summa * (senasteSiffra*senasteSiffra*senasteSiffra);
		}
		else if (föregåendeRäknesätt == "/") {
			resultat = summa / (senasteSiffra*senasteSiffra*senasteSiffra);
		}
		else {
			resultat = senasteSiffra*senasteSiffra*senasteSiffra;
		}
		föregåendeRäknesätt = "x2";
		return resultat;
	}

	/**
	 * Metoden får in ett tal t.ex. 5 och sedan tar den in andra talet t.ex. 2. Då får vi 5^2
	 * 
	 * @param double siffra1
	 * @param double siffra2
	 * @return double resultat
	 * 
	 */
	@Override
	//*************************************************************************************
	//*   x upphöjt i x || x^x
	//*************************************************************************************
	public double xUpphöjtMedX(double siffra1, double siffra2) {
		
		if (föregåendeRäknesätt == "+") {
			resultat = summa + (Math.pow(siffra1, siffra2));
		}
		else if (föregåendeRäknesätt == "-") {
			resultat = summa - (Math.pow(siffra1, siffra2));
		}
		else if (föregåendeRäknesätt == "*") {
			resultat = summa * (Math.pow(siffra1, siffra2));
		}
		else if (föregåendeRäknesätt == "/") {
			resultat = summa / (Math.pow(siffra1, siffra2));
		}
		else {
			resultat = Math.pow(siffra1, siffra2);
		}
		föregåendeRäknesätt = "X^x";
		return resultat;
	}


	/**
	 * Metoden tar in ett tal. t.ex 8 och då gör den 1/8 och skriver ut svaret
	 * 
	 * @param double summa
	 * @param double siffra2
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*  1 / x
	//*************************************************************************************
	public double ettDelatMedX(double summa, double siffra2) {
		
		if (föregåendeRäknesätt == "+") {
			resultat = summa + (1/(double)siffra2);                    
		}
		else if (föregåendeRäknesätt == "-") {
			resultat = summa  - (1/(double)siffra2);
		}
		else if (föregåendeRäknesätt == "*") {
			resultat = summa * (1/(double)siffra2);
		}
		else if (föregåendeRäknesätt == "/") {
			resultat = summa / (1/(double)siffra2);
		}
		else {
			resultat = 1/(double)siffra2;
		}
		föregåendeRäknesätt = "1/x";                                               
		return resultat;
		}

	
	/**
	 * Denna metod innehåller beräkning för de flesta möjliga varianter av uträkningar
	 */
	//*************************************************************************************
	//*   Beräkna metod för alla 
	//*************************************************************************************
	private void beräkning() {
		try {

			if (senasteRäknesätt == "=") {
				textFält.setText("Syntax Error");
				return;
			}
			// Addition
			if  (föregåendeRäknesätt == "+") {
				if (senasteRäknesätt == "%") {
					summa = modulus(föregåendeSiffra, senasteSiffra);
				}
				else if (senasteRäknesätt == "X^x") {
					summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
				}
				else{
					summa = addition(summa, Double.parseDouble(textFält.getText()));
				}

				// Subtraktion
			}else if (föregåendeRäknesätt == "-") {
				if (senasteRäknesätt == "%") {
					summa = modulus(föregåendeSiffra, senasteSiffra);
				}
				else if (senasteRäknesätt == "X^x") {
					summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
				}
				else{
					summa = subtraktion(summa, Double.parseDouble(textFält.getText()));
				}
			}

			// Multiplikation
			else if (föregåendeRäknesätt == "*") {
				if (senasteRäknesätt == "%") {
					summa = modulus(föregåendeSiffra, senasteSiffra);
				}
				else if (senasteRäknesätt == "X^x") {
					summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
				}
				else{
					summa = multiplikation(summa, Double.parseDouble(textFält.getText()));
				}
			}
			// Division			
			else if (föregåendeRäknesätt == "/") {
				if (senasteRäknesätt == "%") {
					summa = modulus(föregåendeSiffra, senasteSiffra);
				}
				else if (senasteRäknesätt == "X^x") {
					summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
				}
				else{
					summa = division(summa, Double.parseDouble(textFält.getText()));
				}
			}

			// Modulus	
			else if (senasteRäknesätt == "%") {
				summa = modulus(föregåendeSiffra, senasteSiffra);
			}

			//x2	
			else if (föregåendeRäknesätt == "x2") {   // X^2 är redan beräknat. Töm fält inför nästa beräkning
				textFält.setText("");
			}

			// x3	
			else if (föregåendeRäknesätt == "x3") {   // X^3 är redan beräknat. Töm fält inför nästa beräkning
				textFält.setText("");

			}

			// sqrt	
			else if (föregåendeRäknesätt == "sqrt") { // sqrt är redan beräknat. Töm fält inför nästa beräkning
				textFält.setText("");     			 

			}

			// 1/x	
			else if (föregåendeRäknesätt == "1/x") { // 1/x är redan beräknat. Töm fält inför nästa beräkning
				textFält.setText("");                 

			}

			// X^x	
			else if (föregåendeRäknesätt == "X^x") {
				summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
			}
			
			// Om senaste räknesättet är % eller X^x, och ingenting finns i föregående räknesätt
			// behöver vi göra beräkningen av % och X^x här.
			else if (föregåendeRäknesätt == null) {
				if (senasteRäknesätt=="%") {
					summa = modulus(föregåendeSiffra, senasteSiffra);
				}
				else if (senasteRäknesätt == "X^x") {
					summa = xUpphöjtMedX(föregåendeSiffra, senasteSiffra);
				}else{
					summa = Double.parseDouble(textFält.getText());
				}
			}else {
				summa = Double.parseDouble(textFält.getText());
			}

		} catch (Exception e1) {

			textFält.setText("Syntax Error");

			föregåendeRäknesätt = null;
			summa = 0;

		}
	}
	
}

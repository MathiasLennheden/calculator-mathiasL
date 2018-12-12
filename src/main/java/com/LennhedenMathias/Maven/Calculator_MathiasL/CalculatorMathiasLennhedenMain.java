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
	private JTextField textFalt;

	//skapa variabler
	double siffra1;  //forsta inmatade tal
	double siffra2;  //andra inmatade tal
	double senasteSiffra = 0; 
	double foregaendeSiffra = 0;  //siffran som ar inmatad innan senasteSiffra
	double resultat;

	String senasteRaknesatt; 	// t.ex. 4 + 3 - 9. Senaste raknesatt ar - (minus)
	String foregaendeRaknesatt;    // t.ex. 4 + 3 - 9. Foregaende raknesatt ar alltsa + (plus)
	double summa = 0;       
	String inmatatTal;  //String for det som ska skrivas i textfaltet beroende pa vilket nummer som anges


	/**
	 * Kor miniraknar-programmet
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
	 * Anropa initialize-metoden for att skapa miniraknaren
	 */
	public CalculatorMathiasLennhedenMain() {
		initialize();
	}

	/**
	 * Har gors allt GUI fran knappar till funktionerna for knapparna
	 */
	private void initialize() {
		frmMathiasKalkylator = new JFrame();
		frmMathiasKalkylator.setTitle("Kalkylator a la Mathias L || Kvalit18");
		frmMathiasKalkylator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frmMathiasKalkylator.setBounds(100, 100, 430, 481);
		frmMathiasKalkylator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMathiasKalkylator.getContentPane().setLayout(null);

		textFalt = new JTextField();
		textFalt.setHorizontalAlignment(SwingConstants.RIGHT);
		textFalt.setBounds(12, 13, 353, 39);
		textFalt.setFont(new Font("Tahoma", Font.BOLD, 24));  //satter storleken pa texten som skrivs i textfaltet
		frmMathiasKalkylator.getContentPane().add(textFalt);
		textFalt.setColumns(10);

		//*************************************************************************************
		//*  Button 0
		//*************************************************************************************
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inmatatTal = textFalt.getText() + button0.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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

				inmatatTal = textFalt.getText() + button1.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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

				inmatatTal = textFalt.getText() + button2.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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

				inmatatTal = textFalt.getText() + button3.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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

				inmatatTal = textFalt.getText() + button4.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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

				inmatatTal = textFalt.getText() + button5.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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

				inmatatTal = textFalt.getText() + button6.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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

				inmatatTal = textFalt.getText() + button7.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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

				inmatatTal = textFalt.getText() + button8.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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

				inmatatTal = textFalt.getText() + button9.getText();
				textFalt.setText(inmatatTal );
				foregaendeSiffra = senasteSiffra;  //spara undan tidigare inmatat tal
				try {
					senasteSiffra = Double.parseDouble(textFalt.getText());
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
				}
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button9.setBounds(157, 133, 60, 50);
		frmMathiasKalkylator.getContentPane().add(button9);

		//*************************************************************************************
		//*  Raknesatt +
		//*************************************************************************************
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				berakning();
				if (!textFalt.getText().equalsIgnoreCase("Syntax Error")) {
					textFalt.setText("");
				}

				senasteRaknesatt = "+";
				foregaendeRaknesatt = "+";
			}
		});
		buttonPlus.setBackground(Color.ORANGE);
		buttonPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonPlus.setBounds(229, 133, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonPlus);

		//*************************************************************************************
		//*  Raknesatt -
		//*************************************************************************************
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				berakning();
				if (!textFalt.getText().equalsIgnoreCase("Syntax Error")) {
					textFalt.setText("");
				}

				senasteRaknesatt = "-";
				foregaendeRaknesatt = "-";
			}
		});
		buttonMinus.setBackground(Color.ORANGE);
		buttonMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonMinus.setBounds(229, 196, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonMinus);

		//*************************************************************************************
		//*  Raknesatt *
		//*************************************************************************************
		JButton buttonGanger = new JButton("*");
		buttonGanger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				berakning();
				if (!textFalt.getText().equalsIgnoreCase("Syntax Error")) {
					textFalt.setText("");
				}

				senasteRaknesatt = "*";
				foregaendeRaknesatt = "*";
			}
		});
		buttonGanger.setBackground(Color.ORANGE);
		buttonGanger.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonGanger.setBounds(226, 259, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonGanger);

		//*************************************************************************************
		//*  Raknesatt /
		//*************************************************************************************
		JButton buttonDelat = new JButton("/");
		buttonDelat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				berakning();
				if (!textFalt.getText().equalsIgnoreCase("Syntax Error")) {
					textFalt.setText("");
				}

				senasteRaknesatt = "/";
				foregaendeRaknesatt = "/";
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

				if(textFalt.getText().length() > 0){
					StringBuilder strb = new StringBuilder(textFalt.getText());
					strb.deleteCharAt(textFalt.getText().length()-1);
					backspace = strb.toString();
					textFalt.setText(backspace);	
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

				inmatatTal = textFalt.getText() + buttonPunkt.getText();
				textFalt.setText(inmatatTal );
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
					plusminus = Double.parseDouble(String.valueOf(textFalt.getText()));
					plusminus = plusminus * (-1);
					textFalt.setText(String.valueOf(plusminus));
					senasteSiffra = plusminus;
				} catch (NumberFormatException e1) {
					textFalt.setText("Syntax Error");
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
				textFalt.setText(null);
				senasteRaknesatt = null;
				foregaendeRaknesatt = null;
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

				textFalt.setText("");
				senasteRaknesatt = "%";
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
				textFalt.setText(textFalt.getText() + "\u221A");   
				senasteRaknesatt = "sqrt";
				foregaendeRaknesatt = "sqrt";
			}
		});
		buttonSqrt.setBackground(Color.ORANGE);
		buttonSqrt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonSqrt.setBounds(301, 70, 65, 50);
		frmMathiasKalkylator.getContentPane().add(buttonSqrt);

		//*************************************************************************************
		//*  Upphojt med 2
		//*************************************************************************************
		JButton buttonX2 = new JButton("x2");
		buttonX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				summa = upphojtTill2(summa, senasteSiffra);
				textFalt.setText(textFalt.getText() + "^2");   
				senasteRaknesatt = "x2";
				foregaendeRaknesatt = "x2";


			}
		});
		buttonX2.setBackground(Color.ORANGE);
		buttonX2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonX2.setBounds(301, 133, 65, 50);
		frmMathiasKalkylator.getContentPane().add(buttonX2);

		//*************************************************************************************
		//*  Upphojt med 3
		//*************************************************************************************
		JButton buttonX3 = new JButton("x3");
		buttonX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				summa = upphojtTill3(summa, senasteSiffra);
				//textFalt.setText("");
				textFalt.setText(textFalt.getText() + "^3");
				senasteRaknesatt = "x3";
				foregaendeRaknesatt = "x3";
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
				textFalt.setText("");
			}
		});
		button1delatMedX.setBackground(Color.ORANGE);
		button1delatMedX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button1delatMedX.setBounds(298, 259, 65, 50);
		frmMathiasKalkylator.getContentPane().add(button1delatMedX);

		//*************************************************************************************
		//*  X upphojt med x
		//*************************************************************************************
		JButton buttonXx = new JButton("X^x");
		buttonXx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textFalt.setText("");
				senasteRaknesatt = "X^x";
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
					if (foregaendeRaknesatt == "+"){ 
						if (senasteRaknesatt == "%") {
							summa = modulus(foregaendeSiffra, senasteSiffra);
						}
						else if (senasteRaknesatt == "X^x") {
							summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
						}
						else {							 
							summa = addition(summa, Double.parseDouble(textFalt.getText()));
						}						
					}
					else if (foregaendeRaknesatt == "-"){
						if (senasteRaknesatt == "%") {
							summa = modulus(foregaendeSiffra, senasteSiffra);
						}
						else if (senasteRaknesatt == "X^x") {
							summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
						}
						else {
							summa = subtraktion(summa, Double.parseDouble(textFalt.getText()));
						}
					} 
					else if (foregaendeRaknesatt == "*"){
						if (senasteRaknesatt == "%") {
							summa = modulus(foregaendeSiffra, senasteSiffra);
						}
						else if (senasteRaknesatt == "X^x") {
							summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
						}
						else {
							summa = multiplikation(summa, Double.parseDouble(textFalt.getText()));
						}
					} 
					else if (foregaendeRaknesatt == "/"){
						if (senasteRaknesatt == "%") {
							summa = modulus(foregaendeSiffra, senasteSiffra);
						}
						else if (senasteRaknesatt == "X^x") {
							summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
						}
						else {
							summa = division(summa, Double.parseDouble(textFalt.getText()));
						}
					} 

					// Om senaste raknesattet ar % eller X^x, och ingenting finns i foregaende raknesatt
					// behover vi gora berakningen av % och X^x har.
					if (foregaendeRaknesatt == null) {
						if (senasteRaknesatt=="%") {
							summa = modulus(foregaendeSiffra, senasteSiffra);
						}
						else if (senasteRaknesatt == "X^x") {
							summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
						}
					}


					slutsumma = String.format(Locale.US, "%.2f", summa);
					textFalt.setText(slutsumma);
					senasteRaknesatt = "=";
				} catch (Exception e1) {
					textFalt.setText("Syntax Error");

				}									
			}
		});
		buttonSumma.setBackground(Color.GREEN);
		buttonSumma.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonSumma.setBounds(226, 322, 60, 50);
		frmMathiasKalkylator.getContentPane().add(buttonSumma);	
	}

	/**
	 * Metoden adderar tva tal   t.ex 3 + 4
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
	 * Metoden subtraherar tva tal  t.ex 3 - 4
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
	 * Metoden multiplicerar tva tal t.ex 3 * 4 
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
	 * Metoden dividerar tva tal  t.ex 9 / 2
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
	 * Metoden anvander modulus och skriver ut "rest" som blir kvar t.ex. 7 % 4 = 3 (3 blir da resten)
	 * @param double siffra1
	 * @param double siffra2
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*  Modulus
	//*************************************************************************************
	public double modulus(double siffra1,double siffra2) {

		if (foregaendeRaknesatt == "+") {
			resultat = summa + (siffra1 % siffra2);
		}
		else if (foregaendeRaknesatt == "-") {
			resultat = summa - (siffra1 % siffra2);
		}
		else if (foregaendeRaknesatt == "*") {
			resultat = summa * (siffra1 % siffra2);
		}
		else if (foregaendeRaknesatt == "/") {
			resultat = summa / (siffra1 % siffra2);
		}
		else {
			resultat = siffra1 % siffra2;
		}
		foregaendeRaknesatt = "%";
		return resultat;
	}

	/**
	 * Metoden beraknar squareRoot(roten ur) av ett tal
	 * @param double senasteSiffra
	 * @return double resultat 
	 */
	@Override
	//*************************************************************************************
	//*  Roten ur / SquareRoot
	//*************************************************************************************
	public double rotenUr(double senasteSiffra) {

		if (foregaendeRaknesatt == "+") {
			resultat = summa + Math.sqrt(senasteSiffra);
		}
		else if (foregaendeRaknesatt == "-") {
			resultat = summa - Math.sqrt(senasteSiffra);
		}
		else if (foregaendeRaknesatt == "*") {
			resultat = summa * Math.sqrt(senasteSiffra);
		}
		else if (foregaendeRaknesatt == "/") {
			resultat = summa / Math.sqrt(senasteSiffra);
		}
		else {
			resultat = Math.sqrt(senasteSiffra);
		}
		foregaendeRaknesatt = "sqrt";
		return resultat;
	}

	/**
	 * Metoden far in ett tal och multiplicerar talet med sig sjalvt 1 gang. t.ex. (inmatat tal) = 9 
	 * da far man tillbaka 9 * 9,  alltsa multiplicerat med sig sjalv 1 gang
	 * 
	 * @param double summa
	 * @param double senasteSiffra
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*  x upphojt i 2 || x^2
	//*************************************************************************************
	public double upphojtTill2(double summa, double senasteSiffra) {
		if (foregaendeRaknesatt == "+") {
			resultat = summa + (senasteSiffra*senasteSiffra);                   
		}
		else if (foregaendeRaknesatt == "-") {
			resultat = summa  - (senasteSiffra*senasteSiffra);
		}
		else if (foregaendeRaknesatt == "*") {
			resultat = summa * (senasteSiffra*senasteSiffra);
		}
		else if (foregaendeRaknesatt == "/") {
			resultat = summa / (senasteSiffra*senasteSiffra);
		}
		else {
			resultat = senasteSiffra*senasteSiffra;
		}
		foregaendeRaknesatt = "x2";                                               
		return resultat;
	}

	/**
	 * Metoden far in ett tal och multiplicerar talet med sig sjalvt 2 ganger. t.ex. (inmatat tal) = 9 
	 * da far man tillbaka 9 * 9 * 9,  alltsa multiplicerat med sig sjalv 2 ganger
	 * 
	 * @param double summa
	 * @param double senasteSiffra
	 * @return double resultat
	 */
	@Override
	//*************************************************************************************
	//*   x upphojt i 3 || x^3
	//*************************************************************************************
	public double upphojtTill3(double summa, double senasteSiffra) {
		if (foregaendeRaknesatt == "+") {
			resultat = summa + (senasteSiffra*senasteSiffra*senasteSiffra);
		}
		else if (foregaendeRaknesatt == "-") {
			resultat = summa - (senasteSiffra*senasteSiffra*senasteSiffra);
		}
		else if (foregaendeRaknesatt == "*") {
			resultat = summa * (senasteSiffra*senasteSiffra*senasteSiffra);
		}
		else if (foregaendeRaknesatt == "/") {
			resultat = summa / (senasteSiffra*senasteSiffra*senasteSiffra);
		}
		else {
			resultat = senasteSiffra*senasteSiffra*senasteSiffra;
		}
		foregaendeRaknesatt = "x2";
		return resultat;
	}

	/**
	 * Metoden far in ett tal t.ex. 5 och sedan tar den in andra talet t.ex. 2. Da far vi 5^2
	 * 
	 * @param double siffra1
	 * @param double siffra2
	 * @return double resultat
	 * 
	 */
	@Override
	//*************************************************************************************
	//*   x upphojt i x || x^x
	//*************************************************************************************
	public double xUpphojtMedX(double siffra1, double siffra2) {

		if (foregaendeRaknesatt == "+") {
			resultat = summa + (Math.pow(siffra1, siffra2));
		}
		else if (foregaendeRaknesatt == "-") {
			resultat = summa - (Math.pow(siffra1, siffra2));
		}
		else if (foregaendeRaknesatt == "*") {
			resultat = summa * (Math.pow(siffra1, siffra2));
		}
		else if (foregaendeRaknesatt == "/") {
			resultat = summa / (Math.pow(siffra1, siffra2));
		}
		else {
			resultat = Math.pow(siffra1, siffra2);
		}
		foregaendeRaknesatt = "X^x";
		return resultat;
	}


	/**
	 * Metoden tar in ett tal. t.ex 8 och da gor den 1/8 och skriver ut svaret
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

		if (foregaendeRaknesatt == "+") {
			resultat = summa + (1/(double)siffra2);                    
		}
		else if (foregaendeRaknesatt == "-") {
			resultat = summa  - (1/(double)siffra2);
		}
		else if (foregaendeRaknesatt == "*") {
			resultat = summa * (1/(double)siffra2);
		}
		else if (foregaendeRaknesatt == "/") {
			resultat = summa / (1/(double)siffra2);
		}
		else {
			resultat = 1/(double)siffra2;
		}
		foregaendeRaknesatt = "1/x";                                               
		return resultat;
	}


	/**
	 * Denna metod innehaller berakning for de flesta mojliga varianter av utrakningar
	 * Anropas vid +, -, *, / knapparna
	 * 
	 */
	//*************************************************************************************
	//*   Berakna metod for alla 
	//*************************************************************************************
	private void berakning() {
		try {

			if (senasteRaknesatt == "=") {
				textFalt.setText("Syntax Error");
				return;
			}
			// Addition
			if  (foregaendeRaknesatt == "+") {
				if (senasteRaknesatt == "%") {
					summa = modulus(foregaendeSiffra, senasteSiffra);
				}
				else if (senasteRaknesatt == "X^x") {
					summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
				}
				else{
					summa = addition(summa, Double.parseDouble(textFalt.getText()));
				}

				// Subtraktion
			}else if (foregaendeRaknesatt == "-") {
				if (senasteRaknesatt == "%") {
					summa = modulus(foregaendeSiffra, senasteSiffra);
				}
				else if (senasteRaknesatt == "X^x") {
					summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
				}
				else{
					summa = subtraktion(summa, Double.parseDouble(textFalt.getText()));
				}
			}

			// Multiplikation
			else if (foregaendeRaknesatt == "*") {
				if (senasteRaknesatt == "%") {
					summa = modulus(foregaendeSiffra, senasteSiffra);
				}
				else if (senasteRaknesatt == "X^x") {
					summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
				}
				else{
					summa = multiplikation(summa, Double.parseDouble(textFalt.getText()));
				}
			}
			// Division			
			else if (foregaendeRaknesatt == "/") {
				if (senasteRaknesatt == "%") {
					summa = modulus(foregaendeSiffra, senasteSiffra);
				}
				else if (senasteRaknesatt == "X^x") {
					summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
				}
				else{
					summa = division(summa, Double.parseDouble(textFalt.getText()));
				}
			}

			// Modulus	
			else if (senasteRaknesatt == "%") {
				summa = modulus(foregaendeSiffra, senasteSiffra);
			}

			//x2	
			else if (foregaendeRaknesatt == "x2") {   // X^2 ar redan beraknat. Tom falt infor nasta berakning
				textFalt.setText("");
			}

			// x3	
			else if (foregaendeRaknesatt == "x3") {   // X^3 ar redan beraknat. Tom falt infor nasta berakning
				textFalt.setText("");

			}

			// sqrt	
			else if (foregaendeRaknesatt == "sqrt") { // sqrt ar redan beraknat. Tom falt infor nasta berakning
				textFalt.setText("");     			 

			}

			// 1/x	
			else if (foregaendeRaknesatt == "1/x") { // 1/x ar redan beraknat. Tom falt infor nasta berakning
				textFalt.setText("");                 

			}

			// X^x	
			else if (foregaendeRaknesatt == "X^x") {
				summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
			}

			// Om senaste raknesattet ar % eller X^x, och ingenting finns i foregaende raknesatt
			// behover vi gora berakningen av % och X^x har.
			else if (foregaendeRaknesatt == null) {
				if (senasteRaknesatt=="%") {
					summa = modulus(foregaendeSiffra, senasteSiffra);
				}
				else if (senasteRaknesatt == "X^x") {
					summa = xUpphojtMedX(foregaendeSiffra, senasteSiffra);
				}else{
					summa = Double.parseDouble(textFalt.getText());
				}
			}else {
				summa = Double.parseDouble(textFalt.getText());
			}

		} catch (Exception e1) {

			textFalt.setText("Syntax Error");

			foregaendeRaknesatt = null;
			summa = 0;

		}
	}

}

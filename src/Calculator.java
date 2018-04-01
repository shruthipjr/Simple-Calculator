


import java.awt.Color;

public class Calculator extends javax.swing.JFrame {

	double input1;
	double input2;
	double result;
	String operations;

	// default constructor
	public Calculator() {
		initComponents();
	}

	// Variables declaration
	private javax.swing.JButton jbtn1;
	private javax.swing.JButton jbtn10;
	private javax.swing.JButton jbtn11;
	private javax.swing.JButton jbtn12;
	private javax.swing.JButton jbtn13;
	private javax.swing.JButton jbtn14;
	private javax.swing.JButton jbtn15;
	private javax.swing.JButton jbtn16;
	private javax.swing.JButton jbtn17;
	private javax.swing.JButton jbtn18;
	private javax.swing.JButton jbtn2;
	private javax.swing.JButton jbtn3;
	private javax.swing.JButton jbtn4;
	private javax.swing.JButton jbtn5;
	private javax.swing.JButton jbtn6;
	private javax.swing.JButton jbtn7;
	private javax.swing.JButton jbtn8;
	private javax.swing.JButton jbtn9;
	private javax.swing.JTextField jtxtDisplay;
	// End of variables declaration

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jtxtDisplay = new javax.swing.JTextField();
		jbtn1 = new javax.swing.JButton();
		jbtn2 = new javax.swing.JButton();
		jbtn3 = new javax.swing.JButton();
		jbtn4 = new javax.swing.JButton();
		jbtn5 = new javax.swing.JButton();
		jbtn6 = new javax.swing.JButton();
		jbtn7 = new javax.swing.JButton();
		jbtn8 = new javax.swing.JButton();
		jbtn9 = new javax.swing.JButton();
		jbtn10 = new javax.swing.JButton();
		jbtn11 = new javax.swing.JButton();
		jbtn12 = new javax.swing.JButton();
		jbtn13 = new javax.swing.JButton();
		jbtn14 = new javax.swing.JButton();
		jbtn15 = new javax.swing.JButton();
		jbtn16 = new javax.swing.JButton();
		jbtn17 = new javax.swing.JButton();
		jbtn18 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jtxtDisplay.setFont(new java.awt.Font("Calibri", 0, 18));
		jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

		jbtn1.setFont(new java.awt.Font("Calibri", 1, 18));
		jbtn1.setText("1");
		jbtn1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn1ActionPerformed(evt);
			}
		});

		jbtn2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn2.setText("2");
		jbtn2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn2ActionPerformed(evt);
			}
		});

		jbtn3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn3.setText("3");
		jbtn3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn3ActionPerformed(evt);
			}
		});

		jbtn4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn4.setText("4");
		jbtn4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn4ActionPerformed(evt);
			}
		});

		jbtn5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn5.setText("5");
		jbtn5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn5ActionPerformed(evt);
			}
		});

		jbtn6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn6.setText("6");
		jbtn6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn6ActionPerformed(evt);
			}
		});

		jbtn7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn7.setText("7");
		jbtn7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn7ActionPerformed(evt);
			}
		});

		jbtn8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn8.setText("8");
		jbtn8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn8ActionPerformed(evt);
			}
		});

		jbtn9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn9.setText("9");
		jbtn9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn9ActionPerformed(evt);
			}
		});

		jbtn10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn10.setText("0");
		jbtn10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn10ActionPerformed(evt);
			}
		});

		jbtn11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn11.setText("+");
		jbtn11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn11ActionPerformed(evt);
			}
		});

		jbtn12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn12.setText("-");
		jbtn12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn12ActionPerformed(evt);
			}
		});

		jbtn13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn13.setText("/");
		jbtn13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn13ActionPerformed(evt);
			}
		});

		jbtn14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn14.setText("*");
		jbtn14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn14ActionPerformed(evt);
			}
		});

		jbtn15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn15.setText("+/-");
		jbtn15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn15ActionPerformed(evt);
			}
		});

		jbtn16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
		jbtn16.setText(".");
		jbtn16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn16ActionPerformed(evt);
			}
		});

		jbtn17.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
		jbtn17.setText("c");
		jbtn17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn17ActionPerformed(evt);
			}
		});

		jbtn18.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
		jbtn18.setText("=");
		jbtn18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtn18ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		getContentPane().setBackground(Color.CYAN);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(22, 22, 22)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jbtn12,
												javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(jbtn17, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE,
																65, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(jbtn14,
																javax.swing.GroupLayout.PREFERRED_SIZE, 65,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE,
																65, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE,
																65, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
																.addComponent(jbtn18,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 142,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addComponent(jtxtDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(27, Short.MAX_VALUE)));

		pack();
	}

	// methods for each of the buttons action performed

	private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn1.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn2.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn3.getText();
		jtxtDisplay.setText(Enternumber); // TODO add your handling code here:
	}

	private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn4.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn5.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn6.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn7.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn8.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn9.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn10ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn10.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {
		input1 = Double.parseDouble(jtxtDisplay.getText());
		jtxtDisplay.setText("");
		operations = "+";
	}

	private void jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {
		input1 = Double.parseDouble(jtxtDisplay.getText());
		jtxtDisplay.setText("");
		operations = "-";
	}

	private void jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {
		input1 = Double.parseDouble(jtxtDisplay.getText());
		jtxtDisplay.setText("");
		operations = "/";
	}

	private void jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {
		input1 = Double.parseDouble(jtxtDisplay.getText());
		jtxtDisplay.setText("");
		operations = "*";
	}

	private void jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {
		double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
		ops = ops * (-1);
		jtxtDisplay.setText(String.valueOf(ops));
	}

	private void jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {
		String Enternumber = jtxtDisplay.getText() + jbtn16.getText();
		jtxtDisplay.setText(Enternumber);
	}

	private void jbtn17ActionPerformed(java.awt.event.ActionEvent evt) {
		jtxtDisplay.setText("");
	}

	private void jbtn18ActionPerformed(java.awt.event.ActionEvent evt) {
		String answer;
		input2 = Double.parseDouble(jtxtDisplay.getText());
		if (null != operations)
			switch (operations) {
			case "+":
				result = input1 + input2;
				answer = String.format("%.0f", result);
				jtxtDisplay.setText(answer);
				break;
			case "-":
				result = input1 - input2;
				answer = String.format("%.0f", result);
				jtxtDisplay.setText(answer);
				break;
			case "/":
				result = input1 / input2;
				answer = String.format("%.0f", result);
				jtxtDisplay.setText(answer);
				break;
			case "*":
				result = input1 * input2;
				answer = String.format("%.0f", result);
				jtxtDisplay.setText(answer);
				break;
			default:
				break;
			}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */

	// main method
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Calculator().setVisible(true);
			}
		});
	}

}

/*import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Project10 extends JFrame implements ActionListener{

	public static final int WIDTH = 400;
	public static final int HEIGHT = 200;
	
	public static final int NUMBER_OF_DIGITS = 30;
	
	private JTextField ioField;
	
	private double result ;
	private double input1 ;
	private double input2 ;
	
	public static void main(String[] args) {
		Project10 p = new Project10();
		p.setVisible(true);	
	}
	
	public Project10(){
		setTitle("Simplified Calculator");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new FlowLayout());
		namePanel.setBackground(Color.WHITE);
		
		ioField = new JTextField("Enter numbers here.",NUMBER_OF_DIGITS);
		ioField.setBackground(Color.WHITE);
		namePanel.add(ioField);
		add(namePanel, BorderLayout.NORTH);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.blue);
		buttonPanel.setLayout(new FlowLayout());
		
		JButton addButton = new JButton("+");
		addButton.addActionListener(this);
		buttonPanel.add(addButton);
		
		JButton subButton = new JButton("-");
		subButton.addActionListener(this);
		buttonPanel.add(subButton);
		
		JButton mulButton = new JButton("*");
		mulButton.addActionListener(this);
		buttonPanel.add(mulButton);
		
		JButton divButton = new JButton("/");
		divButton.addActionListener(this);
		buttonPanel.add(divButton);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(this);
		buttonPanel.add(reset);
		
		add(buttonPanel, BorderLayout.CENTER);
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
			assumingCorrectNumberFormats(e);
			input1 = StringToDouble(ioField.getText());
		}
		
		catch(NumberFormatException e2){
			ioField.setText("Error: Reneter number");
		}
	}

	                
	private void assumingCorrectNumberFormats(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String actionCommand = e.getActionCommand();
		
		input2 = StringToDouble(ioField.getText());
		if(actionCommand=="+"){
			//result = result + StringToDouble(ioField.getText());
			
			result = input1+input2;
			ioField.setText(Double.toString(result));
		}
		
		else if(actionCommand=="-"){
			result = result - StringToDouble(ioField.getText());
			ioField.setText(Double.toString(result));
		}
		
		else if(actionCommand=="*"){
			System.out.println("result before: " + input1);
			result = input1 * input2;
			System.out.println("result after: " + result);
			ioField.setText(Double.toString(result));
		}
		
		else if(actionCommand=="/"){
			result = result / StringToDouble(ioField.getText());
			ioField.setText(Double.toString(result));
		}
		
		else if(actionCommand.equals("Reset")){
			result = 0.0;
			ioField.setText("0.0");
		}
		else{
			ioField.setText("Unexpected error");
		}
	}

	private double StringToDouble(String text) {
		// TODO Auto-generated method stub
		return Double.parseDouble(text.trim());
	}
	
	
}
*/
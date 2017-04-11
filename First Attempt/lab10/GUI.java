import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame implements ActionListener {
JPanel mainPanel;
JPanel northPanel, centerPanel, southPanel;
JButton blueButton, yellowButton, redButton;

JLabel choosecolorLabel, titleLabel, sizeLabel;
	public GUI(){
		initPanels();
		initTextFields();
		initButtons();
		initLabels();

	} 
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== blueButton){
			northPanel.setBackground(Color.BLUE);
			centerPanel.setBackground(Color.BLUE);
			southPanel.setBackground(Color.BLUE);
			
		}else if(e.getSource() == yellowButton) {
			northPanel.setBackground(Color.YELLOW);
			centerPanel.setBackground(Color.YELLOW);
			southPanel.setBackground(Color.YELLOW);
		}else if(e.getSource() == redButton){
			northPanel.setBackground(Color.RED);
			centerPanel.setBackground(Color.RED);
			southPanel.setBackground(Color.RED);
		}else{
			northPanel.setBackground(Color.WHITE);
			centerPanel.setBackground(Color.WHITE);
			southPanel.setBackground(Color.WHITE);
		}
	}
	public void initPanels(){
		mainPanel = new JPanel();
		northPanel = new JPanel();
		centerPanel = new JPanel();
		southPanel = new JPanel();
	
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(northPanel, BorderLayout.NORTH);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel, BorderLayout.SOUTH);
	}
	
	public void initButtons(){
		JButton blueButton = new JButton("blue");
		JButton yellowButton = new JButton("yellow");
		JButton redButton = new JButton("red");
		
		northPanel.add(blueButton, BorderLayout.WEST);
		northPanel.add(yellowButton, BorderLayout.CENTER);
		northPanel.add(redButton, BorderLayout.EAST);
	}
	public void initTextFields() {
		
		
	}
	public void initLabels(){
		JLabel choosecolorLabel = new JLabel();
		JLabel titleLabel = new JLabel();
		JLabel sizeLabel= new JLabel();
		
		northPanel.add(choosecolorLabel);
		centerPanel.add(titleLabel);
		southPanel.add(sizeLabel);
	}
	public static void main(String[] args){
		JFrame frame = new GUI();
	}
}
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextEditor extends JFrame implements ActionListener {

	private static final int Val = 0;
	JPanel p;
	JPanel buttons;
	JTextArea area;
	JButton open;
	JButton save;
	boolean isOpen;
	String openname;
	JFileChooser fc;
	File file;
	JScrollPane scrollPane;
	
	TextEditor()
	{
		fc = new JFileChooser();
		isOpen = false;
		openname = null;
		
		p = new JPanel();
		buttons = new JPanel();
		area = new JTextArea(30,40);
		open = new JButton("open");
		save = new JButton("save");
		
		open.addActionListener(this);
		save.addActionListener(this);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		p.setLayout(new BorderLayout());
		scrollPane = new JScrollPane(area);
		p.add(scrollPane,BorderLayout.NORTH);
		buttons.add(open);
		buttons.add(save);
		p.add(buttons, BorderLayout.CENTER);
		
		add(p);
		
		pack();
		this.setVisible(true);
	}
	
	// TODO: Implement this method
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource() == open){
			if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
				try{
					FileInputStream filein = new FileInputStream(fc.getSelectedFile());
					Scanner sc = new Scanner(filein);
					
					String content="";
					while(sc.hasNext())
					{
						content = content+ sc.nextLine() + '\n';
					}
				area.setText(content);
				
				filein.close();
				}catch(FileNotFoundException ex){
					
				}catch(IOException io){
				
				}
			}
		}
			
	}
	
	public static void main(String[] args) {
		 new TextEditor();

	}

}

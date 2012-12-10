

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class ShortAnswer extends JPanel {
	private JTextField textField;;
	private JLabel label;
	public static PrintWriter out;

	int i=1;
	private JTextField textField_1;
	private JTextField textField_2;

	
	public ShortAnswer() {

		setLayout(new MigLayout("", "[right][grow][]", "[]10[188.00,grow,top][grow][]"));
		
		JLabel lblNewLabel = new JLabel("Quistion Titil (optional) ");
		add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 1 0 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblQuistion = new JLabel("Quistion");
		add(lblQuistion, "cell 0 1,alignx right");
		
		final TextArea textArea = new TextArea();
		add(textArea, "cell 1 1 2 1,grow");

				
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Answer", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		add(panel, "cell 1 2 2 1,grow");
		panel.setLayout(new MigLayout("", "[][grow]", "[][][]"));
		
		JLabel lblA = new JLabel("A");
		panel.add(lblA, "cell 0 0,alignx trailing");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 1 0,growx");
		textField_1.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		panel.add(lblB, "cell 0 1,alignx trailing");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "cell 1 1,growx");
		textField_2.setColumns(10);
		
		JButton btnSaveToFile = new JButton("Save to file");
		add(btnSaveToFile, "cell 0 3,growx");
		
		JButton btnCancleclearQuestion = new JButton("Cancle/Clear Question");
		add(btnCancleclearQuestion, "cell 1 3,alignx right");
		btnCancleclearQuestion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText("");
				textArea.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
			}
		});
		btnSaveToFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"ExamQ.txt", true)));
					
					out.append(textArea.getText().toString() + "?{" + "="+textField_1.getText().toString()+
							  "  ="+textField_2.getText().toString()+"  S. "+textField_1.getText().toString()+" = "+textField_2.getText().toString());
					
					String textField1 = textField_1.getText().toString();
					String textField2 = textField_2.getText().toString();
					
			
					if(textField1.length() < textField2.length()){
						out.append(" "+textField_1.getText().toString()+"}\n");
					}
					else if (textField2.length() < textField1.length()){
						out.append(" "+textField_2.getText().toString()+"}\n");
					}
					
					else{
						JOptionPane.showMessageDialog(null, "No Short Answer found");
					}
					out.close();
					
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				textField.setText("");
				textArea.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});


		
	}
	
	

}

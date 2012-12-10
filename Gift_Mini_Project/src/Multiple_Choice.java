
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;

public class Multiple_Choice extends JPanel{

	private JTextField questionTitle_multi;
	private JTextField choiseTextFilde1;
	private JTextField choiseTextFilde2;
	private JTextField choiseTextFilde3;
	private JTextField choiseTextFilde4;
	private JTextField feadbackFilde1;
	private JTextField feadbackFildeB;
	private JTextField feadbackFildeC;
	private JTextField feadbackFildeD;
	private JCheckBox checkBoxoneanswer;
	private TextArea question_mulit;
	public static PrintWriter out;

	public Multiple_Choice() {
		setLayout(new MigLayout("", "[][700px,grow][:40px:80px,grow]", "[][grow][][][][][][][][][]"));
		
		JLabel lblQuestionTitleoptional_1 = new JLabel("Question Title (optional)");
		add(lblQuestionTitleoptional_1, "cell 0 0,alignx right");
		
		questionTitle_multi = new JTextField();
		add(questionTitle_multi, "cell 1 0 2 1,growx");
		questionTitle_multi.setColumns(10);
		
		JLabel lblQuestion_1 = new JLabel("Question");
		add(lblQuestion_1, "cell 0 1,alignx right,aligny top");
		
		question_mulit = new TextArea();
		add(question_mulit, "cell 1 1 2 1,grow");
		
		
		JLabel lblA = new JLabel("A");
		add(lblA, "flowx,cell 1 3");
		
		choiseTextFilde1 = new JTextField();
		add(choiseTextFilde1, "flowx,cell 1 3,growx");
		choiseTextFilde1.setColumns(10);
		
		JLabel lblfeadbak = new JLabel("Feedback");
		add(lblfeadbak, "flowx,cell 1 3");
		
		feadbackFilde1 = new JTextField();
		add(feadbackFilde1, "flowx,cell 1 3,growx");
		feadbackFilde1.setColumns(10);
		
		final JSpinner spinner = new JSpinner();
		add(spinner, "cell 2 3,growx");
		//////////////row2
		
		JLabel lblB = new JLabel("B");
		add(lblB, "flowx,cell 1 4");
		
		choiseTextFilde2 = new JTextField();
		add(choiseTextFilde2, "flowx,cell 1 4,growx");
		choiseTextFilde2.setColumns(10);
		JLabel lblfeedbakB = new JLabel("Feedback");
		add(lblfeedbakB, "flowx,cell 1 4");
		
		feadbackFildeB = new JTextField();
		add(feadbackFildeB, "flowx,cell 1 4,growx");
		feadbackFildeB.setColumns(10);
		
		final JSpinner spinner_1 = new JSpinner();
		add(spinner_1, "cell 2 4,growx");
		
		
		
		
		
		
		JLabel lblC = new JLabel("C");
		add(lblC, "flowx,cell 1 5");
		choiseTextFilde3 = new JTextField();
		add(choiseTextFilde3, "flowx,cell 1 5,growx");
		choiseTextFilde3.setColumns(10);
		
		JLabel lblfeedbakC = new JLabel("Feedback");
		add(lblfeedbakC, "flowx,cell 1 5");
		
		feadbackFildeC = new JTextField();
		add(feadbackFildeC, "flowx,cell 1 5,growx");
		feadbackFildeC.setColumns(10);
		
		final JSpinner spinner_2 = new JSpinner();
		add(spinner_2, "cell 2 5,growx");
		
		
		
		JLabel lblD = new JLabel("D");
		add(lblD, "flowx,cell 1 6");
		choiseTextFilde4 = new JTextField();
		add(choiseTextFilde4, "flowx,cell 1 6,growx");
		choiseTextFilde4.setColumns(10);
		
		JLabel lblfeedbakD = new JLabel("Feedback");
		add(lblfeedbakD, "flowx,cell 1 6");
		
		feadbackFildeD = new JTextField();
		add(feadbackFildeD, "flowx,cell 1 6,growx");
		feadbackFildeD.setColumns(10);
		
		final JSpinner spinner_3 = new JSpinner();
		add(spinner_3, "cell 2 6,growx");
		JButton btnAddAnotherMultiple = new JButton("Save and Add Another Multiple Choice");	//Multi
		add(btnAddAnotherMultiple, "cell 0 9 3 1");
		
		checkBoxoneanswer = new JCheckBox("One Correct Answer");
		add(checkBoxoneanswer, "cell 0 9 2 1");
		JButton btnAddAnotherMultiple2 = new JButton("Cancle/Clear Question text");	//Multi
		add(btnAddAnotherMultiple2, "cell 0 9 3 1");
		btnAddAnotherMultiple2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				questionTitle_multi.setText("");
				question_mulit.setText("");			
				choiseTextFilde1.setText("");
				choiseTextFilde2.setText("");
				choiseTextFilde3.setText("");
				choiseTextFilde4.setText("");
				feadbackFilde1.setText("");
				feadbackFildeB.setText("");
				feadbackFildeC.setText("");
				feadbackFildeD.setText("");
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
			}
		});
		checkBoxoneanswer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkBoxoneanswer.isSelected()) {
					spinner.setVisible(false);
					spinner_1.setVisible(false);
					spinner_2.setVisible(false);
					spinner_3.setVisible(false);
				}else{
					spinner.setVisible(true);
					spinner_1.setVisible(true);
					spinner_2.setVisible(true);
					spinner_3.setVisible(true);
				}
				
			}
		});
		
		btnAddAnotherMultiple.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String qusetionTitle = questionTitle_multi.getText();
				String qusetionQ = question_mulit.getText();
				
				String choise1 = choiseTextFilde1.getText();
				String choise2 = choiseTextFilde2.getText();
				String choise3 = choiseTextFilde3.getText();
				String choise4 = choiseTextFilde4.getText();
				
				String mark1 = spinner.getValue().toString();
				String mark2 = spinner_1.getValue().toString();
				String mark3 = spinner_2.getValue().toString();
				String mark4 = spinner_3.getValue().toString();

				

				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"ExamQ.txt", true)));
					
					out.append("::" + qusetionTitle + "::" + qusetionQ + "{"
							+ "\n~%" + setzero(mark1) +"%"+ choise1 + " #"+ feadbackFilde1.getText() +
							"\n~%" +setzero(mark2) + "%"+ choise2 + " #"+ feadbackFildeB.getText() +"\n~%" + 
							setzero(mark3) + "%"+ choise3+ " #"+ feadbackFildeC.getText() +
							"\n~%" + setzero(mark4) + "%"+ choise4 + " #"+ feadbackFildeD.getText() +"\n}" + "\n");
					out.close();
					
					
					questionTitle_multi.setText("");
					question_mulit.setText("");			
					choiseTextFilde1.setText("");
					choiseTextFilde2.setText("");
					choiseTextFilde3.setText("");
					choiseTextFilde4.setText("");
					feadbackFilde1.setText("");
					feadbackFildeB.setText("");
					feadbackFildeC.setText("");
					feadbackFildeD.setText("");
					spinner.setValue(0);
					spinner_1.setValue(0);
					spinner_2.setValue(0);
					spinner_3.setValue(0);
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			private String setzero(String mark) {
				if(mark.compareTo("0")==0){
					mark = "-100";
					return mark;
				}else
					return mark;
				
				
			}
		});
		

	}

}

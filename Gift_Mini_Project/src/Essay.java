
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;

public class Essay extends JPanel {
	private JTextField jtfTitle;
	private TextArea jtfQ;
	public static PrintWriter out;

	public Essay() {

		setLayout(new MigLayout("", "[right][grow]",
				"[]10[252.00,grow,top][grow][]"));

		JLabel lblNewLabel = new JLabel("Question Titil (optional) ");
		add(lblNewLabel, "cell 0 0,alignx trailing");

		jtfTitle = new JTextField();
		add(jtfTitle, "cell 1 0,growx");
		jtfTitle.setColumns(10);

		JLabel lblQuistion = new JLabel("Question");
		
		add(lblQuistion, "cell 0 1,alignx right");

		jtfQ = new TextArea();
		add(jtfQ, "cell 1 1,grow");
		
				JButton btnNewButton = new JButton("Save to file");
				add(btnNewButton, "cell 0 3,alignx left");
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"ExamQ.txt", true)));
					String qusetionQ = jtfQ.getText();
					
					out.append("::" + qusetionQ + "{}" + "\n");
					out.close();
					
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				jtfTitle.setText("");
				jtfQ.setText("");
			}
		});

	}
}

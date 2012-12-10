import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;


public class Descriptionn extends JPanel {
	public static PrintWriter out;
	/**
	 * Create the panel.
	 */
	public Descriptionn() {
		setLayout(new MigLayout("", "[][grow]", "[grow][][]"));
		
		JLabel lblDescription = new JLabel("Description");
		add(lblDescription, "cell 0 0");
		
		final TextArea textArea = new TextArea();
		add(textArea, "cell 1 0,grow");
		
		JButton btnSaveToFile = new JButton("Save to file");
		add(btnSaveToFile, "cell 0 2");
		
		JButton btnCancleclearQuestion = new JButton("Cancle/Clear Description");
		add(btnCancleclearQuestion, "cell 1 2,alignx right");
		btnCancleclearQuestion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.setText("");
				
			}
		});
		btnSaveToFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(
							"ExamQ.txt", true)));
					String qusetionQ = textArea.getText();
					
					out.append( qusetionQ  + "\n-------------------------------------------------------\n");
					out.close();
					
					textArea.setText("");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});

	}

}

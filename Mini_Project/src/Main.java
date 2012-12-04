import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;


public class Main {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField txtDublinIs;
	private JTextField txtIreland_1;
	private JTextField txtLondonIsIn_1;
	private JTextField txtEngiland;
	private JTextField txtNewYorkIs;
	private JTextField txtNewYork;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("True-False", null, panel, null);
		panel.setLayout(new MigLayout("", "[][][grow][][][][]", "[][][grow][grow][][][][][][]"));
		
		JLabel lblQuestionTitleoptional = new JLabel("Question Title (optional)");
		panel.add(lblQuestionTitleoptional, "cell 0 0");
		
		textField = new JTextField();
		panel.add(textField, "cell 2 0 5 1,growx");
		textField.setColumns(10);
		
		JLabel lblQuestion = new JLabel("Question");
		panel.add(lblQuestion, "cell 0 2,alignx right");
		
		JTextArea textArea = new JTextArea();
		
		JScrollPane scrol = new JScrollPane(textArea);
		panel.add(scrol, "cell 2 2 5 3,grow");
		
		JButton btnNewButton = new JButton("Cancel/Clear Question Text");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Correct Answer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_8, "cell 2 5 1 2,grow");
		
		JRadioButton rdbtnTrue = new JRadioButton("True");
		panel_8.add(rdbtnTrue);
		
		JRadioButton rdbtnFalse = new JRadioButton("False");
		panel_8.add(rdbtnFalse);
		panel.add(btnNewButton, "cell 6 5");
		
		JButton btnNewButton_1 = new JButton("Save to text file");
		panel.add(btnNewButton_1, "cell 0 6");
		
		JButton btnAddOther = new JButton("Add Another True/False Question");
		panel.add(btnAddOther, "cell 0 9");
		
		
		JPanel panel_2 = new JPanel();//
		tabbedPane.addTab("Matching", null, panel_2, null);
		panel_2.setLayout(new MigLayout("", "[172.00][-18.00][201.00,grow,fill][][][][149.00,grow,fill][]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel_4 = new JLabel("Question Title (optional)");
		panel_2.add(lblNewLabel_4, "cell 0 0,alignx left");
		
		textField_2 = new JTextField();
		panel_2.add(textField_2, "cell 2 0 6 1,growx");
		textField_2.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Add Q&A");
		panel_2.add(btnNewButton_3, "cell 0 2,alignx left");
		
		JLabel lblA_1 = new JLabel("A");
		panel_2.add(lblA_1, "cell 1 2,alignx trailing");
		
		txtDublinIs = new JTextField();
		txtDublinIs.setText("Dublin is the capital of?");
		panel_2.add(txtDublinIs, "cell 2 2,alignx left");
		txtDublinIs.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("A");
		panel_2.add(lblNewLabel_5, "cell 4 2");
		
		txtIreland_1 = new JTextField();
		txtIreland_1.setText("Ireland");
		panel_2.add(txtIreland_1, "cell 6 2,growx");
		txtIreland_1.setColumns(10);
		
		JCheckBox chckbxDelete_1 = new JCheckBox("Delete");
		panel_2.add(chckbxDelete_1, "cell 7 2");
		
		JLabel lblNewLabel_6 = new JLabel("B");
		panel_2.add(lblNewLabel_6, "cell 1 4,alignx trailing");
		
		txtLondonIsIn_1 = new JTextField();
		txtLondonIsIn_1.setText("London is in?");
		panel_2.add(txtLondonIsIn_1, "cell 2 4,growx");
		txtLondonIsIn_1.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		panel_2.add(lblB, "cell 4 4");
		
		txtEngiland = new JTextField();
		txtEngiland.setText("England");
		panel_2.add(txtEngiland, "cell 6 4,growx");
		txtEngiland.setColumns(10);
		
		JCheckBox chckbxDelete_2 = new JCheckBox("Delete");
		panel_2.add(chckbxDelete_2, "cell 7 4");
		
		JLabel lblC = new JLabel("C");
		panel_2.add(lblC, "cell 1 6,alignx trailing");
		
		txtNewYorkIs = new JTextField();
		txtNewYorkIs.setText("New York is the capital of?");
		panel_2.add(txtNewYorkIs, "cell 2 6,growx");
		txtNewYorkIs.setColumns(10);
		
		JLabel lblC_1 = new JLabel("C");
		panel_2.add(lblC_1, "cell 4 6");
		
		txtNewYork = new JTextField();
		txtNewYork.setText("New York");
		panel_2.add(txtNewYork, "cell 6 6,growx");
		txtNewYork.setColumns(10);
		
		JCheckBox chckbxDelete_3 = new JCheckBox("Delete");
		panel_2.add(chckbxDelete_3, "cell 7 6");
		
		JButton btnNewButton_4 = new JButton("Delete Selected");
		panel_2.add(btnNewButton_4, "cell 7 8");
		
		JButton btnSaveToTest = new JButton("Save to test file");
		panel_2.add(btnSaveToTest, "cell 0 10");
		
		JButton btnAddAnother = new JButton("Add another Matching Question");
		panel_2.add(btnAddAnother, "cell 0 13 3 1");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Multiple Choice", null, panel_1, null);
		panel_1.setLayout(new MigLayout("", "[153.00][15.00][grow][][][][148.00][]", "[][][grow][][][][][][][][][][][][][]"));
		
		JLabel lblQuestionTitleoptional_1 = new JLabel("Question Title (optional)");
		panel_1.add(lblQuestionTitleoptional_1, "cell 0 0");
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "cell 2 0 6 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Question");
		panel_1.add(lblNewLabel, "cell 0 2,alignx right");
		
		JTextArea textArea_1 = new JTextArea();
		panel_1.add(textArea_1, "cell 2 2 6 6,grow");
		
		JButton btnC = new JButton("Cancel/Clear Question Text");
		panel_1.add(btnC, "cell 5 8 3 1");
		
		JButton btnAns = new JButton("Add Answer");
		panel_1.add(btnAns, "cell 0 9");
		
		textField_3 = new JTextField();
		panel_1.add(textField_3, "cell 2 9 5 1,growx");
		textField_3.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		panel_1.add(spinner, "cell 7 9");
		
		textField_4 = new JTextField();
		panel_1.add(textField_4, "cell 2 10 5 1,growx");
		textField_4.setColumns(10);
		
		JSpinner spinner_1 = new JSpinner();
		
		panel_1.add(spinner_1, "cell 7 10");
		
		textField_5 = new JTextField();
		panel_1.add(textField_5, "cell 2 11 5 1,growx");
		textField_5.setColumns(10);
		
		JSpinner spinner_2 = new JSpinner();
		panel_1.add(spinner_2, "cell 7 11");
		
		textField_6 = new JTextField();
		panel_1.add(textField_6, "cell 2 12 5 1,growx");
		textField_6.setColumns(10);
		
		JSpinner spinner_3 = new JSpinner();
		panel_1.add(spinner_3, "cell 7 12");
		
		JButton btnNewButton_2 = new JButton("Save to test file");
		panel_1.add(btnNewButton_2, "cell 0 13");
		
		JButton btnAddAnotherMatching = new JButton("Add Another matching Question");
		btnAddAnotherMatching.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnAddAnotherMatching, "cell 0 15 3 1,alignx left");
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Short Answer", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Numerical", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Calculated", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Essay", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Description", null, panel_7, null);
	}

}

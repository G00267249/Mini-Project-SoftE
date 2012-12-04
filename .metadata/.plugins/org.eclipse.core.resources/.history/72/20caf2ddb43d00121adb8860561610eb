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


public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtDublinIsThe;
	private JTextField txtIreland;
	private JTextField txtLondonIsIn;
	private JTextField txtEngland;

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
		panel.setLayout(new MigLayout("", "[][][grow]", "[][][grow][grow][][]"));
		
		
		JLabel lblQuestionTitleoptional = new JLabel("Question Title(optional)");
		panel.add(lblQuestionTitleoptional, "cell 0 0");
		
		textField = new JTextField();
		panel.add(textField, "cell 2 0,growx,aligny top");
		textField.setColumns(10);
		
		JLabel lblQuestion = new JLabel("Question\n");
		panel.add(lblQuestion, "cell 0 2,alignx right");
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea, "cell 2 2,grow");
		
		JButton btnNewButton_1 = new JButton("Save to test file");
		panel.add(btnNewButton_1, "cell 0 3");
		
		
		JButton btnNewButton = new JButton("Add another True/False Question");
		panel.add(btnNewButton, "cell 0 5");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Matching", null, panel_1, null);
		panel_1.setLayout(new MigLayout("", "[][][grow]", "[][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Question title(optional)");
		panel_1.add(lblNewLabel, "cell 0 0");
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "cell 2 0,growx");
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Add Q&A");
		panel_1.add(btnNewButton_2, "cell 0 2");
		
		JLabel lblA = new JLabel("AAAA");
		panel_1.add(lblA, "cell 1 2,alignx trailing");
		
		txtDublinIsThe = new JTextField();
		txtDublinIsThe.setText("Dublin is the capital of?");
		panel_1.add(txtDublinIsThe, "flowx,cell 2 2,growx,alignx left");
		txtDublinIsThe.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("                   A");
		panel_1.add(lblNewLabel_1, "cell 2 2");
		
		txtIreland = new JTextField();
		txtIreland.setText("Ireland");
		panel_1.add(txtIreland, "cell 2 2,growx");
		txtIreland.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Delete");
		panel_1.add(chckbxNewCheckBox, "cell 2 2,alignx right");
		
		JLabel lblNewLabel_2 = new JLabel("BBB");
		panel_1.add(lblNewLabel_2, "cell 1 4,alignx trailing");
		
		txtLondonIsIn = new JTextField();
		txtLondonIsIn.setText("London is in?");
		panel_1.add(txtLondonIsIn, "flowx,cell 2 4,alignx left,grow");
		txtLondonIsIn.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("              B");
		panel_1.add(lblNewLabel_3, "cell 2 4");
		
		txtEngland = new JTextField();
		txtEngland.setText("England");
		panel_1.add(txtEngland, "cell 2 4");
		txtEngland.setColumns(10);
		
		JCheckBox chckbxDelete = new JCheckBox("Delete");
		panel_1.add(chckbxDelete, "cell 2 4");
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Multiple Choice", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Short Answer", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Numerical", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Calculated", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Description", null, panel_6, null);
	}

}

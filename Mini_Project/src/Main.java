import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;


public class Main {

	private JFrame frame;

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
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		
		JLabel lblQuestionTitleoptional = new JLabel("Question Title(optional)");
		panel.add(lblQuestionTitleoptional, "cell 0 0");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Matching", null, panel_1, null);
		
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

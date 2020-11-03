

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ERROR {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ERROR window = new ERROR();
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
	public ERROR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 208);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SOFTWARE EM DESENVOLVIMENTO, OP\u00C7\u00C3O N\u00C3O DISPONIVEL!!");
		lblNewLabel.setBounds(60, 22, 457, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("VOLTAR AO MENU\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				//Janela j = new Janela();	
			}
		});
		btnNewButton.setBounds(10, 68, 414, 90);
		frame.getContentPane().add(btnNewButton);
	}
}

import java.awt.EventQueue;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JTextField;


public class Janela1 {

	private JFrame frame;
	private JTextField txtManutenoMenu;
	private JTextField txtDuvidasPedrofascinavaleocom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela1 window = new Janela1();
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
	public Janela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 240));
		frame.setBounds(100, 100, 450, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnDashbord = new JButton("Dashboard");
		btnDashbord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
			         URI link = new URI ("https://datastudio.google.com/u/0/reporting/558647f9-1df3-42d8-9247-847389631731");
			        Desktop.getDesktop (). browse (link);
			    } catch (Exception erro) {
			            System.out.println (erro);
			        }	
			}
		});
		btnDashbord.setFont(new Font("DialogInput", Font.BOLD, 17));
		btnDashbord.setBackground(Color.BLUE);
		btnDashbord.setForeground(Color.WHITE);
		
		JButton btnAbrirSs = new JButton("Abrir SS");
		btnAbrirSs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
			         URI link = new URI ("https://docs.google.com/forms/d/e/1FAIpQLSdkpkUCsrgRE4iXZ13_H_UfCe6jxhXBXTeCMkyLfp17XJCGvg/viewform");
			        Desktop.getDesktop (). browse (link);
			    } catch (Exception erro) {
			            System.out.println (erro);
			        }	
			}
		});
		btnAbrirSs.setForeground(Color.WHITE);
		btnAbrirSs.setFont(new Font("DialogInput", Font.BOLD, 17));
		btnAbrirSs.setBackground(Color.BLUE);
		
		JButton btnAvaliarSs = new JButton("Avaliar SS");
		btnAvaliarSs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ERROR ();
			}
		});
		btnAvaliarSs.setForeground(Color.WHITE);
		btnAvaliarSs.setFont(new Font("DialogInput", Font.BOLD, 17));
		btnAvaliarSs.setBackground(Color.BLUE);
		
		txtManutenoMenu = new JTextField();
		txtManutenoMenu.setBackground(Color.DARK_GRAY);
		txtManutenoMenu.setForeground(Color.WHITE);
		txtManutenoMenu.setFont(new Font("DialogInput", Font.BOLD, 17));
		txtManutenoMenu.setText("\t     Manuten\u00E7\u00E3o Menu");
		txtManutenoMenu.setColumns(10);
		
		txtDuvidasPedrofascinavaleocom = new JTextField();
		txtDuvidasPedrofascinavaleocom.setText("Duvidas Pedro.Fascina@valeo.com");
		txtDuvidasPedrofascinavaleocom.setForeground(Color.DARK_GRAY);
		txtDuvidasPedrofascinavaleocom.setFont(new Font("DialogInput", Font.BOLD, 17));
		txtDuvidasPedrofascinavaleocom.setColumns(10);
		txtDuvidasPedrofascinavaleocom.setBackground(Color.WHITE);
		
		JButton btntags = new JButton("Lista De Tag's");
		btntags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new Janela2 ();
			}
		});
		btntags.setForeground(Color.WHITE);
		btntags.setFont(new Font("DialogInput", Font.BOLD, 17));
		btntags.setBackground(Color.BLUE);
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtManutenoMenu, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAbrirSs, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnDashbord, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAvaliarSs, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btntags, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(44, Short.MAX_VALUE)
					.addComponent(txtDuvidasPedrofascinavaleocom, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtManutenoMenu, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(btnAbrirSs, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(btnDashbord)
					.addGap(31)
					.addComponent(btnAvaliarSs, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(btntags, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
					.addComponent(txtDuvidasPedrofascinavaleocom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}

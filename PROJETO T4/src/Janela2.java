import java.awt.EventQueue;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class Janela2 {

	private JFrame frame;
	private JTextField txtManutenoMenu;
	private JTextField txtDuvidasPedrofascinavaleocom;
	private JButton btnLilinhaDeMontagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela2 window = new Janela2();
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
	public Janela2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 438);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				frame.dispose();
			}
		});
		btnvoltar.setFont(new Font("DialogInput", Font.BOLD, 17));
		btnvoltar.setBackground(Color.BLUE);
		btnvoltar.setForeground(Color.WHITE);
		
		JButton btnInj21 = new JButton("INJETORA 21 ");
		btnInj21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
			         URI link = new URI ("https://docs.google.com/spreadsheets/d/1tQ5RpTbrQh82nGXDngvSTewxyCYympqAZQZDXsHl7gA/edit#gid=1362035542");
			        Desktop.getDesktop (). browse (link);
			    } catch (Exception erro) {
			            System.out.println (erro);
			        }	
			}
		});
		btnInj21.setForeground(Color.WHITE);
		btnInj21.setFont(new Font("DialogInput", Font.BOLD, 17));
		btnInj21.setBackground(Color.BLUE);
		
		txtManutenoMenu = new JTextField();
		txtManutenoMenu.setBackground(Color.DARK_GRAY);
		txtManutenoMenu.setForeground(Color.WHITE);
		txtManutenoMenu.setFont(new Font("DialogInput", Font.BOLD, 21));
		txtManutenoMenu.setText("         Menu De Tag's");
		txtManutenoMenu.setColumns(10);
		
		txtDuvidasPedrofascinavaleocom = new JTextField();
		txtDuvidasPedrofascinavaleocom.setText("Duvidas Pedro.Fascina@valeo.com");
		txtDuvidasPedrofascinavaleocom.setForeground(Color.DARK_GRAY);
		txtDuvidasPedrofascinavaleocom.setFont(new Font("DialogInput", Font.BOLD, 17));
		txtDuvidasPedrofascinavaleocom.setColumns(10);
		txtDuvidasPedrofascinavaleocom.setBackground(Color.WHITE);
		
		btnLilinhaDeMontagem = new JButton("LINHA DE MONTAGEM");
		btnLilinhaDeMontagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
			         URI link = new URI ("https://docs.google.com/spreadsheets/d/1tQ5RpTbrQh82nGXDngvSTewxyCYympqAZQZDXsHl7gA/edit#gid=320014469");
			        Desktop.getDesktop (). browse (link);
			    } catch (Exception erro) {
			            System.out.println (erro);
			        }	
			}
		});
		btnLilinhaDeMontagem.setForeground(Color.WHITE);
		btnLilinhaDeMontagem.setFont(new Font("DialogInput", Font.BOLD, 17));
		btnLilinhaDeMontagem.setBackground(Color.BLUE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtManutenoMenu, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInj21, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(10, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(43, Short.MAX_VALUE)
					.addComponent(txtDuvidasPedrofascinavaleocom, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
					.addGap(41))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnLilinhaDeMontagem, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnvoltar, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(txtManutenoMenu, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(btnInj21)
					.addGap(33)
					.addComponent(btnLilinhaDeMontagem, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
					.addComponent(btnvoltar)
					.addGap(48)
					.addComponent(txtDuvidasPedrofascinavaleocom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}

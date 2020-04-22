package renameThisPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.DropMode;

public class CoreUI {

	private JFrame coreFrame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoreUI window = new CoreUI();
					window.coreFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CoreUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		coreFrame = new JFrame();
		coreFrame.getContentPane().setBackground(Color.DARK_GRAY);
		coreFrame.setBounds(100, 100, 800, 600);
		coreFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		coreFrame.getContentPane().setLayout(null);
		coreFrame.setTitle("Thief Simulator 0.1");
		
		JButton btnExit = new JButton("Bye Bye");
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnExit.setBackground(Color.GRAY);
		btnExit.setForeground(Color.WHITE);
		btnExit.setToolTipText("Closes the program.");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coreFrame.dispose();
			}
		});
		btnExit.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnExit.setBounds(649, 501, 125, 49);
		coreFrame.getContentPane().add(btnExit);

		JPanel panelHeist = new JPanel();
		panelHeist.setBackground(Color.LIGHT_GRAY);
		panelHeist.setBounds(10, 11, 250, 539);
		coreFrame.getContentPane().add(panelHeist);
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		
		JList<String> listHeist = new JList<String>(listModel);
		listHeist.setSelectionForeground(Color.ORANGE);
		listHeist.setSelectionBackground(Color.DARK_GRAY);
		listHeist.setBackground(Color.LIGHT_GRAY);
		
		panelHeist.add(listHeist);
		
		//panelHeist.add(new JScrollBar(listHeist));
		
		JButton btnTemp_AddItem = new JButton("Add");
		btnTemp_AddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listModel.addElement(""+System.currentTimeMillis());
			}
		});
		btnTemp_AddItem.setToolTipText("Closes the program.");
		btnTemp_AddItem.setForeground(Color.WHITE);
		btnTemp_AddItem.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnTemp_AddItem.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnTemp_AddItem.setBackground(Color.GRAY);
		btnTemp_AddItem.setBounds(270, 523, 28, 27);
		coreFrame.getContentPane().add(btnTemp_AddItem);
		
		JButton btnTemp_goto = new JButton("Cshuuz");
		btnTemp_goto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String where = listHeist.getSelectedValue();
				if (where == null) {
					JOptionPane.showMessageDialog(null, "Nem választottál uticélt");
				}
				else {
					
				}
				
			}
		});
		btnTemp_goto.setToolTipText("Closes the program.");
		btnTemp_goto.setForeground(Color.WHITE);
		btnTemp_goto.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnTemp_goto.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnTemp_goto.setBackground(Color.GRAY);
		btnTemp_goto.setBounds(270, 11, 125, 49);
		coreFrame.getContentPane().add(btnTemp_goto);
		
		
		
		
		
		
	}
}

package renameThisPackage;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import renameThisPackage.Gear;

public class GearChoiceWindow {

	private JFrame frmGearChoiceWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GearChoiceWindow window = new GearChoiceWindow();
					window.frmGearChoiceWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GearChoiceWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGearChoiceWindow = new JFrame();
		frmGearChoiceWindow.setTitle("Gear Choice Window");
		frmGearChoiceWindow.getContentPane().setBackground(Color.DARK_GRAY);
		frmGearChoiceWindow.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 11, 264, 89);
		frmGearChoiceWindow.getContentPane().add(panel);
		
		DefaultListModel<String> listModelGear = new DefaultListModel<String>();
		
		for (GearTypes gT: GearTypes.values()) {
			listModelGear.addElement(gT.toString());
		}
		
		JList<String> list = new JList<String>(listModelGear);
		list.setFont(new Font("Segoe UI", Font.BOLD, 20));
		list.setBackground(Color.LIGHT_GRAY);
		
		panel.add(list);
		
		JButton btnGearChoice = new JButton("Cshuuz");
		btnGearChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnGearChoice.setToolTipText("Closes the program.");
		btnGearChoice.setForeground(Color.WHITE);
		btnGearChoice.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnGearChoice.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnGearChoice.setBackground(Color.GRAY);
		btnGearChoice.setBounds(89, 110, 105, 37);
		frmGearChoiceWindow.getContentPane().add(btnGearChoice);
		frmGearChoiceWindow.setBounds(100, 100, 300, 197);
		frmGearChoiceWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

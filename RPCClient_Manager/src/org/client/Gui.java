package org.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;

import org.apache.xmlrpc.XmlRpcException;
import org.xmlrpc.SystemInterface;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

	private SystemInterface SystemInterfaceObj=new SystemInterface();
	
	private JFrame frmManager;
	private JEditorPane editorPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frmManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManager = new JFrame();
		frmManager.setTitle("Manager");
		frmManager.setBounds(100, 100, 652, 517);
		frmManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManager.getContentPane().setLayout(null);
		
		editorPane = new JEditorPane();
		editorPane.setBounds(30, 11, 509, 308);
		frmManager.getContentPane().add(editorPane);
		
		JButton btnGetcompletemenu = new JButton("GetCompleteMenu");
		btnGetcompletemenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					editorPane.setText(SystemInterfaceObj.getCompleteMenu());
				} catch (XmlRpcException e) {
					// TODO Auto-generated catch block
					editorPane.setText(e.toString());
				}
			}
		});
		btnGetcompletemenu.setBounds(30, 360, 263, 23);
		frmManager.getContentPane().add(btnGetcompletemenu);
	}
}

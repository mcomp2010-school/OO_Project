package org.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;

import org.apache.xmlrpc.XmlRpcException;
import org.utils.HtmlUtils;
import org.xmlrpc.SystemInterface;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.ScrollPaneConstants;
import java.awt.SystemColor;

public class Gui {

	private SystemInterface SystemInterfaceObj=new SystemInterface();
	
	private JFrame frmManager;
	private JEditorPane editorMenuoutput;

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
		frmManager.setBounds(100, 100, 683, 588);
		frmManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManager.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 639, 528);
		frmManager.getContentPane().add(tabbedPane);
		
		JPanel menu_panel = new JPanel();
		tabbedPane.addTab("Menu", null, menu_panel, null);
		tabbedPane.setEnabledAt(0, true);
		
		menu_panel.setLayout(null);
		
		JButton btnGetcompletemenu = new JButton("Get Complete Menu");
		btnGetcompletemenu.setBounds(272, 448, 174, 23);
		menu_panel.add(btnGetcompletemenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 603, 408);
		menu_panel.add(scrollPane);
		
		editorMenuoutput = new JEditorPane();
		editorMenuoutput.setEditable(false);
		editorMenuoutput.setContentType("text/html");
		scrollPane.setViewportView(editorMenuoutput);
		btnGetcompletemenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					editorMenuoutput.setText(HtmlUtils.convertMenuStringToHtml(SystemInterfaceObj.getCompleteMenu()));
				} catch (XmlRpcException e) {
					// TODO Auto-generated catch block
					editorMenuoutput.setText(e.getMessage().toString());
				}
			}
		});
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
	}
}

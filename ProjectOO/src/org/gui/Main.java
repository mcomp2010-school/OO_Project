package org.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;

import org.info.InformationProvider;
import org.shared.HtmlUtils;
import org.SystemInterface;

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
import java.util.TreeSet;

import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;

public class Main {

	private InformationProvider infoObj=InformationProvider.getSingletonObject(); //NEED TO REMOVE AND USE SystemInterfaceObj
	
	private SystemInterface SystemInterfaceObj=new SystemInterface();
	
	private JFrame frmManager;
	private JEditorPane editorMenuoutput;
	private JEditorPane editorTables;
	private JEditorPane editorPane_recipts_recipt;
	private JList<String> list_recipts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManager = new JFrame();
		frmManager.setTitle("Manager");
		frmManager.setBounds(100, 100, 683, 606);
		frmManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManager.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 647, 546);
		frmManager.getContentPane().add(tabbedPane);
		
		JPanel panel_menu = new JPanel();
		tabbedPane.addTab("Menu", null, panel_menu, null);
		tabbedPane.setEnabledAt(0, true);
		
		panel_menu.setLayout(null);
		
		JButton btnGetCompleteMenu = new JButton("Get Complete Menu");
		btnGetCompleteMenu.setBounds(21, 448, 174, 23);
		panel_menu.add(btnGetCompleteMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 603, 426);
		panel_menu.add(scrollPane);
		
		editorMenuoutput = new JEditorPane();
		editorMenuoutput.setEditable(false);
		editorMenuoutput.setContentType("text/html");
		scrollPane.setViewportView(editorMenuoutput);
		
		JButton btnGetHeartHealthy = new JButton("Get Heart Healthy Menu");
		btnGetHeartHealthy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorMenuoutput.setText(HtmlUtils.convertMenuStringToHtml(infoObj.HeartHealthyMenu().toString()));
			}
		});
		
		btnGetHeartHealthy.setBounds(21, 484, 174, 23);
		panel_menu.add(btnGetHeartHealthy);
		
		JButton btnGetPriceMenu = new JButton("Get Price Menu");
		btnGetPriceMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO need to change to System Interface
				
				Double s=null;
				try{
					s = Double.parseDouble((String)JOptionPane.showInputDialog(
		                    frmManager,
		                    "Set Max Price you want to view. Input value needs to be a number"
		                    + "",
		                    "Menu",
		                    JOptionPane.PLAIN_MESSAGE,null,
		                    null,
		                    null));

				}catch(Exception exin){
					//editorMenuoutput.setText(exin.toString());
					//return;
					s=null;
				}
				
				//If a string was returned, say so.
				if ((s != null)&&(s>=0.0)) {
				    editorMenuoutput.setText(HtmlUtils.convertMenuStringToHtml(infoObj.PriceMenu(s).toString()));
				    return;
				}else{
					editorMenuoutput.setText("Canceled");
					return;
				}
	
			}
		});
		
		btnGetPriceMenu.setBounds(205, 450, 174, 23);
		panel_menu.add(btnGetPriceMenu);
		
		JButton btnGetIngredientMenu = new JButton("Get Ingredient Menu");
		btnGetIngredientMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO need to change to System Interface
				
				String[] possibilities = infoObj.getUniqueIngredients();
				
				String s = (String)JOptionPane.showInputDialog(
				                    frmManager,
				                    "What Ingredient do you want to view??"
				                    + "",
				                    "Menu",
				                    JOptionPane.PLAIN_MESSAGE,null,
				                    possibilities,
				                    null);

				//If a string was returned, say so.
				if ((s != null) && (s.length() > 0)) {
				    editorMenuoutput.setText(HtmlUtils.convertMenuStringToHtml(infoObj.IngredientMenu(s).toString()));
				    return;
				}else{
					editorMenuoutput.setText("Canceled");
					return;
				}
				
				
			}
		});
		btnGetIngredientMenu.setBounds(205, 484, 174, 23);
		panel_menu.add(btnGetIngredientMenu);
		btnGetCompleteMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					editorMenuoutput.setText(HtmlUtils.convertMenuStringToHtml(SystemInterfaceObj.getGetCompleteMenu()));
			}
		});
		
		JPanel panel_tables = new JPanel();
		tabbedPane.addTab("Tables", null, panel_tables, null);
		panel_tables.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(10, 11, 614, 462);
		panel_tables.add(scrollPane_1);
		
		editorTables = new JEditorPane();
		editorTables.setContentType("text/html");
		editorTables.setEditable(false);
		scrollPane_1.setViewportView(editorTables);
		
		JButton btn_tables_getTables = new JButton("Get All Tables");
		btn_tables_getTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorTables.setText(HtmlUtils.convertMenuStringToHtml(SystemInterfaceObj.getTables()));
			}
		});
		btn_tables_getTables.setBounds(10, 484, 151, 23);
		panel_tables.add(btn_tables_getTables);
		
		JButton btn_tables_getAvailableTables = new JButton("Get Available Tables");
		btn_tables_getAvailableTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_tables_getAvailableTables.setBounds(171, 484, 151, 23);
		panel_tables.add(btn_tables_getAvailableTables);
		
		JPanel panel_recipt = new JPanel();
		tabbedPane.addTab("Recipts", null, panel_recipt, null);
		panel_recipt.setLayout(null);
		
		JLabel lblLblreciptslist = new JLabel("Recipt List");
		lblLblreciptslist.setBounds(10, 11, 111, 14);
		panel_recipt.add(lblLblreciptslist);
		
		JScrollPane scrollPane_recipts_recipt = new JScrollPane();
		scrollPane_recipts_recipt.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_recipts_recipt.setBounds(188, 36, 444, 471);
		panel_recipt.add(scrollPane_recipts_recipt);
		
		editorPane_recipts_recipt = new JEditorPane();
		editorPane_recipts_recipt.setEditable(false);
		editorPane_recipts_recipt.setContentType("text/html");
		scrollPane_recipts_recipt.setViewportView(editorPane_recipts_recipt);
		
		JScrollPane scrollPane_recipts_reciptlist = new JScrollPane();
		scrollPane_recipts_reciptlist.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_recipts_reciptlist.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_recipts_reciptlist.setBounds(10, 36, 168, 437);
		panel_recipt.add(scrollPane_recipts_reciptlist);
		
		list_recipts = new JList();
		scrollPane_recipts_reciptlist.setViewportView(list_recipts);
		
		JButton btn_recipt_getReciptList = new JButton("Get Recipt List");
		btn_recipt_getReciptList.setBounds(10, 484, 168, 23);
		panel_recipt.add(btn_recipt_getReciptList);
		
		JPanel panel_simulation = new JPanel();
		panel_simulation.setLayout(null);
		tabbedPane.addTab("Simulation", null, panel_simulation, null);
	}
}

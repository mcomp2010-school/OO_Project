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
import org.system.SystemInterface;

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
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/** The info obj. */
	private InformationProvider infoObj=InformationProvider.getSingletonObject(); //NEED TO REMOVE AND USE SystemInterfaceObj
	
	/** The System interface obj. */
	private SystemInterface SystemInterfaceObj=new SystemInterface();
	
	/** The frm manager. */
	private JFrame frmManager;
	
	/** The editor menuoutput. */
	private JEditorPane editorMenuoutput;
	
	/** The editor tables. */
	private JEditorPane editorTables;
	
	/** The editor pane_recipts_recipt. */
	private JEditorPane editorPane_recipts_recipt;
	
	/** The list_recipts. */
	private JList<String> list_recipts;
	
	/** The slider. */
	private JSlider slider;
	
	/** The lbl current speed. */
	private JLabel lblCurrentSpeed;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
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
		frmManager.setBounds(100, 100, 683, 604);
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
		//Action Listeners
		btnGetHeartHealthy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorMenuoutput.setText(HtmlUtils.convertMenuStringToHtml(infoObj.HeartHealthyMenu().toString()));
			}
		});
		
		btnGetHeartHealthy.setBounds(21, 484, 174, 23);
		panel_menu.add(btnGetHeartHealthy);
		
		JButton btnGetPriceMenu = new JButton("Get Price Menu");
		//Action Listeners
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
		//Action Listeners
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
		
		//Action Listeners
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
		btn_tables_getTables.setBounds(10, 484, 151, 23);
		panel_tables.add(btn_tables_getTables);
		//Action Listeners
		btn_tables_getTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorTables.setText(HtmlUtils.convertMenuStringToHtml(SystemInterfaceObj.getTables()));
			}
		});
		
		JButton btn_tables_getAvailableTables = new JButton("Get Available Tables");
		btn_tables_getAvailableTables.setBounds(171, 484, 151, 23);
		panel_tables.add(btn_tables_getAvailableTables);
		//Action Listeners
		btn_tables_getAvailableTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
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
		
		JPanel panel_comments = new JPanel();
		panel_comments.setLayout(null);
		tabbedPane.addTab("Comments", null, panel_comments, null);
		
		JLabel lblCommentList = new JLabel("Comment List");
		lblCommentList.setBounds(10, 11, 111, 14);
		panel_comments.add(lblCommentList);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(188, 36, 444, 471);
		panel_comments.add(scrollPane_2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setContentType("text/html");
		scrollPane_2.setViewportView(editorPane);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_3.setBounds(10, 36, 168, 437);
		panel_comments.add(scrollPane_3);
		
		JList list = new JList();
		scrollPane_3.setViewportView(list);
		
		JButton btnGetComment = new JButton("Get Comment List");
		btnGetComment.setBounds(10, 484, 168, 23);
		panel_comments.add(btnGetComment);
		
		JPanel panel_orders = new JPanel();
		panel_orders.setLayout(null);
		tabbedPane.addTab("Orders", null, panel_orders, null);
		
		JLabel lbl_order_orderList = new JLabel("Order List");
		lbl_order_orderList.setBounds(10, 11, 111, 14);
		panel_orders.add(lbl_order_orderList);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_4.setBounds(188, 36, 444, 471);
		panel_orders.add(scrollPane_4);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setEditable(false);
		editorPane_1.setContentType("text/html");
		scrollPane_4.setViewportView(editorPane_1);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_5.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_5.setBounds(10, 36, 168, 437);
		panel_orders.add(scrollPane_5);
		
		JList list_1 = new JList();
		scrollPane_5.setViewportView(list_1);
		
		JButton btnGetOrderList = new JButton("Get Order List");
		btnGetOrderList.setBounds(10, 484, 168, 23);
		panel_orders.add(btnGetOrderList);
		
		JPanel panel_simulation = new JPanel();
		panel_simulation.setLayout(null);
		tabbedPane.addTab("Simulation", null, panel_simulation, null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Controls", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 13, 618, 124);
		panel_simulation.add(panel);
		panel.setLayout(null);
		
		lblCurrentSpeed = new JLabel("Current Speed: 5");
		lblCurrentSpeed.setBounds(12, 91, 142, 14);
		panel.add(lblCurrentSpeed);
		
		slider = new JSlider();
		slider.setBounds(12, 38, 200, 52);
		panel.add(slider);
		slider.setValue(5);
		slider.setSnapToTicks(true);
		slider.setMinimum(1);
		slider.setMaximum(10);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		
		JLabel lblSpeed = new JLabel("Speed");
		lblSpeed.setBounds(12, 23, 46, 14);
		panel.add(lblSpeed);
		
		JButton btnStartSimulation = new JButton("Start Simulation");
		btnStartSimulation.setBounds(239, 19, 152, 23);
		panel.add(btnStartSimulation);
		
		JButton btnPauseSimulation = new JButton("Pause Simulation");
		btnPauseSimulation.setBounds(239, 52, 152, 23);
		panel.add(btnPauseSimulation);
		
		JButton btn_simulation_controls_reset = new JButton("Reset Simulation");
		btn_simulation_controls_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_simulation_controls_reset.setBounds(239, 88, 152, 23);
		panel.add(btn_simulation_controls_reset);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(12, 142, 618, 244);
		panel_simulation.add(panel_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(50);
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setBounds(22, 68, 34, 133);
		panel_1.add(progressBar);
		
		JLabel lblTable = new JLabel("Table\r\n Capacity");
		lblTable.setEnabled(true);
		lblTable.setBounds(12, 43, 78, 23);
		panel_1.add(lblTable);
		
		JLabel lblCustomersWaiting = new JLabel("Customers Waiting");
		lblCustomersWaiting.setBounds(12, 27, 157, 14);
		panel_1.add(lblCustomersWaiting);
		//Action Listeners
		btnPauseSimulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		//Action Listeners
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblCurrentSpeed.setText("Current Speed: "+slider.getValue());	
			}
		});
	}
}

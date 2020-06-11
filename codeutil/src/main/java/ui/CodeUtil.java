/*
 * CodeUtil.java
 * CodeUtil.java
 *
 * Created on __DATE__, __TIME__
 */

package ui;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 *
 * @author
 *
 */
public class CodeUtil extends javax.swing.JFrame {

	/** Creates new form CodeUtil */
	public CodeUtil() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new JLabel();
		jLabel4 = new JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jTextField4 = new javax.swing.JTextField();
		jLabel5 = new JLabel();
		jTextField5 = new javax.swing.JTextField();
		jSeparator2 = new javax.swing.JSeparator();
		jLabel6 = new JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel7 = new JLabel();
		jTextField7 = new javax.swing.JTextField();
		jLabel8 = new JLabel();
		jTextField8 = new javax.swing.JTextField();
		jLabel9 = new JLabel();
		jTextField9 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		数据库 = new JLabel();
		jTextField10 = new javax.swing.JTextField();
		jLabel10 = new JLabel();
		jTextField11 = new javax.swing.JTextField();
		jLabel11 = new JLabel();
		jTextField12 = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		//setTitle("\u4f20\u667a\u5218\u5907\u4ee3\u7801\u751f\u6210\u5668 V2.3");
		setTitle("架构师 2.5.1 ->人人都是架构师");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowActivated(java.awt.event.WindowEvent evt) {
				formWindowActivated(evt);
			}

			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}

			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jLabel1.setText("\u6a21\u677f");

		jLabel4.setText("\u7ed3\u6784\u6587\u6863\u8def\u5f84");

		jLabel5.setText("\u4ee3\u7801\u751f\u6210\u8def\u5f84");

		jLabel6.setText("\u9879\u76ee\u540d\uff08\u82f1\u6587\uff09");

		jLabel7.setText("\u9879\u76ee\u4e2d\u6587\u540d\u79f0");

		jLabel8.setText("\u5305\u540d");

		jLabel9.setText("\u4f5c\u8005");

		jButton1.setText("\u751f\u6210\u4ee3\u7801");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5173\u95ed");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton6.setText("\u9009\u62e9");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("\u9009\u62e9");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		数据库.setText("\u6570\u636e\u5e93");

		jLabel10.setText("\u7528\u6237\u540d");

		jLabel11.setText("\u5bc6\u7801");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "--请选择模板--" }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jSeparator2,
						javax.swing.GroupLayout.DEFAULT_SIZE, 543,
						Short.MAX_VALUE)
				.addComponent(jSeparator1,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 543,
						Short.MAX_VALUE)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(26, 26,
																		26)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel4)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel5))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(25, 25,
																		25)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel6)
																				.addComponent(
																						jLabel8)
																				.addComponent(
																						jLabel7)
																				.addComponent(
																						jLabel9)
																				.addComponent(
																						数据库)
																				.addComponent(
																						jLabel10))))
								.addGap(0, 0, 0)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jTextField11,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		104,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jLabel11)
																.addGap(36, 36,
																		36)
																.addComponent(
																		jTextField12,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		118,
																		Short.MAX_VALUE))
												.addComponent(
														jTextField10,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		140,
																		Short.MAX_VALUE)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		79,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addComponent(
														jTextField5,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addComponent(
														jTextField6,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addComponent(
														jTextField7,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addComponent(
														jTextField8,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addComponent(
														jTextField9,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addComponent(
														jButton7,
														javax.swing.GroupLayout.Alignment.LEADING,
														0, 0, Short.MAX_VALUE)
												.addComponent(
														jButton6,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														73, Short.MAX_VALUE))
								.addGap(54, 54, 54))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(27, 27, 27)
								.addComponent(jLabel1)
								.addGap(57, 57, 57)
								.addComponent(jComboBox1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										299,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(136, 136, 136)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(96, 96, 96)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1))
								.addGap(18, 18, 18)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(jTextField4)
												.addComponent(jButton6))
								.addGap(15, 15, 15)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(jTextField5)
												.addComponent(jButton7))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jSeparator2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(jTextField6))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel8)
												.addComponent(jTextField7))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(jTextField8))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField9)
												.addComponent(jLabel9))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(数据库)
												.addComponent(jTextField10))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(
														jTextField11,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel11)
												.addComponent(
														jTextField12,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(jButton1))
								.addGap(24, 24, 24)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		dispose();
		System.exit(0);

	}

	private void formWindowOpened(java.awt.event.WindowEvent evt) {

		setLocationRelativeTo(null);

		//获取当前文件夹下的模板目录下的所有文件夹
		File directory = new File(new File("").getAbsolutePath() + File.separatorChar + "模板");//设定为当前文件夹
		File[] listFiles = directory.listFiles();
		if (listFiles != null) {
			for (File f : listFiles) {
				if (f.isDirectory()) {
					this.jComboBox1.addItem(f.getName());
				}
			}
		}
		this.jTextField4.setText(new File("").getAbsolutePath() + File.separatorChar + "db");

		//读取变量
		//Map<String, String> pathMap = xml.XmlUtil.read("pathMap.xml");
		//if (pathMap != null && pathMap.size() > 0) {
		//	this.jTextField5.setText(pathMap.get("codePath"));
		//}
		Map<String, String> publicMap = xml.XmlUtil.read("publicMap.xml");
		if (publicMap != null && publicMap.size() > 0) {
			this.jTextField6.setText(publicMap.get("project"));
			this.jTextField7.setText(publicMap.get("package"));
			this.jTextField8.setText(publicMap.get("projectComment"));
			this.jTextField9.setText(publicMap.get("author"));
			//this.jTextField10.setText(publicMap.get("db"));
			//this.jTextField11.setText(publicMap.get("dbuser"));
			//this.jTextField12.setText(publicMap.get("dbpassword"));
		}
	}

	private void formWindowActivated(java.awt.event.WindowEvent evt) {

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		//this.dispose();
		System.exit(0);
	}

	public void setDbInfo(String dbName, String dbuser, String dbpassword) {
		this.jTextField10.setText(dbName);
		this.jTextField11.setText(dbuser);
		this.jTextField12.setText(dbpassword);

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		jButton1.setEnabled(false);
		jButton1.setText("代码生成中...");
		final Thread t=new Thread(new Runnable(){
			  public void run(){
				  try{
					//路径map封装
						Map<String, String> pathMap = new HashMap<String, String>();
						//获取当前文件夹下的模板目录下的所有文件夹
						String basePath = new File("").getAbsolutePath() + File.separatorChar + "模板" + File.separatorChar
								+ jComboBox1.getSelectedItem();//设定为当前文件夹

						pathMap.put("templetPath", basePath);
						pathMap.put("projectTempletPath", basePath + File.separatorChar +"工程模板");
						pathMap.put("tablleTempletPath", basePath + File.separatorChar +"表级模板");
						pathMap.put("columnTempletPath", basePath + File.separatorChar +"列级模板");
						pathMap.put("xmlPath", jTextField4.getText());
						pathMap.put("codePath",jTextField5.getText());

						//全局替换符
						Map<String, String> publicMap = new HashMap<String, String>();
						publicMap.put("project", jTextField6.getText());
						publicMap.put("package", jTextField7.getText());

						publicMap.put("projectComment", jTextField8.getText());
						publicMap.put("author", jTextField9.getText());

						publicMap.put("db", jTextField10.getText());
						publicMap.put("dbuser", jTextField11.getText());
						publicMap.put("dbpassword", jTextField12.getText());
						String s = jTextField7.getText().replace(".", ",");
						String[] paths = s.split(",");
						for (int i = 0; i < paths.length; i++) {
							publicMap.put("path_" + String.valueOf(i + 1), paths[i]);
						}
						publicMap.put("path_all", s.replace(",", "/"));

						//暂存变量
						//xml.XmlUtil.write(pathMap, "pathMap.xml");
						xml.XmlUtil.write(publicMap, "publicMap.xml");

						templet.Code.create(pathMap, publicMap);//生成代码
						JOptionPane.showMessageDialog(null, "代码生成成功", "提示",
								JOptionPane.DEFAULT_OPTION);
						
				  }catch (Exception e) {
				     e.printStackTrace();
				     JOptionPane.showMessageDialog(null, "发生错误", "错误详情请查看error.log",
								JOptionPane.INFORMATION_MESSAGE);
				     
				  }
				  jButton1.setEnabled(true);
				  jButton1.setText("生成代码");
				  
			  }}
		  );
		t.start();
		
		

	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextField5.setText(selectPath("选择代码生成路径"));
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextField4.setText(selectPath("选择结构文档路径"));
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		//this.jTextField2.setText(selectPath("选择表级模板路径"));
	}

	/**
	 * 选择路径
	 * @param title
	 * @return
	 */
	private String selectPath(String title) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		jfc.showDialog(new JLabel(), title);
		File file = jfc.getSelectedFile();
		if (file == null) {
			return null;
		}
		return file.getPath();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CodeUtil().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JComboBox jComboBox1;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	private JLabel 数据库;
	// End of variables declaration//GEN-END:variables

}
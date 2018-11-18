package PassMan;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author WANDE
 */
public final class Passwords extends javax.swing.JFrame {
	public static String acctName = null;
	private final String key;
	private String acctPass = null;
	static ArrayList<String> fileContents = new ArrayList<>();
	int accountCount;
	
	/**
	 * Creates new form PassManMain
	 */
	public Passwords() {
		this.key = "tisisthe16bitkey";
		initComponents();
	}
	
	public static void setAcctName(String accountName){
		Passwords.acctName = accountName;
	}
	

	/**
	 * This method is called from within the
	 * constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The
	 * content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameArea = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        infoArea = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NewWebsite = new javax.swing.JTextField();
        newUsername = new javax.swing.JTextField();
        newPassword = new javax.swing.JPasswordField();
        saveAccount = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentsTable = new javax.swing.JTable();
        showPass = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        settingsPage = new javax.swing.JButton();
        editAcount = new javax.swing.JButton();
        deleteAcount = new javax.swing.JButton();
        Welcome = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PassMan");
        setBackground(new java.awt.Color(0, 102, 204));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        nameArea.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        nameArea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameArea.setText("PassMan: Encrypted Password Manager v1.00.01");
        nameArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        infoArea.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Website");

        jLabel4.setText("Username");

        jLabel5.setText("Password");

        NewWebsite.setText("http://");

        saveAccount.setIcon(new javax.swing.ImageIcon("C:\\Users\\WANDE\\Downloads\\save-icon.png")); // NOI18N
        saveAccount.setText("Save");
        saveAccount.setToolTipText("save password");
        saveAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAccountActionPerformed(evt);
            }
        });

        contentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S/N", "Website", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        contentsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(contentsTable);
        if (contentsTable.getColumnModel().getColumnCount() > 0) {
            contentsTable.getColumnModel().getColumn(0).setMinWidth(25);
            contentsTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            contentsTable.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dotum", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Designed by: Shokunbi Olawande");
        jLabel2.setToolTipText("http://twitter.com/wande_sho");

        settingsPage.setText("Settings");
        settingsPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsPageActionPerformed(evt);
            }
        });

        editAcount.setText("Edit");
        editAcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAcountActionPerformed(evt);
            }
        });

        deleteAcount.setForeground(new java.awt.Color(255, 0, 0));
        deleteAcount.setText("Delete");
        deleteAcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAcountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(NewWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(newUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPass)
                                .addGap(18, 18, 18)
                                .addComponent(saveAccount))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(editAcount, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteAcount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(settingsPage, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)))
                        .addComponent(infoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(showPass)
                                .addComponent(saveAccount)))))
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(infoArea))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editAcount)
                                .addComponent(deleteAcount))
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(settingsPage)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Welcome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Welcome.setForeground(new java.awt.Color(0, 51, 255));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Welcome.setText("Welcome, " + acctName);

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	public void addContentToTable(int sn, String website, String username, String password){
		DefaultTableModel model = (DefaultTableModel) contentsTable.getModel();
		Object rowData[] = new Object[4];
		rowData[0] = ++accountCount;
		rowData[1] = website;
		rowData[2] = username;
		rowData[3] = password;
		model.addRow(rowData);
	}
	
	public void populateTable(ArrayList<String> fileContents){
		accountCount = fileContents.size() / 3;
		DefaultTableModel model = (DefaultTableModel) contentsTable.getModel();
		Object rowData[] = new Object[4];
		for(int i=2; i<fileContents.size(); i=i+3){
			rowData[0] = (i+1)/3;
			rowData[1] = fileContents.get(i-2);
			rowData[2] = fileContents.get(i-1);
			rowData[3] = fileContents.get(i);
			model.addRow(rowData);
		}
	}
	
	public void getFileContents() throws IOException{
		String filepath = acctName + ".psm";
		FileReader readFile = null;
		PassManMain mainScreen = new PassManMain();
		try {
			readFile = new FileReader(filepath);
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Error: Account not found ");
			dispose();
			mainScreen.setVisible(true);
			//Logger.getLogger(Passwords.class.getName()).log(Level.SEVERE, null, ex);
		}
		BufferedReader readBuffer = new BufferedReader(readFile);
		try {
			String encContent;
			while( (encContent = readBuffer.readLine()) != null){
				Crypt decLine = new Crypt(key);
				String decContent = null;
				try {
					decContent = decLine.decrypt(encContent);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error: Could not decrypt account " + encContent + " " + decContent);
					PassManMain mainScreenError = new PassManMain();
					mainScreenError.setVisible(true);
					//Logger.getLogger(Passwords.class.getName()).log(Level.SEVERE, null, ex);
				}
				fileContents.add(decContent);
				//decrypted file contents added to an arraylist
			}
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error: Account file is corrupt");
			dispose();
			mainScreen.setVisible(true);
			//Logger.getLogger(Passwords.class.getName()).log(Level.SEVERE, null, ex);
		}
		readBuffer.close();
	}
	
	public void onView(){
		//then populate passwords table from file
		try {
			getFileContents();
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Could not get file contents");
			//Logger.getLogger(Passwords.class.getName()).log(Level.SEVERE, null, ex);
		}
		if(fileContents.size() > 0){
			this.acctPass = fileContents.get(0);
			fileContents.remove(0);
			populateTable(fileContents);
		}
	}
	
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Welcome.setText("Welcome, " + acctName);
    }//GEN-LAST:event_formComponentShown

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if(showPass.isSelected()){
			newPassword.setEchoChar((char) 0);
		}else{
			newPassword.setEchoChar('*');
		}
    }//GEN-LAST:event_showPassActionPerformed

    private void saveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAccountActionPerformed
		String encWeb = null, encUsn = null, encPas = null;
		if(!"".equals(NewWebsite.getText()) && !"".equals(newUsername.getText()) && newPassword.getPassword().length > 0 ){
			String newWeb = NewWebsite.getText();
			String newUsn = newUsername.getText();
			char[] newPas = newPassword.getPassword();
			
			Crypt newContent = new Crypt(key);
			
			//encrypt new website, username and password
			try {
				encWeb = newContent.encrypt(newWeb);
				encUsn = newContent.encrypt(newUsn);
				encPas = newContent.encrypt(new String(newPas));
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Website, username or password failed to encrypt");
				//Logger.getLogger(Passwords.class.getName()).log(Level.SEVERE, null, ex);
			}
			
			//save encrypted website, username and password to file
			String filepath = acctName + ".psm";
			FileWriter writeFile = null;
			try {
				writeFile = new FileWriter(filepath, true);
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(null, "Error: Could not find account");
				//Logger.getLogger(Passwords.class.getName()).log(Level.SEVERE, null, ex);
			}
			BufferedWriter writeBuffer = new BufferedWriter(writeFile);
			try {
				writeBuffer.write(encWeb);
				writeBuffer.newLine();
				writeBuffer.write(encUsn);
				writeBuffer.newLine();
				writeBuffer.write(encPas);
				writeBuffer.newLine();
				writeBuffer.close();
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(null, "Error: Could not write to account");
				//Logger.getLogger(Passwords.class.getName()).log(Level.SEVERE, null, ex);
			}
			
			NewWebsite.setText("http://");
			newPassword.setText("");
			newUsername.setText("");
			JOptionPane.showMessageDialog(null, "Encryption success!");
			
			addContentToTable(12, newWeb, newUsn, new String(newPas));
			
		}else{
			JOptionPane.showMessageDialog(null, "Website, username and password fields are required");
		}
		
    }//GEN-LAST:event_saveAccountActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void settingsPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsPageActionPerformed
        Settings changeSettings = new Settings();
		changeSettings.settingsState(acctName);
		changeSettings.setVisible(true);
    }//GEN-LAST:event_settingsPageActionPerformed

	private void deleteTableRow(){
		DefaultTableModel contentsTableModel = (DefaultTableModel) contentsTable.getModel();
		int selectedRowIndex = contentsTable.getSelectedRow();
		
		Crypt encryptTableContents = new Crypt(key);
		//delete from table
		contentsTableModel.removeRow(selectedRowIndex);

		//delete from file
		String filename = acctName + ".psm";
		FileWriter writeFile = null;
		try {
			writeFile = new FileWriter(filename, false);

		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error: Account file not found");
		}
		BufferedWriter writeBuffer = new BufferedWriter(writeFile);
		try {
			//encrypt password and write back to file
			writeBuffer.write(encryptTableContents.encrypt(acctPass));
			writeBuffer.newLine();
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error: Master Password written to file");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Error: Master Password not encrypted");
		}

		//write table to file
		for(int i=0; i<contentsTableModel.getRowCount(); i++){
			try {					
				String web = contentsTable.getValueAt(i, 1).toString();
				writeBuffer.write( encryptTableContents.encrypt(web) );
				writeBuffer.newLine();

				String usn = contentsTable.getValueAt(i, 2).toString();
				writeBuffer.write( encryptTableContents.encrypt(usn) );
				writeBuffer.newLine();

				String pass = contentsTable.getValueAt(i, 3).toString();
				writeBuffer.write( encryptTableContents.encrypt(pass) );
				writeBuffer.newLine();
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(null, "Error: Could not write to acouny file");
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error: Could not encrypt file");
			}
		}
		try {
			writeBuffer.close();
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error: Could not close buffer");
		}
	}
	
    private void deleteAcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAcountActionPerformed
		int deleteAccount = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this account?");
		
		if(deleteAccount == 0){
			deleteTableRow();
		}
    }//GEN-LAST:event_deleteAcountActionPerformed

    private void editAcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAcountActionPerformed
        DefaultTableModel contentsTableModel = (DefaultTableModel) contentsTable.getModel();
		int selectedRowIndex = contentsTable.getSelectedRow();
		
		int editAccount = JOptionPane.showConfirmDialog(null, "Do you want to edit this account?");
		
		if(editAccount == 0){
			NewWebsite.setText( contentsTableModel.getValueAt(selectedRowIndex, 1).toString() );
			newUsername.setText( contentsTableModel.getValueAt(selectedRowIndex, 2).toString() );
			newPassword.setText( contentsTableModel.getValueAt(selectedRowIndex, 3).toString() );
			
			deleteTableRow();
		}
    }//GEN-LAST:event_editAcountActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Passwords().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NewWebsite;
    private javax.swing.JLabel Welcome;
    private javax.swing.JTable contentsTable;
    private javax.swing.JButton deleteAcount;
    private javax.swing.JButton editAcount;
    private javax.swing.JLabel infoArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel nameArea;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JTextField newUsername;
    private javax.swing.JButton saveAccount;
    private javax.swing.JButton settingsPage;
    private javax.swing.JCheckBox showPass;
    // End of variables declaration//GEN-END:variables
}
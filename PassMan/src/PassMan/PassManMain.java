package PassMan;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author WANDE
 */
public class PassManMain extends javax.swing.JFrame {
	private String key = "tisisthe16bitkey";
	
	/**
	 * Creates new form PassManMain
	 */
	public PassManMain() {
		initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        usnArea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        createAcctbtn = new javax.swing.JButton();
        infoArea = new javax.swing.JLabel();
        pasArea = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - PassMan");
        setBackground(new java.awt.Color(0, 102, 204));
        setResizable(false);

        nameArea.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        nameArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameArea.setText("PassMan: Encrypted Password Manager v1.00.01");
        nameArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        loginPanel.setBackground(new java.awt.Color(102, 204, 255));

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        loginBtn.setForeground(new java.awt.Color(0, 153, 0));
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        createAcctbtn.setText("create account");
        createAcctbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAcctbtnActionPerformed(evt);
            }
        });

        infoArea.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(usnArea)
                    .addComponent(jLabel3)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(createAcctbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginBtn))
                    .addComponent(infoArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasArea))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(infoArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usnArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(createAcctbtn))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String filePass = null, decFilePass = null;
		
		if(usnArea.getText().isEmpty() || pasArea.getPassword().length < 1 ){
			infoArea.setText("Username and Password required");
		}else{
			String username = usnArea.getText();
			char[] password = pasArea.getPassword();
			
			String filepath = username + ".psm";
			FileReader fReader = null;
			try {
				fReader = new FileReader(filepath);
			} catch (FileNotFoundException ex) {
				infoArea.setText("Could not find this account");
				//Logger.getLogger(PassManMain.class.getName()).log(Level.SEVERE, null, ex);
			}
			BufferedReader bReader = new BufferedReader(fReader);
			try {
				filePass = bReader.readLine();
			} catch (IOException ex) {
				infoArea.setText("Account may be corrupt");
				//Logger.getLogger(PassManMain.class.getName()).log(Level.SEVERE, null, ex);
			}
			try {
				bReader.close();
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(null, "Could not close account file");
				//Logger.getLogger(PassManMain.class.getName()).log(Level.SEVERE, null, ex);
			}
			Crypt decryptPass = new Crypt(key);
			try {
				decFilePass = decryptPass.decrypt(filePass);
			} catch (Exception ex) {
				infoArea.setText("Could not decrypt account");
				//Logger.getLogger(PassManMain.class.getName()).log(Level.SEVERE, null, ex);
			}
			if( Arrays.equals(password, decFilePass.toCharArray()) ){
				//decrypted password in file and password entered are the same
				dispose();
				Passwords passwordsPage = new Passwords();
				passwordsPage.setAcctName(username);
				passwordsPage.setVisible(true);
				passwordsPage.onView();
			}else{
				infoArea.setText("Incorrect username or password");
				pasArea.setText("");
			}
		}
    }//GEN-LAST:event_loginBtnActionPerformed

    private void createAcctbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAcctbtnActionPerformed
        dispose();
		CreateAccount newAcct = new CreateAccount();
		newAcct.setVisible(true);
    }//GEN-LAST:event_createAcctbtnActionPerformed

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
			java.util.logging.Logger.getLogger(PassManMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PassManMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PassManMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PassManMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PassManMain().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAcctbtn;
    private javax.swing.JLabel infoArea;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel nameArea;
    private javax.swing.JPasswordField pasArea;
    private javax.swing.JTextField usnArea;
    // End of variables declaration//GEN-END:variables
}

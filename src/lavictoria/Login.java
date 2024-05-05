/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavictoria;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 11a10
 */
public class Login extends javax.swing.JDialog {

    private Connection conn;
    private Statement stmt;

    public Login(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.yellow);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "12345");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuarioC = new javax.swing.JTextField();
        entrarB = new javax.swing.JButton();
        contraseñaC = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        recuperaL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("La Victoria");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        entrarB.setText("Entrar");
        entrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBActionPerformed(evt);
            }
        });

        jLabel4.setText("¿Olvidaste tu contraseña? ");

        recuperaL.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        recuperaL.setForeground(new java.awt.Color(0, 51, 255));
        recuperaL.setText("Recuperala aquí");
        recuperaL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                recuperaLMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(usuarioC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contraseñaC, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(entrarB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recuperaL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel5)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usuarioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contraseñaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(recuperaL))
                .addGap(18, 18, 18)
                .addComponent(entrarB)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void entrarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBActionPerformed
        String nombre = usuarioC.getText().toString();
        boolean senal = false;
        String cont = contraseñaC.getText().toString();
        if (nombre.equals("") && cont.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa tu usuario y contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (nombre.equals("") || cont.equals("")) {
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa tu usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (cont.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa tu contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Usuario");
                while (rs.next()) {
                    if (nombre.equals(rs.getString("nombre_u"))) {
                        senal = true;
                    }
                }
                if (senal == true) {
                    rs = stmt.executeQuery("SELECT contrasena FROM Usuario WHERE nombre_u ='" + nombre + "'");
                    if (rs.next()) {
                        if (rs.getString(1).equals(contraseñaC.getText())) {
                            rs = stmt.executeQuery("SELECT rol FROM Usuario WHERE nombre_u ='" + nombre + "'");
                            if (rs.next()) {
                                if (rs.getString(1).equals("empleado")) {
                                    //////////////////////////////////
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
                                        java.util.logging.Logger.getLogger(Empleado.class
                                                .getName()).log(java.util.logging.Level.SEVERE, null, ex);

                                    } catch (InstantiationException ex) {
                                        java.util.logging.Logger.getLogger(Empleado.class
                                                .getName()).log(java.util.logging.Level.SEVERE, null, ex);

                                    } catch (IllegalAccessException ex) {
                                        java.util.logging.Logger.getLogger(Empleado.class
                                                .getName()).log(java.util.logging.Level.SEVERE, null, ex);

                                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                        java.util.logging.Logger.getLogger(Empleado.class
                                                .getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                    }
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>

                                    /* Create and display the dialog */
                                    java.awt.EventQueue.invokeLater(new Runnable() {
                                        public void run() {
                                            Empleado dialog = null;
                                            try {
                                                dialog = new Empleado(new javax.swing.JFrame(), true, nombre);

                                            } catch (SQLException ex) {
                                                Logger.getLogger(Empleado.class
                                                        .getName()).log(Level.SEVERE, null, ex);
                                            }
                                            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                                @Override
                                                public void windowClosing(java.awt.event.WindowEvent e) {
                                                    System.exit(0);
                                                }
                                            });
                                            dialog.setVisible(true);
                                        }
                                    });
                                } else {
                                    ////////////////////////////////

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
                                        java.util.logging.Logger.getLogger(Gerente.class
                                                .getName()).log(java.util.logging.Level.SEVERE, null, ex);

                                    } catch (InstantiationException ex) {
                                        java.util.logging.Logger.getLogger(Gerente.class
                                                .getName()).log(java.util.logging.Level.SEVERE, null, ex);

                                    } catch (IllegalAccessException ex) {
                                        java.util.logging.Logger.getLogger(Gerente.class
                                                .getName()).log(java.util.logging.Level.SEVERE, null, ex);

                                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                        java.util.logging.Logger.getLogger(Gerente.class
                                                .getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                    }
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>
                                    //</editor-fold>

                                    /* Create and display the dialog */
                                    java.awt.EventQueue.invokeLater(new Runnable() {
                                        public void run() {
                                            Gerente dialog = null;
                                            try {
                                                dialog = new Gerente(new javax.swing.JFrame(), true, nombre);

                                            } catch (SQLException ex) {
                                                Logger.getLogger(Gerente.class
                                                        .getName()).log(Level.SEVERE, null, ex);
                                            }
                                            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                                @Override
                                                public void windowClosing(java.awt.event.WindowEvent e) {
                                                    System.exit(0);
                                                }
                                            });
                                            dialog.setVisible(true);
                                        }
                                    });
                                }
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_entrarBActionPerformed

    private void recuperaLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recuperaLMousePressed
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
            java.util.logging.Logger.getLogger(RecuperaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecuperaContraseña dialog = null;
                try {
                    dialog = new RecuperaContraseña(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(RecuperaContraseña.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        // System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_recuperaLMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = null;
                try {
                    dialog = new Login(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField contraseñaC;
    public javax.swing.JButton entrarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel recuperaL;
    public javax.swing.JTextField usuarioC;
    // End of variables declaration//GEN-END:variables
}

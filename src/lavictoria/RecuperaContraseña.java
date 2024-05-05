/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package lavictoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author 11a10
 */
public class RecuperaContraseña extends javax.swing.JDialog {

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    public RecuperaContraseña(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "12345");
        stmt = conn.createStatement();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarioC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        correoC = new javax.swing.JTextField();
        enviarB = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 204));
        jLabel1.setText("Ingresa tu nombre de usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Introduce el email a donde se enviará tu nueva contraseña");

        correoC.setBackground(new java.awt.Color(255, 204, 204));

        enviarB.setBackground(new java.awt.Color(255, 153, 255));
        enviarB.setText("Enviar");
        enviarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 255));
        jLabel13.setText("Recupera el acceso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(correoC, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(usuarioC, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel13)))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enviarB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(correoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(enviarB)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String generatePassword() {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Crear un StringBuilder para construir la contraseña
        StringBuilder password = new StringBuilder();

        // Generar cada dígito de la contraseña
        for (int i = 0; i < 5; i++) {
            // Generar un dígito aleatorio entre 0 y 9
            int digit = random.nextInt(10);
            // Agregar el dígito a la contraseña
            password.append(digit);
        }

        // Devolver la contraseña como una cadena de texto
        return password.toString();
    }
    private void enviarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBActionPerformed
        if (usuarioC.getText().equals("") || correoC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los datos", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            //buscar usuario
            String nombre = usuarioC.getText();
            boolean senal = false;
            try {
                rs = stmt.executeQuery("SELECT * FROM Usuario");
                while (rs.next()) {
                    if (nombre.equals(rs.getString("nombre_u"))) {
                        senal = true;
                        
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(RecuperaContraseña.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (senal == true) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres que te manden una nueva contraseña a tu correo?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    String password = generatePassword();

                    // Datos del remitente
                    String senderEmail = "11a10101z11@gmail.com";
                    String senderPassword = "ggvd qhjb eytu uklo";

                    // Datos del destinatario
                    // String recipientEmail = "rossss25flor@gmail.com";
                    String recipientEmail = correoC.getText();

                    // Configuración de propiedades para la conexión SMTP
                    Properties props = new Properties();
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.port", "587");

                    // Crear una autenticación para el remitente
                    Authenticator auth = new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(senderEmail, senderPassword);
                        }
                    };

                    // Crear sesión de correo
                    Session session = Session.getInstance(props, auth);

                    try {
                        // Crear un mensaje de correo electrónico
                        Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress(senderEmail));
                        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
                        message.setSubject("Recuperación de contraseña");
                        message.setText("Tu contraseña ahora es: " + password + " , recuerda que puedes cambiarla una vez que ingreses a la aplicación");

                        // Enviar el mensaje
                        Transport.send(message);
                        JOptionPane.showMessageDialog(null, " El correo se ha enviado, puedes revisar tu email");
                        //cambiar en bd
                        String sql = "update Usuario set contrasena = '" + password + "' where nombre_u ='" + nombre + "'";
                        try {
                            int rs = stmt.executeUpdate(sql);
                        } catch (SQLException ex) {
                            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } catch (MessagingException e) {
                        ///////////////////////////////////////////////////////////////////////////////////
                        System.out.println("Error al enviar el correo electrónico: " + e.getMessage());
                    }

                } else if (opcion == JOptionPane.NO_OPTION) {
                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Este usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_enviarBActionPerformed

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
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField correoC;
    private javax.swing.JButton enviarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuarioC;
    // End of variables declaration//GEN-END:variables
}

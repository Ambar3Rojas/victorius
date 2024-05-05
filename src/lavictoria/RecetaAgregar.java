package lavictoria;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 11a10
 */
public class RecetaAgregar extends javax.swing.JDialog {

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private DefaultTableModel modelo;

    public RecetaAgregar(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "12345");
        stmt = conn.createStatement();
        llenarProductos(productosCB);
        llenarCB(ingredienteCB, "Ingrediente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        productosCB = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        porcionesC = new javax.swing.JTextField();
        añadirR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tRecetas = new javax.swing.JTable();
        modificarIngr = new javax.swing.JButton();
        eliminarIngr = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ingredienteCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        agregarIngr = new javax.swing.JButton();
        cantidadC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel12.setBackground(new java.awt.Color(255, 255, 51));

        jLabel11.setText("Porciones");

        jLabel12.setText("Producto");

        productosCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige" }));

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 51));
        jLabel13.setText("Añade una receta");

        porcionesC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                porcionesCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(productosCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(porcionesC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel13)))
                .addContainerGap(507, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(porcionesC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productosCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        añadirR.setText("Añadir receta");
        añadirR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirRActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        tRecetas.setBackground(new java.awt.Color(204, 255, 204));
        tRecetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente", "Cantidad", "Medida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tRecetas);

        modificarIngr.setText("Modificar cantidad");
        modificarIngr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarIngrActionPerformed(evt);
            }
        });

        eliminarIngr.setText("Eliminar ingrediente");
        eliminarIngr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarIngrActionPerformed(evt);
            }
        });

        jLabel14.setText("Ingrediente");

        ingredienteCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige" }));

        jLabel1.setText("Cantidad");

        agregarIngr.setText("Agregar ingrediente");
        agregarIngr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIngrActionPerformed(evt);
            }
        });

        cantidadC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(modificarIngr, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eliminarIngr, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(ingredienteCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(agregarIngr)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingredienteCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(agregarIngr)
                    .addComponent(cantidadC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarIngr)
                    .addComponent(modificarIngr))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(añadirR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(añadirR)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarCB(JComboBox<String> nomComB, String Tabla) {
        String coso = nomComB.getSelectedItem().toString();
        nomComB.removeAllItems();
        nomComB.addItem(coso);
        try {
            rs = stmt.executeQuery("SELECT * FROM " + Tabla + "");
            while (rs.next()) {
                nomComB.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarProductos(JComboBox<String> nomComB) {
        String coso = nomComB.getSelectedItem().toString();
        nomComB.removeAllItems();
        nomComB.addItem(coso);
        try {
            rs = stmt.executeQuery("SELECT * FROM Producto where recet='" + 0 + "'");
            while (rs.next()) {
                nomComB.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listar() {
        String ingrediente = ingredienteCB.getSelectedItem().toString();
        boolean senal = false;
        modelo = (DefaultTableModel) tRecetas.getModel();
        Object renglon[] = new Object[3];
        for (int i = 0; i < tRecetas.getRowCount(); i++) {
            if (ingrediente.equals(tRecetas.getValueAt(i, 0))) {
                senal = true;
            }
        }
        if (senal == false) {
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT tipo_cantidad FROM Ingrediente where nombre='" + ingrediente + "'");
                while (rs.next()) {
                    renglon[0] = ingrediente;
                    renglon[1] = Double.parseDouble(cantidadC.getText().toString());
                    renglon[2] = rs.getString(1);
                    modelo.addRow(renglon);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
            tRecetas.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "Ese ingrediente ya se encuentra en la tabla", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void eliminarIngrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarIngrActionPerformed
        int fila = tRecetas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            modelo.removeRow(fila);
        }
    }//GEN-LAST:event_eliminarIngrActionPerformed

    private void añadirRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirRActionPerformed
        String producto = productosCB.getSelectedItem().toString();
        String porcionesCString = porcionesC.getText().toString();

        int filas = tRecetas.getRowCount();
        if (producto.equals("Elige") || porcionesCString.equals("") || filas == 0) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres agregar esta receta?", "Confirmación", JOptionPane.YES_NO_OPTION);
            // Comprobar la opción seleccionada
            if (opcion == JOptionPane.YES_OPTION) {
                /// poner porciones en receta que se crea
                int porciones = Integer.parseInt(porcionesCString);
                PreparedStatement ps;
                String sql = "insert into Receta(nombre,porciones) values(?,?)";
                try {
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, producto);
                    ps.setInt(2, porciones);
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
                ///buscar id de receta
                int idreceta = 0;
                try {
                    rs = stmt.executeQuery("SELECT idreceta FROM Receta WHERE nombre ='" + producto + "'");
                    while (rs.next()) {
                        idreceta = Integer.parseInt(rs.getString(1));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                /// actualizar id de receta en Producto
                String sql1 = "update Producto set recet = '" + idreceta + "' where nombrep ='" + producto + "'";
                try {
                    stmt = conn.createStatement();
                    int rs = stmt.executeUpdate(sql1);
                } catch (SQLException e) {
                    System.out.println(e);
                }

                ///insertar en utiliza los valores de la tabla
                for (int i = 0; i < filas; i++) {
                    String sql2 = "insert into Utiliza(idutilizar,idutilizai,cantidad_i) values(?,?,?)";
                    double canti = Double.parseDouble(tRecetas.getValueAt(i, 1).toString());

                    //buscar id del ingrediente
                    String ingre = tRecetas.getValueAt(i, 0).toString();
                    int idingrediente = 0;

                    try {
                        rs = stmt.executeQuery("SELECT idingrediente FROM Ingrediente WHERE nombre ='" + ingre + "'");
                        while (rs.next()) {
                            idingrediente = Integer.parseInt(rs.getString(1));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }

                    ///pone las consultas xd
                    try {
                        ps = conn.prepareStatement(sql2);
                        ps.setInt(1, idreceta);
                        ps.setInt(2, idingrediente);
                        ps.setDouble(3, canti);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Receta agregada");
                    } catch (SQLException ex) {
                        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else if (opcion == JOptionPane.NO_OPTION) {
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
            }
        }
    }//GEN-LAST:event_añadirRActionPerformed

    private void modificarIngrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarIngrActionPerformed
        if (tRecetas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            double cant = Double.parseDouble(tRecetas.getValueAt(tRecetas.getSelectedRow(), 1).toString());
            tRecetas.setValueAt(cant, tRecetas.getSelectedRow(), 1);
        }
    }//GEN-LAST:event_modificarIngrActionPerformed

    private void agregarIngrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngrActionPerformed
        if (ingredienteCB.getSelectedItem().toString().equals("Elige") || cantidadC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            listar();
            ingredienteCB.setSelectedIndex(0);
            cantidadC.setText("");
        }
    }//GEN-LAST:event_agregarIngrActionPerformed

    private void porcionesCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_porcionesCKeyTyped
        JTextField textField = porcionesC;
        String text = textField.getText();
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == '.' && text.indexOf('.') == -1) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_porcionesCKeyTyped

    private void cantidadCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadCKeyTyped
      JTextField textField = cantidadC;
        String text = textField.getText();
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == '.' && text.indexOf('.') == -1) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadCKeyTyped

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
            java.util.logging.Logger.getLogger(RecetaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecetaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecetaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecetaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecetaAgregar dialog = null;
                try {
                    dialog = new RecetaAgregar(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(RecetaAgregar.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton agregarIngr;
    private javax.swing.JButton añadirR;
    private javax.swing.JTextField cantidadC;
    private javax.swing.JButton eliminarIngr;
    private javax.swing.JComboBox<String> ingredienteCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarIngr;
    private javax.swing.JTextField porcionesC;
    private javax.swing.JComboBox<String> productosCB;
    private javax.swing.JTable tRecetas;
    // End of variables declaration//GEN-END:variables
}

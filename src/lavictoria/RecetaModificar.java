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
public class RecetaModificar extends javax.swing.JDialog {

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private String nombre;
    private String porciones;
    private int idreceta;
    private DefaultTableModel modelo;

    public RecetaModificar(java.awt.Frame parent, boolean modal, String nPr) throws SQLException {
        super(parent, modal);
        initComponents();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "12345");
        stmt = conn.createStatement();
        nombre = nPr;
        consultaRec();
        llenarCB(ingredienteCB, "Ingrediente");
        listar();
        listar2();
        productoL.setText(nombre);
        porcionesC.setText(porciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        porcionesC = new javax.swing.JTextField();
        productoL = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        modificarR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tRecetasM = new javax.swing.JTable();
        modificarIngr = new javax.swing.JButton();
        eliminarIngr = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ingredienteCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        agregarIngr = new javax.swing.JButton();
        cantidadC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel12.setBackground(new java.awt.Color(255, 255, 51));

        jLabel11.setText("Porciones");

        jLabel12.setText("Producto");

        porcionesC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                porcionesCKeyTyped(evt);
            }
        });

        productoL.setText("jLabel4");

        jLabel15.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 51));
        jLabel15.setText("Modifica una receta");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productoL)
                .addGap(194, 194, 194)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(porcionesC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(520, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(261, 261, 261)
                    .addComponent(jLabel15)
                    .addContainerGap(552, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(porcionesC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoL))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel15)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        modificarR.setText("Modificar receta");
        modificarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarRActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        tRecetasM.setBackground(new java.awt.Color(204, 255, 204));
        tRecetasM.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tRecetasM);

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

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 255));
        jLabel13.setText("Agrega otros ingredientes");

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
                        .addComponent(agregarIngr))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel13)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(modificarR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(modificarR)
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

    ///que solo se listen los productos que no tienen receta
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

    public void consultaRec() {
        try {
            rs = stmt.executeQuery("SELECT * FROM Receta where nombre='" + nombre + "'");
            while (rs.next()) {
                idreceta = Integer.parseInt(rs.getString(1));
                porciones = rs.getString(3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listar() {
        String ingrediente = ingredienteCB.getSelectedItem().toString();
        modelo = (DefaultTableModel) tRecetasM.getModel();
        Object renglon[] = new Object[3];
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Utiliza where idutilizar='" + idreceta + "'");
            while (rs.next()) {
                renglon[0] = rs.getString(2);
                renglon[1] = Double.parseDouble(rs.getString(3));
                modelo.addRow(renglon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        tRecetasM.setModel(modelo);
    }

    public void listar2() {
        for (int i = 0; i < tRecetasM.getRowCount(); i++) {
            String idi = tRecetasM.getValueAt(i, 0).toString();
            try {
                rs = stmt.executeQuery("SELECT * FROM Ingrediente where idingrediente=' " + idi + "'");
                while (rs.next()) {
                    tRecetasM.setValueAt(rs.getString(2), i, 0);
                    tRecetasM.setValueAt(rs.getString(4), i, 2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void eliminarIngrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarIngrActionPerformed
        int fila = tRecetasM.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            modelo.removeRow(fila);
        }
    }//GEN-LAST:event_eliminarIngrActionPerformed

    private void modificarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarRActionPerformed

        String porcionesCString = porcionesC.getText().toString();
        int filas = tRecetasM.getRowCount();
        if (porcionesCString.equals("") || filas == 0) {
            JOptionPane.showMessageDialog(null, "Elige ingredientes/porciones", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres modificar esta receta?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                /// cambiar porciones en receta 
                int porciones = Integer.parseInt(porcionesCString);
                PreparedStatement ps;
                String sql = "update Receta set porciones = '" + porciones + "' where idreceta ='" + idreceta + "'";
                try {
                    int rs = stmt.executeUpdate(sql);
                } catch (SQLException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }

//busqueda de ids
                int idin[] = new int[filas];
                for (int i = 0; i < filas; i++) {
                    try {
                        rs = stmt.executeQuery("SELECT idingrediente FROM Ingrediente where nombre='" + tRecetasM.getValueAt(i, 0) + "'");
                        while (rs.next()) {
                            idin[i] = Integer.parseInt(rs.getString(1));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                //borra valores de utiliza si hay xd
                String sql1 = "delete from Utiliza where idutilizar ='" + idreceta + "'";
                try {
                    stmt = conn.createStatement();
                    int rs = stmt.executeUpdate(sql1);
                } catch (SQLException e) {
                    System.out.println(e);
                }

                ///insertar en utiliza los valores de la tabla
                for (int i = 0; i < filas; i++) {
                    String sql2 = "insert into Utiliza(idutilizar,idutilizai,cantidad_i) values(?,?,?)";
                    double canti = Double.parseDouble(tRecetasM.getValueAt(i, 1).toString());
                    ///pone las consultas xd
                    try {
                        ps = conn.prepareStatement(sql2);
                        ps.setInt(1, idreceta);
                        ps.setInt(2, idin[i]);
                        ps.setDouble(3, canti);
                        ps.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                JOptionPane.showMessageDialog(null, "Receta modidificada");

            } else if (opcion == JOptionPane.NO_OPTION) {
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
            }
        }
    }//GEN-LAST:event_modificarRActionPerformed

    private void modificarIngrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarIngrActionPerformed
        if (tRecetasM.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            double cant = Double.parseDouble(tRecetasM.getValueAt(tRecetasM.getSelectedRow(), 1).toString());
            tRecetasM.setValueAt(cant, tRecetasM.getSelectedRow(), 1);
        }
    }//GEN-LAST:event_modificarIngrActionPerformed

    private void agregarIngrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngrActionPerformed
        String ingrediente = ingredienteCB.getSelectedItem().toString();
        boolean senal = false;
        modelo = (DefaultTableModel) tRecetasM.getModel();
        Object renglon[] = new Object[3];
        if (ingredienteCB.getSelectedItem().toString().equals("Elige") || cantidadC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los datos si deseas agregar ingredientes", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < tRecetasM.getRowCount(); i++) {
                if (tRecetasM.getValueAt(i, 0).equals(ingrediente)) {
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
                tRecetasM.setModel(modelo);
                ingredienteCB.setSelectedIndex(0);
                cantidadC.setText("");
            } else {
                System.out.println("Ese ingrediente ya se encuentra en la tabla");
            }

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
                RecetaModificar dialog = null;
                try {
                    dialog = new RecetaModificar(new javax.swing.JFrame(), true, "Papas sin queso");
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
    private javax.swing.JTextField cantidadC;
    private javax.swing.JButton eliminarIngr;
    private javax.swing.JComboBox<String> ingredienteCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarIngr;
    private javax.swing.JButton modificarR;
    private javax.swing.JTextField porcionesC;
    private javax.swing.JLabel productoL;
    private javax.swing.JTable tRecetasM;
    // End of variables declaration//GEN-END:variables
}

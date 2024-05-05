/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavictoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 11a10
 */
public class IngredientesNecesarios extends javax.swing.JDialog {
    public Connection conn;
    public Statement stmt;
    private ResultSet rs;
    private DefaultTableModel modelo;
    private ArrayList<Double> lista1;
    private ArrayList<Integer> ingredientes;
    private ArrayList<Double> cantidad;

    public IngredientesNecesarios(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "12345");
        stmt = conn.createStatement();
        llenarProductos(productosCB_in);
        lista1 = new ArrayList<>();
        ingredientes = new ArrayList<>();
        cantidad = new ArrayList<>();

        unProducto(productosCB_in.getItemAt(1));
        for (int i = 2; i < productosCB_in.getItemCount(); i++) {
            masProducto(productosCB_in.getItemAt(i));
        }
        ingredientes();
    }

    public void llenarProductos(JComboBox<String> nomComB) {
        String coso = nomComB.getSelectedItem().toString();
        nomComB.removeAllItems();
        nomComB.addItem(coso);

        try {
            // Realiza una consulta para obtener todos los nombres de productos
            PreparedStatement ps = conn.prepareStatement("SELECT nombrep FROM Producto WHERE idproducto IN (SELECT id_p FROM mediadiaria)");
            ResultSet rs = ps.executeQuery();

            // Agrega los nombres de productos al JComboBox
            while (rs.next()) {
                nomComB.addItem(rs.getString("nombrep"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngredientesNecesarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tIn = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        productosCB_in = new javax.swing.JComboBox<>();
        aplicar_in = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        tIn.setBackground(new java.awt.Color(255, 255, 153));
        tIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente", "Cantidad", "Medida", "Hoy", "Ma;ana", "Pasado ma;ana"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tIn);

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 51));
        jLabel13.setText("Necesitas ingredientes?");

        jPanel20.setBackground(new java.awt.Color(255, 255, 51));

        jLabel14.setText("Producto");

        productosCB_in.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        aplicar_in.setText("Aplicar");
        aplicar_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicar_inActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productosCB_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(aplicar_in, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(productosCB_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aplicar_in))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void limpiar() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void masProducto(String nProducto) {
        int idreceta = 0;
        int idProducto = 0;
        try {
            //busca el id de receta del producto
            rs = stmt.executeQuery("SELECT * FROM Producto where nombrep ='" + nProducto + "'");
            while (rs.next()) {
                idProducto = Integer.parseInt(rs.getString(1));
                idreceta = Integer.parseInt(rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngredientesNecesarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        //busca en utiliza los ingredientes
        modelo = (DefaultTableModel) tIn.getModel();
        Object renglon[] = new Object[6];
        try {
            rs = stmt.executeQuery("SELECT * FROM Utiliza where idutilizar=' " + idreceta + "'");
            while (rs.next()) {
                ingredientes.add(Integer.parseInt(rs.getString(2)));
                cantidad.add(Double.parseDouble(rs.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //buscar media xd
        int media = 0;
        try {
            //busca el id de receta del producto
            rs = stmt.executeQuery("SELECT media FROM mediadiaria where id_p ='" + idProducto + "'");
            while (rs.next()) {
                media = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngredientesNecesarios.class.getName()).log(Level.SEVERE, null, ex);
        }
//poner ingrediente que no este
        boolean flag = true;
        for (int i = 0; i < ingredientes.size(); i++) {
            flag = true;
            for (int j = 0; j < tIn.getRowCount(); j++) {
                if (tIn.getValueAt(j, 0).toString().equals(ingredientes.get(i).toString())) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                renglon[0] = ingredientes.get(i);
                renglon[1] = 0;
                renglon[2] = 0;
                renglon[3] = 0;
                renglon[4] = 0;
                renglon[5] = 0;
                modelo.addRow(renglon);
            }
        }
        tIn.setModel(modelo);
        //calcular cuanto se necesita     
        for (int i = 0; i < tIn.getRowCount(); i++) {
            for (int j = 0; j < ingredientes.size(); j++) {
                if (tIn.getValueAt(i, 0).toString().equals(ingredientes.get(j).toString())) {
                    double d1 = Double.parseDouble(tIn.getValueAt(i, 3).toString());
                    double d2 = Double.parseDouble(tIn.getValueAt(i, 4).toString());
                    double d3 = Double.parseDouble(tIn.getValueAt(i, 5).toString());
                    tIn.setValueAt(d1 + (cantidad.get(j) * media), i, 3);
                    tIn.setValueAt(d2 + (cantidad.get(j) * media * 2), i, 4);
                    tIn.setValueAt(d3 + (cantidad.get(j) * media * 3), i, 5);
                }
            }

        }

        ingredientes.clear();
        cantidad.clear();
    }

    public void unProducto(String nProducto) {
                //borrar si hay algo xd
   if (tIn.getRowCount() != 0) {
            limpiar();
        }
   
        int idreceta = 0;
        int idProducto = 0;
        try {
            //busca el id de receta del producto
            rs = stmt.executeQuery("SELECT * FROM Producto where nombrep ='" + nProducto + "'");
            if (rs.next()) { 
                idProducto = Integer.parseInt(rs.getString(1));
                idreceta = Integer.parseInt(rs.getString(4));
            } else {
                System.out.println("El producto '" + nProducto + "' no fue encontrado en la base de datos.");
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngredientesNecesarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        //busca en utiliza los ingredientes
        modelo = (DefaultTableModel) tIn.getModel();
        Object renglon[] = new Object[1];
        try {
            rs = stmt.executeQuery("SELECT * FROM Utiliza where idutilizar=' " + idreceta + "'");
            while (rs.next()) {
                renglon[0] = rs.getString(2);
                lista1.add(Double.parseDouble(rs.getString(3)));
                modelo.addRow(renglon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        tIn.setModel(modelo);

        //buscar media xd
        int media = 0;
        try {
            //busca el id de receta del producto
            rs = stmt.executeQuery("SELECT media FROM mediadiaria where id_p ='" + idProducto + "'");
            while (rs.next()) {
                media = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngredientesNecesarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        //calcular cuanto se necesita     
        for (int i = 0; i < tIn.getRowCount(); i++) {
            tIn.setValueAt(lista1.get(i) * media, i, 3);
            tIn.setValueAt(lista1.get(i) * media * 2, i, 4);
            tIn.setValueAt(lista1.get(i) * media * 3, i, 5);
        }
        lista1.clear();
    }

    public void ingredientes() {
        //poner nombre, cantidades y medida de ingredientes
        if (tIn.getRowCount() != 0) {
            for (int i = 0; i < tIn.getRowCount(); i++) {
                int idIngrediente = Integer.parseInt(tIn.getValueAt(i, 0).toString());
                try {
                    rs = stmt.executeQuery("SELECT * FROM Ingrediente where idingrediente=' " + idIngrediente + "'");
                    while (rs.next()) {
                        tIn.setValueAt(rs.getString(2), i, 0);
                        tIn.setValueAt(rs.getDouble(3), i, 1);
                        tIn.setValueAt(rs.getString(4), i, 2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }


    private void aplicar_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicar_inActionPerformed
        if (tIn.getRowCount() != 0) {
            limpiar();
        }

        String nproducto = productosCB_in.getSelectedItem().toString();
        if (nproducto.equals("Todos")) {
            unProducto(productosCB_in.getItemAt(1));
            for (int i = 2; i < productosCB_in.getItemCount(); i++) {
                masProducto(productosCB_in.getItemAt(i));
            }
            ingredientes();
        } else {
            unProducto(nproducto);
            ingredientes();
        }
    }//GEN-LAST:event_aplicar_inActionPerformed

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
            java.util.logging.Logger.getLogger(IngredientesNecesarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngredientesNecesarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngredientesNecesarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngredientesNecesarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                IngredientesNecesarios dialog = null;
                try {
                    dialog = new IngredientesNecesarios(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(IngredientesNecesarios.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton aplicar_in;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> productosCB_in;
    public javax.swing.JTable tIn;
    // End of variables declaration//GEN-END:variables
}

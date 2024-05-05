package lavictoria;

import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class Gerente extends javax.swing.JDialog {

    private String Messoures[];
    private String Mesoure[];
    private Connection conn;
    private Statement stmt;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    private DefaultTableModel modelo3;
    private DefaultTableModel modelo4;
    private DefaultTableModel modelo5;
    private int idcatego;
    private String nomTP;
    private String nomTI;
    int filaAnterior = -1;
    int filaAnterior2 = -1;
    String nombUsuar;
    JDateChooser dateChooser;
    Date fechaActual;
    private ArrayList<Integer> ingredientes;
    private ArrayList<Double> cantidadIngred;
    private ArrayList<Double> cantidadIngredE;
    private ArrayList<Integer> ingredientes2;
    private ArrayList<Double> cantidadIngred2;
    private ArrayList<Double> cantidadIngredE2;

    public Gerente(java.awt.Frame parent, boolean modal, String usN) throws SQLException {
        super(parent, modal);
        dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd/MM/yyyy"); // Formato de fecha
        initComponents();
        dateChooser.setBounds(250, 73, 180, 25);
        jPanel25.add(dateChooser);

        dateChooser.setVisible(true);

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "12345");
        modelo = new DefaultTableModel();
        Messoures = new String[]{"Piezas", "Kilos", "Litros"};
        Mesoure = new String[]{"Pieza", "Kilo", "Litro"};
        idcatego = 0;
        for (int i = 0; i < Messoures.length; i++) {
            medidaCBi.addItem(Messoures[i]);
        }
        listar();
        llenarCBCat(categoriaV_p);
        llenarCBCat(categoriaCB_p);
        listarProductos();
        listarProductosMejor();
        listarRecetas();
        listarMediaD();
        llenarProductos(productosCB_md);
        nombUsuar = usN;
        usuarioLI.setText(nombUsuar);
        llenarCB(productoCBIngreso, "Producto");
        listarIngresos();

        tIngresos.getColumnModel().getColumn(2).setPreferredWidth(3);
        tIngresos.getColumnModel().getColumn(3).setPreferredWidth(1);
        tIngresos.getColumnModel().getColumn(5).setPreferredWidth(3);
        tIngresos.getColumnModel().getColumn(6).setPreferredWidth(3);
        tIngresos.getColumnModel().getColumn(0).setPreferredWidth(7);
        tIngresos.getColumnModel().getColumn(7).setPreferredWidth(3);
        fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String fechaFormateada = formatoFecha.format(fechaActual);
        jLabel31.setText("Hoy es: " + fechaFormateada);
        dateChooser.setDate(fechaActual);

        ingredientes = new ArrayList<>();
        cantidadIngred = new ArrayList<>();
        cantidadIngredE = new ArrayList<>();
        ingredientes2 = new ArrayList<>();
        cantidadIngred2 = new ArrayList<>();
        cantidadIngredE2 = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tIngresos = new javax.swing.JTable();
        agregarBIngresos = new javax.swing.JButton();
        modificarBIngresos = new javax.swing.JButton();
        eliminarBIngresos = new javax.swing.JButton();
        limpiarBIngresos = new javax.swing.JButton();
        productoCBIngreso = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        precioCIngresos = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cantidadCIngresos = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tipopagoCBIngresos = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        unDiaBIngresos = new javax.swing.JButton();
        verTodosIngresos = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tIngresos1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        registra = new javax.swing.JButton();
        cambiarContrasenaBI = new javax.swing.JButton();
        usuarioLI = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tIngredientes = new javax.swing.JTable();
        modificar_i = new javax.swing.JButton();
        eliminar_i = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        medidaCBi = new javax.swing.JComboBox<>();
        agregar_i = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cantidadCi = new javax.swing.JTextField();
        nombreCi = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        nIngredientesL = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tProductos = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        categoriaV_p = new javax.swing.JComboBox<>();
        aplicar_cp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        categoriaL = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        categoriaCB_p = new javax.swing.JComboBox<>();
        agregar_p = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        precio_p = new javax.swing.JTextField();
        nombre_p = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        modificar_p = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        eliminar_p = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tRecetas = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        ver_r = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        agregar_r = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        modificar_r = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        eliminar_r = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tMd = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        productosCB_md = new javax.swing.JComboBox<>();
        establecer_md = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        mediaC = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        modificar_md = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        eliminar_md = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 51, 51));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jTabbedPane1.setName(""); // NOI18N

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 153));
        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel25.setBackground(new java.awt.Color(255, 255, 153));

        tIngresos.setBackground(new java.awt.Color(255, 255, 153));
        tIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Precio", "Cantidad", "Tipo de pago", "Estado", "Total", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tIngresosMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tIngresos);
        if (tIngresos.getColumnModel().getColumnCount() > 0) {
            tIngresos.getColumnModel().getColumn(1).setResizable(false);
            tIngresos.getColumnModel().getColumn(2).setResizable(false);
        }

        agregarBIngresos.setText("Añadir");
        agregarBIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBIngresosActionPerformed(evt);
            }
        });

        modificarBIngresos.setText("Modificar");
        modificarBIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBIngresosActionPerformed(evt);
            }
        });

        eliminarBIngresos.setText("Eliminar");
        eliminarBIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBIngresosActionPerformed(evt);
            }
        });

        limpiarBIngresos.setText("Limpiar");
        limpiarBIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBIngresosActionPerformed(evt);
            }
        });

        productoCBIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige" }));
        productoCBIngreso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productoCBIngresoItemStateChanged(evt);
            }
        });

        jLabel9.setText("Producto");

        jLabel25.setText("Precio");

        precioCIngresos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioCIngresosKeyTyped(evt);
            }
        });

        jLabel26.setText("Cantidad");

        cantidadCIngresos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadCIngresosKeyTyped(evt);
            }
        });

        jLabel27.setText("Tipo de pago");

        tipopagoCBIngresos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige", "Efectivo", "Transferencia completa", "Transferencia pendiente" }));

        jLabel31.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 204, 51));
        jLabel31.setText("Hoy...");

        unDiaBIngresos.setText("Listar dia");
        unDiaBIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unDiaBIngresosActionPerformed(evt);
            }
        });

        verTodosIngresos.setText("Listar todos");
        verTodosIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTodosIngresosActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 204, 51));
        jLabel33.setText("Total:");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(unDiaBIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(verTodosIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel33)
                .addGap(146, 146, 146))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(productoCBIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioCIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadCIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel27)
                                .addGap(28, 28, 28)
                                .addComponent(tipopagoCBIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(limpiarBIngresos)
                .addGap(160, 160, 160)
                .addComponent(agregarBIngresos)
                .addGap(255, 255, 255)
                .addComponent(modificarBIngresos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarBIngresos)
                .addGap(114, 114, 114))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unDiaBIngresos)
                    .addComponent(verTodosIngresos)
                    .addComponent(jLabel33))
                .addGap(89, 89, 89)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(productoCBIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(precioCIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(cantidadCIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(tipopagoCBIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarBIngresos)
                    .addComponent(agregarBIngresos)
                    .addComponent(modificarBIngresos)
                    .addComponent(eliminarBIngresos))
                .addGap(41, 41, 41))
        );

        jTabbedPane3.addTab("Ventas", jPanel25);

        jPanel26.setBackground(new java.awt.Color(248, 178, 239));

        jLabel32.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 153));
        jLabel32.setText("Hoy...");

        tIngresos1.setBackground(new java.awt.Color(248, 178, 239));
        tIngresos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Precio", "Cantidad", "Tipo de pago", "Estado", "Total", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tIngresos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tIngresos1MousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(tIngresos1);
        if (tIngresos1.getColumnModel().getColumnCount() > 0) {
            tIngresos1.getColumnModel().getColumn(1).setResizable(false);
            tIngresos1.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setText("Confirmar");

        jButton2.setText("Eliminar");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel32))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jButton1)
                        .addGap(235, 235, 235)
                        .addComponent(jButton2))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel32)
                .addGap(94, 94, 94)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(67, 67, 67))
        );

        jTabbedPane3.addTab("Confirmar", jPanel26);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingresos", jPanel3);

        jPanel24.setBackground(new java.awt.Color(255, 255, 153));
        jPanel24.setForeground(new java.awt.Color(255, 255, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 255));
        jLabel4.setText("Bienvenido");

        registra.setText("Registrar nuevos empleados");
        registra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraActionPerformed(evt);
            }
        });

        cambiarContrasenaBI.setText("Cambiar contraseña");
        cambiarContrasenaBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContrasenaBIActionPerformed(evt);
            }
        });

        usuarioLI.setText("jLabel9");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(registra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(cambiarContrasenaBI)
                .addGap(166, 166, 166))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel4))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(usuarioLI)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(usuarioLI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registra)
                    .addComponent(cambiarContrasenaBI))
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inicio", jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane2.setBackground(new java.awt.Color(102, 255, 102));
        jTabbedPane2.setForeground(new java.awt.Color(255, 102, 102));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel6.setBackground(new java.awt.Color(255, 255, 153));
        jPanel6.setForeground(new java.awt.Color(255, 255, 153));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tIngredientes.setBackground(new java.awt.Color(255, 255, 153));
        tIngredientes.setForeground(new java.awt.Color(51, 51, 51));
        tIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Medida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tIngredientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tIngredientes);

        modificar_i.setText("Modificar");
        modificar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_iActionPerformed(evt);
            }
        });

        eliminar_i.setText("Eliminar");
        eliminar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_iActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setText("Nombre");

        jLabel2.setText("Cantidad");

        jLabel3.setText("Medida");

        medidaCBi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige" }));

        agregar_i.setText("Agregar");
        agregar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_iActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setText("Agrega un ingrediente");

        cantidadCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadCiKeyTyped(evt);
            }
        });

        nombreCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCiActionPerformed(evt);
            }
        });

        jPanel23.setBackground(new java.awt.Color(255, 204, 204));

        nIngredientesL.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        nIngredientesL.setText("Necesitas ingredientes? ");
        nIngredientesL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nIngredientesLMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nIngredientesL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(nIngredientesL, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreCi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cantidadCi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(medidaCBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(agregar_i)
                        .addGap(34, 34, 34)))
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medidaCBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregar_i)
                            .addComponent(cantidadCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(modificar_i)
                        .addGap(134, 134, 134)
                        .addComponent(eliminar_i))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificar_i)
                    .addComponent(eliminar_i))
                .addGap(49, 49, 49))
        );

        jTabbedPane2.addTab("Ingredientes", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 153));

        tProductos.setBackground(new java.awt.Color(255, 255, 153));
        tProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Receta", "Categoría"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tProductosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tProductos);

        jPanel11.setBackground(new java.awt.Color(255, 255, 51));

        categoriaV_p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        aplicar_cp.setText("Aplicar");
        aplicar_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicar_cpActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 51));
        jLabel8.setText("Visualiza por categoria");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(categoriaV_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(aplicar_cp))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel8)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aplicar_cp)
                    .addComponent(categoriaV_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));

        categoriaL.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        categoriaL.setText("Categoria");
        categoriaL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                categoriaLMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(categoriaL)
                .addGap(29, 29, 29))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(categoriaL)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 51));

        jLabel10.setText("Nombre");

        jLabel11.setText("Precio");

        jLabel12.setText("Categoria");

        categoriaCB_p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige" }));

        agregar_p.setText("Añadir");
        agregar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_pActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 51));
        jLabel13.setText("Añade un producto");

        precio_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precio_pKeyTyped(evt);
            }
        });

        nombre_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_p, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precio_p, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12)
                        .addGap(29, 29, 29)
                        .addComponent(categoriaCB_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)))
                .addComponent(agregar_p, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaCB_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregar_p)
                .addGap(21, 21, 21))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 51));

        modificar_p.setText("Modificar");
        modificar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_pActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 51));
        jLabel15.setText("Modifica");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(modificar_p, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(69, 69, 69))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar_p)
                .addGap(12, 12, 12))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 51));

        eliminar_p.setText("Eliminar");
        eliminar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_pActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 51));
        jLabel16.setText("Elimina");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(eliminar_p, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(69, 69, 69))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar_p)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane2.addTab("Productos", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 153));

        tRecetas.setBackground(new java.awt.Color(255, 255, 153));
        tRecetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Porciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tRecetas);

        jPanel15.setBackground(new java.awt.Color(255, 255, 51));

        ver_r.setText("Ver");
        ver_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_rActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 51));
        jLabel17.setText("Ver");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ver_r, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel17)))
                .addGap(36, 36, 36))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ver_r)
                .addGap(12, 12, 12))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 51));

        agregar_r.setText("Agregar");
        agregar_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_rActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 51));
        jLabel18.setText("Agregar receta");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(agregar_r, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar_r)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 51));

        modificar_r.setText("Modificar");
        modificar_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_rActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 51));
        jLabel19.setText("Modificar");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(modificar_r, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar_r)
                .addGap(12, 12, 12))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 51));

        eliminar_r.setText("Eliminar");
        eliminar_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_rActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 51));
        jLabel20.setText("Eliminar");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(eliminar_r, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar_r)
                .addGap(12, 12, 12))
        );

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("Recetas");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Recetas", jPanel8);

        jPanel1.setForeground(new java.awt.Color(255, 255, 153));

        jPanel19.setBackground(new java.awt.Color(255, 255, 153));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText(" Media diaria de productos");

        tMd.setBackground(new java.awt.Color(255, 255, 153));
        tMd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Media diaria vendida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tMd);

        jPanel20.setBackground(new java.awt.Color(255, 255, 51));

        jLabel14.setText("Producto");

        jLabel21.setText("Media");

        productosCB_md.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige" }));

        establecer_md.setText("Añadir");
        establecer_md.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                establecer_mdActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 204, 51));
        jLabel23.setText("Establece la madia diaria de un producto");

        mediaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mediaCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(175, 175, 175))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productosCB_md, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(mediaC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(establecer_md, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel21)
                    .addComponent(productosCB_md, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(establecer_md)
                    .addComponent(mediaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 51));

        modificar_md.setText("Modificar");
        modificar_md.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_mdActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 204, 51));
        jLabel22.setText("Modificar");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(modificar_md, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar_md)
                .addGap(12, 12, 12))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 51));

        eliminar_md.setText("Eliminar");
        eliminar_md.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_mdActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 204, 51));
        jLabel24.setText("Elimina");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(eliminar_md, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar_md)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Media diaria", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 207, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inventario", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1125, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("EgRESOS", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarCBCat(JComboBox<String> nomComB) {
        String coso = nomComB.getSelectedItem().toString();
        nomComB.removeAllItems();
        nomComB.addItem(coso);
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Categoria");
            while (rs.next()) {
                nomComB.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarCB(JComboBox<String> nomComB, String Tabla) {
        String coso = nomComB.getSelectedItem().toString();
        nomComB.removeAllItems();
        nomComB.addItem(coso);
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + Tabla + "");
            while (rs.next()) {
                nomComB.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listar() {
        modelo = (DefaultTableModel) tIngredientes.getModel();
        Object renglon[] = new Object[3];
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Ingrediente");
            while (rs.next()) {
                renglon[0] = rs.getString(2);
                renglon[1] = rs.getDouble(3);
                renglon[2] = rs.getString(4);
                modelo.addRow(renglon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        tIngredientes.setModel(modelo);
    }

    public void listarProductos() {
        modelo2 = (DefaultTableModel) tProductos.getModel();
        Object renglon[] = new Object[4];
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Producto");
            while (rs.next()) {
                renglon[0] = rs.getString(2);
                renglon[1] = rs.getDouble(3);
                renglon[2] = rs.getString(4);
                renglon[3] = rs.getString(5);
                modelo2.addRow(renglon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        tProductos.setModel(modelo2);
    }

    public void listarProductosMejor() {
        for (int f = 0; f < tProductos.getRowCount(); f++) {
            if (tProductos.getValueAt(f, 2).toString().equals("0")) {
                tProductos.setValueAt("No", f, 2);
            } else {
                tProductos.setValueAt("Si", f, 2);
            }

            int catt = Integer.parseInt(tProductos.getValueAt(f, 3).toString());
            ResultSet rs;
            try {
                rs = stmt.executeQuery("SELECT nombre FROM Categoria WHERE idcategoria ='" + catt + "'");
                while (rs.next()) {
                    tProductos.setValueAt(rs.getString(1), f, 3);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void listarRecetas() {
        modelo3 = (DefaultTableModel) tRecetas.getModel();
        Object renglon[] = new Object[3];
        try {
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM Receta");
            while (rs.next()) {
                renglon[0] = rs.getString(2);
                renglon[1] = rs.getInt(3);
                modelo3.addRow(renglon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        tRecetas.setModel(modelo3);
        ///
        for (int i = 0; i < tRecetas.getRowCount(); i++) {
            Object value = tRecetas.getValueAt(i, 0);
            if (value != null && value.toString().equals("0")) {
                modelo3.removeRow(i);
            }
        }
    }

    public void listarMediaD() {
        modelo4 = (DefaultTableModel) tMd.getModel();
        Object renglon[] = new Object[2];
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM mediaDiaria");
            while (rs.next()) {
                renglon[0] = rs.getInt(2);
                renglon[1] = rs.getInt(3);
                modelo4.addRow(renglon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        tMd.setModel(modelo4);
        ///
        for (int i = 0; i < tMd.getRowCount(); i++) {
            String value = tMd.getValueAt(i, 0).toString();
            //
            String nombP = "i";
            ResultSet rs;
            try {
                rs = stmt.executeQuery("SELECT nombrep FROM Producto WHERE idproducto ='" + value + "'");
                while (rs.next()) {
                    nombP = rs.getString(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            tMd.setValueAt(nombP, i, 0);
        }
    }

    public void listarIngresos() {
        modelo5 = (DefaultTableModel) tIngresos.getModel();
        Object renglon[] = new Object[8];
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Ingresos ORDER BY fecha");
            while (rs.next()) {
                renglon[0] = rs.getInt(1);
                renglon[1] = rs.getString(2);
                renglon[2] = rs.getDouble(3);
                renglon[3] = rs.getInt(4);
                renglon[4] = rs.getString(5);
                renglon[5] = rs.getString(6);
                renglon[6] = rs.getDouble(7);
                renglon[7] = rs.getString(9);
                modelo5.addRow(renglon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        tIngresos.setModel(modelo5);
        //
        for (int i = 0; i < tIngresos.getRowCount(); i++) {
            String value = tIngresos.getValueAt(i, 1).toString();
            //
            String nombP = "i";
            ResultSet rs;
            try {
                rs = stmt.executeQuery("SELECT nombrep FROM Producto WHERE idproducto ='" + value + "'");
                while (rs.next()) {
                    nombP = rs.getString(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            tIngresos.setValueAt(nombP, i, 1);
        }
    }

    public void limpiar() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void limpiar2() {
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            modelo2.removeRow(i);
            i = i - 1;
        }
    }

    public void limpiar3() {
        for (int i = 0; i < modelo3.getRowCount(); i++) {
            modelo3.removeRow(i);
            i = i - 1;
        }
    }

    public void limpiar4() {
        for (int i = 0; i < modelo4.getRowCount(); i++) {
            modelo4.removeRow(i);
            i = i - 1;
        }
    }

    public void limpiar5() {
        for (int i = 0; i < modelo5.getRowCount(); i++) {
            modelo5.removeRow(i);
            i = i - 1;
        }
    }

    public void llenarProductos(JComboBox<String> nomComB) {
        String coso = nomComB.getSelectedItem().toString();
        nomComB.removeAllItems();
        nomComB.addItem(coso);
        try {
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM Producto where recet!='" + 0 + "'");
            while (rs.next()) {
                nomComB.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificar() {
        int fila = tIngredientes.getSelectedRow();
        try {
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
            } else {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres modificar este ingrediente?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    String nom = tIngredientes.getValueAt(fila, 0).toString();
//buscar id 
                    int idIngrediente = 0;
                    try {
                        ResultSet rs = stmt.executeQuery("SELECT idingrediente FROM Ingrediente WHERE nombre ='" + nomTI + "'");
                        while (rs.next()) {
                            idIngrediente = Integer.parseInt(rs.getString(1));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                    //actualiza cantidad y nombre de ingrediente
                    String sql1 = "update Ingrediente set nombre = '" + nom + "' where idingrediente ='" + idIngrediente + "'";
                    double cant = Double.parseDouble(tIngredientes.getValueAt(fila, 1).toString());
                    String sql = "update Ingrediente set cantidad = " + cant + " where idingrediente ='" + idIngrediente + "'";
                    try {
                        stmt = conn.createStatement();
                        int rs2 = stmt.executeUpdate(sql1);
                        int rs = stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Ingrediente Actualizado");
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                } else if (opcion == JOptionPane.NO_OPTION) {
                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                }
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void agregar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_iActionPerformed
        String nombre = nombreCi.getText().toString();
        String cantidad0 = cantidadCi.getText().toString();
        String medida = medidaCBi.getSelectedItem().toString();
        double cantidad;
        boolean senal = false;
        if (nombre.equals("") || cantidad0.equals("") || medida.equals("Elige")) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cantidad = Double.parseDouble(cantidadCi.getText().toString());
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Ingrediente");
                while (rs.next()) {
                    if (nombre.toLowerCase().equals(rs.getString("nombre").toLowerCase())) {
                        JOptionPane.showMessageDialog(null, "Este ingrediente ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                        senal = true;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (senal == false) {
                //elegir si se añadirá
                int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres agregar este ingrediente?", "Confirmación", JOptionPane.YES_NO_OPTION);
                // Comprobar la opción seleccionada
                if (opcion == JOptionPane.YES_OPTION) {
                    PreparedStatement ps;
                    String sql = "insert into Ingrediente(nombre, cantidad, tipo_cantidad) values(?,?,?)";
                    try {
                        ps = conn.prepareStatement(sql);
                        ps.setString(1, nombre);
                        ps.setDouble(2, cantidad);
                        ps.setString(3, medida);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Ingrediente registrado");
                        limpiar();
                        listar();
                        nombreCi.setText("");
                        cantidadCi.setText("");
                        medidaCBi.setSelectedItem("Elige");
                    } catch (SQLException ex) {
                        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (opcion == JOptionPane.NO_OPTION) {
                    nombreCi.setText("");
                    cantidadCi.setText("");
                    medidaCBi.setSelectedItem("Elige");
                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                }
            }
        }
    }//GEN-LAST:event_agregar_iActionPerformed

    private void eliminar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_iActionPerformed
        if (tIngredientes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            int fila = tIngredientes.getSelectedRow();
            try {
                if (fila == -1) {
                    JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
                } else {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar este ingrediente?", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        String nom = tIngredientes.getValueAt(fila, 0).toString();
                        int idreceta = 0;
                        //buscar id
                        try {
                            stmt = conn.createStatement();
                            ResultSet rs = stmt.executeQuery("SELECT idingrediente FROM Ingrediente where nombre ='" + nom + "'");
                            while (rs.next()) {
                                idreceta = Integer.parseInt(rs.getString(1));
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //borrar primero el registro de la tabla  Registra por id
                        String sql2 = "delete from Registra where idregistrai ='" + idreceta + "'";
                        try {
                            stmt = conn.createStatement();
                            int rs = stmt.executeUpdate(sql2);
                        } catch (SQLException e) {
                            System.out.println(e);
                        }
                        //borra de utiliza
                        String sql3 = "delete from Utiliza where idutilizai ='" + idreceta + "'";
                        try {
                            stmt = conn.createStatement();
                            int rs = stmt.executeUpdate(sql3);

                        } catch (SQLException e) {
                            System.out.println(e);
                        }
//borra
                        String sql = "delete from Ingrediente where nombre ='" + nom + "'";
                        try {
                            stmt = conn.createStatement();
                            int rs = stmt.executeUpdate(sql);
                            JOptionPane.showMessageDialog(null, "Ingrediente eliminado");
                            limpiar();
                            listar();
                        } catch (SQLException e) {
                            System.out.println(e);
                        }
                    } else if (opcion == JOptionPane.NO_OPTION) {
                    } else if (opcion == JOptionPane.CANCEL_OPTION) {
                    }
                }
            } catch (HeadlessException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_eliminar_iActionPerformed

    private void modificar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_iActionPerformed
        modificar();
        limpiar();
        listar();
    }//GEN-LAST:event_modificar_iActionPerformed

    private void nombreCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCiActionPerformed
        // TODO add your handling code here:
        //////////////////////nadaaaaaaaaaaaaa
    }//GEN-LAST:event_nombreCiActionPerformed

    private void agregar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_pActionPerformed
        String nombre = nombre_p.getText().toString();
        String precioString = precio_p.getText().toString();
        String catEleccion = "";
        int idcatego = 0;
        double precio = 0.0;
        boolean senal = false;
        if (nombre.equals("") || precioString.equals("") || categoriaCB_p.getSelectedItem().equals("Elige")) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                precio = Double.parseDouble(precioString);
                catEleccion = categoriaCB_p.getSelectedItem().toString();
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Producto");
                while (rs.next()) {
                    if (nombre.toLowerCase().equals(rs.getString("nombrep").toLowerCase())) {
                        JOptionPane.showMessageDialog(null, "Este producto ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                        senal = true;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            /// cambiar id 
            ResultSet rs;
            try {
                rs = stmt.executeQuery("SELECT idcategoria FROM Categoria WHERE nombre ='" + catEleccion + "'");
                while (rs.next()) {
                    idcatego = Integer.parseInt(rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (senal == false) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres agregar este producto?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    PreparedStatement ps;
                    String sql = "insert into Producto(nombrep, precio,recet, catego) values(?,?,?,?)";
                    try {
                        ps = conn.prepareStatement(sql);
                        ps.setString(1, nombre);
                        ps.setDouble(2, precio);
                        // se agrega el 0 de receta para que no este null
                        ps.setInt(3, 0);
                        ps.setInt(4, idcatego);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Producto registrado");
                        nombre_p.setText("");
                        precio_p.setText("");
                        categoriaCB_p.setSelectedItem("Elige");
                        limpiar2();
                        listarProductos();
                        listarProductosMejor();
                        //listar en 
                    } catch (SQLException ex) {
                        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (opcion == JOptionPane.NO_OPTION) {
                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                }
            }
        }
    }//GEN-LAST:event_agregar_pActionPerformed

    private void nombre_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_pActionPerformed

    private void aplicar_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicar_cpActionPerformed
        limpiar2();
        idcatego = 0;
        String categoria = categoriaV_p.getSelectedItem().toString();
        boolean bandera = false;
        if (categoria.equals("Todos")) {
            listarProductos();
        } else {
///////buscar categoria
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Categoria");
                while (rs.next()) {
                    if (categoria.equals(rs.getString(2))) {
                        idcatego = Integer.parseInt(rs.getString(1));
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
///////lista de categorias
            try {
                Object renglon[] = new Object[4];
                ////listar ssegun categoria
                ResultSet rs = stmt.executeQuery("SELECT * FROM Producto WHERE catego ='" + idcatego + "'");
                while (rs.next()) {
                    renglon[0] = rs.getString(2);
                    renglon[1] = rs.getDouble(3);
                    renglon[2] = rs.getString(4);
                    renglon[3] = rs.getString(5);
                    modelo2.addRow(renglon);
                }
/////////si no hay productos de la categoria?
                tProductos.setModel(modelo2);
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        listarProductosMejor();
    }//GEN-LAST:event_aplicar_cpActionPerformed

    private void modificar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_pActionPerformed
        if (tProductos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            modificarp();
            limpiar2();
            listarProductos();
            listarProductosMejor();
        }
    }//GEN-LAST:event_modificar_pActionPerformed

    public void modificarp() {
        idcatego = 0;
        int fila = tProductos.getSelectedRow();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres modificar este producto?", "Confirmación", JOptionPane.YES_NO_OPTION);
        // Comprobar la opción seleccionada
        if (opcion == JOptionPane.YES_OPTION) {
            /// tomar valores de tabla 
            String nom = tProductos.getValueAt(fila, 0).toString();
            double pre = Double.parseDouble(tProductos.getValueAt(fila, 1).toString());
            String cat = "";
            if (!tProductos.getValueAt(fila, 3).toString().isEmpty()) {
                cat = tProductos.getValueAt(fila, 3).toString();
            }
            ///buscar id categoria
            try {
                ResultSet rs = stmt.executeQuery("SELECT idcategoria FROM Categoria WHERE nombre ='" + cat + "'");

                while (rs.next()) {
                    idcatego = Integer.parseInt(rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            //buscar id de producto
            int idPro = 0;
            try {
                ResultSet rs = stmt.executeQuery("SELECT idproducto FROM Producto WHERE nombrep ='" + nomTP + "'");

                while (rs.next()) {
                    idPro = Integer.parseInt(rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "update Producto set nombrep = '" + nom + "' where idproducto ='" + idPro + "'";
            System.out.println(nom);
            String sql2 = "update Producto set precio ='" + pre + "' where idproducto ='" + idPro + "'";
            String sql3 = "update Producto set catego = '" + idcatego + "' where idproducto ='" + idPro + "'";
            try {
                stmt = conn.createStatement();
                int rs = stmt.executeUpdate(sql);
                int rs2 = stmt.executeUpdate(sql2);
                if (idcatego != 0) {
                    int rs3 = stmt.executeUpdate(sql3);
                }
                JOptionPane.showMessageDialog(null, "Producto Actualizado");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {
        } else if (opcion == JOptionPane.CANCEL_OPTION) {
        }
    }
    private void eliminar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_pActionPerformed
        int fila = tProductos.getSelectedRow();
        try {
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
            } else {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar este producto?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    String nom = tProductos.getValueAt(fila, 0).toString();
//buscar id
                    int idPro = 0;
                    try {
                        stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT idproducto FROM Producto where nombrep ='" + nom + "'");
                        while (rs.next()) {
                            idPro = Integer.parseInt(rs.getString(1));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //eliminar de mediadiaria
                    String sql2 = "delete from mediadiaria where id_p ='" + idPro + "'";
                    try {
                        stmt = conn.createStatement();
                        int rs = stmt.executeUpdate(sql2);
                        limpiar4();
                        listarMediaD();
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
//elimina
                    String sql = "delete from Producto where nombrep ='" + nom + "'";
                    try {
                        stmt = conn.createStatement();
                        int rs = stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Producto eliminado");
                        limpiar2();
                        listarProductos();
                        listarProductosMejor();
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                } else if (opcion == JOptionPane.NO_OPTION) {
                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                }
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_eliminar_pActionPerformed

    private void ver_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_rActionPerformed
        int fila = -2;
        fila = tRecetas.getSelectedRow();
        if (tRecetas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            String receta = tRecetas.getValueAt(fila, 0).toString();
            //////////////////////abre ventana

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
                java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            /* Create and display the dialog */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    RecetaVer dialog = null;
                    try {
                        dialog = new RecetaVer(new javax.swing.JFrame(), true, receta);
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            //   System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_ver_rActionPerformed

    private void agregar_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_rActionPerformed
        ////////////////////////////abre RecetaAgregar

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
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        limpiar3();
                        listarRecetas();
                    }
                });
                dialog.setVisible(true);
            }
        });
        limpiar3();
        listarRecetas();
    }//GEN-LAST:event_agregar_rActionPerformed

    private void categoriaLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaLMousePressed
        //abre ventana categoria

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
            java.util.logging.Logger.getLogger(Categoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Categoria dialog = null;
                try {
                    dialog = new Categoria(new javax.swing.JFrame(), true);

                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        llenarCBCat(categoriaV_p);
                        llenarCBCat(categoriaCB_p);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_categoriaLMousePressed

    private void modificar_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_rActionPerformed
        //////////////////// abre ventana RecetaModificar
        int fila = -2;
        fila = tRecetas.getSelectedRow();
        if (tRecetas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            String receta = tRecetas.getValueAt(fila, 0).toString();
            //////////////////////abre ventana

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
                java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(RecetaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            /* Create and display the dialog */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    RecetaModificar dialog = null;
                    try {
                        dialog = new RecetaModificar(new javax.swing.JFrame(), true, receta);
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            limpiar3();
                            listarRecetas();

                        }
                    });
                    dialog.setVisible(true);
                }
            });
            limpiar3();
            listarRecetas();
        }
        limpiar3();
        listarRecetas();
    }//GEN-LAST:event_modificar_rActionPerformed

    private void eliminar_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_rActionPerformed
        int fila = -2;
        fila = tRecetas.getSelectedRow();
        if (tRecetas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar esta receta?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                String receta = tRecetas.getValueAt(fila, 0).toString();
                int idreceta = 0;
                boolean senal = false;
                boolean senal2 = false;
                ResultSet rs;
                // busca id Receta
                try {
                    rs = stmt.executeQuery("SELECT idreceta FROM Receta where nombre='" + receta + "'");
                    while (rs.next()) {
                        idreceta = Integer.parseInt(rs.getString(1));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }
                //busca en utiliza
                try {
                    rs = stmt.executeQuery("SELECT idutilizai FROM Utiliza where idutilizar='" + idreceta + "'");
                    while (rs.next()) {
                        senal = true;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }

                //solo si utiliza hay registro
                if (senal == true) {
                    /// eliminar utiliza 
                    String sql = "delete from Utiliza where idutilizar ='" + idreceta + "'";
                    try {
                        //   stmt = conn.createStatement();
                        int ms = stmt.executeUpdate(sql);
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                }
                int idpro = 0;
                //buscar id de producto
                try {
                    rs = stmt.executeQuery("SELECT idproducto FROM Producto where nombrep='" + receta + "'");
                    while (rs.next()) {
                        idpro = Integer.parseInt(rs.getString(1));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }

                //busca en medidiaria
                try {
                    rs = stmt.executeQuery("SELECT * FROM mediadiaria where id_p=' " + idpro + "'");
                    while (rs.next()) {
                        senal2 = true;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }

                //solo si medidiaria hay registro
                if (senal2 == true) {

                    /// eliminar utiliza 
                    String sql = "delete from mediadiaria where id_p =' " + idpro + "'";
                    try {
                        int ms = stmt.executeUpdate(sql);
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                }

                /// actualizar id de receta en Producto
                String sql1 = "update Producto set recet = '" + 0 + "' where recet ='" + idreceta + "'";
                try {
                    stmt = conn.createStatement();
                    int ns = stmt.executeUpdate(sql1);
                } catch (SQLException e) {
                    System.out.println(e);
                }

                ///eliminar receta
                String sql = "delete from Receta where idreceta ='" + idreceta + "'";
                try {
                    int ns = stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Receta eliminada");
                } catch (SQLException e) {
                    System.out.println(e);
                }
                limpiar3();
                listarRecetas();

                limpiar4();
                listarMediaD();

            } else if (opcion == JOptionPane.NO_OPTION) {
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
            }
        }
    }//GEN-LAST:event_eliminar_rActionPerformed

    private void tIngredientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tIngredientesMousePressed
        checkI(tIngredientes.getSelectedRow());
    }//GEN-LAST:event_tIngredientesMousePressed
    public void checkI(int fila) {
        if (fila != filaAnterior2) {
            nomTI = tIngredientes.getValueAt(tIngredientes.getSelectedRow(), 0).toString();
            filaAnterior2 = tIngredientes.getSelectedRow();
        } else {
        }
    }
    private void tProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductosMousePressed
        check(tProductos.getSelectedRow());
    }//GEN-LAST:event_tProductosMousePressed

    public void check(int fila) {
        if (fila != filaAnterior) {
            nomTP = tProductos.getValueAt(tProductos.getSelectedRow(), 0).toString();
            filaAnterior = tProductos.getSelectedRow();
        } else {
        }
    }
    private void tProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductosMouseEntered

    }//GEN-LAST:event_tProductosMouseEntered

    private void tProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tProductosMouseExited

    private void establecer_mdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_establecer_mdActionPerformed
        boolean bandera = false;
        String nProducto = productosCB_md.getSelectedItem().toString();
        if (nProducto.equals("Elige") || mediaC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los datos", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres establecer esta media diaria?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                //que no este en la tabla xd
                if (tMd.getRowCount() != 0) {
                    for (int i = 0; i < tMd.getRowCount(); i++) {
                        if (tMd.getValueAt(i, 0).equals(nProducto)) {
                            bandera = true;
                            JOptionPane.showMessageDialog(null, "Este producto ya cuenta con una media de venta diaria", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }

                if (bandera == false) {
                    int media = Integer.parseInt(mediaC.getText().toString());
                    //buscar id de producto
                    ResultSet rs;
                    int idProducto = 0;
                    try {
                        rs = stmt.executeQuery("SELECT idproducto FROM Producto WHERE nombrep ='" + nProducto + "'");
                        while (rs.next()) {
                            idProducto = Integer.parseInt(rs.getString(1));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }

                    //agrega en MediaDiaria
                    PreparedStatement ps;
                    String sql = "insert into mediadiaria(id_p,media) values(?,?)";
                    try {
                        ps = conn.prepareStatement(sql);
                        ps.setInt(1, idProducto);
                        ps.setInt(2, media);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Media diaria registrada");
                    } catch (SQLException ex) {
                        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    limpiar4();
                    listarMediaD();
                    productosCB_md.setSelectedItem("Elige");
                    mediaC.setText("");
                }
            } else if (opcion == JOptionPane.NO_OPTION) {
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
            }
        }
    }//GEN-LAST:event_establecer_mdActionPerformed

    private void modificar_mdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_mdActionPerformed
        int fila = tMd.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {

            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres modificar esta media diaria", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                int median = Integer.parseInt(tMd.getValueAt(fila, 1).toString());
                String nom = tMd.getValueAt(fila, 0).toString();
                //buscar idproducto
                ResultSet rs;
                int idProducto = 0;
                try {
                    rs = stmt.executeQuery("SELECT idproducto FROM Producto WHERE nombrep ='" + nom + "'");
                    while (rs.next()) {
                        idProducto = Integer.parseInt(rs.getString(1));
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

                String sql = "update mediadiaria set media = " + median + " where id_p ='" + idProducto + "'";
                try {
                    stmt = conn.createStatement();
                    int rsr = stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Media diaria modificada");
                    limpiar4();
                    listarMediaD();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            } else if (opcion == JOptionPane.NO_OPTION) {
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
            }
        }
    }//GEN-LAST:event_modificar_mdActionPerformed

    private void eliminar_mdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_mdActionPerformed
        int fila = tMd.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar esta media diaria?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                String nom = tMd.getValueAt(fila, 0).toString();
                //buscar idproducto
                ResultSet rs;
                int idProducto = 0;
                try {
                    rs = stmt.executeQuery("SELECT idproducto FROM Producto WHERE nombrep ='" + nom + "'");
                    while (rs.next()) {
                        idProducto = Integer.parseInt(rs.getString(1));
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                String sql = "delete from mediadiaria where id_p ='" + idProducto + "'";
                try {
                    stmt = conn.createStatement();
                    int rsr = stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Media diaria eliminada");
                    limpiar4();
                    listarMediaD();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            } else if (opcion == JOptionPane.NO_OPTION) {
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
            }
        }
    }//GEN-LAST:event_eliminar_mdActionPerformed

    private void nIngredientesLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nIngredientesLMousePressed
        ////abre ventana Ingredientes Necesarios
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

                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_nIngredientesLMousePressed

    private void cantidadCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadCiKeyTyped
        JTextField textField = cantidadCi;
        String text = textField.getText();
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == '.' && text.indexOf('.') == -1) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadCiKeyTyped

    private void precio_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_pKeyTyped
        JTextField textField = precio_p;
        String text = textField.getText();
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == '.' && text.indexOf('.') == -1) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_precio_pKeyTyped

    private void mediaCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mediaCKeyTyped
        JTextField textField = mediaC;
        String text = textField.getText();
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == '.' && text.indexOf('.') == -1) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_mediaCKeyTyped

    private void registraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraActionPerformed
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro dialog = null;
                try {
                    dialog = new Registro(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {

                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_registraActionPerformed

    private void cambiarContrasenaBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContrasenaBIActionPerformed
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
            java.util.logging.Logger.getLogger(CambiaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CambiaContraseña dialog = null;
                try {
                    dialog = new CambiaContraseña(new javax.swing.JFrame(), true, nombUsuar);
                } catch (SQLException ex) {
                    Logger.getLogger(CambiaContraseña.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }//GEN-LAST:event_cambiarContrasenaBIActionPerformed

    private void verTodosIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTodosIngresosActionPerformed
        limpiar5();
        listarIngresos();
        JOptionPane.showMessageDialog(null, "Ingresos existentes listados");
    }//GEN-LAST:event_verTodosIngresosActionPerformed

    private void unDiaBIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unDiaBIngresosActionPerformed
        java.util.Date selectedDate = dateChooser.getDate();
        if (selectedDate != null) {
            java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
            JOptionPane.showMessageDialog(null, "Fecha seleccionada: " + sqlDate + "");
            limpiar5();
            listarIngresosF(selectedDate);

            if (tIngresos.getRowCount() == 0) {
                limpiar5();
                listarIngresos();
                JOptionPane.showMessageDialog(null, "No hay registros en esta fecha");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una fecha", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_unDiaBIngresosActionPerformed

    private void cantidadCIngresosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadCIngresosKeyTyped
        JTextField textField = cantidadCIngresos;
        String text = textField.getText();
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadCIngresosKeyTyped

    private void precioCIngresosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioCIngresosKeyTyped
        JTextField textField = precioCIngresos;
        String text = textField.getText();
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == '.' && text.indexOf('.') == -1) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_precioCIngresosKeyTyped

    private void productoCBIngresoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productoCBIngresoItemStateChanged
        if (productoCBIngreso.getSelectedIndex() == 0) {
            precioCIngresos.setText("");
        } else {
            Object selectedItem = productoCBIngreso.getSelectedItem();
            String np;
            if (selectedItem != null) {
                np = selectedItem.toString();
                ResultSet rs;
                try {
                    rs = stmt.executeQuery("SELECT precio FROM Producto WHERE nombrep ='" + np + "'");
                    while (rs.next()) {
                        precioCIngresos.setText(rs.getString(1));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_productoCBIngresoItemStateChanged

    private void limpiarBIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBIngresosActionPerformed
        productoCBIngreso.setSelectedIndex(0);
        precioCIngresos.setText("");
        cantidadCIngresos.setText("");
        tipopagoCBIngresos.setSelectedIndex(0);
        dateChooser.setDate(fechaActual);
    }//GEN-LAST:event_limpiarBIngresosActionPerformed

    private void eliminarBIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBIngresosActionPerformed
        int fila = tIngresos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar esta venta?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                String nombP = tIngresos.getValueAt(fila, 1).toString();
                int cantidad = Integer.parseInt(tIngresos.getValueAt(fila, 3).toString());

                //aumentar en inventario, ingrediente
//buscar id receta por nombre
                int idr = 0;
                ResultSet rs1;
                try {
                    rs1 = stmt.executeQuery("SELECT * FROM Receta WHERE nombre ='" + nombP + "'");
                    while (rs1.next()) {

                        idr = rs1.getInt(1);
                        System.out.println("Consulta 1");
                        System.out.println(idr);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
//registros de utiliza
                ResultSet rs2;
                try {
                    rs2 = stmt.executeQuery("SELECT * FROM Utiliza WHERE idutilizar ='" + idr + "'");
                    while (rs2.next()) {
                        ingredientes.add(rs2.getInt(2));
                        cantidadIngred.add(rs2.getDouble(3));
                        System.out.println("Consulta 2");
                        System.out.println(rs2.getInt(2));
                        System.out.println(rs2.getDouble(3));

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
//buscar cantidad existente
                ResultSet rs3;
                try {
                    for (int i = 0; i < ingredientes.size(); i++) {
                        rs3 = stmt.executeQuery("SELECT cantidad FROM Ingrediente WHERE idingrediente ='" + ingredientes.get(i) + "'");
                        while (rs3.next()) {
                            System.out.println("Consulta 3");
                            cantidadIngredE.add(rs3.getDouble(1));
                            System.out.println(cantidadIngredE.get(i));
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
//calcular con utiliza y cantidad vendida
                for (int i = 0; i < ingredientes.size(); i++) {
                    double nuevacantidad = cantidadIngredE.get(i) + (cantidadIngred.get(i) * cantidad);
                    String sql1 = "update Ingrediente set cantidad = '" + nuevacantidad + "' where idingrediente ='" + ingredientes.get(i) + "'";
                    try {
                        System.out.println("Consulta 4");
                        System.out.println(nuevacantidad);
                        stmt = conn.createStatement();
                        int rs0 = stmt.executeUpdate(sql1);
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                    limpiar();
                    listar();
                }
                cantidadIngredE.clear();
                cantidadIngred.clear();
                ingredientes.clear();
                //eliminar
                int idIngreso = Integer.parseInt(tIngresos.getValueAt(fila, 0).toString());
                String sql1 = "delete from Ingresos where idingresos ='" + idIngreso + "'";
                try {
                    stmt = conn.createStatement();
                    int rss2 = stmt.executeUpdate(sql1);
                    limpiar5();
                    listarIngresos();
                    JOptionPane.showMessageDialog(null, "Venta eliminada");
                } catch (SQLException e) {
                    System.out.println(e);
                }

            } else if (opcion == JOptionPane.NO_OPTION) {
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
            }
        }
    }//GEN-LAST:event_eliminarBIngresosActionPerformed

    private void modificarBIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBIngresosActionPerformed
        int fila = tIngresos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            if (dateChooser.getDate() == null || productoCBIngreso.getSelectedIndex() == 0 || precioCIngresos.getText().equals("") || cantidadCIngresos.getText().equals("")
                    || tipopagoCBIngresos.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Debes ingresar datos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres modificar esta venta?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {

                    //buscar el id del producto
                    String nombP = productoCBIngreso.getSelectedItem().toString();
                    int idp = 0;
                    ResultSet rs;
                    try {
                        rs = stmt.executeQuery("SELECT idproducto FROM Producto WHERE nombrep ='" + nombP + "'");
                        while (rs.next()) {
                            idp = rs.getInt(1);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                    //
                    //tipopago y estado
                    String tipoPago;
                    String estado;
                    if (tipopagoCBIngresos.getSelectedItem().equals("Efectivo")) {
                        tipoPago = "Efectivo";
                        estado = "Pagado";
                    } else {
                        tipoPago = "Transferencia";
                        if (tipopagoCBIngresos.getSelectedItem().equals("Transferencia completa")) {
                            estado = "Pagado";
                        } else {
                            estado = "Pendiente";
                        }
                    }

                    //precio, cantidad, total
                    double precio = Double.parseDouble(precioCIngresos.getText());
                    int cantidad = Integer.parseInt(cantidadCIngresos.getText());
                    double total = precio * cantidad;

                    String nombPAnterior = tIngresos.getValueAt(fila, 1).toString();
                    int cantidadAnterior = Integer.parseInt(tIngresos.getValueAt(fila, 3).toString());

                    java.util.Date selectedDate = dateChooser.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String fechaFormateada = sdf.format(selectedDate); // 'selectedDate' es tu fecha de tipo java.util.Date
                    java.sql.Date sqlDate = java.sql.Date.valueOf(fechaFormateada);

                    ////////////////////////////////info de vieja venta
                    if (!nombP.equals(tIngresos.getValueAt(fila, 0).toString())) {
                        //decrementar en inventario, ingrediente
//buscar id receta por nombre
                        int idr = 0;
                        ResultSet rs1;
                        try {
                            rs1 = stmt.executeQuery("SELECT * FROM Receta WHERE nombre ='" + nombPAnterior + "'");
                            while (rs1.next()) {

                                idr = rs1.getInt(1);
                                System.out.println("Consulta 1v");
                                System.out.println(idr);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Gerente.class
                                    .getName()).log(Level.SEVERE, null, ex);
                        }
//registros de utiliza
                        ResultSet rs2;
                        try {
                            rs2 = stmt.executeQuery("SELECT * FROM Utiliza WHERE idutilizar ='" + idr + "'");
                            while (rs2.next()) {
                                ingredientes2.add(rs2.getInt(2));
                                cantidadIngred2.add(rs2.getDouble(3));
                                System.out.println("Consulta 2v");
                                System.out.println(rs2.getInt(2));
                                System.out.println(rs2.getDouble(3));

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Gerente.class
                                    .getName()).log(Level.SEVERE, null, ex);
                        }
//buscar cantidad existente
                        ResultSet rs3;
                        try {
                            for (int i = 0; i < ingredientes2.size(); i++) {
                                rs3 = stmt.executeQuery("SELECT cantidad FROM Ingrediente WHERE idingrediente ='" + ingredientes2.get(i) + "'");
                                while (rs3.next()) {
                                    System.out.println("Consulta 3v");
                                    cantidadIngredE2.add(rs3.getDouble(1));
                                    System.out.println(cantidadIngredE2.get(i));
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Gerente.class
                                    .getName()).log(Level.SEVERE, null, ex);
                        }
//calcular con utiliza y cantidad vendida
                        for (int i = 0; i < ingredientes2.size(); i++) {
                            double nuevacantidad = cantidadIngredE2.get(i) + (cantidadIngred2.get(i) * cantidadAnterior);
                            String sql1 = "update Ingrediente set cantidad = '" + nuevacantidad + "' where idingrediente ='" + ingredientes2.get(i) + "'";
                            try {
                                System.out.println("Consulta 4v");
                                System.out.println(nuevacantidad);
                                stmt = conn.createStatement();
                                int rs0 = stmt.executeUpdate(sql1);
                            } catch (SQLException e) {
                                System.out.println(e);
                            }
                            limpiar();
                            listar();
                        }
                        cantidadIngredE2.clear();
                        cantidadIngred2.clear();
                        ingredientes2.clear();

                    }
                    ////venta nueva
                    //decrementar en inventario, ingrediente
//buscar id receta por nombre
                    int idr = 0;
                    ResultSet rs1;
                    try {
                        rs1 = stmt.executeQuery("SELECT * FROM Receta WHERE nombre ='" + nombP + "'");
                        while (rs1.next()) {

                            idr = rs1.getInt(1);
                            System.out.println("Consulta 1n");
                            System.out.println(idr);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
//registros de utiliza
                    ResultSet rs2;
                    try {
                        rs2 = stmt.executeQuery("SELECT * FROM Utiliza WHERE idutilizar ='" + idr + "'");
                        while (rs2.next()) {
                            ingredientes.add(rs2.getInt(2));
                            cantidadIngred.add(rs2.getDouble(3));
                            System.out.println("Consulta 2n");
                            System.out.println(rs2.getInt(2));
                            System.out.println(rs2.getDouble(3));

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
//buscar cantidad existente
                    ResultSet rss3;
                    try {
                        for (int i = 0; i < ingredientes.size(); i++) {
                            rss3 = stmt.executeQuery("SELECT cantidad FROM Ingrediente WHERE idingrediente ='" + ingredientes.get(i) + "'");
                            while (rss3.next()) {
                                System.out.println("Consulta 3n");
                                cantidadIngredE.add(rss3.getDouble(1));
                                System.out.println(cantidadIngredE.get(i));
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
//calcular con utiliza y cantidad vendida
                    for (int i = 0; i < ingredientes.size(); i++) {
                        double nuevacantidad = cantidadIngredE.get(i) - (cantidadIngred.get(i) * cantidad);
                        String sql1 = "update Ingrediente set cantidad = '" + nuevacantidad + "' where idingrediente ='" + ingredientes.get(i) + "'";
                        try {
                            System.out.println("Consulta 4n");
                            System.out.println(nuevacantidad);
                            stmt = conn.createStatement();
                            int rs0 = stmt.executeUpdate(sql1);
                        } catch (SQLException e) {
                            System.out.println(e);
                        }
                        limpiar();
                        listar();
                    }
                    cantidadIngredE.clear();
                    cantidadIngred.clear();
                    ingredientes.clear();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    //actualizar
                    int idIngreso = Integer.parseInt(tIngresos.getValueAt(fila, 0).toString());
                    String sql1 = "update Ingresos set idpro = '" + idp + "' where idingresos ='" + idIngreso + "'";

                    String sql2 = "update Ingresos set precio = '" + precio + "' where idingresos ='" + idIngreso + "'";
                    String sql3 = "update Ingresos set cantidad = '" + cantidad + "' where idingresos ='" + idIngreso + "'";
                    String sql4 = "update Ingresos set tipo_pago = '" + tipoPago + "' where idingresos ='" + idIngreso + "'";
                    String sql5 = "update Ingresos set estado = '" + estado + "' where idingresos ='" + idIngreso + "'";
                    String sql6 = "update Ingresos set total = '" + total + "' where idingresos ='" + idIngreso + "'";
                    String sql7 = "update Ingresos set fecha = '" + sqlDate + "' where idingresos ='" + idIngreso + "'";
                    try {
                        stmt = conn.createStatement();
                        int rss2 = stmt.executeUpdate(sql1);
                        int rs3 = stmt.executeUpdate(sql2);
                        int rs4 = stmt.executeUpdate(sql3);
                        int rs5 = stmt.executeUpdate(sql4);
                        int rs6 = stmt.executeUpdate(sql5);
                        int rs7 = stmt.executeUpdate(sql6);
                        int rs8 = stmt.executeUpdate(sql7);
                        limpiar5();
                        listarIngresos();
                        productoCBIngreso.setSelectedIndex(0);
                        precioCIngresos.setText("");
                        cantidadCIngresos.setText("");
                        tipopagoCBIngresos.setSelectedIndex(0);
                        dateChooser.setDate(fechaActual);
                        JOptionPane.showMessageDialog(null, "Ingreso actualizado");

                    } catch (SQLException e) {
                        System.out.println(e);
                    }

                    //info de nueva venta
                } else if (opcion == JOptionPane.NO_OPTION) {
                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                }
            }

        }
    }//GEN-LAST:event_modificarBIngresosActionPerformed

    private void agregarBIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBIngresosActionPerformed

        if (dateChooser.getDate() == null || productoCBIngreso.getSelectedIndex() == 0 || precioCIngresos.getText().equals("") || cantidadCIngresos.getText().equals("")
                || tipopagoCBIngresos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres agregar esta venta?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                //buscar el id del producto
                String nombP = productoCBIngreso.getSelectedItem().toString();
                int idp = 0;
                ResultSet rs;
                try {
                    rs = stmt.executeQuery("SELECT idproducto FROM Producto WHERE nombrep ='" + nombP + "'");
                    while (rs.next()) {
                        idp = rs.getInt(1);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

                //tipopago y estado
                String tipoPago;
                String estado;
                if (tipopagoCBIngresos.getSelectedItem().equals("Efectivo")) {
                    tipoPago = "Efectivo";
                    estado = "Pagado";
                } else {
                    tipoPago = "Transferencia";
                    if (tipopagoCBIngresos.getSelectedItem().equals("Transferencia completa")) {
                        estado = "Pagado";
                    } else {
                        estado = "Pendiente";
                    }
                }

                //precio, cantidad, total
                double precio = Double.parseDouble(precioCIngresos.getText());
                int cantidad = Integer.parseInt(cantidadCIngresos.getText());
                double total = precio * cantidad;

                java.util.Date selectedDate = dateChooser.getDate();
                java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

                PreparedStatement ps;
                String sql = "insert into Ingresos(idpro,precio, cantidad, tipo_pago, estado,total, aprobado, fecha) values(?,?,?,?,?,?,?,?)";
                try {
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, idp);
                    ps.setDouble(2, precio);
                    ps.setInt(3, cantidad);
                    ps.setString(4, tipoPago);
                    ps.setString(5, estado);
                    ps.setDouble(6, total);
                    ps.setInt(7, 1);
                    ps.setDate(8, sqlDate);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Venta registrada");
                    limpiar5();
                    listarIngresos();

                    productoCBIngreso.setSelectedIndex(0);
                    precioCIngresos.setText("");
                    cantidadCIngresos.setText("");
                    tipopagoCBIngresos.setSelectedIndex(0);
                    dateChooser.setDate(fechaActual);

//decrementar en inventario, ingrediente
//buscar id receta por nombre
                    int idr = 0;
                    ResultSet rs1;
                    try {
                        rs1 = stmt.executeQuery("SELECT * FROM Receta WHERE nombre ='" + nombP + "'");
                        while (rs1.next()) {

                            idr = rs1.getInt(1);
                            System.out.println("Consulta 1");
                            System.out.println(idr);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
//registros de utiliza
                    ResultSet rs2;
                    try {
                        rs2 = stmt.executeQuery("SELECT * FROM Utiliza WHERE idutilizar ='" + idr + "'");
                        while (rs2.next()) {
                            ingredientes.add(rs2.getInt(2));
                            cantidadIngred.add(rs2.getDouble(3));
                            System.out.println("Consulta 2");
                            System.out.println(rs2.getInt(2));
                            System.out.println(rs2.getDouble(3));

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
//buscar cantidad existente
                    ResultSet rs3;
                    try {
                        for (int i = 0; i < ingredientes.size(); i++) {
                            rs3 = stmt.executeQuery("SELECT cantidad FROM Ingrediente WHERE idingrediente ='" + ingredientes.get(i) + "'");
                            while (rs3.next()) {
                                System.out.println("Consulta 3");
                                cantidadIngredE.add(rs3.getDouble(1));
                                System.out.println(cantidadIngredE.get(i));
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Gerente.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
//calcular con utiliza y cantidad vendida
                    for (int i = 0; i < ingredientes.size(); i++) {
                        double nuevacantidad = cantidadIngredE.get(i) - (cantidadIngred.get(i) * cantidad);
                        String sql1 = "update Ingrediente set cantidad = '" + nuevacantidad + "' where idingrediente ='" + ingredientes.get(i) + "'";
                        try {
                            System.out.println("Consulta 4");
                            System.out.println(nuevacantidad);
                            stmt = conn.createStatement();
                            int rs0 = stmt.executeUpdate(sql1);
                        } catch (SQLException e) {
                            System.out.println(e);
                        }
                        limpiar();
                        listar();
                    }
                    cantidadIngredE.clear();
                    cantidadIngred.clear();
                    ingredientes.clear();
                } catch (SQLException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (opcion == JOptionPane.NO_OPTION) {
            } else if (opcion == JOptionPane.CANCEL_OPTION) {
            }
        }
    }//GEN-LAST:event_agregarBIngresosActionPerformed

    private void tIngresosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tIngresosMousePressed
        int fila = tIngresos.getSelectedRow();

        if (fila == -1) {
            // JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            productoCBIngreso.setSelectedItem(tIngresos.getValueAt(fila, 1));
            precioCIngresos.setText(tIngresos.getValueAt(fila, 2).toString());
            cantidadCIngresos.setText(tIngresos.getValueAt(fila, 3).toString());

            Object valorCelda = tIngresos.getValueAt(fila, 7);
            if (valorCelda instanceof java.util.Date) {
                dateChooser.setDate((java.util.Date) valorCelda);
            } else if (valorCelda instanceof String) {
                try {
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date fecha = formatoFecha.parse((String) valorCelda);
                    dateChooser.setDate(fecha);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

            }

            if (tIngresos.getValueAt(fila, 4).equals("Efectivo")) {
                tipopagoCBIngresos.setSelectedItem(tIngresos.getValueAt(fila, 4));
            } else {
                if (tIngresos.getValueAt(fila, 5).equals("Pagado")) {
                    tipopagoCBIngresos.setSelectedItem("Transferencia completa");
                } else {
                    tipopagoCBIngresos.setSelectedItem("Transferencia pendiente");
                }
            }
        }
    }//GEN-LAST:event_tIngresosMousePressed

    private void tIngresos1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tIngresos1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tIngresos1MousePressed
    public void listarIngresosF(Date selectedDate) {
        modelo5 = (DefaultTableModel) tIngresos.getModel();
        Object renglon[] = new Object[8];
        try {
            // Crear un PreparedStatement para evitar la vulnerabilidad de SQL Injection
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Ingresos WHERE fecha = ?");
            // Establecer la fecha seleccionada como parámetro en el PreparedStatement
            pstmt.setDate(1, new java.sql.Date(selectedDate.getTime()));

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                renglon[0] = rs.getInt(1);
                renglon[1] = rs.getString(2);
                renglon[2] = rs.getDouble(3);
                renglon[3] = rs.getInt(4);
                renglon[4] = rs.getString(5);
                renglon[5] = rs.getString(6);
                renglon[6] = rs.getDouble(7);
                renglon[7] = rs.getString(9);
                modelo5.addRow(renglon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        tIngresos.setModel(modelo5);

        //
        for (int i = 0; i < tIngresos.getRowCount(); i++) {
            String value = tIngresos.getValueAt(i, 1).toString();
            //
            String nombP = "i";
            ResultSet rs;
            try {
                rs = stmt.executeQuery("SELECT nombrep FROM Producto WHERE idproducto ='" + value + "'");
                while (rs.next()) {
                    nombP = rs.getString(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gerente.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            tIngresos.setValueAt(nombP, i, 1);
        }
    }

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
                    dialog = new Gerente(new javax.swing.JFrame(), true, "admin");

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBIngresos;
    private javax.swing.JButton agregar_i;
    private javax.swing.JButton agregar_p;
    private javax.swing.JButton agregar_r;
    private javax.swing.JButton aplicar_cp;
    private javax.swing.JButton cambiarContrasenaBI;
    private javax.swing.JTextField cantidadCIngresos;
    private javax.swing.JTextField cantidadCi;
    private javax.swing.JComboBox<String> categoriaCB_p;
    private javax.swing.JLabel categoriaL;
    private javax.swing.JComboBox<String> categoriaV_p;
    private javax.swing.JButton eliminarBIngresos;
    private javax.swing.JButton eliminar_i;
    private javax.swing.JButton eliminar_md;
    private javax.swing.JButton eliminar_p;
    private javax.swing.JButton eliminar_r;
    private javax.swing.JButton establecer_md;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton limpiarBIngresos;
    private javax.swing.JTextField mediaC;
    private javax.swing.JComboBox<String> medidaCBi;
    private javax.swing.JButton modificarBIngresos;
    private javax.swing.JButton modificar_i;
    private javax.swing.JButton modificar_md;
    private javax.swing.JButton modificar_p;
    private javax.swing.JButton modificar_r;
    private javax.swing.JLabel nIngredientesL;
    private javax.swing.JTextField nombreCi;
    private javax.swing.JTextField nombre_p;
    private javax.swing.JTextField precioCIngresos;
    private javax.swing.JTextField precio_p;
    private javax.swing.JComboBox<String> productoCBIngreso;
    private javax.swing.JComboBox<String> productosCB_md;
    private javax.swing.JButton registra;
    private javax.swing.JTable tIngredientes;
    private javax.swing.JTable tIngresos;
    private javax.swing.JTable tIngresos1;
    private javax.swing.JTable tMd;
    private javax.swing.JTable tProductos;
    private javax.swing.JTable tRecetas;
    private javax.swing.JComboBox<String> tipopagoCBIngresos;
    private javax.swing.JButton unDiaBIngresos;
    private javax.swing.JLabel usuarioLI;
    private javax.swing.JButton verTodosIngresos;
    private javax.swing.JButton ver_r;
    // End of variables declaration//GEN-END:variables
}

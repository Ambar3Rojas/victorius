/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavictoria;

import com.toedter.calendar.JDateChooser;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 11a10
 */
public class LaVictoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JOptionPane.showMessageDialog(null, "Debes introducir todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
      JOptionPane.showMessageDialog(null, "Ingrediente eliminado");
        
    int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres agregar esta categoria?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {

                  
                } else if (opcion == JOptionPane.NO_OPTION) {
                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                }

/////
        JFrame frame = new JFrame("Selección de fecha");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Crear un JDateChooser
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd/MM/yyyy"); // Formato de fecha

        // Crear un botón para obtener la fecha seleccionada
        JButton button = new JButton("Obtener Fecha");
        button.addActionListener((ActionEvent e) -> {
            java.util.Date selectedDate = dateChooser.getDate();
            java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
            JOptionPane.showMessageDialog(frame, "Fecha seleccionada: " + sqlDate);
        });

        // Agregar el JDateChooser y el botón al marco
        frame.add(dateChooser);
        frame.add(button);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        Date fechaActual = new Date();

        // Crear un formato para la fecha y hora
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, dd MMMM yyyy");

        // Formatear la fecha y hora actual como una cadena
        String fechaFormateada = formatoFecha.format(fechaActual);

        // Mostrar la fecha y hora actual
        System.out.println("Hoy es: " + fechaFormateada);
    }
    

}

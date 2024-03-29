/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamofausto;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edgar
 */
public class ProcesosCobros extends javax.swing.JFrame {

    /**
     * Creates new form ProcesosCobros
     */
    public ProcesosCobros() {
        initComponents();
        setLocationRelativeTo(null);
              setResizable(false);
         this.getContentPane().setBackground(Color.WHITE);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        desde = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        hasta = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCobros = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Procesos de cobros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Desde");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        getContentPane().add(desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 207, -1));

        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Hasta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        getContentPane().add(hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 207, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 90, 40));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 122, 48));

        tablaCobros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id cobro", "Fecha cobro", "Id cliente", "Valor cobro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCobros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, 730, 190));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("VOLVER");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(desde.getCalendar()!=null && hasta.getCalendar()!=null ){
            MetodosGenerales generales = new MetodosGenerales();
            ArrayList vector = new ArrayList();
            DefaultTableModel  modelo =(DefaultTableModel) tablaCobros.getModel();
            modelo.setRowCount(0);
            tablaCobros.setModel(modelo);
            SimpleDateFormat formato = new SimpleDateFormat("MM/dd/YYYY");
            String fechaD=formato.format(desde.getCalendar().getTime());
            Date fechaDesde = new Date(fechaD);

            String fechaH=formato.format(hasta.getCalendar().getTime());
            Date fechaHasta = new Date(fechaH);
            vector=generales.LlenarTablaRangoFecha("Cobros_prestamos.txt",fechaDesde,fechaHasta,1);
            String datos [ ] = new String [4];
            for (int i = 0; i <vector.size(); i++) {
                if(vector.get(i).toString().split("~")[5].equals("false")){
                datos[0]=vector.get(i).toString().split("~")[0];
                datos[1]=vector.get(i).toString().split("~")[1];
                datos[2]=vector.get(i).toString().split("~")[2];
                datos[3]=vector.get(i).toString().split("~")[3];
                modelo.addRow(datos);
                }
               

            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           if(tablaCobros.getRowCount()==0){
                    JOptionPane.showMessageDialog(null,"La tabla de cobros esta vacia, por favor llenarlo","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                MetodosGenerales generales = new MetodosGenerales();
           
                 for(int i=0;i<tablaCobros.getRowCount();i++){
                     
                      ArrayList vector = generales.LlenarTablaCondicion("Detalles_Cobros.txt", 0,tablaCobros.getValueAt(i, 0).toString());
                      for(int j=0;j<vector.size();j++){
                          String cuotaPres  = generales.CuotaPrestamo(vector.get(i).toString().split("~")[2], vector.get(i).toString().split("~")[3]);
                          if(cuotaPres.equals("no")==false){
                              double valorCuota = Double.parseDouble(cuotaPres.split("~")[4]);
                              valorCuota -= Double.parseDouble(vector.get(i).toString().split("~")[4]);
                              String statusCuota="false";
                              if(valorCuota<=0.0){
                                  statusCuota="true";
                              }
                               cuotaPres = cuotaPres.split("~")[0]+"~"+cuotaPres.split("~")[1]+"~"+cuotaPres.split("~")[2]+"~"+cuotaPres.split("~")[3]+"~"+String.valueOf(valorCuota)+"~"+cuotaPres.split("~")[5]+"~"+cuotaPres.split("~")[6]+"~"+statusCuota;
                               generales.modificar("Cuotas_Prestamos.txt", cuotaPres.split("~")[0], cuotaPres);
                          
                          }
                      
                      }
                      
                      
                     String detalleCobro = generales.validarCondicion("Detalles_Cobros.txt", tablaCobros.getValueAt(i, 0).toString(), 0);
                     String prestamo = generales.validarID("Prestamos.txt", detalleCobro.split("~")[2]);
                     double balancePrestamo = Double.parseDouble(prestamo.split("~")[9]);
                     double valorCobro = Double.parseDouble(tablaCobros.getValueAt(i, 3).toString());
                     balancePrestamo -= valorCobro;
                     String statusPrestamo="false";
                     
                     if(balancePrestamo<=0.0){
                         statusPrestamo="true";
                     }
                     
                     prestamo=prestamo.split("~")[0]+"~"+prestamo.split("~")[1]+"~"+prestamo.split("~")[2]+"~"+statusPrestamo+"~"+prestamo.split("~")[4]+"~"+prestamo.split("~")[5]+"~"+
                                prestamo.split("~")[6]+"~"+prestamo.split("~")[7]+"~"+prestamo.split("~")[8]+"~"+balancePrestamo+"~"+prestamo.split("~")[10]+"~"+prestamo.split("~")[11]+"~"+prestamo.split("~")[12];
                        generales.modificarPrestamos("Prestamos.txt",prestamo.split("~")[0], prestamo);
                  }
                 
                  JOptionPane.showMessageDialog(null,"Los cobros se ha actualizado correctamente.");
                  DefaultTableModel  modelo =(DefaultTableModel) tablaCobros.getModel();
                  modelo.setRowCount(0);
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ProcesosCobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcesosCobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcesosCobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcesosCobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcesosCobros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser desde;
    private com.toedter.calendar.JDateChooser hasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCobros;
    // End of variables declaration//GEN-END:variables
}

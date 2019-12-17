
package prestamofausto;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class MantFiadores extends javax.swing.JFrame {
 String ruta="Fiadores.txt";
         
         /**
     * Creates new form MantFiadores
     */
    public MantFiadores() {
        initComponents();setLocationRelativeTo(null);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        materno = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        paterno = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        empresa = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ocupacion = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        hombre = new javax.swing.JRadioButton();
        mujer = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO FIADOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 600, 41));

        mensaje.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(51, 153, 255));
        mensaje.setText("CREANDO");
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 153, 255));
        jLabel17.setText("ID:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 170, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 153, 255));
        jLabel18.setText("Nombre:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        nombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 101, 220, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 153, 255));
        jLabel19.setText("Materno:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, -1, -1));

        materno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 210, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 153, 255));
        jLabel20.setText("Paterno:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        paterno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 220, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 153, 255));
        jLabel22.setText("Cédula");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        cedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 220, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 153, 255));
        jLabel21.setText("Dirección:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        direccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 220, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 153, 255));
        jLabel23.setText("Teléfono:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        telefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 480, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 153, 255));
        jLabel24.setText("Empresa");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        empresa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 459, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 153, 255));
        jLabel26.setText("Ocupación");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        ocupacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupacionActionPerformed(evt);
            }
        });
        getContentPane().add(ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 247, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 153, 255));
        jLabel27.setText("Sueldo");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        sueldo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 247, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 153, 255));
        jLabel25.setText("Sexo");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        buttonGroup1.add(hombre);
        hombre.setText("Hombre");
        hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombreActionPerformed(evt);
            }
        });
        getContentPane().add(hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        buttonGroup1.add(mujer);
        mujer.setText("Mujer");
        getContentPane().add(mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 190, 70));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VOLVER");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 117, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyPressed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        MetodosGenerales usuario= new MetodosGenerales();
        String consulta=usuario.validarID(ruta, id.getText());
        if(consulta.equals("no")){
            limpiarControles(false);
            mensaje.setText("CREANDO");
        }else{
            nombre.setText(consulta.split("~")[1]);
            paterno.setText(consulta.split("~")[2]);
            materno.setText(consulta.split("~")[3]);
            cedula.setText(consulta.split("~")[4]);
            direccion.setText(consulta.split("~")[5]);
            telefono.setText(consulta.split("~")[6]);
            empresa.setText(consulta.split("~")[7]);
            ocupacion.setText(consulta.split("~")[8]);
            sueldo.setText(consulta.split("~")[9]);
            if(consulta.split("~")[10].equals("True")) hombre.setSelected(true);
            else mujer.setSelected(true);
            mensaje.setText("Modificando");
        }
    }//GEN-LAST:event_idKeyReleased

    private void ocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ocupacionActionPerformed

    private void hombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(id.getText().equals("")==false && nombre.getText().equals("")==false  && materno.getText().equals("")==false && paterno.getText().equals("")==false  && cedula.getText().equals("")==false && direccion.getText().equals("")==false && telefono.getText().equals("")==false && empresa.getText().equals("")==false && ocupacion.getText().equals("")==false && sueldo.getText().equals("")==false && (hombre.isSelected() || mujer.isSelected()  ) ){
            MetodosGenerales general = new MetodosGenerales ();
            String sexo = hombre.isSelected() ? "True" : "False";
            String datos=id.getText()+"~"+nombre.getText()+"~"+paterno.getText()+"~"+materno.getText()+"~"+cedula.getText()+"~"+direccion.getText()+"~"+telefono.getText()+"~"+empresa.getText()+"~"+ocupacion.getText()+"~"+sueldo.getText()+"~"+sexo;
            if(mensaje.getText().equals("CREANDO")){
                general.registrar(ruta,datos);
                limpiarControles(true);
                mensaje.setText("CREANDO");
            }else{
                general.modificar(ruta,id.getText(),datos);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios, por favor llenarlo","Errro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void limpiarControles(boolean limpiarID){
           if(limpiarID){
               id.setText("");
           } 
            nombre.setText("");
            paterno.setText("");
            materno.setText("");
            direccion.setText("");
            telefono.setText("");
            empresa.setText("");
            ocupacion.setText( "");
            sueldo.setText("");
            cedula.setText("");
   }
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
            java.util.logging.Logger.getLogger(MantFiadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantFiadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantFiadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantFiadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantFiadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField empresa;
    private javax.swing.JRadioButton hombre;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JTextField materno;
    private javax.swing.JLabel mensaje;
    private javax.swing.JRadioButton mujer;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField ocupacion;
    private javax.swing.JTextField paterno;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}

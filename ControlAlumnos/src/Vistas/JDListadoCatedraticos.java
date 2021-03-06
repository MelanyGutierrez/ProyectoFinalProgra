/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Estudiante;
import Modelos.Catedratico;
import static Vistas.JDListadoAlumnos.tablita;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author romar
 */
public class JDListadoCatedraticos extends javax.swing.JDialog {
 DefaultTableModel Modelo = new DefaultTableModel();
    /**
     * Creates new form JDListadoCatedraticos
     */
    public JDListadoCatedraticos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Modelo.addColumn("ID");
        Modelo.addColumn("Nombres");
        Modelo.addColumn("Apellidos");
        Modelo.addColumn("Teléfono");
        Modelo.addColumn("Dirección");
        Modelo.addColumn("Correo electrónico");
       tablita.setModel(Modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        btnBuscar2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTele = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDire = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(550, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Listado de catedráticos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 21));

        btnBuscar.setText("Listado de catedráticos");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, 40));

        btnBuscar1.setText("Buscar catedrático");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 160, 40));

        jLabel2.setText("ID del catedrático");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 50, 20));

        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablita.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tablita);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 540, 230));

        btnBuscar2.setText("Limpiar");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 160, 40));

        jTabbedPane1.addTab("Catadráticos", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(541, 543));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nombres:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });
        jPanel2.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 185, -1));

        jLabel4.setText("Apellidos:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeKeyTyped(evt);
            }
        });
        jPanel2.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 185, -1));

        jLabel6.setText("Teléfono:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        txtTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleActionPerformed(evt);
            }
        });
        txtTele.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeleKeyTyped(evt);
            }
        });
        jPanel2.add(txtTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 185, -1));

        jLabel5.setText("Dirección:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));
        jPanel2.add(txtDire, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 185, -1));

        btnAgregar.setText("Modificar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAgregarKeyPressed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 100, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("Modificación de datos del catedrático");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 21));

        jLabel8.setText("Código:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        txtCod.setEnabled(false);
        jPanel2.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 185, -1));

        jLabel9.setText("Correo electrónico:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));
        jPanel2.add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 185, -1));

        jTabbedPane1.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Catedratico NC = new Catedratico();
        NC.ListarCatedraticos(Modelo);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
        
         if ((txtBusqueda.getText().equals(""))){
            
            javax.swing.JOptionPane.showMessageDialog(this,"No ingresó número de carnet. \n","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtBusqueda.requestFocus();
            
        }
        else{
        
            Catedratico NC = new Catedratico();
            NC.LimpiarLista(Modelo);
            NC.BuscarCatedratico(txtBusqueda.getText(),Modelo);
            txtBusqueda.setText("");
            
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        // TODO add your handling code here:
        Catedratico NC = new Catedratico();
        NC.LimpiarLista(Modelo);
        
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void txtTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if ((txtCod.getText().equals("")) || (txtNom.getText().equals("")) || (txtApe.getText().equals("")) || 
           (txtTele.getText().equals("")) || (txtDire.getText().equals("")) || (txtCor.getText().equals(""))){
            
            javax.swing.JOptionPane.showMessageDialog(this,"Llene todos los campos, por favor. \n","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtNom.requestFocus();
        }
        else{
        
            Catedratico NC = new Catedratico();
            JOptionPane.showMessageDialog(null, NC.ModificarCatedratico(Integer.parseInt(txtCod.getText()), txtNom.getText(), txtApe.getText(), txtTele.getText(),txtDire.getText(), txtCor.getText()));
            txtCod.setText("");
            txtNom.setText("");
            txtApe.setText("");
            txtTele.setText("");
            txtDire.setText("");
            txtCor.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAgregarKeyPressed
    
    }//GEN-LAST:event_btnAgregarKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fila=tablita.getSelectedRow();
        if(fila>=0){
            txtCod.setText(tablita.getValueAt(fila,0).toString());
            txtNom.setText(tablita.getValueAt(fila,1).toString());
            txtApe.setText(tablita.getValueAt(fila,2).toString());
            txtTele.setText(tablita.getValueAt(fila,3).toString());
            txtDire.setText(tablita.getValueAt(fila,4).toString());
            txtCor.setText(tablita.getValueAt(fila,5).toString());
        }else{
            JOptionPane.showMessageDialog(null,"No seleccionó la fila");
        }
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Catedratico NC = new Catedratico();
        DefaultTableModel Modelo =(DefaultTableModel)tablita.getModel();// obtener el modelo de la tabla
        String Codigo=(Modelo.getValueAt(tablita.getSelectedRow(),0)+"");
        JOptionPane.showMessageDialog(null, NC.EliminarCatedratico(Integer.parseInt(Codigo)));
     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyPressed
        
    }//GEN-LAST:event_txtBusquedaKeyPressed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'á' || c>'ú') && (c<'A' || c>'Z' ) && (c<'Á' || c>'Ú') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtNomKeyTyped

    private void txtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'á' || c>'ú') && (c<'A' || c>'Z' ) && (c<'Á' || c>'Ú') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtApeKeyTyped

    private void txtTeleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeleKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtTeleKeyTyped

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
            java.util.logging.Logger.getLogger(JDListadoCatedraticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDListadoCatedraticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDListadoCatedraticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDListadoCatedraticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDListadoCatedraticos dialog = new JDListadoCatedraticos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable tablita;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDire;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTele;
    // End of variables declaration//GEN-END:variables
}

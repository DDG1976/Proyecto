/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Sistema;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
/**
 *
 * @author diego
 */
public class AgregarUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarUsuarios
     */
    public AgregarUsuarios() {
        initComponents();
        cargardatosbd();
    }
    private void cargardatosbd(){
        try{
            String user = "root";
            String url = "jdbc:mysql://localhost:3306/";
            String password = "123456";
            String bd = "proyecto_final";
            String con = "com.mysql.cj.jdbc.Driver";
            
            Class.forName(con);
            Connection co = DriverManager.getConnection(url+bd,user,password);
            //JOptionPane.showMessageDialog(null, "Si se conecto");
             String query = "SELECT * FROM roles";
             Statement sql = co.createStatement();
             ResultSet datos = sql.executeQuery(query);
          while(datos.next()){
               comboTipoA.addItem(datos.getString(1));
             }
             /*datos.close();
         sql.close();*/
         co.close();
        }catch(ClassNotFoundException ex){
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuarioA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboTipoA = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtPasswordA = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtPasswordFA = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCerrarA = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agregar Usuarios");

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2);

        txtUsuarioA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioAKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuarioA);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setText("Tipo:");
        jPanel1.add(jLabel3);

        jPanel1.add(comboTipoA);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4);

        txtPasswordA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordAKeyTyped(evt);
            }
        });
        jPanel1.add(txtPasswordA);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel5.setText("Confirm Password:");
        jPanel1.add(jLabel5);

        txtPasswordFA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordFAKeyTyped(evt);
            }
        });
        jPanel1.add(txtPasswordFA);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Usuarios");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 50));

        btnCerrarA.setText("Cerrar");
        btnCerrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarAActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 100, 50));

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarAActionPerformed

    private void txtUsuarioAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioAKeyTyped
        // TODO add your handling code here:
        int letra12 = evt.getKeyChar();
        if ((letra12>=47 && letra12<=58)//Numeros
            ||(letra12>=97 && letra12<=122)//Letras minusculas
            || (letra12>=65 && letra12<=90)//letras mayusculas
            || (letra12==95)){//guion bajo _
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioAKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try{
                String user = "root";
                String url = "jdbc:mysql://localhost:3306/";
                String password = "123456";
                String bd = "proyecto_final";
                String con = "com.mysql.cj.jdbc.Driver";
               int P,CP;
               String Us,Tipo;
               Us=txtUsuarioA.getText();
               Tipo=(String) comboTipoA.getSelectedItem();
               P=txtPasswordA.getX();
               CP=txtPasswordFA.getX();
                Class.forName(con);
                Connection co = DriverManager.getConnection(url+bd,user,password);
                String query = "INSERT INTO usuarios VALUES(0,'"+Us+"','"+Tipo+"','"+P+"','"+CP+"')";
                 Statement sql=co.createStatement();
                 sql.execute(query);
                 JOptionPane.showMessageDialog(null, "El usuario se guardo correctamene");
             co.close(); 
               
              }catch(ClassNotFoundException ex){
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
         
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPasswordAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordAKeyTyped
        // TODO add your handling code here:
        
        int letra = evt.getKeyChar();
        //JOptionPane.showMessageDialog(null, letra);
        if ((letra>=47 && letra<=58)//Numeros
            ||(letra>=97 && letra<=122)//Letras minusculas
            || (letra>=65 && letra<=90)//letras mayusculas
            || (letra==95)){//guion bajo _
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordAKeyTyped

    private void txtPasswordFAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordFAKeyTyped
        // TODO add your handling code here:
        
        int letra = evt.getKeyChar();
        //JOptionPane.showMessageDialog(null, letra);
        if ((letra>=47 && letra<=58)//Numeros
            ||(letra>=97 && letra<=122)//Letras minusculas
            || (letra>=65 && letra<=90)//letras mayusculas
            || (letra==95)){//guion bajo _
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordFAKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarA;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboTipoA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtPasswordA;
    private javax.swing.JPasswordField txtPasswordFA;
    private javax.swing.JTextField txtUsuarioA;
    // End of variables declaration//GEN-END:variables

   
}

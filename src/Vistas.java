
import java.awt.*;
import java.math.BigInteger;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 25666
 */
public class Vistas extends javax.swing.JFrame {

    /**
     * Creates new form Vistas
     */
    public Vistas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/gato.png"));
        return retValue;
    }
    
    public RSA rsa;
    public boolean vaciop, vacioq, esprimop, esprimoq, itsok, largop, largoq;
    public Validaciones val = new Validaciones();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jPrivadaKey = new javax.swing.JTextField();
        jPublicaKey = new javax.swing.JTextField();
        MODn = new javax.swing.JTextField();
        pq = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jNumQ = new javax.swing.JTextField();
        jNumP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BGenerar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAMensaje = new javax.swing.JTextArea();
        BCalcular = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton4.setBackground(java.awt.Color.orange);
        jToggleButton4.setText("Descifrar Mensaje");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jToggleButton2.setBackground(java.awt.Color.orange);
        jToggleButton2.setText("Cifrar Mensaje");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Mensaje:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 20));

        jPrivadaKey.setEditable(false);
        jPrivadaKey.setBackground(java.awt.Color.white);
        jPrivadaKey.setForeground(new java.awt.Color(0, 0, 0));
        jPrivadaKey.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jPrivadaKey.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPrivadaKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrivadaKeyActionPerformed(evt);
            }
        });
        getContentPane().add(jPrivadaKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 70, 20));

        jPublicaKey.setEditable(false);
        jPublicaKey.setBackground(java.awt.Color.white);
        jPublicaKey.setForeground(new java.awt.Color(0, 0, 0));
        jPublicaKey.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        getContentPane().add(jPublicaKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 70, 20));

        MODn.setEditable(false);
        MODn.setBackground(java.awt.Color.white);
        MODn.setForeground(new java.awt.Color(0, 0, 0));
        MODn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        MODn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODnActionPerformed(evt);
            }
        });
        getContentPane().add(MODn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 70, 20));

        pq.setEditable(false);
        pq.setBackground(java.awt.Color.white);
        pq.setForeground(new java.awt.Color(0, 0, 0));
        pq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        pq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pqActionPerformed(evt);
            }
        });
        getContentPane().add(pq, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 70, 20));

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CIFRADO Y DESCIFRADO RSA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número p: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jNumQ.setForeground(new java.awt.Color(0, 0, 0));
        jNumQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jNumQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumQActionPerformed(evt);
            }
        });
        jNumQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNumQKeyTyped(evt);
            }
        });
        getContentPane().add(jNumQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 70, 20));

        jNumP.setForeground(new java.awt.Color(0, 0, 0));
        jNumP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jNumP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumPActionPerformed(evt);
            }
        });
        jNumP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNumPKeyTyped(evt);
            }
        });
        getContentPane().add(jNumP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 70, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número q:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modulo de  n:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        BGenerar.setBackground(java.awt.Color.orange);
        BGenerar.setText("Generar impares aleatorios");
        BGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(BGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(p - 1) × (q - 1): ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Llave privada (d):");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 100, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Llave publica(e):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        TAMensaje.setColumns(20);
        TAMensaje.setForeground(new java.awt.Color(0, 0, 0));
        TAMensaje.setRows(5);
        TAMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jScrollPane1.setViewportView(TAMensaje);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 320, 60));

        BCalcular.setBackground(java.awt.Color.orange);
        BCalcular.setText("Calcular valores");
        BCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Silva Juarez Alejandro 5IV8");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCalcularActionPerformed

        

        vaciop = val.estaVacio(jNumP.getText(), "Número P");
        vacioq = val.estaVacio(jNumQ.getText(), "Número Q");
        esprimop = val.esPrimo(jNumP.getText(), "Número P");
        esprimoq = val.esPrimo(jNumQ.getText(), "Número Q");
        largop = val.Tama(jNumP.getText(), "Número P");
        largoq = val.Tama(jNumQ.getText(), "Número Q");

     
        if(vaciop && vacioq && esprimop && esprimoq && largop && largoq){
            BigInteger p=new BigInteger(jNumP.getText());
            BigInteger q=new  BigInteger(jNumQ.getText());
            TAMensaje.setText("");
            rsa = new RSA(p, q,10);
            jPrivadaKey.setText(""+rsa.getD());
            jPublicaKey.setText(""+rsa.getE());
            MODn.setText(""+rsa.getP());
            pq.setText(""+rsa.getPhi());
        }

    }//GEN-LAST:event_BCalcularActionPerformed

    private void BGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGenerarActionPerformed

        rsa=new RSA(10);
        jNumP.setText(""+rsa.getP());
        jNumQ.setText(""+rsa.getQ());

    }//GEN-LAST:event_BGenerarActionPerformed

    private void jNumPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNumPKeyTyped

        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();

    }//GEN-LAST:event_jNumPKeyTyped

    private void jNumPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumPActionPerformed

    }//GEN-LAST:event_jNumPActionPerformed

    private void jNumQKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNumQKeyTyped

        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();

    }//GEN-LAST:event_jNumQKeyTyped

    private void jNumQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNumQActionPerformed

    private void pqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pqActionPerformed

    private void jPrivadaKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrivadaKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrivadaKeyActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

        itsok = val.estaVacio(TAMensaje.getText(), "Mensaje");

        if(jNumP.getText().isEmpty() || jNumQ.getText().isEmpty() || MODn.getText().isEmpty() || pq.getText().isEmpty() || jPublicaKey.getText().isEmpty() || jPrivadaKey.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Algun campo esta vacio");
            itsok = false;
        }

        if(itsok){
            BigInteger[] textoCifrado = rsa.cifrar(TAMensaje.getText());
            TAMensaje.setText("");
            for(int i=0; i<textoCifrado.length; i++) {
                TAMensaje.setText(TAMensaje.getText()+textoCifrado[i].toString()+"\t");
                if(i != textoCifrado.length-1)
                TAMensaje.setText(TAMensaje.getText()+"");
            }
        }

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed

        itsok = val.estaVacio(TAMensaje.getText(), "Mensaje");

        if(jNumP.getText().isEmpty() || jNumQ.getText().isEmpty() || MODn.getText().isEmpty() || pq.getText().isEmpty() || jPublicaKey.getText().isEmpty() || jPrivadaKey.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Algun campo esta vacio");
            itsok = false;
        }

        if(itsok){
            String letra="";

            StringTokenizer st=new StringTokenizer(TAMensaje.getText());
            BigInteger[] textoCifrado = new BigInteger[st.countTokens()];

            for(int i=0;i<textoCifrado.length;i++){
                letra = st.nextToken();
                textoCifrado[i]=new BigInteger(letra);
            }
            TAMensaje.setText(rsa.descifrar(textoCifrado));
        }

    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void MODnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MODnActionPerformed

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
            java.util.logging.Logger.getLogger(Vistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BCalcular;
    private javax.swing.JToggleButton BGenerar;
    private javax.swing.JTextField MODn;
    private javax.swing.JTextArea TAMensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNumP;
    private javax.swing.JTextField jNumQ;
    private javax.swing.JTextField jPrivadaKey;
    private javax.swing.JTextField jPublicaKey;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTextField pq;
    // End of variables declaration//GEN-END:variables

}

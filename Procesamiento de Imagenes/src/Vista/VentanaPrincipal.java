
package Vista;

import Controlador.Seleccionador;
import java.awt.Canvas;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


public class VentanaPrincipal extends javax.swing.JFrame {

    
    private BufferedImage imagenIzq;
    private BufferedImage imagenDer;
    private ImageIcon icon;
    private String escala = "";

    public VentanaPrincipal() {
        initComponents();
        setTitle("Medidor de distancia, camara-objetivo");
        icon = new ImageIcon(getClass().getResource("/Imagenes/IconoCamara.png"));
        this.setIconImage(icon.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        cnvFoto2 = new java.awt.Canvas();
        cnvFoto1 = new java.awt.Canvas();
        lblFoto1 = new javax.swing.JLabel();
        lblFoto2 = new javax.swing.JLabel();
        btnFoto1 = new javax.swing.JButton();
        btnFoto2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnProcess = new javax.swing.JButton();
        lblEnunRta = new javax.swing.JLabel();
        rbtnCM = new javax.swing.JRadioButton();
        rbtnM = new javax.swing.JRadioButton();
        rbtnMM = new javax.swing.JRadioButton();
        lblRTA = new javax.swing.JLabel();
        lblEscala = new javax.swing.JLabel();

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(cnvFoto2);
        cnvFoto2.setBounds(286, 39, 260, 290);
        getContentPane().add(cnvFoto1);
        cnvFoto1.setBounds(10, 39, 260, 290);

        lblFoto1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblFoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto1.setText("Imagen, Foco Derecho");
        getContentPane().add(lblFoto1);
        lblFoto1.setBounds(286, 11, 266, 18);

        lblFoto2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblFoto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto2.setText("Imagen, Foco Izquierdo");
        getContentPane().add(lblFoto2);
        lblFoto2.setBounds(10, 11, 266, 18);

        btnFoto1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnFoto1.setText("Seleccionar Foto Izq");
        btnFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoto1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnFoto1);
        btnFoto1.setBounds(50, 341, 192, 25);

        btnFoto2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnFoto2.setText("Seleccionar Foto Der");
        btnFoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoto2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnFoto2);
        btnFoto2.setBounds(323, 341, 192, 25);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(574, 0, 12, 375);

        btnProcess.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnProcess.setText("Procesar Imagenes");
        getContentPane().add(btnProcess);
        btnProcess.setBounds(592, 36, 198, 45);

        lblEnunRta.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblEnunRta.setText("La distancia hasta el objetivo es:");
        getContentPane().add(lblEnunRta);
        lblEnunRta.setBounds(592, 182, 198, 24);

        buttonGroup1.add(rbtnCM);
        rbtnCM.setText("Centimetros (cm)");
        rbtnCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCMActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnCM);
        rbtnCM.setBounds(611, 116, 160, 23);

        buttonGroup1.add(rbtnM);
        rbtnM.setText("Metros (m)");
        rbtnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnM);
        rbtnM.setBounds(611, 142, 160, 23);

        buttonGroup1.add(rbtnMM);
        rbtnMM.setText("Milimetros (mm)");
        rbtnMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMMActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnMM);
        rbtnMM.setBounds(611, 90, 160, 23);

        lblRTA.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        getContentPane().add(lblRTA);
        lblRTA.setBounds(592, 212, 130, 69);

        lblEscala.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        getContentPane().add(lblEscala);
        lblEscala.setBounds(732, 212, 58, 47);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMMActionPerformed
        escala = "mm";
        lblEscala.setText(escala);        
    }//GEN-LAST:event_rbtnMMActionPerformed

    private void rbtnCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCMActionPerformed
        escala = "cm";
        lblEscala.setText(escala);
    }//GEN-LAST:event_rbtnCMActionPerformed

    private void rbtnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMActionPerformed
        escala = "m";
        lblEscala.setText(escala);
    }//GEN-LAST:event_rbtnMActionPerformed

    
    private void btnFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoto1ActionPerformed
        Seleccionador s = new Seleccionador();
        imagenIzq = s.seleccionarImagen(this, cnvFoto1);
    }//GEN-LAST:event_btnFoto1ActionPerformed

    private void btnFoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoto2ActionPerformed
        Seleccionador s = new Seleccionador();
        imagenDer = s.seleccionarImagen(this, cnvFoto2);
    }//GEN-LAST:event_btnFoto2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto1;
    private javax.swing.JButton btnFoto2;
    private javax.swing.JButton btnProcess;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas cnvFoto1;
    private java.awt.Canvas cnvFoto2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEnunRta;
    private javax.swing.JLabel lblEscala;
    private javax.swing.JLabel lblFoto1;
    private javax.swing.JLabel lblFoto2;
    private javax.swing.JLabel lblRTA;
    private javax.swing.JRadioButton rbtnCM;
    private javax.swing.JRadioButton rbtnM;
    private javax.swing.JRadioButton rbtnMM;
    // End of variables declaration//GEN-END:variables
}

package Controlador;

import Vista.VentanaPrincipal;
import java.awt.Canvas;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Seleccionador {
    
    private BufferedImage imagenSeleccionada;
    
    public BufferedImage seleccionarImagen(VentanaPrincipal v, Canvas cnv){
        JFileChooser jc = new JFileChooser();
        File fileImagen;
        int returnVal = jc.showOpenDialog(v);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                fileImagen = jc.getSelectedFile();
                if(fileImagen.getName().indexOf(".jpg") != -1){
                    imagenSeleccionada = ImageIO.read(fileImagen);
                    ImageIcon imgIco = new ImageIcon(imagenSeleccionada);
                    Icon icono = new ImageIcon(imgIco.getImage().getScaledInstance(cnv.getWidth()+15, cnv.getHeight(), Image.SCALE_DEFAULT));
                    icono.paintIcon(jc, cnv.getGraphics(), 0, 0);
                    cnv.getGraphics().drawLine(0, 0, 10, 100);
                }else{
                    System.out.println("ERROR de tipo ");
                }
            } catch (IOException ex) {
                System.out.println("ERROR: "+ex);
            }
        }
        return imagenSeleccionada;
    }
    
}

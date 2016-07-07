

package Modelo;

import Controlador.Conexion;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.sql.*;
import Modelo.*;
import java.util.*;

/**
 *
 * @author Yonna
 */

public class fotoclass {

    private Image data;
        
    public fotoclass() {
        
    }
    //metodo que dada una cadena de bytes la convierte en una imagen con extension jpeg
    private Image ConvertirImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis; // File or InputStream
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        return reader.read(0, param);
    }
   
    //METODO PARA RECUPERAR LA IMAGEN DE LA BASE DE DATOS
    public Image recuperarfotos(String codigo) {

        try {
            PreparedStatement pstm = Conexion.Conecta().prepareStatement("SELECT FOTO FROM PERSONA WHERE CODE= ? ");
            pstm.setString(1, codigo);
            ResultSet res = pstm.executeQuery();
            int i = 0;
                while (res.next()) {
                    // se lee la cadena de bytes de la base de datos
                    byte[] b = res.getBytes("foto");
                    //esta cadena de bytes sera convertida en una imagen
                    data = ConvertirImagen(b);                   
                    i++;
                }
            res.close();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return data;
    }
}


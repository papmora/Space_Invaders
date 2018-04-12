package Interfaz;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Font;
import java.awt.FontFormatException;

/**
 * Clase Cargar, nos permite cargar los archivos multimedia
 *
 * @author pablo
 * @version 9.4.2018
 */


class Cargar {

    static BufferedImage CargarImagen(String ruta){

        try {

            return ImageIO.read(Cargar.class.getResource(ruta));

        }

        catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

    static Font CargarFuente(String ruta, int tamaño) {
        try {
            return Font.createFont(Font.TRUETYPE_FONT, Loader.class.getResourceAsStream(ruta)).deriveFont(Font.PLAIN, tamaño);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
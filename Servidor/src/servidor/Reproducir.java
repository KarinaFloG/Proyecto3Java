package servidor;
import java.io.File;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author kaariina
 */
public class Reproducir implements Runnable{
    String archivo;
    Clip sonido;


    public Reproducir(String archivo) {
        this.archivo = archivo;

        try {
            sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File(archivo)));
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public void run() {

        sonido.start();
        do {
            try {
                Thread.sleep(1100);
            } catch (Exception e) {
                System.out.println("no se puede det");
            }
        } while (sonido.isActive());
        sonido.close();

    }

    public void msn() {
        System.out.println("lncdsjnkcd");
    }
}



  

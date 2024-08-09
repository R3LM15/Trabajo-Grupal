import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class SonidoOnClick {

    private Clip clip;

    public SonidoOnClick() {
        cargarSonido("Sounds/escopetasonido.wav");
    }

    // Método para cargar el sonido desde un archivo
    private void cargarSonido(String ruta) {
        try {
            // Obtén el archivo de sonido
            File archivo = new File(ruta);
            // Crea un AudioInputStream desde el archivo
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivo);
            // Obtén un Clip
            clip = AudioSystem.getClip();
            // Abre el Clip con el AudioInputStream
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Método para reproducir el sonido
    private void reproducirSonido() {
        if (clip != null) {
            clip.setFramePosition(0); // Rewind to the beginning
            clip.start();
        }
    }

    // Método para crear una interfaz gráfica con un botón
    public void crearInterfaz() {
        JFrame frame = new JFrame("Sonido al Clic");
        JButton boton = new JButton("Haz clic aquí");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproducirSonido();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(boton);
        frame.setVisible(true);
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SonidoOnClick().crearInterfaz();
        });
    }
}

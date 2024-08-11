package DuckHunt;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
 


public class Pato {
    private int x, y, speedX, speedY;
    private BufferedImage duckImage;
    private BufferedImage cazadoImage;
    private BufferedImage[] frames;
    private int currentFrame;
    private int frameCount;
    private int frameDelay;
    private int frameDelayCounter;
    private boolean falling = false;
    private boolean cazado = false;
    private int velocidad = Juego.nivel * 2;

    //Sonidos
        private Clip cazadoSoundClip;
        private Clip caidaSoundClip;


    public Pato() {

        x = (int) (Math.random() * 800);
        y = (int) (Math.random() * 600);
        speedX = (int) (Math.random() * 10 - velocidad);
        speedY = (int) (Math.random() * 10 - velocidad);

        try {
            duckImage = ImageIO.read(new File("imagenes/patoimg.png"));
            cazadoImage = ImageIO.read(new File("imagenes/patocazado.png"));

            //escopeta
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sonido/shotgun.wav"));
            cazadoSoundClip = AudioSystem.getClip();
            cazadoSoundClip.open(audioInputStream);
            //caida
            AudioInputStream caidaAudioInputStream = AudioSystem.getAudioInputStream(new File("Sonido/Voicy_Duck-Flapping.wav"));
            caidaSoundClip = AudioSystem.getClip();
            caidaSoundClip.open(caidaAudioInputStream);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        int frameWidth = duckImage.getWidth() / 4; // Número de frames horizontalmente
        int frameHeight = duckImage.getHeight();
        frames = new BufferedImage[4];
        for (int i = 0; i < 4; i++) {
            frames[i] = duckImage.getSubimage(i * frameWidth, 0, frameWidth, frameHeight);
        }

        currentFrame = 0;
        frameCount = 4;
        frameDelay = 5; // Cambia el frame cada 5 actualizaciones
        frameDelayCounter = 0;
    }
    public void update() {
        if (!falling) {
            
            x += speedX;
            y += speedY;
    
            
            if (x < -frames[currentFrame].getWidth()) {
                x = 800; 
            } else if (x > 800) {
                x = -frames[currentFrame].getWidth(); 
            }
    
            if (y < -frames[currentFrame].getHeight()) {
                y = 600; 
            } else if (y > 600) {
                y = -frames[currentFrame].getHeight(); 
            }

            frameDelayCounter++;
            if (frameDelayCounter >= frameDelay) {
                currentFrame = (currentFrame + 1) % frameCount;
                frameDelayCounter = 0;
            }
        } else {
            
            y += 5; 
        }
    }
    
/* 
public void update() {
    if (!falling) {
        x += speedX;
        y += speedY;
        if (x < 0 || x > 800) speedX = -speedX;
        if (y < 0 || y > 600) speedY = -speedY;
        
        frameDelayCounter++;
        if (frameDelayCounter >= frameDelay) {
            currentFrame = (currentFrame + 1) % frameCount;
            frameDelayCounter = 0;
        }
    } else {
        y += 5; // Velocidad de caída
    }
}
*/

    public void draw(Graphics g) {
        if (cazado) {
            g.drawImage(cazadoImage, x, y, null);
        } else {
            g.drawImage(frames[currentFrame], x, y, null);
        }
    }

    public boolean isHit(int mouseX, int mouseY) {
        int duckWidth = frames[currentFrame].getWidth();
        int duckHeight = frames[currentFrame].getHeight();
        return mouseX >= x && mouseX <= x + duckWidth && mouseY >= y && mouseY <= y + duckHeight;
    }

    public void fall() {
        playCazadoSound(); 
        playCaidaSound(); 
        falling = true;
        cazado = true;
        speedX = 0;
        speedY = 0;
    }

    public boolean isFalling() {
        return falling;
    }

    private void playCazadoSound() {
        if (cazadoSoundClip != null) {
            cazadoSoundClip.setFramePosition(0); 
            cazadoSoundClip.start(); 
        }
    }

    private void playCaidaSound() {
        if (caidaSoundClip != null) {
            caidaSoundClip.setFramePosition(0); 
            caidaSoundClip.start(); 
        }
    }
}

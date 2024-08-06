package DuckHunt;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

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

    public Pato() {
        x = (int) (Math.random() * 800);
        y = (int) (Math.random() * 600);
        speedX = (int) (Math.random() * 10 - 5);
        speedY = (int) (Math.random() * 10 - 5);

        try {
            duckImage = ImageIO.read(new File("imagenes/patoimg.png"));
            cazadoImage = ImageIO.read(new File("imagenes/patocazado.png"));
        } catch (IOException e) {
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
        falling = true;
        cazado = true;
        speedX = 0;
        speedY = 0;
    }

    public boolean isFalling() {
        return falling;
    }
}

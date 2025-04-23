import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class buttons extends JButton {


    private Image backgroundImage;

    public buttons(String text) {
        super(text);
        setOpaque(false);
        setContentAreaFilled(false);
       setBorderPainted(false);
        setForeground(Color.WHITE); // text color
    }


    public void setBackgroundImage(String imagePath) {
        try {
            backgroundImage = ImageIO.read(new File(imagePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        super.paintComponent(g);
    }
}

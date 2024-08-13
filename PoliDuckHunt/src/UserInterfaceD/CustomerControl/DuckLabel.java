package UserInterfaceD.CustomerControl;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import UserInterfaceD.DuckStyle;

public class DuckLabel extends JLabel{
    public DuckLabel(){
        customizeComponent();
    }
    public DuckLabel(String text){
        setText(text);
        customizeComponent();
    }
    private void customizeComponent(){
        setCustomizeComponent(getText(), DuckStyle.FONT, DuckStyle.COLOR_FONT_LIGHT, DuckStyle.ALIGNMENT_LEFT);
    }
    public void setCustomizeComponent(String text, Font  font, Color color, int alignment) {
        setText(text);
        setFont(font);
        setOpaque(false);
        setBackground(null);
        setForeground(color);
        setHorizontalAlignment(alignment);
        //setIcon(new ImageIcon(iconPath));
    }
}
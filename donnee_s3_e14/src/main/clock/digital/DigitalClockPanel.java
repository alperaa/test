/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clock.digital;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import javax.swing.JComponent;
import javax.swing.JPanel;


/**
 *
 * @author alper_a
 */
public class DigitalClockPanel extends JPanel{

    private Font font = new Font("TimesRoman", Font.PLAIN, 25);
    private Color bgcolor = Color.lightGray;
    private Color bcolor = Color.BLACK;
    int hour, minute, second;


        
    DigitalClockPanel() {
            setFont(font);
            
    }
    
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
        
    public void paintComponent(Graphics g)
    {
        
        g.setColor(bgcolor);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.setColor(bcolor);
        
      
        g.drawString(hour + " : " + minute + " : " + second, 30, 60);
      //  g.drawString(minute + "", 90, 60);
      //  g.drawString(": " + second, 140, 60);
        
        
    }
    

}


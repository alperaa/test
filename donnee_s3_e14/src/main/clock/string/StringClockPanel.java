package clock.string;

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
public class StringClockPanel extends JPanel{

    private Font font = new Font("TimesRoman", Font.PLAIN, 25);
    private Color bgcolor = Color.black;
    private Color bcolor = Color.red;
    int hour, minute, second;


        
    StringClockPanel() {
            this.setFont(font);
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
        
        g.drawString("Es ist", 40, 30);
        
        if(hour == 0){
            g.drawString("Null", 40, 60);
        }else if(hour == 1){
            g.drawString("Eins", 40, 60);
        }else if(hour == 2){
            g.drawString("Zwei", 40, 60);
        }else if(hour == 3){
            g.drawString("Drei", 40, 60);
        }else if(hour == 4){
            g.drawString("Vier", 40, 60);
        }else if(hour == 5){
            g.drawString("Fünf", 40, 60);
        }else if(hour == 6){
            g.drawString("Sechs", 40, 60);
        }else if(hour == 7){
            g.drawString("Sieben", 40, 60);
        }else if(hour == 8){
            g.drawString("Acht", 40, 60);
        }else if(hour == 9){
            g.drawString("Neun", 40, 60);
        }else if(hour == 10){
            g.drawString("Zehn", 40, 60);
        }else if(hour == 11){
            g.drawString("Elf", 40, 60);
        }else if(hour == 12){
            g.drawString("Zwölf", 40, 60);
        }else if(hour == 13){
            g.drawString("Dreizehn", 40, 60);
        }else if(hour == 14){
            g.drawString("Vierzehn", 40, 60);
        }else if(hour == 15){
            g.drawString("Fünfzehn", 40, 60);
        }else if(hour == 16){
            g.drawString("Sechzehn", 40, 60);
        }else if(hour == 17){
            g.drawString("Siebzehn", 40, 60);
        }else if(hour == 18){
            g.drawString("Achtzehn", 40, 60);
        }else if(hour == 19){
            g.drawString("Neunzehn", 40, 60);
        }else if(hour == 20){
            g.drawString("Zwanzig", 40, 60);
        }else if(hour == 21){
            g.drawString("Einundzwanzig", 40, 60);
        }else if(hour == 22){
            g.drawString("Zweiundzwanzig", 40, 60);
        }else if(hour == 23){
            g.drawString("Dreiundzwanzig", 40, 60);
        }
        
         g.drawString("Uhr ", 280, 60);
        
        if(minute == 0){
            g.drawString("Null", 40, 90);
        }else if(minute == 1){
            g.drawString("Eins", 40, 90);
        }else if(minute == 2){
            g.drawString("Zwei", 40, 90);
        }else if(minute == 3){
            g.drawString("Drei", 40, 90);
        }else if(minute == 4){
            g.drawString("Vier", 40, 90);
        }else if(minute == 5){
            g.drawString("Fünf", 40, 90);
        }else if(minute == 6){
            g.drawString("Sechs", 40, 90);
        }else if(minute == 7){
            g.drawString("Sieben", 40, 90);
        }else if(minute == 8){
            g.drawString("Acht", 40, 90);
        }else if(minute == 9){
            g.drawString("Neun", 40, 90);
        }else if(minute == 10){
            g.drawString("Zehn", 40, 90);
        }else if(minute == 11){
            g.drawString("Elf", 40, 90);
        }else if(minute == 12){
            g.drawString("Zwölf", 40, 90);
        }else if(minute == 13){
            g.drawString("Dreizehn", 40, 90);
        }else if(minute == 14){
            g.drawString("Vierzehn", 40, 90);
        }else if(minute == 15){
            g.drawString("Fünfzehn", 40, 90);
        }else if(minute == 16){
            g.drawString("Sechzehn", 40, 90);
        }else if(minute == 17){
            g.drawString("Siebzehn", 40, 90);
        }else if(minute == 18){
            g.drawString("Achtzehn", 40, 90);
        }else if(minute == 19){
            g.drawString("Neunzehn", 40, 90);
        }else if(minute == 20){
            g.drawString("Zwanzig", 40, 90);
        }else if(minute == 21){
            g.drawString("Einundzwanzig", 40, 90);
        }else if(minute == 22){
            g.drawString("Zweiundzwanzig", 40, 90);
        }else if(minute == 23){
            g.drawString("Dreiundzwanzig", 40, 90);
        }else if(minute == 24){
            g.drawString("Vierundzwanzig", 40, 90);
        }else if(minute == 25){
            g.drawString("Fünfundzwanzig", 40, 90);
        }else if(minute == 26){
            g.drawString("Sechsundzwanzig", 40, 90);
        }else if(minute == 27){
            g.drawString("Siebenundzwanzig", 40, 90);
        }else if(minute == 28){
            g.drawString("Achtundzwanzig", 40, 90);
        }else if(minute == 29){
            g.drawString("Neunundzwanzig", 40, 90);
        }else if(minute == 30){
            g.drawString("Dreissig", 40, 90);
        }else if(minute == 31){
            g.drawString("Einunddreissig", 40, 90);
        }else if(minute == 32){
            g.drawString("Zweiunddreissig", 40, 90);
        }else if(minute == 33){
            g.drawString("Dreiunddreissig", 40, 90);
        }else if(minute == 34){
            g.drawString("Vierunddreissig", 40, 90);
        }else if(minute == 35){
            g.drawString("Fünfunddreissig", 40, 90);
        }else if(minute == 36){
            g.drawString("Sechsunddreissig", 40, 90);
        }else if(minute == 37){
            g.drawString("Siebenunddreissig", 40, 90);
        }else if(minute == 38){
            g.drawString("Achtunddreissig", 40, 90);
        }else if(minute == 39){
            g.drawString("Neununddreissig", 40, 90);
        }else if(minute == 40){
            g.drawString("Vierzig", 40, 90);
        }else if(minute == 41){
            g.drawString("Einundvierzig", 40, 90);
        }else if(minute == 42){
            g.drawString("Zweiundvierzig", 40, 90);
        }else if(minute == 43){
            g.drawString("Dreiundvierzig", 40, 90);
        }else if(minute == 44){
            g.drawString("Vierundvierzig", 40, 90);
        }else if(minute == 45){
            g.drawString("Fünfundvierzig", 40, 90);
        }else if(minute == 46){
            g.drawString("Sechsundvierzig", 40, 90);
        }else if(minute == 47){
            g.drawString("Siebenundvierzig", 40, 90);
        }else if(minute == 48){
            g.drawString("Achtundvierzig", 40, 90);
        }else if(minute == 49){
            g.drawString("Neunundvierzig", 40, 90);
        }else if(minute == 50){
            g.drawString("Fünfzig", 40, 90);
        }else if(minute == 51){
            g.drawString("Einundfünfzig", 40, 90);
        }else if(minute == 52){
            g.drawString("Zweiundfünfzig", 40, 90);
        }else if(minute == 53){
            g.drawString("Dreiundfunfzig", 40, 90);
        }else if(minute == 54){
            g.drawString("Vierundfünfzig", 40, 90);
        }else if(minute == 55){
            g.drawString("Fünfundfünfzig", 40, 90);
        }else if(minute == 56){
            g.drawString("Sechsundfünfzig", 40, 90);
        }else if(minute == 57){
            g.drawString("Siebenundfünfzig", 40, 90);
        }else if(minute == 58){
            g.drawString("Achtundfünfzig", 40, 90);
        }else if(minute == 59){
            g.drawString("Neunundfünfzig", 40, 90);
        }
        
        if(second == 0){
            g.drawString("Null", 40, 130);
        }else if(second == 1){
            g.drawString("Eins", 40, 130);
        }else if(second == 2){
            g.drawString("Zwei", 40, 130);
        }else if(second == 3){
            g.drawString("Drei", 40, 130);
        }else if(second == 4){
            g.drawString("Vier", 40, 130);
        }else if(second == 5){
            g.drawString("Fünf", 40, 130);
        }else if(second == 6){
            g.drawString("Sechs", 40, 130);
        }else if(second == 7){
            g.drawString("Sieben", 40, 130);
        }else if(second == 8){
            g.drawString("Acht", 40, 130);
        }else if(second == 9){
            g.drawString("Neun", 40, 130);
        }else if(second == 10){
            g.drawString("Zehn", 40, 130);
        }else if(second == 11){
            g.drawString("Elf", 40, 130);
        }else if(second == 12){
            g.drawString("Zwölf", 40, 130);
        }else if(second == 13){
            g.drawString("Dreizehn", 40, 130);
        }else if(second == 14){
            g.drawString("Vierzehn", 40, 130);
        }else if(second == 15){
            g.drawString("Fünfzehn", 40, 130);
        }else if(second == 16){
            g.drawString("Sechzehn", 40, 130);
        }else if(second == 17){
            g.drawString("Siebzehn", 40, 130);
        }else if(second == 18){
            g.drawString("Achtzehn", 40, 130);
        }else if(second == 19){
            g.drawString("Neunzehn", 40, 130);
        }else if(second == 20){
            g.drawString("Zwanzig", 40, 130);
        }else if(second == 21){
            g.drawString("Einundzwanzig", 40, 130);
        }else if(second == 22){
            g.drawString("Zweiundzwanzig", 40, 130);
        }else if(second == 23){
            g.drawString("Dreiundzwanzig", 40, 130);
        }else if(second == 24){
            g.drawString("Vierundzwanzig", 40, 130);
        }else if(second == 25){
            g.drawString("Fünfundzwanzig", 40, 130);
        }else if(second == 26){
            g.drawString("Sechsundzwanzig", 40, 130);
        }else if(second == 27){
            g.drawString("Siebenundzwanzig", 40, 130);
        }else if(second == 28){
            g.drawString("Achtundzwanzig", 40, 130);
        }else if(second == 29){
            g.drawString("Neunundzwanzig", 40, 130);
        }else if(second == 30){
            g.drawString("Dreissig", 40, 130);
        }else if(second == 31){
            g.drawString("Einunddreissig", 40, 130);
        }else if(second == 32){
            g.drawString("Zweiunddreissig", 40, 130);
        }else if(second == 33){
            g.drawString("Dreiunddreissig", 40, 130);
        }else if(second == 34){
            g.drawString("Vierunddreissig", 40, 130);
        }else if(second == 35){
            g.drawString("Fünfunddreissig", 40, 130);
        }else if(second == 36){
            g.drawString("Sechsunddreissig", 40, 130);
        }else if(second == 37){
            g.drawString("Siebenunddreissig", 40, 130);
        }else if(second == 38){
            g.drawString("Achtunddreissig", 40, 130);
        }else if(second == 39){
            g.drawString("Neununddreissig", 40, 130);
        }else if(second == 40){
            g.drawString("Vierzig", 40, 130);
        }else if(second == 41){
            g.drawString("Einundvierzig", 40, 130);
        }else if(second == 42){
            g.drawString("Zweiundvierzig", 40, 130);
        }else if(second == 43){
            g.drawString("Dreiundvierzig", 40, 130);
        }else if(second == 44){
            g.drawString("Vierundvierzig", 40, 130);
        }else if(second == 45){
            g.drawString("Fünfundvierzig", 40, 130);
        }else if(second == 46){
            g.drawString("Sechsundvierzig", 40, 130);
        }else if(second == 47){
            g.drawString("Siebenundvierzig", 40, 130);
        }else if(second == 48){
            g.drawString("Achtundvierzig", 40, 130);
        }else if(second == 49){
            g.drawString("Neunundvierzig", 40, 130);
        }else if(second == 50){
            g.drawString("Fünfzig", 40, 130);
        }else if(second == 51){
            g.drawString("Einundfünfzig", 40, 130);
        }else if(second == 52){
            g.drawString("Zweiundfünfzig", 40, 130);
        }else if(second == 53){
            g.drawString("Dreiundfunfzig", 40, 130);
        }else if(second == 54){
            g.drawString("Vierundfünfzig", 40, 130);
        }else if(second == 55){
            g.drawString("Fünfundfünfzig", 40, 130);
        }else if(second == 56){
            g.drawString("Sechsundfünfzig", 40, 130);
        }else if(second == 57){
            g.drawString("Siebenundfünfzig", 40, 130);
        }else if(second == 58){
            g.drawString("Achtundfünfzig", 40, 130);
        }else if(second == 59){
            g.drawString("Neunundfünfzig", 40, 130);
        }
   
    }
    

}
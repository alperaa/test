/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clock.digital;


import clock.analog.AnalogClockPanel;
import clock.timer.ClockTimer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import clock.util.PositionManager;
import java.util.Observable;
import java.util.Observer;

/**
 * An analog clock observing a clock timer.
 * 
 * @author Andreas Ruppen
 */
public class DigitalClock extends JFrame implements Observer{

	/**
	 * 
	 * @uml.property name="analogClockPanel"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private DigitalClockPanel digitalClockPanel;
        
        private ClockTimer time;
        
      //  private int hour2, minute2, second2;

    /**
     * Creates a new instance of <code>AnalogClock</code> that observes the 
     * given clock timer.
     */
    public DigitalClock(ClockTimer time) {   
        this.time = time;
        System.out.println("Count: " + this.time.countObservers());
    //   this.time.addObserver(this);
        this.time.addObserver(this);
        System.out.println("Count: " + this.time.countObservers());
 //       System.out.println(this.time.countObservers());
        // Create and set up the window.
        setTitle("Digital Clock");
        addWindowListener(new DetachOnClosingWindowListener());
        
 
        // Create and set up the analog clock panel.
        digitalClockPanel = new DigitalClockPanel();
        digitalClockPanel.setPreferredSize(new Dimension(200, 100));

        // Add the panel to the window.
        getContentPane().add(digitalClockPanel, BorderLayout.CENTER);

        // Set screen position.
        setLocation(PositionManager.getUniqueInstance().getClockWindowPosition());

        // Display the window.
        pack();
        setVisible(true);
    }
    
    public void update(Observable o, Object arg) {
        digitalClockPanel.setTime(time.getHour(), time.getMinute(), time.getSecond());
        digitalClockPanel.repaint();
        System.out.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());
        
    }
    
    /**
     * A window listener that detaches the clock from the timer when the window 
     * is being closed.
     */
    private class DetachOnClosingWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
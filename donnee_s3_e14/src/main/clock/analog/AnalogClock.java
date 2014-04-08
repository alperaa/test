package clock.analog;

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
public class AnalogClock extends JFrame implements Observer{
    private static final long serialVersionUID = 3258408447900069937L;

	/**
	 * 
	 * @uml.property name="analogClockPanel"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private AnalogClockPanel analogClockPanel;
        private ClockTimer time;

    /**
     * Creates a new instance of <code>AnalogClock</code> that observes the 
     * given clock timer.
     */
    public AnalogClock(ClockTimer time) {  
        this.time = time;
         this.time.addObserver(this);
        // Create and set up the window.
        setTitle("Analog Clock");
        addWindowListener(new DetachOnClosingWindowListener());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create and set up the analog clock panel.
        analogClockPanel = new AnalogClockPanel();
        analogClockPanel.setPreferredSize(new Dimension(200, 200));

        // Add the panel to the window.
        getContentPane().add(analogClockPanel, BorderLayout.CENTER);

        // Set screen position.
        setLocation(PositionManager.getUniqueInstance().getClockWindowPosition());

        // Display the window.
        pack();
        setVisible(true);
    }
    
    /**
     * Updates the clock.
     */
    public void update(int hour, int minute, int second) {
        analogClockPanel.setTime(hour, minute, second);
        analogClockPanel.repaint();
    }

    public void update(Observable o, Object arg) {
        analogClockPanel.setTime(time.getHour(), time.getMinute(), time.getSecond());
        analogClockPanel.repaint();    }
    
    /**
     * A window listener that detaches the clock from the timer when the window 
     * is being closed.
     */
    private class DetachOnClosingWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            // Do some cleanup here...
        }
    }
}
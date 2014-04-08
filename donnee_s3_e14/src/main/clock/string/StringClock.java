package clock.string;

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
 *
 * @author alper_a
 */
public class StringClock extends JFrame implements Observer{

	/**
	 * 
	 * @uml.property name="analogClockPanel"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private StringClockPanel stringClockPanel;
        
        private ClockTimer time;
        
      //  private int hour2, minute2, second2;

    /**
     * Creates a new instance of <code>AnalogClock</code> that observes the 
     * given clock timer.
     */
    public StringClock(ClockTimer time) {   
        this.time = time;
        System.out.println("Count: " + this.time.countObservers());
    //   this.time.addObserver(this);
        this.time.addObserver(this);
        System.out.println("Count: " + this.time.countObservers());
 //       System.out.println(this.time.countObservers());
        // Create and set up the window.
        setTitle("String Clock");
        addWindowListener(new DetachOnClosingWindowListener());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create and set up the analog clock panel.
        stringClockPanel = new StringClockPanel();
        stringClockPanel.setPreferredSize(new Dimension(350, 200));
        
        // Add the panel to the window.
        getContentPane().add(stringClockPanel, BorderLayout.CENTER);

        // Set screen position.
        setLocation(PositionManager.getUniqueInstance().getClockWindowPosition());

        // Display the window.
        pack();
        setVisible(true);
    }
    
    /**
     * Updates the clock.
     */
/*    public void update(int hour, int minute, int second) {
        stringClockPanel.setTime(hour, minute, second);
        stringClockPanel.repaint();
    }
*/
    public void update(Observable o, Object arg) {
        stringClockPanel.setTime(time.getHour(), time.getMinute(), time.getSecond());
        stringClockPanel.repaint();
       
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
package netflixstatistics;

// @author Bart

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;


public class NSButton extends JButton{
    
    private static String OS = System.getProperty("os.name").toLowerCase();

    public NSButton(String label)
    {
        super(label);
        
        setForeground(Color.WHITE);
        
        if (isWindows()) 
        {
		setOpaque(true);
                setBorderPainted(true);
                setBackground(Color.BLACK);
                System.out.println("OS IS WINDOWS");
        } 
        else if (isMac()) 
        {
		setOpaque(true);
                setBorderPainted(false);
                setBackground(Color.DARK_GRAY);
                System.out.println("OS IS MACS");
        }
        
        
    }
    
    public static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}
}


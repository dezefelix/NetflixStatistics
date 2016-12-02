package netflixstatistics;

// @AUTHOR Felix

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

 
class AccountPanel extends JPanel {
    private JPanel menu, content;
    private BannerPanel banner;
    private JButton menuAccBtn, menuFilmBtn, menuShowBtn, menuExtraBtn;
    private JButton contentFilmBtn, contentShowBtn;
    private JComboBox contentAccountBox;
    
            
    public AccountPanel() {
        setLayout(new BorderLayout());
        
        banner = new BannerPanel();
        menu = new JPanel();
        content = new JPanel();
        
        JButton menuAccBtn = new JButton("Account");
        JButton menuFilmBtn = new JButton("Film");
        JButton menuShowBtn = new JButton("Show");
        JButton menuExtraBtn = new JButton("Extra");

        JButton contentFilmBtn = new JButton("Film");
        JButton contentShowBtn = new JButton("Show");
        
        JComboBox contentAccountBox = new JComboBox();
        
        banner.setPreferredSize(new Dimension(600, 150));
        content.setSize(600, 250);
        content.setBackground(Color.LIGHT_GRAY);
        
        
        
        
        
        
        add(banner, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
        add(menu, BorderLayout.WEST);
    }
    
   

}

package netflixstatistics;

// @AUTHOR Felix

import java.awt.*;
import javax.swing.*;

 
class AccountPanel extends JPanel {
    private final JPanel menu, content;
    private final BannerPanel banner;
    private final JButton menuAccBtn, menuFilmBtn, menuShowBtn, menuExtraBtn;
    private final JButton contentFilmBtn, contentShowBtn;
    private JComboBox contentAccountBox;
    
            
    public AccountPanel() {
        //Setting layout for hole panel
        setLayout(new BorderLayout());
        
        //Banner
        banner = new BannerPanel();
            
            //Setting dimension for banner
            banner.setPreferredSize(new Dimension(600, 150));
        
        //Menu
        menu = new JPanel();
            
            //Initializing buttons
            menuAccBtn = new JButton("Account");
            menuFilmBtn = new JButton("Film");
            menuShowBtn = new JButton("Show");
            menuExtraBtn = new JButton("Extra");
        
            //Setting background color for buttons
            menuAccBtn.setBackground(Color.WHITE);//Is white because active
            menuFilmBtn.setBackground(Color.BLACK);
            menuShowBtn.setBackground(Color.BLACK);
            menuExtraBtn.setBackground(Color.BLACK);
        
            //Setting text color for buttons
            menuAccBtn.setForeground(Color.BLACK);//Is black because active
            menuFilmBtn.setForeground(Color.WHITE);
            menuShowBtn.setForeground(Color.WHITE);
            menuExtraBtn.setForeground(Color.WHITE);
        
            //adding buttons in menupanel
            menu.add(menuAccBtn);
            menu.add(menuFilmBtn);
            menu.add(menuShowBtn);
            menu.add(menuExtraBtn);
            menu.setLayout(new GridLayout(4,1));
        
        //content
        content = new JPanel();
        content.setSize(600, 250);
        content.setBackground(Color.BLACK);
            
            //setting layout null so setBounds works
            content.setLayout(null);
            
            //Initializing buttons and combobox
            contentFilmBtn = new JButton("Film");
            contentShowBtn = new JButton("Show");
            contentAccountBox = new JComboBox();
            
            //Setting location of buttons
            contentAccountBox.setBounds(50,30,400,25);
            contentFilmBtn.setBounds(50,70,200,100);
            contentShowBtn.setBounds(250,70,200,100);
            
            //Setting background color buttons
            contentFilmBtn.setBackground(Color.BLACK);
            contentShowBtn.setBackground(Color.BLACK);
            
            //Setting text color buttons
            contentFilmBtn.setForeground(Color.WHITE);
            contentShowBtn.setForeground(Color.WHITE);
            
     
            //Adding buttons in contentpanel
            content.add(contentAccountBox);
            content.add(contentFilmBtn);
            content.add(contentShowBtn);
        
        //Adding panels to Accountpanel
        add(banner, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
        add(menu, BorderLayout.WEST);
    }
}

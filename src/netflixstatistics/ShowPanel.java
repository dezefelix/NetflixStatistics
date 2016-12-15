package netflixstatistics;

// @AUTHOR Felix

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

 
class ShowPanel extends JPanel {
    private final JPanel menu, content;
    private final BannerPanel banner;
    private final NSButton menuAccBtn, menuFilmBtn, menuShowBtn, menuExtraBtn, menuConfigBtn;
    private JLabel titleStatic, accWatchedStatic, averageWatchedStatic;
    private JLabel title, accWatched, averageWatched;
    private JComboBox showBox, episodeBox;
    
    private JPanel thisPanel;
    
            
    public ShowPanel() 
    {
        
        thisPanel = this;
        
        //Setting layout for hole panel
        setLayout(new BorderLayout());
        
        //Banner
        banner = new BannerPanel();
            
            //Setting dimension for banner
            banner.setPreferredSize(new Dimension(600, 150));
        
        //Menu
        menu = new JPanel();
            
            //Initializing buttons
            menuAccBtn = new NSButton("Account");
            menuFilmBtn = new NSButton("Film");
            menuShowBtn = new NSButton("Show");
            menuExtraBtn = new NSButton("Extra");
            menuConfigBtn= new NSButton("Config");
            
            //Adding handlers to buttons
            MenuAccBtnHandler menuAccBtnHandler = new MenuAccBtnHandler();
            menuAccBtn.addActionListener(menuAccBtnHandler);
            MenuFilmBtnHandler menuFilmBtnHandler = new MenuFilmBtnHandler();
            menuFilmBtn.addActionListener(menuFilmBtnHandler);
            MenuShowBtnHandler menuShowBtnHandler = new MenuShowBtnHandler();
            menuShowBtn.addActionListener(menuShowBtnHandler);
        
            //Setting background color for buttons
            menuShowBtn.setBackground(Color.WHITE);//Is white because active
       
            //Setting text color for buttons
            menuShowBtn.setForeground(Color.BLACK);//Is black because active
        
            //adding buttons in menupanel
            menu.add(menuAccBtn);
            menu.add(menuFilmBtn);
            menu.add(menuShowBtn);
            menu.add(menuExtraBtn);
            menu.add(menuConfigBtn);
            menu.setLayout(new GridLayout(5,1));
        
        //content
        content = new JPanel();
        content.setSize(600, 250);
        content.setBackground(Color.BLACK);
            
            //setting layout null so setBounds works
            content.setLayout(null);
            
            //Initializing combobox
            showBox = new JComboBox();
            episodeBox = new JComboBox();
            
            //Initializing static labels
            titleStatic = new JLabel("Title:");
            accWatchedStatic = new JLabel("How many accounts have watched:");
            averageWatchedStatic = new JLabel("Average percentage of time watched:");
            
            //Initializing database labels
            title = new JLabel("Too Far Gone");
            accWatched = new JLabel("2139");
            averageWatched = new JLabel("100%");
            
            //Setting label colors to white 
            titleStatic.setForeground(Color.WHITE);
            accWatchedStatic.setForeground(Color.WHITE);
            averageWatchedStatic.setForeground(Color.WHITE);
            title.setForeground(Color.WHITE);
            accWatched.setForeground(Color.WHITE);
            averageWatched.setForeground(Color.WHITE);

            //Setting location of combobox
            showBox.setBounds(50,30,400,25);
            episodeBox.setBounds(50,65,400,25);
           
            //Setting location of  static labels
            titleStatic.setBounds(50,110,40,25);
            accWatchedStatic.setBounds(50,135,200,25);
            averageWatchedStatic.setBounds(50,160,220,25);

            //Setting location of  nonstatic labels
            title.setBounds(100,110,350,25);
            accWatched.setBounds(350,135,100,25);
            averageWatched.setBounds(350,160,100,25);
            
            //Setting alignment for nonstatic labels
            title.setHorizontalAlignment(SwingConstants.RIGHT);
            accWatched.setHorizontalAlignment(SwingConstants.RIGHT);
            averageWatched.setHorizontalAlignment(SwingConstants.RIGHT);
     
            //Adding combobox in contentpanel
            content.add(showBox);
            content.add(episodeBox);
            
            //Adding labels in contentpanel
            content.add(titleStatic);
            content.add(accWatchedStatic);
            content.add(averageWatchedStatic);
            content.add(title);
            content.add(accWatched);
            content.add(averageWatched);
        
        //Adding panels to Accountpanel
        add(banner, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
        add(menu, BorderLayout.WEST);
    }
    
    //Handlers for menu buttons
      class MenuAccBtnHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new GUI();
            SwingUtilities.windowForComponent(thisPanel).dispose();
        }
    }

        class MenuFilmBtnHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new FilmGUI();
            SwingUtilities.windowForComponent(thisPanel).dispose();
        }
    }
        
        class MenuShowBtnHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new ShowGUI();
            SwingUtilities.windowForComponent(thisPanel).dispose();
        }
    }
}

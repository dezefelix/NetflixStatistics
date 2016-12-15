package netflixstatistics;

// @AUTHOR Felix

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

 
class ExtraPanel extends JPanel {
    private final JPanel menu, content;
    private final BannerPanel banner;
    private final NSButton menuAccBtn, menuFilmBtn, menuShowBtn, menuExtraBtn;
    private JLabel accountsLb, longestMovieLb;
    private JTextArea accounts, longestMovie;
    private JScrollPane scrollPane;
    
    private JPanel thisPanel;
            
    public ExtraPanel() 
    {
        thisPanel = this;
        
        //Setting layout for whole panel
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
            
            //Adding handlers to buttons
            MenuAccBtnHandler menuAccBtnHandler = new MenuAccBtnHandler();
            menuAccBtn.addActionListener(menuAccBtnHandler);
            MenuFilmBtnHandler menuFilmBtnHandler = new MenuFilmBtnHandler();
            menuFilmBtn.addActionListener(menuFilmBtnHandler);
            MenuShowBtnHandler menuShowBtnHandler = new MenuShowBtnHandler();
            menuShowBtn.addActionListener(menuShowBtnHandler);
            MenuExtraBtnHandler extraBtnHandler = new MenuExtraBtnHandler();
            menuExtraBtn.addActionListener(extraBtnHandler);
            
            //Initializing labels
            accountsLb = new JLabel("Accounts with 1 profile");
            longestMovieLb = new JLabel("Movie with longest time for age under 16");
            
            //Initializing textarea & scrollpanel
            accounts = new JTextArea();
            longestMovie = new JTextArea();
            scrollPane = new JScrollPane(accounts);
        
            //Setting background color for buttons
            menuExtraBtn.setBackground(Color.WHITE);//Is white because active
       
            //Setting text color for buttons & labels
            menuExtraBtn.setForeground(Color.BLACK);//Is black because active
            accountsLb.setForeground(Color.WHITE);
            longestMovieLb.setForeground(Color.WHITE);
        
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
            
            //Setting location of labels & textarea
            accountsLb.setBounds(50, 30, 400, 25);
            scrollPane.setBounds(50, 60, 400, 80);
            longestMovieLb.setBounds(50, 150, 400, 25);
            longestMovie.setBounds(50, 180, 400, 25);
            accountsLb.setHorizontalAlignment(SwingConstants.CENTER);
            longestMovieLb.setHorizontalAlignment(SwingConstants.CENTER);
            
            //Setting other properties
            accountsLb.setFont(new Font("", Font.BOLD, 12));
            accounts.setMargin(new Insets(4, 6, 4, 6));
            longestMovie.setMargin(new Insets(4, 6, 4, 6));
            scrollPane.setBackground(Color.WHITE);

            accounts.setLineWrap(true);
            accounts.setWrapStyleWord(true);
            
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
     
            //Adding buttons & textarea in contentpanel
            content.add(accountsLb);
            content.add(scrollPane);
            content.add(longestMovieLb);
            content.add(longestMovie);
        
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
        
        class MenuExtraBtnHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            new ExtraGUI();
            SwingUtilities.windowForComponent(thisPanel).dispose();
        }
    }
}

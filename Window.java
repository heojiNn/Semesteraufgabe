package mainframe;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;


@SuppressWarnings("serial")
public class Window extends JFrame {
    
    private Font fontHead = new Font("Monospaced", Font.BOLD, 36);
    private Font fontBold = new Font("Monospaced", Font.PLAIN, 22);
    
    public Window() {
	super("Das Info Quiz");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container con = this.getContentPane();				// wofür brauche ich das?
	
	// Welcome Panel
	JPanel pWelcome = new JPanel();
	pWelcome.setBounds(550, 100, 300, 75);
	pWelcome.setForeground(Color.white);				// warum ändert sich die Farbe nicht?
	pWelcome.setOpaque(false);
	JLabel lblWelcome = new JLabel ("DAS INFO QUIZ");
	lblWelcome.setFont(fontHead);
	pWelcome.add(lblWelcome);	
	con.add(pWelcome);
	
	
	// Menu Panel
	JButton btnPlay = new JButton("Quiz starten!");
	btnPlay.setFont(fontBold);
	JButton btnHelp = new JButton("Infos & Hilfe");
	btnHelp.setFont(fontBold);
	Box boxMenu = new Box(0);
	boxMenu.add(btnPlay);
	boxMenu.add(btnHelp);
	
	JPanel pMenu = new JPanel();
	pMenu.add(boxMenu);
	pMenu.setBounds(550, 200, 300, 400);
	pMenu.setOpaque(false);
	con.add(pMenu);
	
	
	// Uni Logo
	Image imgUni = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
	Image modifiedUni = imgUni.getScaledInstance(250, 57, Image.SCALE_SMOOTH);
	JLabel lblUni = new JLabel(new ImageIcon(modifiedUni));
	JPanel pUni = new JPanel();
	pUni.add(lblUni);
	pUni.setSize(250, 57);
	pUni.setOpaque(false);
	pUni.setVisible(true);
	pUni.setLocation(1180, 750);
	this.add(pUni, BorderLayout.CENTER);
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	// Import imgBackground -- sollte möglichst am Ende stehen
	Image imgBackground = new ImageIcon(getClass().getResource("/Farbverlauf_blau.png")).getImage();
	// Background lbl -- könnte man auch mit Graphics und rendern machen, scheint jedoch aufwendig
	JLabel lblBackground = new JLabel(new ImageIcon(imgBackground));
	this.add(lblBackground);
	
	// MenuBar
	JMenu mMainmenu = new JMenu("Menu");
	JMenu mSubmenu = new JMenu("Submenu");
	mMainmenu.add(mSubmenu);
	JMenuBar mbMenu = new JMenuBar();
	mbMenu.add(mMainmenu);
	this.setJMenuBar(mbMenu);

	// Standard End
	this.setSize(800, 500);					// Size if minimized
	this.setLocation(300, 200);
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);			// might not be supported on every platform
	this.setVisible(true);

    }
}

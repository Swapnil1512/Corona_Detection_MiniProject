import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
  
@SuppressWarnings("serial")
class Infected
    extends JFrame 
    implements ActionListener { 
  
	
    private Container c; 
    private JLabel title; 
    private JLabel a;
    private JLabel b;
  
	@SuppressWarnings("unused")
	private ButtonGroup gengp; 
  
	
    private JButton sub; 
   
   
	public Infected() 
    { 
        setTitle("Partially"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Tested positive for"); 
        title.setFont(new Font("Arial", Font.PLAIN, 40)); 
        title.setSize(400, 50); 
        title.setLocation(290, 30); 
        c.add(title); 
  
        title = new JLabel("COVID-19"); 
        title.setFont(new Font("Arial", Font.PLAIN, 40)); 
        title.setSize(400, 50); 
        title.setLocation(340, 70); 
        c.add(title);
  
        sub = new JButton("MAINTAIN SOCIAL DISTANCING"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(300, 70); 
        sub.setLocation(290, 450); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        a = new JLabel("YOU ARE BEING TRANSFERRED ");
        a.setFont(new Font("Arial", Font.PLAIN, 25)); 
        a.setSize(400, 50); 
        a.setLocation(210, 150); 
        c.add(a); 
        
        a = new JLabel(" FOR RESPECTIVE HOSPITAL.");
        a.setFont(new Font("Arial", Font.PLAIN, 25)); 
        a.setSize(400, 50); 
        a.setLocation(210, 180); 
        c.add(a); 
        
       
        b = new JLabel("YOUR DATA WILL BE SHARED");
        b.setFont(new Font("Arial", Font.PLAIN, 25)); 
        b.setSize(400, 50); 
        b.setLocation(210, 250); 
        c.add(b);
        
       
        b = new JLabel("WITH DOCTORS AND GOVT.");
        b.setFont(new Font("Arial", Font.PLAIN, 25)); 
        b.setSize(400, 50); 
        b.setLocation(210,280); 
        c.add(b); 
        
       
        
        setVisible(true); 
    } 
  public void close()
  {
	  WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
	  Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
  }
    
    public void actionPerformed(ActionEvent e) 
    { 
    	
        if (e.getSource() == sub) { 
            
              close();
          
        } 
  
       
    } 
       	  
        public static void main(String[] args) throws Exception 
        { 
           new Infected(); 
        } 
    
} 
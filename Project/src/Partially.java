import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
  
@SuppressWarnings("serial")
class Partially
    extends JFrame 
    implements ActionListener { 
  
	
    private Container c; 
    private JLabel title; 
    private JLabel a;
    private JLabel b;
  
	@SuppressWarnings("unused")
	private ButtonGroup gengp; 
  
  
	
    private JButton sub; 
   
  
   
	public Partially() 
    { 
        setTitle("Partially"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Likely To Get Infected"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(400, 50); 
        title.setLocation(290, 30); 
        c.add(title); 
  

  
        sub = new JButton("Stay Safe Stay Home"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(200, 50); 
        sub.setLocation(320, 450); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        a = new JLabel("CALL HELPLINE NUMBER :-");
        a.setFont(new Font("Arial", Font.PLAIN, 21)); 
        a.setSize(400, 50); 
        a.setLocation(210, 100); 
        c.add(a); 
        
        b = new JLabel("1075");
        b.setFont(new Font("Arial", Font.PLAIN, 50)); 
        b.setSize(400, 50); 
        b.setLocation(600, 110); 
        c.add(b); 
       
        b = new JLabel("+91-11-23978046");
        b.setFont(new Font("Arial", Font.PLAIN, 50)); 
        b.setSize(400, 50); 
        b.setLocation(450, 180); 
        c.add(b); 
        
        b = new JLabel("STAY QUARANTINE");
        b.setFont(new Font("Arial", Font.PLAIN, 40)); 
        b.setSize(400, 50); 
        b.setLocation(250, 280); 
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
           new Partially(); 
        } 
    
} 
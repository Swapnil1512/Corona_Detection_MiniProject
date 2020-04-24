import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
  
@SuppressWarnings("serial")
class Negative
    extends JFrame 
    implements ActionListener { 
  
	
    private Container c; 
    private JLabel title; 
    private JLabel a;
    private JLabel b;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JLabel i;
    private JLabel j;
    private JLabel k;
	@SuppressWarnings("unused")
	private ButtonGroup gengp; 
  
  
	
    private JButton sub; 
   
  
   
	public Negative() 
    { 
        setTitle("Negative"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Negative"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(400, 50); 
        title.setLocation(350, 30); 
        c.add(title); 
  

  
        sub = new JButton("Stay Safe Stay Home"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(200, 50); 
        sub.setLocation(320, 450); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        a = new JLabel("FOLLOW THE INSTRUCTIONS BY GOI");
        a.setFont(new Font("Arial", Font.PLAIN, 21)); 
        a.setSize(400, 50); 
        a.setLocation(210, 100); 
        c.add(a); 
        
        b = new JLabel("1.TAKE CARE OF ELDERLY PPL.");
        b.setFont(new Font("Arial", Font.PLAIN, 20)); 
        b.setSize(400, 50); 
        b.setLocation(100, 140); 
        c.add(b); 
       
        d = new JLabel("2.FOLLOW SOCIAL DISTANCING NORMS.");
        d.setFont(new Font("Arial", Font.PLAIN, 20)); 
        d.setSize(400, 50); 
        d.setLocation(100, 170); 
        c.add(d); 
        
        e = new JLabel("3.BOOST YOUR IMMUNE SYATEM");
        e.setFont(new Font("Arial", Font.PLAIN, 20)); 
        e.setSize(400, 50); 
        e.setLocation(100, 200); 
        c.add(e); 
        
        f = new JLabel("4.DOWNLOAD AROGYA SETU APP.");
        f.setFont(new Font("Arial", Font.PLAIN, 20)); 
        f.setSize(400, 50); 
        f.setLocation(100, 230); 
        c.add(f); 
        
        g = new JLabel("5.BE COMPREHHENSIVE TOWARDS,");
        g.setFont(new Font("Arial", Font.PLAIN, 20)); 
        g.setSize(400, 50); 
        g.setLocation(100, 260); 
        c.add(g); 
        
        
        h = new JLabel("THOSE WHO  WORK WITH YOU.");
        h.setFont(new Font("Arial", Font.PLAIN, 20)); 
        h.setSize(400, 50); 
        h.setLocation(115, 290); 
        c.add(h); 

        
        i = new JLabel("6.HELP POOR AND NEEDY PEOPLE.");
        i.setFont(new Font("Arial", Font.PLAIN, 20)); 
        i.setSize(400, 50); 
        i.setLocation(100, 320); 
        c.add(i); 
    
        j = new JLabel("7.RESPECT EFFORTS OF CORONAVIRUS,");
        j.setFont(new Font("Arial", Font.PLAIN, 20)); 
        j.setSize(400, 50); 
        j.setLocation(100, 350); 
        c.add(j); 
    
        k = new JLabel("WORRIERS.");
        k.setFont(new Font("Arial", Font.PLAIN, 20)); 
        k.setSize(400, 50); 
        k.setLocation(115, 380); 
        c.add(k); 
        
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
           new Negative(); 
        } 
    
} 
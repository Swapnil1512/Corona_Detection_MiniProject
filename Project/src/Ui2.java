import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
  
@SuppressWarnings("serial")
class Ui2
	extends JFrame 
  
    implements ActionListener { 
  
    private Container c; 
    private JLabel title; 
    
    private JLabel data; 
    private JRadioButton IgG; 
    private JRadioButton Nil; 
    private JRadioButton IgM; 
    private JLabel temp;
   
    @SuppressWarnings("unused")
	private ButtonGroup gengp; 
    private JLabel dob; 
    @SuppressWarnings({ "rawtypes" })
	private JComboBox Blood_gp;
 
    private JCheckBox term; 
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 
  
	public Ui2() 
    { 
        setTitle("Pateint Report"); 
        setBounds(300, 90, 500, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Patient Report"); 
        title.setFont(new Font("Arial", Font.PLAIN, 26)); 
        title.setSize(400, 50); 
        title.setLocation(250, 30); 
        c.add(title); 
  
        title = new JLabel("Stage 2 :-"); 
        title.setFont(new Font("Arial", Font.PLAIN, 26)); 
        title.setSize(400, 50); 
        title.setLocation(100, 30);
        c.add(title);
       
        
        temp = new JLabel("List Out The "); 
        temp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        temp.setSize(100, 20); 
        temp.setLocation(120,120); 
        c.add(temp); 
  
        temp = new JLabel("Antibodies"); 
        temp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        temp.setSize(100, 20); 
        temp.setLocation(207,120); 
        c.add(temp);
        
        temp = new JLabel(" Found "); 
        temp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        temp.setSize(100, 20); 
        temp.setLocation(280,120); 
        c.add(temp);
        
        temp = new JLabel("in Your"); 
        temp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        temp.setSize(100, 20); 
        temp.setLocation(120,150); 
        c.add(temp);
        
        temp = new JLabel("BloodGroup."); 
        temp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        temp.setSize(100, 20); 
        temp.setLocation(170,150); 
        c.add(temp);
        
        dob = new JLabel("Antibodies"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dob.setSize(100, 20); 
        dob.setLocation(120, 250); 
        c.add(dob); 
  
        term = new JCheckBox("Ensure u have entered Correct"); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(150, 400); 
        c.add(term); 
      
        
        IgM = new JRadioButton("IgM"); 
        IgM.setFont(new Font("Arial", Font.PLAIN, 15)); 
        IgM.setSelected(false); 
        IgM.setSize(90, 20); 
        IgM.setLocation(230, 250); 
        c.add(IgM); 
        
        
        
        IgG = new JRadioButton("IgG"); 
        IgG.setFont(new Font("Arial", Font.PLAIN, 15)); 
        IgG.setSelected(true); 
        IgG.setSize(75, 20); 
        IgG.setLocation(320, 250); 
        c.add(IgG); 
  
        Nil = new JRadioButton("Nil"); 
        Nil.setFont(new Font("Arial", Font.PLAIN, 15)); 
        Nil.setSelected(false); 
        Nil.setSize(80, 20); 
        Nil.setLocation(410, 250); 
        c.add(Nil);
        
        data = new JLabel("Data"); 
        data.setFont(new Font("Arial", Font.PLAIN, 15)); 
        data.setSize(250, 20); 
        data.setLocation(240, 419); 
        c.add(data); 
  
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 450); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 450); 
        reset.addActionListener(this); 
        c.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
  
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
        setVisible(true); 
    } 
  public void close()
  {
	  WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
	  Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
  }
    
    public void actionPerformed(ActionEvent e) 
    { 
    	
    	if (e.getSource() == sub) 
    	{ 
    			String report=null;
    		  if (term.isSelected()) { 
                  String data1 = null; 
                  String data = null ;
                  String data3=null;
                  if(Nil.isSelected())
              	{
              		 data3="Nil";
              	}
                  if(IgM.isSelected())
              	{
              		 data="IgM";
              	}
                  if(IgG.isSelected())
                	{
                		 data1="IgM";
                	}
                  if (IgG.isSelected()) 
                  {
                      data1 = "IgG";
                              
                    if(IgM.isSelected())
                    {
                    	data = "IgM";
                    	if(Nil.isSelected())
                    	{
                    		 data3="Nil";
                    	}
                      	 
                    }
                      
                  }
                
                  res.setText("Registration Successfully.."); 
                if( res.getText()==("Registration Successfully.."))
                	JOptionPane.showMessageDialog(this, "Are You Sure");
                
                if(data1=="IgG" && data=="IgM" && data3==null)
                {
                	report="INFECTED";
                	
                	try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		Connection con = null;
					try {
						con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","swapnil","swapnil");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					PreparedStatement stmt = null;
					try {
						stmt = con.prepareStatement("insert into final_report values(?)");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		try {
						stmt.setString(1,report);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		try {
						stmt.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		dispose();
                	new Infected();
                }
                
                else if(data1=="IgG" && data==null && data3==null )
                {
                	report="PARTIALLY";
                	
                	try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		Connection con = null;
					try {
						con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","swapnil","swapnil");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					PreparedStatement stmt = null;
					try {
						stmt = con.prepareStatement("insert into final_report values(?)");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		try {
						stmt.setString(1,report);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		try {
						stmt.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                	
                	
                	dispose();
                	
                	new Partially();
                }
                else if(data=="IgM" && data1==null && data3==null)
                {
                	report="PARTIALLY";
                	
                	try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		Connection con = null;
					try {
						con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","swapnil","swapnil");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					PreparedStatement stmt = null;
					try {
						stmt = con.prepareStatement("insert into final_report values(?)");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		try {
						stmt.setString(1,report);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		try {
						stmt.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                	
                	
                	dispose();
                	
                	new Partially();
                }
                else if(data1==null && data==null && data3=="Nil")
                {
                	report="NEGATIVE";
                	
                	try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		Connection con = null;
					try {
						con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","swapnil","swapnil");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					PreparedStatement stmt = null;
					try {
						stmt = con.prepareStatement("insert into final_report values(?)");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		try {
						stmt.setString(1,report);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		try {
						stmt.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                	
                	dispose();
                	
                	new Negative();
                } else {
                	
				}
            	
                
            } 
    		  
            else 
            { 
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Please accept the"
                            + " terms & conditions.."); 
            
            } 
         
  
         if (e.getSource() == reset) { 
            String def = ""; 

       
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            Blood_gp.setSelectedIndex(0); 
            
            resadd.setText(def); 
         
         }
    	}
    }
        
     
       	  
        public static void main(String[] args) throws Exception 
        { 
        	new Ui2();        	
        }     
}
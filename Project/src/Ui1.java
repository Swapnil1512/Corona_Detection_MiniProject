import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
  
@SuppressWarnings("serial")
class Ui1
    extends JFrame 
    implements ActionListener { 
  
	
    private Container c; 
    private JLabel title; 
    private JLabel name; 
    private JTextField tname; 
    private JLabel mno; 
    private JLabel data; 
    private JTextField tmno; 
    private JLabel gender; 
    private JRadioButton cough; 
    private JRadioButton Fever; 
    private JRadioButton cold;
    @SuppressWarnings("unused")
	private ButtonGroup gengp; 
    private JLabel dob; 
    @SuppressWarnings({ "rawtypes", "unused" })
	private JComboBox Blood_gp;
   
    private JLabel add; 
    private JTextField tadd;
    private JLabel temp; 
    private JTextField btemp; 
    private JCheckBox term; 
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 
  
    private String dates[] 
        = { "A+","B+","A-","B-","AB+","AB-","O+","O-" }; 
    
    // constructor, to initialize the components 
    // with default values. 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public Ui1() 
    { 
        setTitle("Pateint Report"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Patient Report"); 
        title.setFont(new Font("Arial", Font.PLAIN, 26)); 
        title.setSize(400, 50); 
        title.setLocation(350, 30); 
        c.add(title); 
  
        title = new JLabel("Stage 1 :-"); 
        title.setFont(new Font("Arial", Font.PLAIN, 26)); 
        title.setSize(400, 50); 
        title.setLocation(100, 30);
        c.add(title);
        
        name = new JLabel("HB count"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(100, 20); 
        name.setLocation(100, 200); 
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(200, 200); 
        c.add(tname); 
  
        mno = new JLabel("WBC"); 
        mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mno.setSize(100, 20); 
        mno.setLocation(100, 150); 
        c.add(mno); 
        
       
        tmno = new JTextField(); 
        tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tmno.setSize(190, 20); 
        tmno.setLocation(200, 150); 
        c.add(tmno); 
  
        gender = new JLabel("Symptoms"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(100, 100); 
        c.add(gender); 
  
        cough = new JRadioButton("Cough"); 
        cough.setFont(new Font("Arial", Font.PLAIN, 15)); 
        cough.setSelected(true); 
        cough.setSize(75, 20); 
        cough.setLocation(200, 100); 
        c.add(cough); 
  
        Fever = new JRadioButton("Fever"); 
        Fever.setFont(new Font("Arial", Font.PLAIN, 15)); 
        Fever.setSelected(false); 
        Fever.setSize(80, 20); 
        Fever.setLocation(300, 100); 
        c.add(Fever);
        
        cold = new JRadioButton("Cold"); 
        cold.setFont(new Font("Arial", Font.PLAIN, 15)); 
        cold.setSelected(false); 
        cold.setSize(90, 20); 
        cold.setLocation(400, 100); 
        c.add(cold); 
  
        
        
        dob = new JLabel("BloodGp"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dob.setSize(100, 20); 
        dob.setLocation(100, 250); 
        c.add(dob); 
  
        Blood_gp = new JComboBox(dates); 
        Blood_gp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        Blood_gp.setSize(55, 25); 
        Blood_gp.setLocation(200, 250); 
        c.add(Blood_gp); 
  
      
        add = new JLabel("PulseRate"); 
        add.setFont(new Font("Arial", Font.PLAIN, 20)); 
        add.setSize(100, 20); 
        add.setLocation(100, 300); 
        c.add(add); 
  

        tadd = new JTextField(); 
        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tadd.setSize(180,20); 
        tadd.setLocation(200, 300); 
        c.add(tadd); 
        
        temp = new JLabel("Tempt"); 
        temp.setFont(new Font("Arial", Font.PLAIN, 20)); 
        temp.setSize(100, 20); 
        temp.setLocation(100, 350); 
        c.add(temp); 
  

        btemp = new JTextField(); 
        btemp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        btemp.setSize(180,20); 
        btemp.setLocation(200, 350); 
        c.add(btemp); 
        
        term = new JCheckBox("Ensure u have entered Correct"); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(150, 400); 
        c.add(term); 
        
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
    	
        if (e.getSource() == sub) { 
            if (term.isSelected()) { 
                String data5 = "" ;
                String data6 ="";
                String data7 ="";
                String data 
                    = "HB_Count : "
                      + tname.getText() + "\n"
                      + "WBC : "
                      + tmno.getText() + "\n"; 
              if(cough.isSelected())
              {
                    data5 = "Symptoms : Cough"
                            + "\n";
                    if(Fever.isSelected())
                    {
                          data5 = "Cough,Fever"
                                  + "\n"; 
                          if(cold.isSelected())
                          {
                                data5 ="Cough,Fever,Cold,"
                                        + "\n"; 
                          
                    }
              }
                    
              
              else
              {
            	  
              }
                String data2 
                    = "Blood_GP : "
                      + (String)Blood_gp.getSelectedItem() 
                     
                      + "\n"; 
  
                String data3 = "PulseRate : " + tadd.getText(); 
                String data8 = "Temperature : " + btemp.getText(); 
                tout.setText(data + data5  +data6  +data7 + data2 + data3 +"\n"+ data8); 
                tout.setEditable(false); 
                
                res.setText("Registration Successfully.."); 
                if( res.getText()==("Registration Successfully.."))
                	JOptionPane.showMessageDialog(this, "Are You Sure");
                
                String ecp=new String(tname.getText());
            	String ecp1=new String(tmno.getText());
                 String ecp2=new String(data5);
                 String ecp3=new String((String)Blood_gp.getSelectedItem());
                 String ecp4=new String(data3);
                 String ecp5=new String(data8);
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
					stmt = con.prepareStatement("insert into patient_report values(?,?,?,?,?,?)");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
        		try {
					stmt.setString(1,ecp);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		try {
					stmt.setString(2,ecp1);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		try {
					stmt.setString(3,ecp2);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
        		try {
					stmt.setString(4,ecp3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		try {
					stmt.setString(5,ecp4);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		try {
					stmt.setString(6,ecp5);
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
                	
                	new Ui2();
            } 
            
            else { 
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Please accept the"
                            + " terms & conditions.."); 
            
            } 
        } 
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tname.setText(def); 
            tadd.setText(def); 
            tmno.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            Blood_gp.setSelectedIndex(0); 
            
            resadd.setText(def); 
        }}
    } 
       	  
        public static void main(String[] args) throws Exception 
        { 
           new Ui1(); 
        } 
    
} 
package Registration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel Gender;
    private JRadioButton Male;
    private JRadioButton Female;
    private JRadioButton Transgender;
    private ButtonGroup gengp;
    private JLabel DOB;
    private JComboBox Date;
    private JComboBox Month;
    private JComboBox Year;
    private JLabel Add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1980","1990","1991","1992","1993","1994","1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    // Layout of the form set
    // Type of data inputted
    public MyFrame()
    {
        setTitle("Intergence Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        mno = new JLabel("Mobile NO");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);

        Gender = new JLabel("Gender");
        Gender.setFont(new Font("Arial", Font.PLAIN, 20));
        Gender.setSize(100, 20);
        Gender.setLocation(100, 200);
        c.add(Gender);

        Male = new JRadioButton("Male");
        Male.setFont(new Font("Arial", Font.PLAIN, 15));
        Male.setSelected(true);
        Male.setSize(75, 20);
        Male.setLocation(200, 200);
        c.add(Male);

        Female = new JRadioButton("Female");
        Female.setFont(new Font("Arial", Font.PLAIN, 15));
        Female.setSelected(false);
        Female.setSize(80, 20);
        Female.setLocation(275, 200);
        c.add(Female);

        Transgender = new JRadioButton("Transgender");
        Transgender.setFont(new Font("Arial", Font.PLAIN, 15));
        Transgender.setSelected(false);
        Transgender.setSize(80, 20);
        Transgender.setLocation(275, 200);
        c.add(Female);
        gengp = new ButtonGroup();
        gengp.add(Male);
        gengp.add(Female);
        gengp.add(Transgender);

        DOB = new JLabel("DOB");
        DOB.setFont(new Font("Arial", Font.PLAIN, 20));
        DOB.setSize(100, 20);
        DOB.setLocation(100, 250);
        c.add(DOB);

        Date = new JComboBox(dates);
        Date.setFont(new Font("Arial", Font.PLAIN, 15));
        Date.setSize(50, 20);
        Date.setLocation(200, 250);
        c.add(Date);

        Month = new JComboBox(months);
        Month.setFont(new Font("Arial", Font.PLAIN, 15));
        Month.setSize(60, 20);
        Month.setLocation(250, 250);
        c.add(Month);

        Year = new JComboBox(years);
        Year.setFont(new Font("Arial", Font.PLAIN, 15));
        Year.setSize(60, 20);
        Year.setLocation(320, 250);
        c.add(Year);

        Add = new JLabel("Address");
        Add.setFont(new Font("Arial", Font.PLAIN, 20));
        Add.setSize(100, 20);
        Add.setLocation(100, 300);
        c.add(Add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Clear");
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

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                        = "Name : "
                        + tname.getText() + "\n"
                        + "Mobile : "
                        + tmno.getText() + "\n";
                if (Male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";



                String data2
                        = "DOB : "
                        + (String)Date.getSelectedItem()
                        + "/" + (String)Month.getSelectedItem()
                        + "/" + (String)Year.getSelectedItem()
                        + "\n";

                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successful and Welcome");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                        + " Terms & Conditions!");
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
            Date.setSelectedIndex(0);
            Month.setSelectedIndex(0);
            Year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}

// Driver Code
class Registration {

    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}


//This is my first attempt at creating the questionaire. The only issue i had with this is making a timer functional which is a design aspect of our solution.

package Registration;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class Question extends JFrame implements  ActionListener {


    JLabel label;
    JRadioButton radioButton[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];

    // created with  jFrame with radioButton and JButton
    Question(String s) {
        super(s);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            radioButton[i] = new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }
        btnNext = new JButton("Next");
        btnResult = new JButton("Result");
        btnResult.setVisible(false);
        btnNext.addActionListener(this);
        btnResult.addActionListener(this);
        add(btnNext);
        add(btnResult);
        set();
        label.setBounds(30, 40, 450, 20);
        //radioButton[0].setBounds(50, 80, 200, 20);
        radioButton[0].setBounds(50, 80, 450, 20);
        radioButton[1].setBounds(50, 110, 200, 20);
        radioButton[2].setBounds(50, 140, 200, 20);
        radioButton[3].setBounds(50, 170, 200, 20);
        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    // handle all actions based on event
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            if (check())
                count = count + 1;
            current++;
            set();
            if (current == 9) {
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            current++;
            JOptionPane.showMessageDialog(this, "correct answers= " + count);
            JOptionPane.showMessageDialog(this, "Well done on finishing our test. We will be in contact soon to let you know about the outcome!- Intergence Team.");
            System.exit(0);
        }
    }

    // The questions with options are set

    // Example questions from reference:
    void set() {
        radioButton[4].setSelected(true);
        if (current == 0) {
            label.setText("Q1:  Which is an official language for Android Development ?");
            radioButton[0].setText("Java");
            radioButton[1].setText("Kotlin");
            radioButton[2].setText("C++");
            radioButton[3].setText("Javascript");
        }
        if (current == 1) {
            label.setText("Q2:  Which feature of java 7 allows to not explicitly close IO resource?");
            radioButton[0].setText("try catch finally");
            radioButton[1].setText("IOException");
            radioButton[2].setText("AutoCloseable");
            radioButton[3].setText("Streams");
        }
        if (current == 2) {
            label.setText("Q3: SessionFactory is a thread-safe object.");
            radioButton[0].setText("true");
            radioButton[1].setText("false");
            radioButton[2].setText("don't know");
            radioButton[3].setText("false");
        }
        if (current == 3) {
            label.setText("Q4: Which is the new method introduced in java 8 to iterate over a collection?");
            radioButton[0].setText(" for (String i : StringList)");
            radioButton[1].setText("foreach (String i : StringList)");
            radioButton[2].setText("StringList.forEach()");
            radioButton[3].setText("List.for()");
        }
        if (current == 4) {
            label.setText("Q5:  What is the substitute of Rhino javascript engine in Java 8?");
            radioButton[0].setText(" Nashorn");
            radioButton[1].setText("V8");
            radioButton[2].setText("Inscript");
            radioButton[3].setText("Narcissus");
        }
        if (current == 5) {
            label.setText("Q6: How to read entire file in one line using java 8?");
            radioButton[0].setText("Files.readAllLines()");
            radioButton[1].setText("Files.read()");
            radioButton[2].setText("Files.readFile()");
            radioButton[3].setText("Files.lines()");
        }
        if (current == 6) {
            label.setText("Q7:  Which feature of java 7 allows to not explicitly close IO resource?");
            radioButton[0].setText("try catch finally");
            radioButton[1].setText("IOException");
            radioButton[2].setText("AutoCloseable");
            radioButton[3].setText("Streams");
        }
        if (current == 7) {
            label.setText("Q8:  Which of the following is not a core interface of Hibernate?");
            radioButton[0].setText("Configuration");
            radioButton[1].setText("Criteria");
            radioButton[2].setText("SessionManagement");
            radioButton[3].setText("Session");
        }
        if (current == 8) {
            label.setText("Q9: SessionFactory is a thread-safe object.");
            radioButton[0].setText("true");
            radioButton[1].setText("false");
            radioButton[2].setText("don't know");
            radioButton[3].setText("false");
        }
        if (current == 9) {
            label.setText("Q10: Which of the following is not a state of object in Hibernate?");
            radioButton[0].setText("Attached()");
            radioButton[1].setText("Detached()");
            radioButton[2].setText("Persistent()");
            radioButton[3].setText("Transient()");
        }
        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            radioButton[j].setBounds(50, 80 + i, 200, 20);

    }

    // Boolean used to verify answers
    boolean check() {
        if (current == 0)
            return (radioButton[1].isSelected());
        if (current == 1)
            return (radioButton[1].isSelected());
        if (current == 2)
            return (radioButton[0].isSelected());
        if (current == 3)
            return (radioButton[2].isSelected());
        if (current == 4)
            return (radioButton[0].isSelected());
        if (current == 5)
            return (radioButton[0].isSelected());
        if (current == 6)
            return (radioButton[1].isSelected());
        if (current == 7)
            return (radioButton[2].isSelected());
        if (current == 8)
            return (radioButton[0].isSelected());
        if (current == 9)
            return (radioButton[0].isSelected());
        return false;
    }

    public static void main(String s[]) {
        new Question("Intergance's Candidate Test");
    }

}

// This is ideally what the quiz would be like except it doesn't have timer. The 2nd attempt at the quiz has this but it isn't as neat as this one.
// I wanted the questions to be randomly generated to the  role but i have no knowledge of the actual roles Intergence or the different types quwstion that they set
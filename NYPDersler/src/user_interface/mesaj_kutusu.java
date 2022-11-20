package user_interface;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ysfbil
 */
public class mesaj_kutusu {
    
    JFrame frame;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       mesaj_kutusu mk=new mesaj_kutusu();
    }
    
    mesaj_kutusu(){
        frame=new JFrame("Mesaj kutusu göster");
        JButton button = new JButton("Tıkla");
        button.setAlignmentX(100.00f);
        button.addActionListener(new MyAction());
        frame.add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class MyAction implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame,"Mesaj Kutusu");
        }
    }
}

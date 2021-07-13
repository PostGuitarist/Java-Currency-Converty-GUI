
import javax.swing.*;

class gui{
    public static void main(String[] args){
        JFrame frame = new JFrame("USD to Euro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Convert");
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}

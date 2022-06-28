import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //JOptionPane = pop up a standard dialog box that prompts users for a value
        //    or informs them of something.

//        JOptionPane.showMessageDialog(null,"This is a message","Title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is a info message","Title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is a question message","Title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is a warning message","Title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is a error message","Title",JOptionPane.ERROR_MESSAGE);

//        int answer = System.out.println(JOptionPane.showConfirmDialog(null,"Yes, No or Cancel?","Hmm",JOptionPane.YES_NO_CANCEL_OPTION));
//        String name = JOptionPane.showInputDialog("What is your name?: ");
//        System.out.println("Hello " + name);

        String[] responses = {"O nie!", "Chyba ty", "Tylko nie w szczepionke"};
        ImageIcon icon = new ImageIcon("muka.png");

        JOptionPane.showOptionDialog(
                null,
                "Muka!",
                "Title",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);

    }
}

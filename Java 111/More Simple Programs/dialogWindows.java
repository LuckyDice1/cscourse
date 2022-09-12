import javax.swing.JOptionPane;

public class dialogWindows {
    public static void main(String[] args) {
        Double num = Double.parseDouble(JOptionPane.showInputDialog("What would you like to input?"));
        System.out.println(num);
        System.exit(0);
    }
}

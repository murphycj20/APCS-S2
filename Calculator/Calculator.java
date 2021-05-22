import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Calculator extends JFrame {

    public Menu() {

        initUI();
    }

    private void initUI() {

        createMenuBar();

        setTitle("Colin's Calculator");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        var menuBar = new JMenuBar();
        var exitIcon = new ImageIcon("src/resources/exit.png");

        var fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        var eMenuItem = new JMenuItem("Exit", exitIcon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener((event) -> System.exit(0));

        fileMenu.add(eMenuItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new Menu();
            ex.setVisible(true);
        });
    }
}
    public static String calculate(String equation){
        char[] arr = equation.toCharArray();
        String a = "";
        String b = "";
        String op = "";
        double result =  0;

        if (arr[0] == '-'){
            a += arr[0];
            for (int i = 1; i < arr.length; i++){
                char c = arr[i];
                if(c >= '0' && c <= '9' || c =='.'){
                    if (op.isEmpty()){
                        a += c;
                    } else {
                        b += c;
                    }
                }
    
                if (c == '+' || c == '-' || c == '*' || c == '/'){
                    op += c;
                }
            }
        } else {
            for (char c : arr){
                if(c >= '0' && c <= '9' || c =='.'){
                    if (op.isEmpty()){
                        a += c;
                    } else {
                        b += c;
                    }
                }
    
                if (c == '+' || c == '-' || c == '*' || c == '/'){
                    op += c;
                }
                
            }
        }

        if (op.equals("+")){
            result = (Double.parseDouble(a) + Double.parseDouble(b));
        } else if (op.equals("-")){
            result = (Double.parseDouble(a) - Double.parseDouble(b));
        } else if (op.equals("*")){
            result = (Double.parseDouble(a) * Double.parseDouble(b));
        } else if (op.equals("/")){
            result = (Double.parseDouble(a) / Double.parseDouble(b));
        }

        return String.valueOf(result);
    }
}
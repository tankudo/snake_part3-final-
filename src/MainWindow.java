import javax.swing.*;

/**
 * Created by infuntis on 15/01/17.
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Progmatic Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //крестик закрывает окно
        setSize(640,665);
        setLocation(400,200);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}

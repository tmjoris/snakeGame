import javax.swing.JFrame;

public class GameFrame{
    private JFrame frame;

    GameFrame(){
         frame = new JFrame();
         
         frame.add(new GamePanel());
         frame.setTitle("Snake");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setResizable(false);
         frame.pack();
         frame.setVisible(true);
         frame.setLocationRelativeTo(null);
    }
    
}

import javax.swing.JFrame;

public class GameFrame extends JFrame { class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); // Make sure the window isn't resizable
        this.pack(); // Sizes the frame so all contents are at preferred sizes
        this.setVisible(true); // Make the frame visible
        this.setLocationRelativeTo(null); // Center the window on the screen
    }

    public static void main(String[] args) {
        new GameFrame(); // Create and display the game window
    }
}

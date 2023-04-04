import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SwingWindow extends JFrame {
    private JPanel MainPanel;
    private JButton recruitAWorkerButton;
    private JButton workEmButton;
    private JLabel Picture;

    public SwingWindow() throws IOException {
        setContentPane(MainPanel);
        setTitle("Window test");
        setSize(1000,1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        recruitAWorkerButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Picture.isShowing())
                {
                    Picture.hide();
                }
                else
                {
                    Picture.show();
                }
            }
        }
        )
        ;
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PraktikTombol {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Praktik Tekan Tombol");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Halo, silakan klik tombol!");
        JButton button = new JButton("Klik Saya");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol berhasil diklik!");
            }
        });

        panel.add(label);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
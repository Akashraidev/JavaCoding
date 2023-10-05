import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleStopwatch {
    private long startTime = 0;
    private Timer timer;

    private JFrame frame;
    private JLabel timerLabel;

    public SimpleStopwatch() {
        frame = new JFrame("Stopwatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        timerLabel = new JLabel("0.000");
        timerLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        frame.add(timerLabel, BorderLayout.CENTER);

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stop();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void start() {
        if (timer == null) {
            startTime = System.currentTimeMillis();
            timer = new Timer(10, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    long elapsedTime = System.currentTimeMillis() - startTime;
                    double seconds = (double) elapsedTime / 1000;
                    timerLabel.setText(String.format("%.3f", seconds));
                }
            });
            timer.start();
        }
    }

    public void stop() {
        if (timer != null) {
            timer.stop();
            timer = null;
        }
    }

    public void reset() {
        stop();
        timerLabel.setText("0.000");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleStopwatch();
            }
        });
    }
}

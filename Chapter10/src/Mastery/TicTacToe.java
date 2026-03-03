package Mastery;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class TicTacToe {

    private JFrame frame;
    private boolean whoseturn = true;
    private JButton[][] board = new JButton[3][3];
    private JLabel WinorLOSS;
    private boolean gameOver = false;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TicTacToe window = new TicTacToe();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TicTacToe() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 609);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(50, 50, 380, 380);
        frame.getContentPane().add(panel);
        panel.setLayout(new GridLayout(3, 3));

        WinorLOSS = new JLabel("");
        WinorLOSS.setFont(new Font("Tahoma", Font.PLAIN, 17));
        WinorLOSS.setBounds(50, 465, 377, 79);
        frame.getContentPane().add(WinorLOSS);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (gameOver)
                    return;

                JButton playeroneortwo = (JButton) e.getSource();

                if (playeroneortwo.getText().equals("")) {

                    if (whoseturn) {
                        playeroneortwo.setText("X");
                    } else {
                        playeroneortwo.setText("O");
                    }

                    if (checkWinner()) {
                        if (whoseturn) {
                            WinorLOSS.setText("The winner is X");
                        } else {
                            WinorLOSS.setText("The winner is O");
                        }
                        gameOver = true;
                    } 
                    else if (isBoardFull()) {
                        WinorLOSS.setText("It has been a tie");
                        gameOver = true;
                    }

                    whoseturn = !whoseturn;
                }
            }
        };

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = new JButton("");
                board[row][col].setFont(new Font("Tahoma", Font.BOLD, 60));
                board[row][col].addActionListener(listener);
                panel.add(board[row][col]);
            }
        }
    }

    private boolean checkWinner() {

        for (int i = 0; i < 3; i++) {
            if (!board[i][0].getText().equals("") &&
                board[i][0].getText().equals(board[i][1].getText()) &&
                board[i][1].getText().equals(board[i][2].getText())) {
                return true;
            }

            if (!board[0][i].getText().equals("") &&
                board[0][i].getText().equals(board[1][i].getText()) &&
                board[1][i].getText().equals(board[2][i].getText())) {
                return true;
            }
        }

        if (!board[0][0].getText().equals("") &&
            board[0][0].getText().equals(board[1][1].getText()) &&
            board[1][1].getText().equals(board[2][2].getText())) {
            return true;
        }

        if (!board[0][2].getText().equals("") &&
            board[0][2].getText().equals(board[1][1].getText()) &&
            board[1][1].getText().equals(board[2][0].getText())) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col].setText("");
            }
        }
        whoseturn = true;
        gameOver = false;
        WinorLOSS.setText("");
    }
}
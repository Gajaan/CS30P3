
/*

Program: TicTacToe.java          Last Date of this Revision: March 3 2026
Purpose: an application that allows two players to play a computerized tic-tac-toe game.

Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/


package Mastery; // Declares the package this class belongs to

import java.awt.EventQueue; // Imports EventQueue to safely start the GUI
import javax.swing.JFrame; // Imports JFrame for the main window
import javax.swing.JPanel; // Imports JPanel to group components
import java.awt.GridLayout; // Imports GridLayout to organize buttons in a grid
import javax.swing.JButton; // Imports JButton for clickable game squares
import java.awt.event.ActionListener; // Imports ActionListener to respond to button clicks
import java.awt.event.ActionEvent; // Imports ActionEvent for event information
import javax.swing.JLabel; // Imports JLabel to display text messages
import java.awt.Font; // Imports Font to control text size and style

public class TicTacToe {

    private JFrame frame; // Declares the main window frame
    private boolean whoseturn = true; // Tracks whose turn it is (true = X, false = O)
    private JButton[][] board = new JButton[3][3]; // Creates a 3x3 array of buttons for the board
    private JLabel WinorLOSS; // Label used to display the winner or tie message
    private boolean gameOver = false; // Tracks whether the game has ended

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() { // Runs the GUI on the event-dispatching thread
            public void run() { // Method that starts the program
                try { // Try block to catch errors
                    TicTacToe window = new TicTacToe(); // Creates a TicTacToe object
                    window.frame.setVisible(true); // Makes the window visible
                } catch (Exception e) { // Catches any errors
                    e.printStackTrace(); // Prints error information to the console
                }
            }
        });
    }

    public TicTacToe() { // Constructor that runs when the object is created
        initialize(); // Calls the method that builds the GUI
    }

    private void initialize() { // Method that sets up the entire interface
        frame = new JFrame(); // Creates the main window
        frame.setBounds(100, 100, 500, 609); // Sets window position and size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes program when window is closed
        frame.getContentPane().setLayout(null); // Uses absolute positioning for components

        JPanel panel = new JPanel(); // Creates a panel to hold the Tic Tac Toe board
        panel.setBounds(50, 50, 380, 380); // Sets panel position and size
        frame.getContentPane().add(panel); // Adds the panel to the frame
        panel.setLayout(new GridLayout(3, 3)); // Divides the panel into a 3x3 grid

        WinorLOSS = new JLabel(""); // Creates a label to show the result of the game
        WinorLOSS.setFont(new Font("Tahoma", Font.PLAIN, 17)); // Sets the font style and size
        WinorLOSS.setBounds(50, 465, 377, 79); // Sets the position and size of the label
        frame.getContentPane().add(WinorLOSS); // Adds the label to the window

        ActionListener listener = new ActionListener() { // Creates one listener for all buttons
            public void actionPerformed(ActionEvent e) { // Runs when a board button is clicked

                if (gameOver) // Checks if the game has already ended
                    return; // Stops the method if the game is over

                JButton playeroneortwo = (JButton) e.getSource(); // Finds which button was clicked

                if (playeroneortwo.getText().equals("")) { // Ensures the square is empty

                    if (whoseturn) { // Checks if it is X's turn
                        playeroneortwo.setText("X"); // Places an X on the button
                    } else { // Otherwise it is O's turn
                        playeroneortwo.setText("O"); // Places an O on the button
                    }

                    if (checkWinner()) { // Checks if the current move created a winner
                        if (whoseturn) { // If it was X's turn
                            WinorLOSS.setText("The winner is X"); // Displays X as the winner
                        } else { // If it was O's turn
                            WinorLOSS.setText("The winner is O"); // Displays O as the winner
                        }
                        gameOver = true; // Marks the game as finished
                    } 
                    else if (isBoardFull()) { // Checks if the board is full with no winner
                        WinorLOSS.setText("It has been a tie"); // Displays tie message
                        gameOver = true; // Ends the game
                    }

                    whoseturn = !whoseturn; // Switches turns between X and O
                }
            }
        };

        for (int row = 0; row < 3; row++) { // Loops through rows of the board
            for (int col = 0; col < 3; col++) { // Loops through columns of the board
                board[row][col] = new JButton(""); // Creates a new empty button
                board[row][col].setFont(new Font("Tahoma", Font.BOLD, 60)); // Sets large font for X and O
                board[row][col].addActionListener(listener); // Attaches the listener to the button
                panel.add(board[row][col]); // Adds the button to the panel
            }
        }
    }

    private boolean checkWinner() { // Method that checks if a player has won

        for (int i = 0; i < 3; i++) { // Loops through rows and columns
            if (!board[i][0].getText().equals("") && // Checks if first square is not empty
                board[i][0].getText().equals(board[i][1].getText()) && // Compares first and second squares
                board[i][1].getText().equals(board[i][2].getText())) { // Compares second and third squares
                return true; // Returns true if a row has matching symbols
            }

            if (!board[0][i].getText().equals("") && // Checks if first square in column is not empty
                board[0][i].getText().equals(board[1][i].getText()) && // Compares first and second column squares
                board[1][i].getText().equals(board[2][i].getText())) { // Compares second and third column squares
                return true; // Returns true if a column has matching symbols
            }
        }

        if (!board[0][0].getText().equals("") && // Checks the first diagonal square
            board[0][0].getText().equals(board[1][1].getText()) && // Compares with the center
            board[1][1].getText().equals(board[2][2].getText())) { // Compares with the bottom-right square
            return true; // Returns true if the diagonal matches
        }

        if (!board[0][2].getText().equals("") && // Checks the opposite diagonal square
            board[0][2].getText().equals(board[1][1].getText()) && // Compares with the center
            board[1][1].getText().equals(board[2][0].getText())) { // Compares with the bottom-left square
            return true; // Returns true if the diagonal matches
        }

        return false; // Returns false if no winning condition is found
    }

    private boolean isBoardFull() { // Method that checks if all squares are filled
        for (int row = 0; row < 3; row++) { // Loops through rows
            for (int col = 0; col < 3; col++) { // Loops through columns
                if (board[row][col].getText().equals("")) { // Checks if any square is empty
                    return false; // Returns false if an empty square exists
                }
            }
        }
        return true; // Returns true if every square is filled
    }

    private void resetBoard() { // Method that resets the game board
        for (int row = 0; row < 3; row++) { // Loops through rows
            for (int col = 0; col < 3; col++) { // Loops through columns
                board[row][col].setText(""); // Clears the button text
            }
        }
        whoseturn = true; // Resets the turn back to X
        gameOver = false; // Allows the game to start again
        WinorLOSS.setText(""); // Clears the result message
    }
}
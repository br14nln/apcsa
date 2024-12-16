import java.util.Scanner;

public class tictactoes {
    public char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    public int round = 1;
    public char player = 'X';
    public boolean gameover = false;

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean play = true;
        while (play) {
            tictactoes game = new tictactoes();
            game.game();
        }
    }

    public void game() {
        System.out.println("Round: " + round);
        printBoard();
        while (!gameover) {
            // whos move
            if (player == 'X') {
                move('X');
                player = 'O';
                if (win('X')) {
                    gameover = true;
                }
            } else {
                move('O');
                player = 'X';
                if (win('O')) {
                    gameover = true;
                }
            }
            printBoard();
            
            //see if draw
            if (round == 9 && !gameover) {
                System.out.println("It's a draw!");
                gameover = true;
            }
            round++;
        }
        // keep playing or no
        System.out.println("Game over! Play again? (yes/no)");
        String response = input.nextLine().toLowerCase();
        if (!response.equals("yes")) {
            System.exit(0);
        }
    }

    public void move(char symbol) {
        boolean valid = false;

        while (!valid) {
            System.out.println(symbol + " please make your move in the format: row,col (e.g., 0,2)");
            String move = input.nextLine();

            // Check if valid
            if (move.length() != 3 || move.charAt(1) != ',') {
                System.out.println("Invalid input format. Please use the format: row,col.");
                continue;
            }

            char rowChar = move.charAt(0);
            char colChar = move.charAt(2);

            // Check if input numeric
            if (!Character.isDigit(rowChar) || !Character.isDigit(colChar)) {
                System.out.println("Invalid input. Row and column must be numbers.");
                continue;
            }

            // Convert to int
            int row = rowChar - '0';
            int col = colChar - '0';

            // Check if valid
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid move. The grid is 3x3. Row and column must be between 0 and 2.");
            } else if (board[row][col] != ' ') {
                System.out.println("That position is already occupied. Choose another position.");
            } else {
                // Move is valid
                place(symbol, row, col);
                valid = true;
            }
        }
    }

    public boolean win(char symbol) {
        boolean rWin = false;
        boolean cWin = false;
        boolean d1Win = true;
        boolean d2Win = true;

        // Row win
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == symbol && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                rWin = true;
            }
            if (rWin) {
                System.out.println("Player: " + symbol + " wins on row " + row);
                return true;
            }
        }

        // Column win
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == symbol && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                cWin = true;
            }
            if (cWin) {
                System.out.println("Player: " + symbol + " wins on column " + col);
                return true;
            }
        }

        // Diagonal win
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != symbol) {
                d1Win = false;
            }
            if (board[i][2 - i] != symbol) {
                d2Win = false;
            }
        }
        if (d1Win) {
            System.out.println("Player: " + symbol + " wins on the diagonal starting at 0,0");
            return true;
        }
        if (d2Win) {
            System.out.println("Player: " + symbol + " wins on the diagonal starting at 0,2");
            return true;
        }
        return false;
    }

    public boolean validMove(char symbol, int row, int col) {
        if (row > 2 || row < 0 || col > 2 || col < 0) {
            System.out.println("The grid is 3x3, select another position.");
            return false;
        }
        if (board[row][col] != ' ') {
            System.out.println("There is already a " + board[row][col] + " there! Select another position.");
            return false;
        }
        return true;
    }

    public void place(char symbol, int row, int col) {
        board[row][col] = symbol;
    }

    public void printBoard() {
        System.out.println();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("[" + board[row][col] + "]");
            }
            System.out.println();
        }
        System.out.println();
    }
}

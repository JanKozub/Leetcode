package programming_skills;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println(tictactoe(new int[][]{{2, 2}, {0, 2}, {1, 0}, {0, 1}, {2, 0}, {0, 0}}));
    }

    public static String tictactoe(int[][] moves) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        char turn = 'A';

        for (int[] move : moves) {
            if (turn == 'A') board[move[0]][move[1]] = 'X';
            else board[move[0]][move[1]] = 'O';

            turn = turn == 'A' ? 'B' : 'A';
        }

        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return board[0][0] == 'X' ? "A" : "B";
        } else if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return board[0][2] == 'X' ? "A" : "B";
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0] == 'X' ? "A" : "B";
            } else if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i] == 'X' ? "A" : "B";
            }
        }

        if (moves.length < 9) return "Pending";

        return "Draw";
    }
}

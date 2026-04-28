package LessonRecursion.SudokuProgram;

public class Main {

    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3},
        };

        printBoard(board);

        if(solveBoard(board)) {
            System.out.println("Solved Successfully!");
        }
        else {
            System.out.println("Unsolvable board :(");
        }

        printBoard(board);

    }

    private static void printBoard(int[][] board) {
        for(int row = 0; row < GRID_SIZE; row++) {
            if(row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for(int column = 0; column < GRID_SIZE; column++) {
                if(column % 3 == 0 && column != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }

    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for(int i = 0; i < GRID_SIZE; i++) {
            if(board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for(int i = 0; i < GRID_SIZE; i++) {
            if(board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3; // Finds the top-left box in each 3x3 grid

        for(int i = localBoxRow; i < localBoxRow + 3; i++) { // Will check 3 rows down from the top-left box found above
            for(int j = localBoxColumn; j < localBoxColumn + 3; j++) { // Will check 3 columns right from the top-left box found above
                if(board[i][j] == number) { // Effectively checks the entire "3x3" grid
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
        return !isNumberInRow(board, number, row) &&
                !isNumberInColumn(board, number, column) &&
                !isNumberInBox(board, number, row, column);
    }

    private static boolean solveBoard(int[][] board) {
        for(int row = 0; row < GRID_SIZE; row++) {
            for(int column = 0; column < GRID_SIZE; column++) {
                if(board[row][column] == 0) { // Checks if the spot is empty
                    for(int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) { // Inputs numbers from 1-9
                        if(isValidPlacement(board, numberToTry, row, column)) { // Validates whether the number is allowed to be placed
                            board[row][column] = numberToTry; // Sets that position on the grid to the valid potential answer

                            if (solveBoard(board)) { // Recursively calls the method again, this time with the new board (Recursive case)
                                return true; // Continues until the board is appropriately filled out, each number following the Sudoku rules
                            }
                            else { // (Skip these lines till line 103) Thus the if-condition becomes false, so this else body is used
                                board[row][column] = 0; // Backtracks the board back to 0, so that the NEXT valid number on line 91 can be checked. (This happens with the next recursive method call on the stack, NOT the original unless the original is the last method on the stack -> LIFO)
                            }
                        } // This line is reached if the board is unable to input any valid numbers
                    }
                    return false; // Thus the current recursive method call returns false (go-to line 98) (If the original call returns false, then the board is unsolvable)
                }
            }
        }
        return true; // If this line is ever met, then the board must have been solved. (i.e. there are no more '0's on the board (Base case)
    }
}

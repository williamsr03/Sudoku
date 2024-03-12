import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuGame
{   
    public static void main(String[] args) throws FileNotFoundException
    {   
        // Get the sudoku file name from the command line arguments
        String sudokuFile = args[0];
        // Create a sudoku argument from the file name provided at the command line
        Sudoku sudoku = new Sudoku(sudokuFile);
        
        // Create a Scanner that reads from user input
        Scanner scanner = new Scanner(System.in);
                
        // loop until we reach a break statement
        while(true)
        {
            System.out.println(sudoku);
            // Prompt the user for their next move 
            System.out.print("Enter the next row, column, and value (separated by spaces): ");
            
            // If the user entered an integer, we will parse their move
            if(scanner.hasNextInt())
            {
                // User should provide the row, followed by the column, followed by the value
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                int val = scanner.nextInt();
            
                // check if the row number is valid
                if(row < 1 || row > 9)
                {
                    System.out.println("Invalid row\n");
                    continue;
                }
                
                // check if the column number is valid
                if(col < 1 || col > 9)
                {
                    System.out.println("Invalid column\n");
                    continue;
                }
            
                // check if the value is valid
                if(val < 0 || val > 9)
                {
                    System.out.println("Invalid value\n");
                    continue;
                }
            
                // check if the user is trying to make a move that causes row, column, or box conflicts
                if(sudoku.isValid(row, col, val))
                {
                    sudoku.setValue(row, col, val);
                }
                else
                {
                    System.out.println("Invalid move\n");
                    continue;
                }
            }
            else
            {
                String command = scanner.next();
                
                // If the user entered q, then we quit by breaking the loop
                if(command.equals("q"))
                {
                    break;
                }
                
                // DON'T MODIFY THE CODE ABOVE THIS
                
                // MODIFY THIS SECTION TO SOLVE THE PUZZLE IF THE USER ENTERS 's'
                
                // DON'T MODIFY THE CODE BELOW THIS
                
                // If they didn't enter a number of q, then the command is invalid
                else
                {
                    System.out.println("Invalid command\n");
                }
            }
        }
                        
    }
}

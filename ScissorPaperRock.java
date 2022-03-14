/*
This program simulates the scissor-paper-rock game. When it is run, prompts the user
for an input of 0 (scissor), 1 (paper), or 2 (rock). It then
displays a message indicating whether the user or computer
wins, loses, or draws.
 */

import java.util.Scanner;

public class ScissorPaperRock {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      // Generate integer 0, 1, or 2
      int computer = (int)(Math.random() * 3);
      
      // Prompt user to input 0, 1, or 2
      System.out.print("Choose one; scissor(0), rock(1), paper(2): ");
      int user = input.nextInt();
      
      // Check guess with Switch sturcture
      switch (computer){
        
         case 0:
            if (user == 0)
               System.out.print("The computer is scissor. You are scissor too. It is a draw.");
            else if (user == 1)
               System.out.print("The computer is scissor. You are rock. You won.");
            else if (user == 2)
               System.out.print("The computer is scissor. You are paper. You lost.");
            break;
         
         case 1:
            if (user == 0)
               System.out.print("The computer is rock. You are scissor. You lost.");
            else if (user == 1)
               System.out.print("The computer is rock. You are rock too. It is a draw.");
            else if (user == 2)
               System.out.print("The computer is rock. You are paper. You won.");
            break;
            
         case 2:
            if (user == 0)
               System.out.print("The computer is paper. You are scissor. You won.");
            else if (user == 1)
               System.out.print("The computer is paper. You are rock. You lost.");
            else if (user == 2)
               System.out.print("The computer is paper. You are paper too. It is a draw.");
            break;
		}
	}
}

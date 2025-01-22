package chap02;

public class GuessGame {

   Player p1;
   Player p2;
   Player p3;
   
   public void startGame() {
       p1 = new Player();
       p2 = new Player();
       p3 = new Player();
       int guessp1 = 0;
       int guessp2 = 0;
       int guessp3 = 0;
       boolean p1isRight = false;
       boolean p2isRight = false;
       boolean p3isRight = false;
       int targetNumber = (int) (Math.random() * 10);
       System.out.println("I'm thinking of a number between 0 and 9...");

        int maxround = 0;
       while(maxround <=5) {

        /* this loop will run until atleast one person guessed the 
        targetNumber or number of rounds is less than 5. */
           System.out.println("Number to guess is " + targetNumber);
           
           maxround ++;
           p1.guess();
           p2.guess();
           p3.guess();
           
           guessp1 = p1.number;
           System.out.println("Player one guessed " + guessp1);
           guessp2 = p2.number;
           System.out.println("Player two guessed " + guessp2);
           guessp3 = p3.number;
           System.out.println("Player three guessed " + guessp3);
           
           if (guessp1 == targetNumber) {
               p1isRight = true;
           }
           if (guessp2 == targetNumber) {
               p2isRight = true;
           }
           if (guessp3 == targetNumber) {
               p3isRight = true;
           }
           
           
           if (p1isRight || p2isRight || p3isRight)
           {
            // atleast one player guessed the target Number
               System.out.println("We have a winner!");
               System.out.println("Player one got it right? " + p1isRight);
               System.out.println("Player two got it right? " + p2isRight);
               System.out.println("Player three got it right? " + p3isRight);
               System.out.println("Game is over");
               System.out.println("The trial number is "+ maxround);
               break;
           }
           else
           {

            // target Number not guessed by anyone.
               System.out.println("Players will have to try again.");
           }
       }
   }
}

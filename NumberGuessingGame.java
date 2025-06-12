/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessing.game;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    int i=5;
    
    int score =0;
    public void Guessnum(){
        Random ran = new Random();
        int count=0;
        
        
        Scanner sc= new Scanner(System.in);
        
        int randomNum= ran.nextInt(100)+1;
        System.out.println("Random numer is :"+randomNum);
        
        
        while(i>0){
            System.out.println("You have "+i+" attempts left");
    
            System.out.println("Guess the number (1-100):");
            count++;
            int points=0;
        
            int guess= sc.nextInt();
        
            if(guess==randomNum){
                System.out.println("****************WIN WIN *************");
                System.out.println("It took you" +count+" attempts");
                
                if(count==1){
                    points= 50;
                }
                else if(count==2){
                    points= 40;
                }
                else if(count==3){
                    points= 30;
                }
                else if(count==4){
                    points= 20;
                }
                
                score+=points;
                System.out.println("Your score is: "+score);
                
                System.out.println("DO YOU WANY ANOTHER ROUND?? PRESS '1' FOR YES AND '0' FOR NO--");
                int a= sc.nextInt();
                if(a==1){
                    Guessnum();
                }
                else{
                    System.out.println("SCORE :"+score);
                    System.out.println("GAME ENDED");
                    break;
                    
                }
                
                
               
                
            }
            else if(guess<randomNum){
                System.out.println("OOPs!!!!!--Guess a higher number");
            
            }
            else{
                System.out.println("OOPs!!!!!--Guess a smaller number");
            
            }
            i--;
            
            System.out.println("");
            System.out.println("");
            
        }
        if(i==0){
            System.out.println("OUT OF ATTEMPTS--------BETTER LUCK NEXT TIME");

            
        }
        

        
    }

   
    public static void main(String[] args) {
        NumberGuessingGame obj= new NumberGuessingGame();
        obj.Guessnum();
        
                
        
        
        
        
        
        
        
    }
        
    
}

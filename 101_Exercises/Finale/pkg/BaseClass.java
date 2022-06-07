package pkg;
import java.util.Scanner;
import java.util.Random;


public class Hangman {
	String guessingWord;
	int numTries;
	String generateWord;
	
	Scanner sc = new Scanner(System.in);
	
	public Hangman(){
		generatedWord = sc.nextLine();
		numTries = 5;
	}
	
	public int Hangman{
		generateWord = sc.nextLine();
		numTries = generateWord.length();
	}
	
	public static int guessCheck(String a, int b){
		for(int i = 0; i<generateWord.length(); i++){
			String check = generatedWord.substring(i,i+1);
			if(check.equals(a)){
				return i;
			}
			else{
				return -1;
			}
		}
	}
	
	public static boolean checkWin(boolean [] array){
		for(int i = 0; i<array.length; i++){
			if(gernerateWord.substring(i,i+1).equals(array.substring(i,i+1))){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	


}


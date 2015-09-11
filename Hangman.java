/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class Hangman extends ConsoleProgram {
	
	public void init(){
		hc = new HangmanCanvas();
		add(hc);
	}

    public void run() {
		/* You fill this in */
    	hc.reset();
    	
    	int i = rgen.nextInt(0,9);
    	HangmanLexicon hl = new  HangmanLexicon();
    	String str = hl.getWord(i);
    	int len = str.length();
    	String s = ""; 
    	for(int j=0;j<len/2+1;j++)
    	    s=s+"_ ";
    	int guess=8;
    	println("Welcome to Hangman!");
  	    //println(str);
  	    println("The word looks like this : "+s);
    	while(guess>0)
    	{ 
    	  println("You have "+guess+" guesses left.");
    	  String g = readLine("Your guess: ");
    	  int k = -1; 
    	  int count=0;
    	  while(true)
    	  {
    		  
    	      k=str.indexOf(g.toUpperCase(),k+1);
    	      if(k == -1)
    	    	  break;
    	      else
    	    	  {
    	    	    s = s.substring(0,k)+str.charAt(k)+s.substring(k+1,len);
    	    	    count++;
    	    	  }
    	  }
    	  
    	  if(count==0)
        	 {
    		  hc.noteIncorrectGuess(g);
    		  println("There are no "+g.toUpperCase()+"'s in the word");
    		  guess--;
        	 }
    	  
    	  else
         {
    		hc.displayWord(s);
        	println("That guess is correct");
        	println("The world now look like this: "+s);
         }
    	  if(s.equals(str))
    	  { 
    		  println("you win");
    	      break;
    	  }
    	  else if(guess==0)
    		  {
    		   println("You are completely hung.");
    		   println("The world was: "+str);
    		   println("You Lose.");
    		  }
    	}
    	
	}
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private HangmanCanvas hc;
}

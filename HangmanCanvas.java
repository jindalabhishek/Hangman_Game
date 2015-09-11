/*
 * File: HangmanCanvas.java
 * ------------------------
 * This file keeps track of the Hangman display.
 */

import acm.graphics.*;

public class HangmanCanvas extends GCanvas {

/** Resets the display so that only the scaffold appears */
	public void reset() {
		/* You fill this in */
		removeAll();
		GLine sf = new GLine(50,10,50,SCAFFOLD_HEIGHT);
		GLine bl = new GLine(50,10,50+BEAM_LENGTH,10);
		GLine rope = new GLine(50+BEAM_LENGTH,10,50+BEAM_LENGTH,10+ROPE_LENGTH);
		add(sf);
		add(bl);
		add(rope);
	}

/**
 * Updates the word on the screen to correspond to the current
 * state of the game.  The argument string shows what letters have
 * been guessed so far; unguessed letters are indicated by hyphens.
 */
	
	public void displayWord(String word) {
		/* You fill this in */
		label1.setLabel(word);
		add(label1);
		
	}

/**
 * Updates the display to correspond to an incorrect guess by the
 * user.  Calling this method causes the next body part to appear
 * on the scaffold and adds the letter to the list of incorrect
 * guesses that appears at the bottom of the window.
 */
	public void noteIncorrectGuess(String letter) {
		/* You fill this in */
		s=s+letter;
		label2.setLabel(s);
		add(label2);
		GOval head = new GOval(50+BEAM_LENGTH-HEAD_RADIUS,10+ROPE_LENGTH,2*HEAD_RADIUS,2*HEAD_RADIUS);
		GLine b = new GLine(50+BEAM_LENGTH,10+ROPE_LENGTH+2*HEAD_RADIUS,50+BEAM_LENGTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH);
		GLine lo = new GLine(50+BEAM_LENGTH,10+ARM_OFFSET_FROM_HEAD+ROPE_LENGTH+2*HEAD_RADIUS,50+BEAM_LENGTH-UPPER_ARM_LENGTH,10+ARM_OFFSET_FROM_HEAD+ROPE_LENGTH+2*HEAD_RADIUS);
		GLine la = new GLine(50+BEAM_LENGTH-UPPER_ARM_LENGTH,10+ARM_OFFSET_FROM_HEAD+ROPE_LENGTH+2*HEAD_RADIUS,50+BEAM_LENGTH-UPPER_ARM_LENGTH,10+ARM_OFFSET_FROM_HEAD+ROPE_LENGTH+2*HEAD_RADIUS+LOWER_ARM_LENGTH);
		GLine ro = new GLine(50+BEAM_LENGTH,10+ARM_OFFSET_FROM_HEAD+ROPE_LENGTH+2*HEAD_RADIUS,50+BEAM_LENGTH+UPPER_ARM_LENGTH,10+ARM_OFFSET_FROM_HEAD+ROPE_LENGTH+2*HEAD_RADIUS);
		GLine ra = new GLine(50+BEAM_LENGTH+UPPER_ARM_LENGTH,10+ARM_OFFSET_FROM_HEAD+ROPE_LENGTH+2*HEAD_RADIUS,50+BEAM_LENGTH+UPPER_ARM_LENGTH,10+ARM_OFFSET_FROM_HEAD+ROPE_LENGTH+2*HEAD_RADIUS+LOWER_ARM_LENGTH);
		GLine lh = new GLine(50+BEAM_LENGTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH,50+BEAM_LENGTH-HIP_WIDTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH);
		GLine ll = new GLine(50+BEAM_LENGTH-HIP_WIDTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH,50+BEAM_LENGTH-HIP_WIDTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH+LEG_LENGTH);
		GLine rh = new GLine(50+BEAM_LENGTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH,50+BEAM_LENGTH+HIP_WIDTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH);
		GLine rl = new GLine(50+BEAM_LENGTH+HIP_WIDTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH,50+BEAM_LENGTH+HIP_WIDTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH+LEG_LENGTH);
		GLine lf = new GLine(50+BEAM_LENGTH-HIP_WIDTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH+LEG_LENGTH,50+BEAM_LENGTH-HIP_WIDTH-FOOT_LENGTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH+LEG_LENGTH);
		GLine rf = new GLine(50+BEAM_LENGTH+HIP_WIDTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH+LEG_LENGTH,50+BEAM_LENGTH+HIP_WIDTH+FOOT_LENGTH,10+ROPE_LENGTH+2*HEAD_RADIUS+BODY_LENGTH+LEG_LENGTH);
	
		if(j==8)
		  add(head);
		if(j==7)
			add(b);
		if(j==6)
		{
			add(lo);
			add(la);
		}
		if(j==5)
		{
			add(ro);
			add(ra);
		}
		if(j==4)
		{
			add(lh);
			add(ll);
		}
		if(j==3)
		{
			add(rh);
			add(rl);
		}
		if(j==2)
			add(lf);
		if(j==1)
			add(rf);
		j--;
	}

/* Constants for the simple version of the picture (in pixels) */
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;
	private GLabel label1= new GLabel("",50,400);
	private GLabel label2= new GLabel("",50,420);
	int j = 8;
	String s = "";
}

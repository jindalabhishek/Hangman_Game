/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import acm.util.*;

public class HangmanLexicon {

/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return 10;
	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
		switch (index) {
			case 0: return "B U O Y";
			case 1: return "C O M P U T E R";
			case 2: return "C O N N O I S S E U R";
			case 3: return "D E H Y D R A T E";
			case 4: return "F U Z Z Y";
			case 5: return "H U B B U B";
			case 6: return "K E Y H O L E";
			case 7: return "Q U A G M I R E";
			case 8: return "S L I T H E R";
			case 9: return "Z I R C O N";
			default: throw new ErrorException("getWord: Illegal index");
		}
	};
}

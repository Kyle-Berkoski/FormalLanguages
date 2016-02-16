
public class Driver extends ManWolf {

	/**
	 *assuming you already defined values for q0-q3
	 **/
	private static final int q0  = 0;
	private static final int q1  = 1;
	private static final int q2  = 2;
	private static final int q3  = 3;
	private static final int q4  = 4;
	private static final int q5  = 5;
	private static final int q6  = 6;
	private static final int q7  = 7;
	private static final int q8  = 8;
	private static final int q9  = 9;
	private static final int q10 = 10;
	
	private static int[][] delta = 
	/*      q0,  q1,  q2,  q3,  q4,  q5,  q6,  q7,  q8,  q9 */
	/*G*/ {{q1,  q0,  q10, q5,  q6,  q3,  q4,  q10, q9,  q8},
	/*w*/  {q10, q10, q3,  q2,  q10, q10, q7,  q6,  q10, q10},
	/*C*/  {q10, q10, q4,  q10, q2,  q7,  q10, q5,  q10, q10},
	/*N*/  {q10, q2,  q1,  q10, q10, q10, q10, q8,  q7,  q10}};
	
	int state = q0;
	/*
	 * Makes on transition on each char in 
	 * the given string.
	 * @param in: the string to use as input
	**/
	
	public void process(String in) {
	  for (int i = 0; i < in.length(); i++){
	    char c = in.charAt(i);
	    try{
	      state = delta[state][c-'a']; //fix me 
	    }
	    catch (ArrayIndexOutOfBoundsException ex) {
	      state = delta[state][1]; //possible solution
	    }
	  }
	}
	
	public boolean isCorrect() {
	  return state == q9;
	}
}

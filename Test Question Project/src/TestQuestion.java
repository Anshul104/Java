/**
 * 
 * @author Anshul104
 * Assignment: Test Question
 */
public class TestQuestion 
{
	
	private int questionNumber;
	private static int nextQuestionNumber = 1;
	private String text;
	private String correctAnswer;
	
	
	/*
	 * Write a constructor which takes the test and correct
	 * answer as arguments.
	 */
	
	public TestQuestion(String text, String answer)
	{
		this.text = text;
		correctAnswer = answer;
		questionNumber= nextQuestionNumber;
		nextQuestionNumber++;
	}

	/*
	 * Write a method called isCorrect which takes a
	 * student's answer as an argument and returns true
	 * if it is correct and false otherwise
	 */
	public boolean isCorrect(String answer)
	{
		if(correctAnswer.equals(answer))
			return true;
		return false;
		
	}
	
	/**
	 * returns a string representation of the question
	 */
	public String toString()
	{
		return questionNumber + ".\t" + text;
	}
	
	
	public int getQuestionNumber()
	{
		return questionNumber;
	}
	
	public String getText()
	{
		return text;
	}
	/*
	 * You may need to add additional methods to this class in order
	 * to implement your sub classes.
	 * 
	 */
}

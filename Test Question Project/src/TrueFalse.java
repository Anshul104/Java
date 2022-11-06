/**
 * 
 * @author Anshul104
 * Assignment: Test Question
 */
public class TrueFalse extends TestQuestion
{
	
	/*
	 * Create a constructor which takes a string for the text and and
	 * string for the answer as arguments
	 * 
	 */
	
	public TrueFalse(String text, String answer)
	{
		super(text,answer);
	}
	
	/*
	 * override the toString method so that it displays the question
	 * in the following format:
	 * 
	 * 2. True/False:  This is the text for question 3.
	 * 
	 * The text only includes the statement.  You must format
	 * everything else.
	 */
	public String toString()
	{
		String question = super.getQuestionNumber() + ".\tTrue/False: " + super.getText();
		return question;
	}
	

}

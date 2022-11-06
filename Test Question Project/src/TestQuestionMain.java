import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Anshul104
 * Assignment: Test Question Project
 */
public class TestQuestionMain 
{

	public static void main(String[] args)
	{
		ArrayList<TestQuestion> allQuestions = new ArrayList<TestQuestion>();
		Scanner in = new Scanner(System.in);
		
		boolean anotherQuestion = true;
		
		while(anotherQuestion)
		{	
			System.out.print("Would you like to create a 'MC' or 'True/False' question: ");
			String questionType = in.nextLine();
			if(questionType.equals("MC"))
			{
				System.out.print("Would you like the text of the question to be: ");
				String text = in.nextLine();
				
				System.out.print("How many choices will there be: ");
				int numberOfAnswers = in.nextInt();
				in.nextLine();
				
				String[] answerChoices = new String[numberOfAnswers];
				for (int i = 0; i<numberOfAnswers;i++)
				{
					int newi = i+1;
					System.out.print("What will the choice be for Answer Choice " +  newi  + ": ");
					String oneChoice = in.nextLine();
					answerChoices[i] = oneChoice;
				}
				
				System.out.print("Which choice is the answer: ");
				int answer = in.nextInt();
				in.nextLine();
				
				MCQuestion mcquestion = new MCQuestion(text, answerChoices, answerChoices[answer-1]);
				allQuestions.add(mcquestion);
			}
			
			if(questionType.equals("True/False"))
			{
				System.out.print("Would you like the text of the question to be: ");
				String text = in.nextLine();
		
				System.out.print("Will it be True or False: ");
				String answer = in.nextLine();
							
				TrueFalse trueOrFalseQuestion = new TrueFalse(text,answer);
				allQuestions.add(trueOrFalseQuestion);
			}
			
			System.out.print("Would you like to create another question(yes/no): ");
			String another = in.nextLine();
			
			if(another.equals("yes"))
				anotherQuestion = true;
			if(another.equals("no"))
				anotherQuestion = false;
			System.out.println();
		
		}
		for(int i = 0;i<allQuestions.size();i++)
		{
			System.out.println(allQuestions.get(i));
		}
	}

}
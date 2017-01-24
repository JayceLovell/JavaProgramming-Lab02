package exercise2;

public class MagicBall {
	private int size;
	private String color;
	final static String GREETING_MESSAGE="Hello";
	
	public MagicBall(int Size,String Color) {
		size=Size;
		color=Color;
	}
	final class Messages{
		final static String ONE="Ask again later";
		final static String TWO="It is certain";
		final static String THREE="Yes, definitely";
		final static String FOUR="Cannot predict now";
		final static String FIVE="Don't count on it";
		final static String SIX="My reply is no";	
	}
	public String ToString()
	{
		String message= String.format("Ball is %d Big and %s is the color",size,color);
		return message;
	}
}

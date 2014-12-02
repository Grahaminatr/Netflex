public abstract class Movies {
	protected String kind;
	protected String assumption;

	public void whichType() {
		System.out.println("In this program the computer gives the user three type of movie (Comedy, Romance, Action).");
		System.out.println("It will give you three suggestions for each category.");
		System.out.println("It will also list movies that have overlapping categories. Such as Romantic Comedies...etc.");
	}
	public void goodLuck()
	{
		System.out.println("I hope you like the suggestions!");
	}

	public abstract void sentenceType();
	
	

}

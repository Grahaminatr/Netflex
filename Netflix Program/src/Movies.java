public abstract class Movies {
	protected String kind;
	protected String assumption;

	public void whichType() {
		System.out.println("Netflix gives the you several genres of movies (Comedy, Horror, Action, Drama, Roamnce, and Disney movies).");
		System.out.println("It will give you popular movies for each category that you may enjoy.");
		
	}
	public void useOfSuper()
	{
		System.out.println("I hope you enjoy our movies and consider us again.");
	}

	public abstract void sentenceType();
}

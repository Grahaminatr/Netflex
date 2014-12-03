public class HorrorMovie extends Movies {
	public HorrorMovie() {
		kind = "Horror";
		assumption = "not sleeping that night";

	}

	public void selectHorrorMovie() {
		System.out.println("Here are some suggestions for the " + kind
				+ " movies.");

		System.out.println("\t1)The Shining\n\t2)The Exorcist\n\t3)Nightmare on Elm Street");
	}

	@Override
	public void sentenceType() {
		System.out.println("You like " + kind + " which means you like a good "
				+ assumption + ".");
	}

	public void useOfSuper() {
		super.useOfSuper();

	}


	
}

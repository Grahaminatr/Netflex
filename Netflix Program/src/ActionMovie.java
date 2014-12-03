public class ActionMovie extends Movies {
	public ActionMovie() {
		kind = "action";
		assumption = "adrenaline";
	}

	public void selectActionMovie() {
		System.out.println("Here are the three suggestions for the " + kind + " movies.");
		System.out
				.println("\t1)The Avengers\n\t2)Pirates of the Caribbean: The Curse of the Black Pearl\n\t3)Django Unchanged");
	}

	@Override
	public void sentenceType() {
		System.out.println("You like " + kind + " which means you like "
				+ assumption + ".");
	}
	public void goodLuck() {
		super.goodLuck();
	}

}

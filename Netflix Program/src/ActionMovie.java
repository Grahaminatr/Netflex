public class ActionMovie extends Movies {
	public ActionMovie() {
		kind = "action";
		assumption = "a rush";
	}

	public void selectActionMovie() {
		System.out.println("Here are the three suggestions for the " + kind + " movies.");
		System.out
				.println("\t1)The Avengers 2\n\t2)Iron Man\n\t3)Thor");
	}

	@Override
	public void movieStyle() {
		System.out.println("You like " + kind + " which means you like "
				+ assumption + ".");
	}
	public void useOfSuper() {
		super.useOfSuper();
	}

}

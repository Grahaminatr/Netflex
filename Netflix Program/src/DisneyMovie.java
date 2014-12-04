
public class DisneyMovie {
	public DisneyMovie()
	{
	kind = "Disney";
	assumption = "cartoon";
	}
	public void selectDisneyMovie() {
		System.out.println("Here are the three suggestions for the " + kind + " movies.");
		System.out.println("\t1)Beauty and the Beast\n\t2)Lion King\n\t3)Toy Story");
	}
	@Override
	public void MovieStyle() {
		System.out.println("You like " + kind + " which means you might enjoy "
				+ assumption + ".");
	}
	public void useOfSuper() {
		super.useOfSuper();
	}
}

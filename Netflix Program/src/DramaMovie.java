
public class DramaMovie extends Movies {
	public DramaMovie() 
	{
		kind = "Drama";
		assumption = "to be a twist in a movie";

	}

	public void selectDramaMovie()
	{
		System.out.println("Here are some suggestions for the " + kind
				+ " movies.");

		System.out.println("\t1)The Godfather\n\t2)Schindler's List\n\t3)Inception");
	}

	@Override
	public void movieStyle() 
	{
		System.out.println("You like " + kind + " which means you like  "
				+ assumption + ".");
	}

	public void useOfSuper() 
	{
		super.useOfSuper();
	}
}


public class ComedyMovie extends Movies{
	public ComedyMovie()
	{
	kind = "comedy";
	assumption = "a good laugh";
	}
	public void selectComedyMovie() {
		System.out.println("Here are the three suggestions for the " + kind + " movies.");
		System.out.println("\t1)Ace Ventura\n\t2)Anchorman\n\t3)Airplane");
	}
	@Override
	public void sentenceType() {
		System.out.println("You like " + kind + " which means you might enjoy "
				+ assumption + ".");
	}
	public void goodLuck() {
		super.goodLuck();
	}
}

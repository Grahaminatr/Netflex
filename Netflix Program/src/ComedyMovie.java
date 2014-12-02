
public class ComedyMovie extends Movies{
	public ComedyMovie()
	{
	kind = "comedy";
	assumption = "laughing";
	}
	public void selectComedyMovie() {
		System.out.println("Here are the three suggestions for the " + kind + " movies.");
		System.out.println("\t1)White Chicks\n\t2)Freaky Friday\n\t3)School of Rock");
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


public class RomanceMovie {
	public RomanceMovie()
	{
	kind = "Romance";
	assumption = "love";
	}
	public void selectRomanceMovie() {
		System.out.println("Here are the three suggestions for the " + kind + " movies.");
		System.out.println("\t1)Titanic\n\t2)Her\n\t3)The Fault in our Stars");
	}
	@Override
	public void movieStyle() {
		System.out.println("You like " + kind + " which means you might enjoy "
				+ assumption + ".");
	}
	public void useOfSuper() {
		super.useOfSuper();
	}
}

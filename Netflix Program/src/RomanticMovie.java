public class RomanticMovie extends Movies {
	public RomanticMovie() {
		kind = "romance";
		assumption = "chick-flick";

	}

	public void selectRomanticMovie() {
		System.out.println("Here are some suggestions for the " + kind
				+ " movies.");

		System.out.println("\t1)Silver Linings Playbook\n\t2)Grease\n\t3)13 Going on 30");
	}

	@Override
	public void sentenceType() {
		System.out.println("You like " + kind + " which means you like a good "
				+ assumption + ".");
	}

	public void goodLuck() {
		super.goodLuck();

	}

	public void RomanticCom() {
		System.out.println("Here are some romantic comidies:");
		System.out.println("\t1)Revenge of the Bridesmaids\n\t2)Chalet Girl\n\t3)My Fake Fiance");
	}
}

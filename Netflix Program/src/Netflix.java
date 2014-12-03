public class Netflix {

	public static void main(String[] args) {
		RomanticMovie romMov = new RomanticMovie();
		Movies mov = new ActionMovie();
		ComedyMovie comMov = new ComedyMovie();
		ActionMovie actMov = new ActionMovie();

		mov.whichType();
		System.out.println();
		
		romMov.sentenceType();
		romMov.selectRomanticMovie();
		romMov.goodLuck();
		System.out.println();
		
		comMov.sentenceType();
		comMov.selectComedyMovie();
		comMov.goodLuck();
		System.out.println();
		
		actMov.sentenceType();
		actMov.selectActionMovie();
		actMov.goodLuck();
		System.out.println();
		
		romMov.RomanticCom();

	}

}

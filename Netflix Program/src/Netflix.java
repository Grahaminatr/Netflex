public class Netflix {

	public static void main(String[] args) {
		HorrorMovie horMov = new HorrorMovie();
		Movies mov = new ActionMovie();
		ComedyMovie comMov = new ComedyMovie();
		ActionMovie actMov = new ActionMovie();

		mov.whichType();
		System.out.println();
		
		horMov.sentenceType();
		horMov.selectHorrorMovie();
		horMov.goodLuck();
		System.out.println();
		
		comMov.sentenceType();
		comMov.selectComedyMovie();
		comMov.goodLuck();
		System.out.println();
		
		actMov.sentenceType();
		actMov.selectActionMovie();
		actMov.goodLuck();
		System.out.println();
		
		

	}

}

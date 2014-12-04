import java.util.Scanner;
public class Netflix {

	public static void main(String[] args) {
		HorrorMovie horMov = new HorrorMovie();
		Movies mov = new ActionMovie();
		ComedyMovie comMov = new ComedyMovie();
		ActionMovie actMov = new ActionMovie();
		DramaMovie draMov = new DramaMovie();
		RomanceMovie romMov = new RomanceMovie();
		DisneyMovie disMov = new DisneyMovie();

		mov.whichType();
		System.out.println();
		
		horMov.movieStyle();
		horMov.selectHorrorMovie();
		horMov.useOfSuper();
		System.out.println();
		
		comMov.movieStyle();
		comMov.selectComedyMovie();
		comMov.useOfSuper();
		System.out.println();
		
		actMov.movieStyle();
		actMov.selectActionMovie();
		actMov.useOfSuper();
		System.out.println();
		
		disMov.movieStyle();
		disMov.selectDisneyMovie();
		disMov.useOfSuper();
		System.out.println();
		
		draMov.movieStyle();
		draMov.selectDramaMovie();
		draMov.useOfSuper();
		System.out.println();
		
		romMov.movieStyle();
		romMov.selectRomanceMovie();
		romMov.useOfSuper();
		System.out.println();
		
		

	}

}

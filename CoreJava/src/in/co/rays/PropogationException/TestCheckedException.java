package in.co.rays.PropogationException;
//ex;why we do..online site we enter somethimg and not found so flow na
// ruke..meanms usde handle kre like kuch serach ki jgh 12345 to use site
// na ruke exception handle vo hota btayega kuck nai pr rukegi nai site

public class TestCheckedException {
	public static void main(String[] args) {
		try {
			dad();
		} catch (CheckedException e) {
			e.printStackTrace();
			System.out.println(e);
		}	
	}
	//obj s static s direct daad daugfht thora 
	public static void dad() throws CheckedException {
		mom();
		
	}
	public static void mom() throws CheckedException {
		son();
	}
	public static void son() throws CheckedException {
		CheckedException e= new CheckedException();
		throw e;
		
	}

}

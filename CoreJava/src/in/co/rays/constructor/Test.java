package in.co.rays.constructor;

//[1]

	//in previous prog both constructor and setget..
	//but if only to make cons so take variable public and 
	//if variable private so take setget for acces..
//public class Test {//(for only cons)
	//int ram=0;
	//int rom=0;
	//String color=null;
	
	//public Test(int ram, int rom, String color) {
		//this.ram=ram;
		//this.rom=rom;
		//this.color=color;
		
	//}
    //}

//[2]

//but if variable are private so have to take getset;
//just for ex of an prog after taking variable priv
public class Test {//(for  cons+getset)
	private int ram=0;
	private int rom=0;
	private String color=null;
	
	public Test(int ram, int rom, String color) {
		this.ram=ram;
		this.rom=rom;
		this.color=color;
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram=ram;	
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom= rom;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
	 this.color=color;
	} 
	}
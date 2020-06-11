package assessment_1;


class ABCDE{
	
	private String name;  
	
	public String getName(){  
		return name;  
		} 
	
	public void setName(String name){  
		this.name=name;  
		}
}

public class EncalpsulationDemo{

	public static void main(String[] args) {
		
		ABCDE a = new ABCDE();
		a.setName("Chandrakant");
		System.out.println(a.getName());  
	}

}

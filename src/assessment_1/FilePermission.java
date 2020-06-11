package assessment_1;

import java.io.File;

public class FilePermission {

	public static void main(String[] args) {
		
		File file = new File("D:\\Work_Assignment\\D16-D18\\data.txt");
		
		if(file.exists()){
            boolean result = file.setExecutable(true); 
            System.out.println("Is execute permission for owner set successfully? "+result);
        }else{
            System.out.println("Sorry...File doesn't exist.");
        }
		
		if(file.exists()){
            boolean result = file.setReadable(true, false);
            System.out.println("Is read permission for all set successfully? "+result);
        }else{
            System.out.println("Sorry...File doesn't exist.");
        }
		
		
		if(file.exists()){
            boolean result = file.setWritable(true, false); 
            System.out.println("Is write permission for all set successfully? "+result);
        }
        else{
            System.out.println("Sorry...File doesn't exist.");
        }
	}

}

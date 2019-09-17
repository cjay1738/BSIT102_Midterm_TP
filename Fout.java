import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fout {

    public static void main (String[] args) throws IOException {
    	
    	System.out.print("Enter the file name with extension: ");
    	Scanner cjInput = new Scanner (System.in);
    	
    	File cjFile = new File (cjInput.nextLine()+".ZXC");
    	cjInput = new Scanner(cjFile);
    	
    	String cjLine = cjInput.nextLine();
    	System.out.println(cjLine);
    	
    	cjInput.close();
    }
    
    
}
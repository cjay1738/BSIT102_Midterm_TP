import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;
public class Fin {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	String FileText;
    	String cjText;
    	
    	System.out.println("Input File Text");
    	FileText = sc.nextLine();
    	System.out.println("Input File Name");
    	cjText = sc.nextLine();
    	
    	FileWriter cjFile = new FileWriter (cjText+".ZXC");
    	cjFile.write(FileText);
    	cjFile.close();
    	
    		
    }
    
    
}
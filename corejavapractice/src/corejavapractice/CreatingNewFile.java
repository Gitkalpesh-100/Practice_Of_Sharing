package corejavapractice;

import java.io.File;
import java.io.IOException;

public class CreatingNewFile {

	public static void main(String[] args) throws IOException {

         File f = new File("C:\\Users\\Kalpesh Patil\\Desktop\\LC.txt");
         if(f.createNewFile()) 
         {
        	 System.out.println("New file created");	 
         }
         else { 
        	 System.out.println("File already exists");
         }

        /* if(f.exists());
         {
        	 System.out.println("File Name: " + f.getName());
        	 System.out.println("File Location: " + f.getAbsolutePath());
        	 System.out.println("File Writable: " + f.canWrite());
        	 System.out.println("File Readable: " + f.canRead());
        	 System.out.println("File Size: " + f.length());
        	// System.out.println("File removed: " + f.delete());
         }*/
 
	}
}

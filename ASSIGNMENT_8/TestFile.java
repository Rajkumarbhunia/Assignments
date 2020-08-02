package assignment;

import java.io.*;
import java.nio.file.Files;
public class TestFile {
	public static void main(String[] args) throws IOException{

        File dir = new File("E:/dxc/Badminton"); 
        boolean successful = dir.mkdir();
        if (successful)
        {
          System.out.println("directory was created successfully");
        }
        else
        {
          System.out.println("failed trying to create the directory");
        }
		File file1=new File("E:\\dxc\\Badminton","singles.txt");
		file1.createNewFile();
		File file2=new File("E:\\dxc\\Badminton","dubbles.txt");
		file2.createNewFile();  
        File dir2 = new File("E:/dxc/Badminton/Courts"); 
        dir.mkdir();
    	File file3=new File("E:\\dxc\\Badminton\\Courts","smash.dat");
		file1.createNewFile();
	     File oldName = new File("E:/dxc/Badminton/dubbles.txt");
	     File newName = new File("E:/dxc/Badminton/doubles.txt"); 
	      if(oldName.renameTo(newName)) {
	         System.out.println("renamed");
	      } else {
	         System.out.println("Error");
	      }
	      File f= new File("E:\\dxc\\Badminton\\singles.txt");
	      if(f.delete())  
	      {  
	      System.out.println(f.getName() + " deleted");
	      }  
	      else  
	      {  
	      System.out.println("failed");  
	      } 
	}
}

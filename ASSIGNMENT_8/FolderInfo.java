package assignment;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FolderInfo {
	public static void folderInfo(File file) throws IOException {
	if(file.exists()) {
		System.out.println("File exists");
		System.out.println("File:"+file.getName());
		System.out.println("Absolute Path:"+file.getAbsolutePath());
		System.out.println("Folder Path:"+file.getParentFile());
		System.out.println("Directory:"+file.getParentFile().getName());
		System.out.println("Path:"+file.getAbsoluteFile().getParent());
	}
	else
		System.out.println("“No Folder exists with the given name”");
	}
	public static void main(String[] args) throws IOException {
		String filePath="E:\\dxc\\Badminton\\dubbles.txt";
		File file=new File(filePath);
		folderInfo(file);
	}

}

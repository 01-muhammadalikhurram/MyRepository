import java.io.File;

class FileClass{

	public static void main(String[] args) {
		
		File file = new File("TextDoc.txt"); //file within the project folder
		File file1 = new File("D:\\GitHub Uploads/University Practices\\Java Practice\\File Class/TestDoc/TextDoc.txt"); //file outside the project folder
		File file2 = new File("TextDoc1.txt"); //will be deleted later

		if (file2.exists()) {
			System.out.println("The File Exists! :O!");

			System.out.println();
			
			//returen name if within the same folder else return full path
			System.out.println(file.getPath());
			System.out.println(file1.getPath());
			System.out.println(file2.getPath());

			System.out.println();

			//return full path
			System.out.println(file.getAbsolutePath());
			System.out.println(file1.getAbsolutePath());
			System.out.println(file2.getAbsolutePath());

			System.out.println();

			//return true if file is a file if its a folder or something else it will return false
			System.out.println(file.isFile());
			System.out.println(file1.isFile());
			System.out.println(file2.isFile());	

			//to del a file
			file2.delete();		
		}

		else{
			System.out.println("The File Does not Exists! :(");
		}

	}

}
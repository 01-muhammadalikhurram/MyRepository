java.io.FileWriter;

class FileWrite{

	public static void main(String[] args) {
		
		FileWriter writer = new FileWriter("File.txt");

		writer.write("Roses are red  \nViolet is blue");

	}

}
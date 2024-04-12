package handlingFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws Throwable {
		File f=new File("D:\\Job.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I want job in top Mnc company");
		bw.newLine();
		bw.write("With 25L package");
		bw.newLine();
		bw.write("With attending Classes and Practice");
		bw.flush();
		bw.close();

	}

}

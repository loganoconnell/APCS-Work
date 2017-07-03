// Lab21v100_OCONNELL.java
// Logan O'Connell

import java.io.*;
import java.util.*;

public class Lab21v100_OCONNELL {
	public static void main (String[] args) throws IOException {
      File inFile = new File("classlist.txt");
		BufferedReader inStream = new BufferedReader(new FileReader(inFile));
      
      ArrayList<String> text = new ArrayList<String>();
      String inString;
      
      while ((inString = inStream.readLine()) != null)
         text.add(inString);
      
      inStream.close();
      
      Collections.sort(text);
      
      File outFile = new File("sorted-classlist.txt");
      outFile.createNewFile();
      
      BufferedWriter outStream = new BufferedWriter(new FileWriter(outFile));
      
      for (String line : text) {
         outStream.write(line);
         outStream.newLine();
      }
      
      outStream.close();
      
      System.out.println("Done");
	}
}
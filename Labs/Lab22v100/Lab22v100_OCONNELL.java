// Lab22v100_OCONNELL.java
// Logan O'Connell

import java.io.*;
import java.util.*;

public class Lab22v100_OCONNELL {
	public static void main (String[] args) throws IOException {
      String fileName;
      ExceptionHandler handler;
      
      do {
         fileName = promptForFileName();
         handler = new ExceptionHandler(fileName);
      } while (handler.checkForError());

      
      FileSorter fileSorter = new FileSorter(fileName);
      fileSorter.sort();
	}
   
   public static String promptForFileName() {
      Scanner input = new Scanner(System.in);
      return input.next();
   }
}

class ExceptionHandler {
   private String input;
   
   public ExceptionHandler(String input) {
      this.input = input;
   }
   
   public boolean checkForError() {
      boolean error = false;
      
      try {
         File inFile = new File(input);
         BufferedReader inStream = new BufferedReader(new FileReader(inFile));
      }
      
      catch (NullPointerException ex) {
         error = true;
         exit(ex);
      }
      
      catch (FileNotFoundException ex) {
         error = true;
         exit(ex);
      }
      
      catch (IOException ex) {
         error = true;
         exit(ex);
      }
      
      finally {
         return error;
      }
   }
   
   public static void exit(Exception ex) {
      System.out.println(ex.getMessage());
      ex.printStackTrace();
      System.exit(1);
   }
}

class FileSorter {
   private String fileName;
   
   public FileSorter(String fileName) {
      this.fileName = fileName;
   }
   
   public void sort() throws IOException {
      File inFile = new File(fileName);
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
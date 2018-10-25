
import java.io.*;
import java.util.*;

public class HelloWorld
{
  public static void main(String[] args) throws IOException
  {
    Scanner textfile = new Scanner (System.in);
    BufferedReader bf = null;
    String line = "";
    String txtSplitby = " ";
    int totalA = 0, totalB = 0;
    
    try {
    String txt = "spending.txt";
    bf = new BufferedReader (new FileReader(txt));
    while ((line=bf.readLine()) !=null) {
      String[] splitLine = line.split(txtSplitby);
      String name = splitLine[0];
      String num = splitLine[1];
      int R = Integer.parseInt(num);
      
      switch(name) {
        case "A":
        	totalA = totalA + R;
        	break;
        case "B":
        	totalB = totalB + R;
        	break;
      	}
    }	
}
    catch (FileNotFoundException e) {
      e.printStackTrace();
}
  
}
  
}

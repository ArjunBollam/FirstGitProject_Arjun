import java.io.*;
public class DeserializeDemo {
	static FileInputStream fileIn;
	static ObjectInputStream in;
   public static void main(String [] args) throws IOException {
      SerializeDemo e = null;
      try {
         fileIn = new FileInputStream("C:\\Users\\arjun\\Desktop\\Tep.txt");
          in = new ObjectInputStream(fileIn);
         e = (SerializeDemo) in.readObject();
      }catch(FileNotFoundException i) {
         System.out.println("File Not Foubd");
         return;
      }catch(ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      finally{
    	  if(in !=null)
    	  in.close();
    	  if(fileIn !=null)
          fileIn.close();
      }
      
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);
   }
}
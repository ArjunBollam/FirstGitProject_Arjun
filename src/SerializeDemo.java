import java.io.*;
public class SerializeDemo implements Serializable {
	public String name;
    public String address;
    public int SSN;
    public int number;
   public static void main(String [] args) {
	   SerializeDemo e = new SerializeDemo();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("C:\\Users\\arjun\\Desktop\\Temp.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.print("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i) {
         i.printStackTrace();
      }
   }
}



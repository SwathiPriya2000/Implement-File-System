import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;
class filedemo
{
   public static void main(String[] args) throws Exception
   {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter the file name");
     String s=input.nextLine();
     File f1=new File(s);
     System.out.println("This file:"+(f1.exists()?"Exists":"Does not exists"));
     System.out.println("FileName:"+f1.getName());
     System.out.println("Path:"+f1.getPath());
     System.out.println("Is Readable:"+f1.canRead());
     System.out.println("Is Writable:"+f1.canWrite());
     System.out.println("FileSize:"+f1.length()+"bytes");
     try
     {
      BufferedReader br=new BufferedReader(new FileReader(f1));
      String st;
      System.out.println("************************************");
      System.out.println("Contents in the file");
      while((st=br.readLine())!=null)
            System.out.println(st);
     }
     catch(IOException e)
     {
        System.out.println("File does not exists");
     }
   }
}



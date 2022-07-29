package Virtualkey;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LockerPvtLtd {
	public static void main(String[] args) throws IOException {
		File folder = new File("C:\\Users\\Akanksha Patwa\\Desktop\\main");
        folder.mkdirs();
		int ch=0, Var=0;
		Scanner Sc =new Scanner(System.in);
		
		System.out.println("\t**********************\n");
		System.out.println("\t Welcome to LOCK IT! ");
		System.out.println("\t By, Locker Pvt Ltd. \n");
		System.out.println("\t**********************");
		System.out.println(" Developer\t: Akanksha Patwa \n ");
		
		while(true)
		{
			System.out.println("Please choose one of the following options :");
			System.out.println("1. List Current Files");
			System.out.println("2. Business Operations");
			System.out.println("3. Close Application");
			try{    
				ch = Sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			switch(ch)
			{
			case 1:

                File arr[] = folder.listFiles();
                Arrays.sort(arr);

                for(int i=0;i<arr.length;i++)
                    System.out.println(arr[i]);
                    break;


            case 2:
                Boolean temp = true;
                while(temp) {
                    System.out.println("Option 1 :- To Add a file in the existing Directory");
                    System.out.println("Option 2 :- To Delete a file from the existing Directory. ");
                    System.out.println("Option 3 :- To Search a user specified file from the Directory");
                    System.out.println("Option 4 :- Back to the previous menu");
                    System.out.println("Option 5 :- Terminate Program");


                    int Var2 = Sc.nextInt();

                    switch (Var2) {
                        case 1:
                            /*File f = new File("C:\Users\Akanksha Patwa\Desktop\main");*/
                            System.out.println("Enter a file name");
                            String name = Sc.next();
                            if(new File(folder,name).exists()){
                                System.out.println("file already exist");
                            }else {
                                File folder1 = new File(folder, name);
                                folder1.mkdir();
                                if (new File(folder, name).exists()) {
                                    System.out.println("file added successfully");
                                }
                            }

                            break;


                        case 2:
                            System.out.println("Enter a file name");
                            String name1 = Sc.next();
                            boolean folder2 = new File(folder, name1).exists();
                            System.out.println(folder2);
                            if (folder2 == true) {
                                File folder3 = new File(folder, name1);
                                folder3.delete();
                                System.out.println("File successfully deleted");
                            } else {
                                System.out.println("file does not exist");
                            }
                            /*folder2.delete();*/
                            break;


                        case 3:
                            System.out.println("Enter a keyword to search");
                            String search = Sc.next();

                            File arr1[] = folder.listFiles();
                            for(int a=0;a<arr1.length;a++){
                                if(arr1[a].getName().startsWith(search)){
                                    System.out.println(arr1[a]);
                                }else{
                                    System.out.println("No file found");
                                }
                            }
                            break;

                        case 4:

                            temp = false;
                            break;

                        case 5:

                            System.out.println("*********Program Terminated Successfully***********");
                            System.exit(0);
                        default:
                            System.out.println("Input correct value and retry");

                    }

                }
                break;

            case 3:
                System.out.println("*********Program Terminated Successfully***********");
                System.exit(0);

            default:
                System.out.println("Input correct value and retry");
                break;

        }
	
}
}
}
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class main
{	
	public static void main(String[] args) {

		File f = new File("Result.txt");
		try{
			Scanner in = new Scanner(System.in); //Make Scanner object

			String name;
			int sub1,sub2,sub3,sub4,sub5;

			
			FileWriter file = new FileWriter(f);
			f.createNewFile();



			//-------------------------------------------------------------
			//--------------------------Student1---------------------------
			//-------------------------------------------------------------

			System.out.print("\n* Enter name of the Student 1 : ");
			name = in.next();
			System.out.print("* Enter 1st marks of the Student 1 : ");
			sub1 = in.nextInt();
			System.out.print("* Enter 2nd marks of the Student 1 : ");
			sub2 = in.nextInt();
			System.out.print("* Enter 3rd marks of the Student 1 : ");
			sub3 = in.nextInt();
			System.out.print("* Enter 4th marks of the Student 1 : ");
			sub4 = in.nextInt();
			System.out.print("* Enter 5th marks of the Student 1 : ");
			sub5 = in.nextInt();

			funcs std1 = new funcs(name,sub1,sub2,sub3,sub4,sub5);
			System.out.println("\n\n============================================\n");
			System.out.println(std1.getName());
			System.out.println("Sum : "+std1.getSum());
			System.out.println("Average : "+std1.getAvg());
			System.out.println("\n============================================\n\n\n");

			file.write("\nName : "+name);
			file.write("\nSubject 1 marks : "+sub1);
			file.write("\nSubject 2 marks : "+sub2);
			file.write("\nSubject 3 marks : "+sub3);
			file.write("\nSubject 4 marks : "+sub4);
			file.write("\nSubject 5 marks : "+sub5);
			file.write("\n===================================================\n");
			file.write("Sum : "+std1.getSum());
			file.write("\nAverage : "+std1.getAvg());
			file.write("\n===================================================\n\n\n");



			//-------------------------------------------------------------
			//--------------------------Student2---------------------------
			//-------------------------------------------------------------

			System.out.print("\n* Enter name of the Student 2 : ");
			name = in.next();
			System.out.print("* Enter 1st marks of the Student 2 : ");
			sub1 = in.nextInt();
			System.out.print("* Enter 2nd marks of the Student 2 : ");
			sub2 = in.nextInt();
			System.out.print("* Enter 3rd marks of the Student 2 : ");
			sub3 = in.nextInt();
			System.out.print("* Enter 4th marks of the Student 2 : ");
			sub4 = in.nextInt();
			System.out.print("* Enter 5th marks of the Student 2 : ");
			sub5 = in.nextInt();

			funcs std2 = new funcs(name,sub1,sub2,sub3,sub4,sub5);
			System.out.println("\n\n============================================\n");
			System.out.println(std2.getName());
			System.out.println("Sum : "+std2.getSum());
			System.out.println("Average : "+std2.getAvg());
			System.out.println("\n============================================\n\n\n");

			file.write("\nName : "+name);
			file.write("\nSubject 1 marks : "+sub1);
			file.write("\nSubject 2 marks : "+sub2);
			file.write("\nSubject 3 marks : "+sub3);
			file.write("\nSubject 4 marks : "+sub4);
			file.write("\nSubject 5 marks : "+sub5);
			file.write("\n===================================================\n");
			file.write("Sum : "+std2.getSum());
			file.write("\nAverage : "+std2.getAvg());
			file.write("\n===================================================\n\n\n");



			//-------------------------------------------------------------
			//--------------------------Student3---------------------------
			//-------------------------------------------------------------

			System.out.print("\n* Enter name of the Student 3 : ");
			name = in.next();
			System.out.print("* Enter 1st marks of the Student 3 : ");
			sub1 = in.nextInt();
			System.out.print("* Enter 2nd marks of the Student 3 : ");
			sub2 = in.nextInt();
			System.out.print("* Enter 3rd marks of the Student 3 : ");
			sub3 = in.nextInt();
			System.out.print("* Enter 4th marks of the Student 3 : ");
			sub4 = in.nextInt();
			System.out.print("* Enter 5th marks of the Student 3 : ");
			sub5 = in.nextInt();

			funcs std3 = new funcs(name,sub1,sub2,sub3,sub4,sub5);
			System.out.println("\n\n============================================\n");
			System.out.println(std3.getName());
			System.out.println("Sum : "+std3.getSum());
			System.out.println("Average : "+std3.getAvg());
			System.out.println("\n============================================\n\n\n");

			file.write("\nName : "+name);
			file.write("\nSubject 1 marks : "+sub1);
			file.write("\nSubject 2 marks : "+sub2);
			file.write("\nSubject 3 marks : "+sub3);
			file.write("\nSubject 4 marks : "+sub4);
			file.write("\nSubject 5 marks : "+sub5);
			file.write("\n===================================================\n");
			file.write("Sum : "+std3.getSum());
			file.write("\nAverage : "+std3.getAvg());
			file.write("\n===================================================\n\n\n");



			//-------------------------------------------------------------
			//--------------------------Student4---------------------------
			//-------------------------------------------------------------

			System.out.print("\n* Enter name of the Student 4 : ");
			name = in.next();
			System.out.print("* Enter 1st marks of the Student 4 : ");
			sub1 = in.nextInt();
			System.out.print("* Enter 2nd marks of the Student 4 : ");
			sub2 = in.nextInt();
			System.out.print("* Enter 3rd marks of the Student 4 : ");
			sub3 = in.nextInt();
			System.out.print("* Enter 4th marks of the Student 4 : ");
			sub4 = in.nextInt();
			System.out.print("* Enter 5th marks of the Student 4 : ");
			sub5 = in.nextInt();

			funcs std4 = new funcs(name,sub1,sub2,sub3,sub4,sub5);
			System.out.println("\n\n============================================\n");
			System.out.println(std4.getName());
			System.out.println("Sum : "+std4.getSum());
			System.out.println("Average : "+std4.getAvg());
			System.out.println("\n============================================\n\n\n");

			file.write("\nName : "+name);
			file.write("\nSubject 1 marks : "+sub1);
			file.write("\nSubject 2 marks : "+sub2);
			file.write("\nSubject 3 marks : "+sub3);
			file.write("\nSubject 4 marks : "+sub4);
			file.write("\nSubject 5 marks : "+sub5);
			file.write("\n===================================================\n");
			file.write("Sum : "+std4.getSum());
			file.write("\nAverage : "+std4.getAvg());
			file.write("\n===================================================\n\n\n");



			//-------------------------------------------------------------
			//--------------------------Student5---------------------------
			//-------------------------------------------------------------

			System.out.print("\n* Enter name of the Student 5 : ");
			name = in.next();
			System.out.print("* Enter 1st marks of the Student 5 : ");
			sub1 = in.nextInt();
			System.out.print("* Enter 2nd marks of the Student 5 : ");
			sub2 = in.nextInt();
			System.out.print("* Enter 3rd marks of the Student 5 : ");
			sub3 = in.nextInt();
			System.out.print("* Enter 4th marks of the Student 5 : ");
			sub4 = in.nextInt();
			System.out.print("* Enter 5th marks of the Student 5 : ");
			sub5 = in.nextInt();

			funcs std5 = new funcs(name,sub1,sub2,sub3,sub4,sub5);
			System.out.println("\n\n============================================\n");
			System.out.println(std5.getName());
			System.out.println("Sum : "+std5.getSum());
			System.out.println("Average : "+std5.getAvg());
			System.out.println("\n============================================\n\n\n");

			file.write("\nName : "+name);
			file.write("\nSubject 1 marks : "+sub1);
			file.write("\nSubject 2 marks : "+sub2);
			file.write("\nSubject 3 marks : "+sub3);
			file.write("\nSubject 4 marks : "+sub4);
			file.write("\nSubject 5 marks : "+sub5);
			file.write("\n===================================================\n");
			file.write("Sum : "+std5.getSum());
			file.write("\nAverage : "+std5.getAvg());
			file.write("\n===================================================\n\n\n");
			file.close();

			

		}catch(Exception e){
			System.out.println("\n====> An error occurred!\n====> Check your Inputs!");
			f.delete();
		}	

	}	
}


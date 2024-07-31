import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your Name:");
	
	String name=sc.nextLine();
	
	System.out.println("Welcome to Student Management Portal"+ name);
	
	int ch=0;
	do {
		System.out.println("Press 1 Add Student");
		System.out.println("Press 2 Update Student");
		System.out.println("Press 3 Delete Student");
		System.out.println("Press 4 Read Student Records");
		System.out.println("Press 5 Exit");
		System.out.println("Enter choice:");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			System.out.println("Enter Student Name:");
			sc.nextLine();
			String sname=sc.nextLine();
			System.out.println("Enter Student phone no:");
			
			sc.nextLine();
			String phoneno=sc.nextLine();
			System.out.println("Enter Student city:");
			
			String city=sc.next();
			//public Student(String studentName, String studentPhone, String studentCity) {
			Student st=new Student(sname,phoneno,city);
			boolean ans=StudentDao.insertStudentData(st);
			System.out.println("Data inserted Successfully");
		break;
		case 2:
			
			System.out.println("press 1 to update name:");
			System.out.println("press 2 to update phoneno:");
			System.out.println("press 3 to update city:");
			int val=sc.nextInt();
			
			if(val==1) {
				System.out.println("Enter name which u want to update:");
				String name1=sc.next();
				System.out.println("Enter Id:");
				//	public static boolean updateStudentData(int val,String toUpdate,int id,Student s)
				int id=sc.nextInt();
				Student s1=new Student();
				s1.setStudentName(name1);
				boolean f=StudentDao.updateStudentData(val, name1, id, s1);
				System.out.println("Name is updated successfully");
		}
			else if(val==2) {
				System.out.println("Enter phone no which u want to update:");
				String phno=sc.next();
				System.out.println("Enter Id:");
				
				int id=sc.nextInt();
				Student s1=new Student();
				s1.setStudentPhone(phno);
				boolean f=StudentDao.updateStudentData(val, phno, id, s1);
				System.out.println("Phone number is updated successfully");
			}
			else if(val==3) {
				System.out.println("Enter city  which u want to update:");
				String city1=sc.next();
				System.out.println("Enter Id:");
				
				int id=sc.nextInt();
				Student s1=new Student();
				s1.setStudentCity(city1);
				boolean f=StudentDao.updateStudentData(val, city1, id, s1);
				System.out.println("city is updated successfully");
			}
			else {
				System.out.println("Data is not updated");
			}
			
			break;
		case 3:
			System.out.println("Enter Id which u want delete:");
			int id=sc.nextInt();
			StudentDao.deleteStudentData(id);
			System.out.println("Id is deleted");
			break;
		case 4:
			StudentDao.showAllStudentData();
			break;
		case 5:
			System.out.println("Bye Bye:");
			break;
			default:
				System.out.println("Wrong choice");
		}
	
	}while(ch!=5);
	}

}
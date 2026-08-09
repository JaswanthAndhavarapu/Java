package observation;
import java.util.ArrayList;
import java.util.Scanner;
class Book{
	private String bookname;
	private int bookid;
	private String author;
	private float price;
	private boolean available = true;
	private Student issuedto=null;
	public Book(String name,int id,String author,float price) {
		this.bookname=name;
		this.bookid=id;
		this.author=author;
		this.price=price;
		
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Student getIssuedto() {
		return issuedto;
	}
	public void setIssuedto(Student issuedto) {
		this.issuedto = issuedto;
	}
}
class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
class Student extends Person{
	String course;
	int year;
	public Student(String course, int year,int id,String name) {
		super(id,name);
		this.course = course;
		this.year = year;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
class  Faculty extends Person{
	private String designation;
	private String department;
	public Faculty(String designation, String department,int id ,String name) {
		super(id,name);
		this.designation = designation;
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
class Library{
	ArrayList<Book> book=new ArrayList<>();
	ArrayList<Student>student=new ArrayList<>();
	ArrayList<Faculty> faculty=new ArrayList<>();
	void addbook(String name,int id,String author,float price) {
		book.add(new Book(name,id,author,price));
	}
	void displaybooks() {
		for(int i=0;i<book.size();i++) {
			System.out.println("======================================");
			System.out.println("book name:"+book.get(i).getBookname());
			System.out.println("Author:"+book.get(i).getAuthor());
			System.out.println("BookID:"+book.get(i).getBookid());
			System.out.println("Availability Status:"+book.get(i).isAvailable());
			System.out.println("Issue Status:"+book.get(i).getIssuedto());
			System.out.println("Price:"+book.get(i).getPrice());
		}
	}
	void searchbook(String name) {
		for(int i=0;i<book.size();i++) {
			if (book.get(i).getBookname().equals(name)) {
				System.out.println("the book id found at the index of "+i);
			}
		}
	}
	void registerstudent(String course, int year,int id,String name) {
		student.add(new Student(course,year,id,name));
	}
	void registerfaculty(String designation, String department,int id ,String name) {
		faculty.add(new Faculty(designation, department,id ,name));
	}
	void issuebook(int id,int stdid) {
		Student temp=null;
		for(Student s:student) {
			if(s.getId()==stdid) {
				temp=s;
				break;
			}
		}
		if(temp==null) {
			System.out.println("the student with the desired Student id is not found");
			return;
		}
		for(Book b:book) {
			if(b.getBookid()==id) {
				if(b.isAvailable()) {
					b.setAvailable(false);
					b.setIssuedto(temp);
					System.out.println("book isssued successfully to person:"+temp.getName());
					return;
					
				}
				else {
					System.out.println("book already issued");
				}
			}
			
		}
	}
	void returnbook(int id,int stdid) {
		Book temp=null;
		for(Book b:book) {
			if(b.getIssuedto()!=null && b.getBookid()==id && b.getIssuedto().getId()==stdid) {
				System.out.println("the book is found with the desiredd iID");
				temp=b;
				break;
			}
		}
		if(temp==null) {
			System.out.println("there is no book lile that");
			return;
		}
		temp.setAvailable(true);
		temp.setIssuedto(null);
		System.out.println("book returned sccessfully");
	}
	}
public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {

            System.out.println("\n========== LIBRARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Register Student");
            System.out.println("5. Register Faculty");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

            case 1:

                System.out.print("Enter Book ID: ");
                int bookId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Name: ");
                String bookName = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                System.out.print("Enter Price: ");
                float price = sc.nextFloat();

                library.addbook(bookName, bookId, author, price);
                System.out.println("Book Added Successfully.");
                break;

            case 2:

                library.displaybooks();
                break;

            case 3:

                System.out.print("Enter Book Name to Search: ");
                String searchName = sc.nextLine();

                library.searchbook(searchName);
                break;

            case 4:

                System.out.print("Enter Student ID: ");
                int studentId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String studentName = sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                System.out.print("Enter Year: ");
                int year = sc.nextInt();

                library.registerstudent(course, year, studentId, studentName);
                System.out.println("Student Registered Successfully.");
                break;

            case 5:

                System.out.print("Enter Faculty ID: ");
                int facultyId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Faculty Name: ");
                String facultyName = sc.nextLine();

                System.out.print("Enter Designation: ");
                String designation = sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                library.registerfaculty(designation, department, facultyId, facultyName);
                System.out.println("Faculty Registered Successfully.");
                break;

            case 6:

                System.out.print("Enter BookID: ");
                int issueBookID = sc.nextInt();

                System.out.print("Enter Student ID: ");
                int issueStudentId = sc.nextInt();

                library.issuebook(issueBookID, issueStudentId);
                break;

            case 7:

                System.out.print("Enter Book ID: ");
                int returnBookId = sc.nextInt();

                System.out.print("Enter Student ID: ");
                int returnStudentId = sc.nextInt();

                library.returnbook(returnBookId, returnStudentId);
                break;

            case 8:

                System.out.println("Thank you for using the Library Management System.");
                break;

            default:

                System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}

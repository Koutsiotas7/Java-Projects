package Inheritance;

public class In_Runnable 
{
	public static void main(String[] args)
	{
		Student student = new Student();
		student.setName("Koulis");
		student.setEmail("Koulis1257@uowm.gr");
		student.setPhone("6912345678");
		student.setCollegeName("UOWM");
		student.setYear(2020);
		
		System.out.println("The student's info:");
		System.out.println(student);
		
		Employee employee = new Employee();
		employee.setName("Nikos");
		employee.setEmail("NikosB@uowm.gr");
		employee.setPhone("6976543210");
		employee.setEmployeeGrade('B');
		employee.setTitle("Web Developer");
		employee.setEmployerName("Axilleas");
		
		System.out.println("The employee's info:");
		System.out.println(employee);
		
	}
}

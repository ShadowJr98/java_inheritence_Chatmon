package csci3444.inheritence;

public class MainEntry 
{
	public static void main(String[] args) 
	{
		Person p1, p2;
		Teacher t = new TeacherImpl("ilker","java");
		Student s = new StudentImpl("Elijah", "java");
		
		 p1 =(Person) t;
		 p2 = (Person) s;
		
		System.out.println("Name of p1 and p2: "+ p1.getName() + " " + p2.getName());
		
	}
}

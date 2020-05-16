package csci3444.inheritence;

public class StudentImpl
extends PersonBaseImpl
implements Student
{
	private String takenCourseTitle;
	
	public StudentImpl(String _name, String _takenCourseTitle)
	{
		super(_name);
		takenCourseTitle = _takenCourseTitle;
	}
	
	public String studiesFor() 
	{
		return takenCourseTitle;
	}
	
	public String getDetails()
	{
		return "student";
	}
}

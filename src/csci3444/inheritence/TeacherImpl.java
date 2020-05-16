package csci3444.inheritence;

public class TeacherImpl extends PersonBaseImpl implements Teacher
{
	private String taughtCourseTitle;
	
	public TeacherImpl(String _name, String _taughtCourseTitle)
	{
		super(_name);
		taughtCourseTitle = _taughtCourseTitle;
	}
	
	public String teachesFor()
	{
		return taughtCourseTitle;
	}
	public String getDetails()
	{
		return "teacher";
	}
}

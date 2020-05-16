package csci3444.inheritence;

public abstract class PersonBaseImpl implements Person 
{
 protected String name;
 
 public PersonBaseImpl(String _name)
 {
	 name = _name;
 }
 public String getName()
 {
	 return name;
 }
 
}

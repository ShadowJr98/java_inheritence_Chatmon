README.md

Create an interface called “Person” with below methods;
public String getName();
public String getDetails();
Create an abstract class called “PersonBaseImpl” that implements “Person” interface. 
has attribute “String name” that can be inherited
has a constructor that takes “String _name” input and initializes “name” attribute
has implementation of “getName()” method to simply return “name” attribute. 
Create an interface called “Teacher” that extends Person with below method;
public String teachesFor();
Create a class called TeacherImpl that extends “PersonBaseImpl” and implements “Teacher” interface. 
has an attribute “String thoughtCourseTitle” 
has a constructor that takes in 2 inputs; “String _name” and “String _ thoughtCourseTitle”
let above constructor invoke its parent’s one to initialize inherited “name” attribute with “_name”
let above constructor initialize “thoughtCourseTitle” attribute with “_thoughtCourseTitle”
has implementation of “teachesFor()” method that simply returns “thoughtCourseTitle” attribute
has implementation of “getDetails()” returning “teacher”
Create an interface called “Student” extends Person with below method;
public String studiesFor();
Create a class called StudentImpl that extends “PersonBase” and implements “Student” interface. 
has an attribute “String takenCourseTitle” 
has a constructor that takes in 2 inputs; “String _name” and “String _ takenCourseTitle”
let above constructor invoke its parent’s one to initialize inherited “name” attribute with “_name”
let above constructor initialize “takenCourseTitle” attribute with “_takenCourseTitle”
has implementation of “studiesFor()” method that simply returns “takenCourseTitle” attribute
has implementation of “getDetails()” returning “student”
Create class called MainEntry that 
has a static main method
in main method, create local variables;
“Person p1, p2”
“Teacher t”, initialize it to
new TeacherImpl(“ilker”, “java”)
“Student s”, initialize it to 
new StudentImpl(“yourName”,”java”)
Set p1 = t,  p2 = s
Have a System.out.println statement that print name of p1 and p2.

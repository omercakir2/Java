/**
 * 
 */
package mypackage;

/**
 * 
 */
public class Student {
	String name;
	int age;
	double gpa;
	
	public Student() {
	    this.name = "not known";  
	    this.age = -1;
	    this.gpa = 0;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public void set_age(int age) {
		this.age = age;
	}
	public void set_gpa(double gpa) {
		this.gpa = gpa;
	}
	public void get_info() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gpa:"+gpa);
	}
}

 public class HelloWorldGender extends HelloWorld {



	public boolean gender;
	
	HelloWorldGender(String name, boolean gender) {
	//setName(name);
	super(name);	
	this.gender=gender;
	}

	public void print() {
	if (gender==true)
		{
		System.out.println ("Hello mr "+getName());	
	}
	else
		System.out.println ("Hello miss "+getName());	
	}
	
	





}

class Student3
{
	String name;//instace variable//initialized to null
	int rollnumber; //instace variable//initialized to 0

	Student3(String name, int rollnumber)
	{
		this.name = name;
		this.rollnumber = rollnumber;
	}
	public static void main(String[] args) 
	{
		Student3 s1 = new Student3("John", 101);
		Student3 s2 = new Student3("Jane", 102);
		Student3 s3 = new Student3("July", 103);
		Student3 s4 = new Student3("James", 104);
		System.out.println("Hello World!");
	}
}
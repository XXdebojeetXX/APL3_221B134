/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	int age;
	String name;
	void setAge(int age)
	{
	    this.age=age;
	}
	void setName(String name)
	{
	    this.name=name;
	}
	int getAge()
	{
	    return this.age;
	}
	String getName()
	{
	    return this.name;
	}
	public static void main(String[] args)
	{
	    Main m1=new Main();
	    m1.setName("Ajay");
	    m1.setAge(18);
	    System.out.println(m1.getName()+" "+m1.getAge());
	}
}

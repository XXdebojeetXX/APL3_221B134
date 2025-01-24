public class Q4
{
    int x;
	One(int x) {
	    this.x=x;
	    System.out.print(x);
	}
	public static void main(String[] args) {
        Two ob = new Two(5);
    }
}

class Two extends Q4
{
    Two(int x) {
        super(x);
    }
    

}
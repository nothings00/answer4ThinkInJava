public class Practice2c5{
	public static void main(String[] args) {
		DataOnly data = new DataOnly();
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		System.out.println("data.i="+data.i);
		System.out.println("data.d="+data.d);
		System.out.println("data.b="+data.b);
	}
}

class DataOnly{
	int i;
	double d;
	boolean b;
}
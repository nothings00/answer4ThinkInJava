public class Practice2c8{
	public static void main(String[] args) {
		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();
		System.out.print("s1.i="+s1.i+"\n"+"s2.i="+s2.i+"\n");
		Incrementable.increment();
		System.out.print("after increment: \n");
		System.out.print("s1.i="+s1.i+"\n"+"s2.i="+s2.i+"\n");
	}
}

class StaticTest{
	static int i = 47;
}
class Incrementable{
	static void increment( ){
		StaticTest.i++;
	}
}

	
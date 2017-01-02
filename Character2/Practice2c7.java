public class Practice2c7{
	public static void main(String[] args) {
		Incrementable sf =  new Incrementable();
		sf.increment();
		System.out.print(StaticTest.i);
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

	
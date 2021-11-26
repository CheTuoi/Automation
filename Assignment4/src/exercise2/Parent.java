package exercise2;

public abstract class Parent {
	
	public abstract void message();
}

class Subclass1 extends Parent{
	@Override
	public void message() {
		System.out.println("This is the first subclass");
	}
}

class Subclass2 extends Parent{
	@Override
	public void message() {
		System.out.println("This is the second subclass");
	}
}


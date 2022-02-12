package garbageCollector;

public class GCCase1 {
	public static void main(String[] args) {
		// GCCase1 d=new GCCase1();
		String s = new String("Ganesh");
		s = null;
		System.gc();
		System.out.println("End of main");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		// super.finalize();
		System.out.println("Finalize method called");
	}
}

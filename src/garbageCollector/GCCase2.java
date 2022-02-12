package garbageCollector;

public class GCCase2{
	public static void main(String[] args) throws Throwable {
		GCCase2 t=new GCCase2();
		t.finalize();
		t.finalize();
		t=null;
		System.gc();
		System.out.println("End of main");
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
}

package PracticeDemo;
class Cat{
	int j;
	public Cat(int j){
		this.j=j;
	}
}
class Dog implements Cloneable{
	int i;
	Cat c;
	public Dog(Cat c, int i) {
		this.i=i;
		this.c=c;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class ShalloCloningDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c=new Cat(20);
		Dog d1=new Dog(c, 10);
		System.out.println(d1.i+".........."+d1.c.j);
		Dog d2=(Dog)d1.clone();
		d2.i=888;
		d2.c.j=999;
		System.out.println(d2.i+".........."+d2.c.j);
		System.out.println(d1.i+".........."+d1.c.j);
		
	}

}

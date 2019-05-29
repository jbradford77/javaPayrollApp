public class Inheritance3 {
	public static void main(String[] args) {
		MyDerived mD = new MyDerived(2, 3);
		MyBase mB = mD;
		mB.show();
		mD.show();
	}
}
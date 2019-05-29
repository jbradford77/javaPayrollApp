class ObjectEquivalenceIdentity {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(10, 20);
		if (r1 == r2)
			System.out.println("Same object");
		else
			System.out.println("Different objects");
		if (r1.equals(r2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}
}
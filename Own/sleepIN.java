class dinga {
		static {
		System.out.println("Hi iam SMLI of dinga");
	}

	public static void main(String[] args) {
		System.out.println("Dinga from main");
		int res = sub(55, 3);
		System.out.println(res);
	}

	public static int sub(int a, int b) {
		System.out.println("Hi iam sub of dinga");
		return a * b;
	}

}

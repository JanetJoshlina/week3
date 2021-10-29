package week3;

public class Desktop implements Hardware, Software {
	int a = 20;
	private void desktopMethod() {
	}

	public void hardwareRes() {
		// TODO Auto-generated method stub
		System.out.println("hardware" + this.a);
	}

	public void softwareRes() {
		// TODO Auto-generated method stub
		System.out.println("software");
	}
	public static void main(String[] args) {
		new Desktop().hardwareRes();
		new Desktop().softwareRes();
	}
}

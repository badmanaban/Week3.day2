package week3.day2;

public class Desktop implements Software, HardWare {

	private void desktopModel() {
		System.out.println("DesktopModel");
	}

	public void hardwareResources() {
		System.out.println("This is inherited from HardWare interface");
	}

	public void softwareResources() {
		System.out.println("This is inherited from SoftWare interface");

	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.hardwareResources();
		d.softwareResources();
	

	}

}

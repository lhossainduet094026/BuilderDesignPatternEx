package builderDesignPatternImplementation;

public class MainApp {

	public static void main(String[] args) {

		PcBuilder builder = new PcBuilder();
		PC pc = builder.setProcessor("core i7").setHdd("samsung").getPC();
		System.out.println(pc.toString());
	}

}

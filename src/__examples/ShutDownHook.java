package __examples;

public class ShutDownHook {

	public static void main(String[] args) {

		Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Shutdown Hook is running !")));

		System.out.println("Application Terminating ");
	}

}

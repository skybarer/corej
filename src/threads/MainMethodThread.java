package threads;

public class MainMethodThread {

	public static void main(String[] args) {

		/* List of threads that are running in background */

		Thread.getAllStackTraces().keySet().forEach((t) -> System.out.println(t.getName()));

		/*
		 * Thread.getAllStackTraces().keySet().forEach( (t) ->
		 * System.out.println(t.getName() + "\nIs Daemon " + t.isDaemon() +
		 * "\nIs Alive " + t.isAlive()));
		 */
	}

}

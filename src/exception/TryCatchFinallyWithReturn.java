package exception;

public class TryCatchFinallyWithReturn {

	public static void main(String[] args) {

		try {
			System.out.println("try");
			return;

		}catch (Exception e) {
			System.out.println("catch");
			return;
		} finally {

			System.out.println("finally");
			return;
		}

	}

}

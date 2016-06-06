
public class WaitForLady {

	static class oo {
		static void start() {
			new Thread() {
				public void run() {
					while(true){
						
						System.out.println("aa");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();
		}

	}
	
	public static void main(String[] args) {
		oo.start();
	}
}

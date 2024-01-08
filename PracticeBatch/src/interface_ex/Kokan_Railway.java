package interface_ex;

public class Kokan_Railway implements Indian_Railway,Distance  {

	public static void main(String[] args) {
		Kokan_Railway kr=new Kokan_Railway();
		kr.green(4);
		kr.yellow();
		kr.red();
		kr.signal_distance();
		
	}

	@Override
	public void green(int x) {
		System.out.println("proceed with 90km/h");
	}
	

	@Override
	public void yellow() {
		System.out.println("proceed with 60km/h");

		
	}

	@Override
	public void red() {
		System.out.println("stop here");

		
	}

	@Override
	public void signal_distance() {
		System.out.println("kept signal distance 400m");
	}

}

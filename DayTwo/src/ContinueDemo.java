
public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<10; i++) {
			if(i<7) {
				continue; // will skip the current iteration alone
			}
			System.out.println(i);
		}
	}

}

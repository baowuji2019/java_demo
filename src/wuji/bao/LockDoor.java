package wuji.bao;



public class LockDoor extends Door  implements Lock {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void locked() {
		// TODO Auto-generated method stub
	    System.out.println("����");
	}

	@Override
	public void unlocked() {
		// TODO Auto-generated method stub
	   System.out.println("����");
	}
	
	

}

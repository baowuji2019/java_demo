package wuji.bao;



public class LockDoor extends Door  implements Lock {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开门");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关门");
	}

	@Override
	public void locked(int a ,int b) {
		// TODO Auto-generated method stub
	    System.out.println("加锁");
	}

	@Override
	public void unlocked(int a ,int b) {
		// TODO Auto-generated method stub
	   System.out.println("解锁");
	}
	
	

}

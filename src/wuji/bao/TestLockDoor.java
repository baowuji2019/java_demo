package wuji.bao;

public class TestLockDoor {
	
	public static void main(String[] args) {
		LockDoor T1 = new LockDoor();
		T1.unlocked(1,2);
		T1.open();
		T1.close();
		T1.locked(1,2);
		
		
		
	}

}

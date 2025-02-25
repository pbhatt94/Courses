package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {
	private int i, j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		lockForI.lock(); // get lock for I
		i++;
		lockForI.unlock(); // release lock for I
	}

	public void incrementJ() {
		lockForJ.lock();// get lock for I
		i++;
		lockForJ.unlock();// release lock for I
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
}

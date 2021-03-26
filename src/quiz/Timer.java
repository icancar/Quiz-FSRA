package quiz;

import javax.swing.JLabel;

public class Timer extends Thread{
	private int min;
	private int sec;
	private JLabel text;
	
	public Timer(JLabel t) {
		this.min=0;
		this.sec=0;
		this.text=t;
	}
	
	public void setTime(int m,int s) {
		this.min=m;
		this.sec=s;
	}
	
	public void reset() {
		this.min=0;
		this.sec=0;
	}
	@Override
	public void run() {
		synchronized(this) {
			try {
				while (true) {
				
				if(sec==0) {
					sec=60;
					min--;
				}
				sec--;
				this.text.setText(this.getCurrentTime());
				sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public String getCurrentTime() {
		String s= ""+min+":"+sec;
		return s;
	}
	public boolean timeElapsed () {
		return (this.min==0 && this.sec==0);
	}
}

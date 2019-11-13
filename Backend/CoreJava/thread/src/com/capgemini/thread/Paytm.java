package com.capgemini.thread;

public class Paytm extends Thread{

	PVR ref;

	public Paytm(PVR r)
	{
		ref = r;
	}

	public void run() 
	{
		ref.confirm();
	}
}

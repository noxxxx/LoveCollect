package com.jingzhao.lovecollect.entity;

import java.util.TimerTask;

public class StaffForThrown extends TimerTask{
	public int points,ycolumn,duration;
	
	void getDown(){}
	
	public StaffForThrown(int points,int ycolumn,int duration){
		this.points = points;
		this.ycolumn = ycolumn;
		this.duration = duration;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("StaffForThrown run");
	}
	
}

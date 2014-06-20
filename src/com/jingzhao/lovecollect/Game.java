package com.jingzhao.lovecollect;

import java.util.Timer;

import com.jingzhao.lovecollect.entity.Nox;
import com.jingzhao.lovecollect.entity.StaffForThrown;
import com.jingzhao.lovecollect.entity.Yoyo;

public class Game {
	
	int Score;
	
	Timer gameTimer, throwTime;
	
	Yoyo yoyo;
	
	Nox nox;
	
	int GAME_STATE = 0; //0 停止； 1 进行； 2 暂停
	
	public Game(){
		gameTimer = new Timer();
		throwTime = new Timer();
		Score  = 0;
		nox = new Nox(0);
		
//        timer.schedule(new MyTask(), 1000, 2000)
	}
	
	public void startGame(){
		System.out.println("Game start");
		gameTimer.schedule(new java.util.TimerTask() { 
			public void run(){	
				endGame();
				System.out.println("Game end");
			}}, 20*1000);
		throwTime.schedule(new StaffForThrown(1,2,3), 0, 1000);
	}
	
	void pauseGame(){}
	
	void resumeGame(){}
	
	void endGame(){
		throwTime.cancel();
		gameTimer.cancel();
	}
	
	StaffForThrown generateRandomStaff(){
		
		
		return null;
		
	}
	
	/**
	 * not in use now.
	 * @author zhaojing
	 *
	 */
	class ShutdownTask extends java.util.TimerTask {
		Timer timer = null;

		public ShutdownTask() {
		}

		public ShutdownTask(Timer mytimer) {

			timer = mytimer;
		}

		public void run() {
			timer.cancel();// 使用这个方法退出任务
		}

	}
	
	public static void main(String[] args){
		Game g = new Game();
		g.startGame();
	}
	
	
}

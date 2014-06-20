package com.jingzhao.lovecollect.view;

import com.jingzhao.lovecollect.Game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;

public class GameView extends View implements SensorEventListener{

	/**每50帧刷新一次屏幕**/  
    public static final int TIME_IN_FRAME = 50; 
    
    private Game game;
    
    /** 游戏画布 **/
    Canvas mCanvas = null;
    
    /** 游戏画笔 **/
    Paint mPaint = null;
    
    /**游戏背景文件**/
    private Bitmap mbitmapBg;
    
    /**小球资源文件**/
    private Bitmap mbitmapBall;
	
    /**SensorManager管理器**/
    private SensorManager mSensorMgr = null;    
    Sensor mSensor = null;    
    
	public GameView(Context context) {
		super(context);
		
		/** 创建画布 **/
        mCanvas = new Canvas();
        /** 创建曲线画笔 **/
        mPaint = new Paint();
        mPaint.setColor(Color.WHITE);
        
        /**加载小球资源**/
//        mbitmapBall = BitmapFactory.decodeResource(this.getResources(), R.drawable.ball);
//        /**加载游戏背景**/
//        mbitmapBg = BitmapFactory.decodeResource(this.getResources(), R.drawable.bg);
        
        /**得到SensorManager对象**/
        mSensorMgr = (SensorManager) context.getSystemService(android.content.Context.SENSOR_SERVICE);   
        mSensor = mSensorMgr.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);   
        // 注册listener，第三个参数是检测的精确度  
        //SENSOR_DELAY_FASTEST 最灵敏 因为太快了没必要使用
        //SENSOR_DELAY_GAME    游戏开发中使用
        //SENSOR_DELAY_NORMAL  正常速度
        //SENSOR_DELAY_UI                最慢的速度
        mSensorMgr.registerListener(this, mSensor, SensorManager.SENSOR_DELAY_GAME);  
        
		game = new Game();
		game.startGame();
	}

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.draw(canvas);
	}

	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

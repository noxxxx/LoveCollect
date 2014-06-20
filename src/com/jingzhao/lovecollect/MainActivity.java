package com.jingzhao.lovecollect;

import com.jingzhao.lovecollect.view.GameView;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	private GameView gameView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		gameView = new GameView(this);
		setContentView(gameView);

/*		hello = (TextView)findViewById(R.id.hello);
		hello.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Game g = new Game();
				g.startGame();
			}
			
		});
*/
		
	}

}

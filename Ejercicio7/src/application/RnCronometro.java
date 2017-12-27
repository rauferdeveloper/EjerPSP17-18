package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public  class RnCronometro implements Runnable{
	private Label lbDisplay;

	private boolean stop = false;
	private boolean paused = false;

	private long startPauseTime = 0;
	private long pausedTime = 0;


	public RnCronometro(Label lbDisplay){
		this.lbDisplay = lbDisplay;

	}


	@Override
	public void run(){
		stop = false;

		long startTime = System.currentTimeMillis();


		while(!stop){
			if(!paused){
				Platform.runLater(new Runnable(){

					@Override
					public void run(){
						lbDisplay.setText(TimeFormat.fromMsToChrono(System.currentTimeMillis() - startTime - pausedTime));

					}
				});

			}
			try	{Thread.sleep(100);} catch (InterruptedException e){}

		}

	}

	public void stop(){
		stop = true;
	}

	public void pause(){
		startPauseTime = System.currentTimeMillis();
		paused = true;

	}

	public void resume(){
		pausedTime+= System.currentTimeMillis() - startPauseTime;
		paused = false;
	}

}

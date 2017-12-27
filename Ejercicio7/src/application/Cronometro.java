package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Cronometro {
		private RnCronometro rcn;
		@FXML
		public Label lbDisplay;
		@FXML
		public Button btStart;
		@FXML
		public Button btReset;
		@FXML
		public Button btStop;
		@FXML
		public void onActionStart(ActionEvent ae) {
			if(btStart.getText().equals("Start")) {
				rcn = new RnCronometro(lbDisplay);
				Thread thCronometro = new Thread(rcn);
				thCronometro.setDaemon(true);
				thCronometro.start();
				btStart.setText("Pause");
			}else if(btStart.getText().equals("Pause")) {
					btStart.setText("Resume");
					rcn.pause();

			}else {
				 btStart.setText("Pause");
				 rcn.resume();
			}
			 
			
		}
	
		@FXML
		public void onActionReset(ActionEvent ae) {
			rcn.stop();;
			lbDisplay.setText("0:00:0");
			btStart.setText("Start");

		}
		
		

		

		
}




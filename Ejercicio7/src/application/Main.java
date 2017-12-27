package application;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;


public class Main extends Application
{

	private static int filas;
	private static int columnas;
	@Override
	public void start(Stage primaryStage){
		try{
			GridPane gridPane = new GridPane();

			for (int fila = 0; fila < filas; fila++) {
				for (int columna = 0; columna < columnas; columna++) {
					gridPane.add((AnchorPane)FXMLLoader.load(getClass().getResource("Cronometro.fxml")),columna,fila);

				}
			}


			Scene scene = new Scene(gridPane);

			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de filas: ");
		filas = sc.nextInt();
		System.out.print("Numero de columnas: ");
		columnas = sc.nextInt();
		sc.close();

		launch(args);
	}
}
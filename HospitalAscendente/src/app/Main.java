package app;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.Rotas;

public class Main extends Application {
	
	static Stage stageAtual;
	static FXMLLoader loader;

	@Override
	public void start(Stage stage) throws Exception {
		
		stageAtual = stage;
		loader = new FXMLLoader(getClass().getResource(Rotas.Login));
		
		Parent root;
		
		try {
		
		root = loader.load();
		Scene scene = new Scene(root, 600, 400);
		scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}

	public void openLogin(String rota) throws IOException {
		loader =
				new FXMLLoader(getClass().getResource(rota));
	
		Scene scene = new Scene(loader.load());
		stageAtual.setScene(scene);
		stageAtual.show();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}

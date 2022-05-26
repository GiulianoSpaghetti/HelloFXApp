package org.altervista.numerone.javafx;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFXApp extends Application {

	protected static ResourceBundle bundle = ResourceBundle.getBundle("HelloFXAppMessages", Locale.getDefault());
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		  VBox root=new VBox();
		  Text msg=new Text(bundle.getString("InserisciIlTuoNome")+": ");
		  TextField nameFld=new TextField();
		  Text msg1=new Text("");
		  Button azione=new Button(bundle.getString("Scriviciao"));
		  azione.setOnAction(e -> {
			  if (nameFld.getText().equals(""))
				  msg1.setText(bundle.getString("CiaoATutti")+".");
			  else
				  msg1.setText(bundle.getString("Ciao")+" "+nameFld.getText()+" "+bundle.getString("LaFestaEFinita")+" .");
		  });
		  root.getChildren().addAll(msg, nameFld, msg1, azione);
		  Scene scene=new Scene(root, 650, 150);
		  arg0.setScene(scene);
		  arg0.setTitle(bundle.getString("titolo"));
		  arg0.show();
	}

	public static void main(String args[]) {
		Application.launch(args);
	}
}

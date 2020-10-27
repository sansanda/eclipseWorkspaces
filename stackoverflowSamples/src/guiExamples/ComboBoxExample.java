package guiExamples;

import javax.swing.JFrame;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class ComboBoxExample {
  public static void main(String[] args) {
			ComboBox albumSelect=new ComboBox();
			
			HBox panel=new HBox();
			Button añadir=new Button("añadir imagen");
			Button crearAlbum=new Button("Crear album");
			Button filtros=new Button("Filtros");
			
			BorderPane root = new BorderPane(); 
			root.setTop(new Label("Galeria"));
			root.setBottom(panel);
			panel.getChildren().add(albumSelect);
			panel.getChildren().add(añadir);
			panel.getChildren().add(crearAlbum);
			ScrollPane desplazador=new ScrollPane();
			VBox caja=new VBox();
			TilePane tilePane = new TilePane();
			tilePane.setAlignment(Pos.CENTER);
			tilePane.setPadding(new Insets(15, 15, 15, 15));
			tilePane.setVgap(30);
			tilePane.setHgap(20);
			desplazador.setContent(tilePane);
			caja.getChildren().add(desplazador);
			root.setLeft(caja);
			VBox cajaInterna=new VBox();
			//albumDeMuestra(albumes,albumSelect,desplazador,cajaInterna);
			panel.getChildren().add(filtros);
	  }
}

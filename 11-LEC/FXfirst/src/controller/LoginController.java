package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public TextField txt_name;
    public PasswordField txt_password;



    public void Auth(ActionEvent actionEvent) throws IOException {
        System.out.println(txt_name.getText());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Main.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();

    }
}

package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import java.net.URL;

public class loginController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private Label invalidLabel;
    @FXML
    private ImageView logoImageView;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File logo = new File("images/exam.jpg");
        Image logoImage = new Image(logo.toURI().toString());
        logoImageView.setImage(logoImage);
    }

    public void loginButtonOnAction(ActionEvent event){

        if (usernameField.getText().isBlank() == false && passwordField.getText().isBlank()==false) {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("option.fxml"));
                Stage optionStage = new Stage();
                optionStage.initStyle(StageStyle.DECORATED);
                optionStage.setScene(new Scene(root, 600, 400));
                optionStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            invalidLabel.setText("invalid");
        }

    }
}

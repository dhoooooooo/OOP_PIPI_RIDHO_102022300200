import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {  
    @FXML
    void LoginFunction(ActionEvent event)
    
    @FXML
    private PasswordField idPasswordField;

    @FXML
    private TextField idTextfield;

    @FXML
    private Button idbutton;

    @FXML
    void buttonHandler(ActionEvent event) {
        String username = idTextfield.getText();
        String password = idPasswordField.getText();

        if (username.equals("Ridho") && password.equals("123")) {
            try {
                Stage stage = (Stage) idbutton.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("Album.fxml"));
                stage.setScene(new Scene(root));
            } catch (Exception e) {
                e.printStackTrace();
                showAlert("salah username atau password", "silahkan cek kembali username dan password");
            }
        }
    }

     private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }
    
}



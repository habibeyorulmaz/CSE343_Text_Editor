/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author aliya
 */
public class ErrorBoxController implements Initializable {

    public ImageView errImage;
    public Label messageLabel;
    public Label detailsLabel;
    public Button okButton;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        errImage.setImage(new Image("file:src/Assets/errorPanda_200x200.png"));
        messageLabel.setText(rb.getString("message"));
        detailsLabel.setText(rb.getString("description"));
    }    
    
}

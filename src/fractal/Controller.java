package fractal;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private WebView webView;

    private WebEngine webEngine;

    @FXML
    void initialize() {
        webEngine = webView.getEngine();
        String url = "http://3.89.196.174/mandel/fractal.html";
        webEngine.load(url);
    }
}

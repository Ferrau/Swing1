module com.example.swing1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.swing1 to javafx.fxml;
    exports com.example.swing1;
}
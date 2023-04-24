module com.example.virtuallibrary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.virtuallibrary to javafx.fxml;
    exports com.example.virtuallibrary;
}
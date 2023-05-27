module com.example.javefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javefx to javafx.fxml;
    exports com.example.javefx;
    exports com.example.javefx.Users;
    opens com.example.javefx.Users to javafx.fxml;
}
module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;

    opens com.example to javafx.fxml;
    exports com.example;
}

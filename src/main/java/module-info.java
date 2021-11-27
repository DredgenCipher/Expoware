module com.prototipo.expoware {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.prototipo.expoware to javafx.fxml;
    exports com.prototipo.expoware;
}
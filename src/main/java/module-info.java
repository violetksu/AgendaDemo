module com.example.agendademo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.example.agendademo to javafx.fxml;
    exports com.example.agendademo;
}
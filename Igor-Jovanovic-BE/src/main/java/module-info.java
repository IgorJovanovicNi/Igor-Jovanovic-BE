module com.eng.igorjovanovicbe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.eng.igorjovanovicbe to javafx.fxml;
    exports com.eng.igorjovanovicbe;
}
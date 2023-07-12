module BAPERS {

    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    // install mysql.connector.java in library for line below if line is not working
    requires mysql.connector.java;

    opens sample;


}
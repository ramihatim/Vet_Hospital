module com.example.vet_hospital {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vet_hospital to javafx.fxml;
    exports com.example.vet_hospital;
}
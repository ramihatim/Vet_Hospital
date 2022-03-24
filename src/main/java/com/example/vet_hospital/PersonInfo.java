package com.example.vet_hospital;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PersonInfo {
    ObservableList<String> genderList = FXCollections.observableArrayList("Male","Female",
            "I prefer not to say");
    ObservableList<String> cityList = FXCollections.observableArrayList("Abu Dhabi","Dubai",
            "Sharjah", "Al Ain", "Ajman", "Ras Al-Khaimah", "Umm Al Quwain", "Fujairah");
    ObservableList<String> titleList = FXCollections.observableArrayList("Mr","Ms",
            "Mrs", "Dr");
    ObservableList<String> nationalityList = FXCollections.observableArrayList("Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine");


    //Buttons
    @FXML
    private Button saveButton1;
    @FXML
    private Button backButton1;
    @FXML
    private Button loadButton1;

   // Textfields
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField eid;
    @FXML
    private TextField phone;
    @FXML
    private TextField email;
    //ChoiceBox and others
    @FXML
    private ChoiceBox city;
    @FXML
    private ChoiceBox gender;
    @FXML
    private ChoiceBox title;
    @FXML
    private ChoiceBox nationality;

@FXML
private void initialize(){
    gender.setValue("Male");
    gender.setItems(genderList);
    city.setValue("Abu Dhabi");
    city.setItems(cityList);
    title.setValue("Mr");
    title.setItems(titleList);
    nationality.setValue("Sudan");
    nationality.setItems(nationalityList);
}

@FXML
public void btnSave(ActionEvent actionEvent) {
    SaveData data = new SaveData();
  data.theFirstname = firstname.getText();
    data.theEID = eid.getText();
    data.theLastname = lastname.getText();
    data.theEmail = email.getText();
    data.thePhone = phone.getText();

    try {
        ResourceManager.save(data, "1.save");
    }
    catch(Exception e){
        System.out.println("Couldn't Save Data" + e.getMessage());
    }

}
@FXML
public void btnLoad(ActionEvent event) {
    try {
        SaveData data = (SaveData) ResourceManager.load("1.save");
        firstname.setText(data.theFirstname);
        lastname.setText(data.theLastname);
        email.setText(data.theEmail);
        phone.setText(data.thePhone);
        eid.setText(data.theEID);
    } catch (Exception e) {
        System.out.println("Couldn't Load save data: " + e.getMessage());
    }
}
    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("Login.fxml");

    }

    public void next(ActionEvent actionEvent) {
    }
}

package Exam.Java.Controller;


import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import Exam.Java.DaoImp.MembreDaoImpl;
import Exam.Java.Models.Membre;

public class AddMembreController {
	
	  public TextField nom_fld;
	    public TextField prenom_fld;
	    public TextField email_fld;
	    public TextField phone_fld;
	    public Button inserer_btn;


	    public void initialize(URL url, ResourceBundle resourceBundle) {
	        inserer_btn.setOnAction(e -> InsertIntoMembre());
	    }

	    private void InsertIntoMembre() {
	        int ref= (int) random();
	        MembreDaoImpl impl= new MembreDaoImpl();
	        String nom= nom_fld.getText();
	        String prenom= prenom_fld.getText();
	        String email= email_fld.getText();
	        String phone= phone_fld.getText();
	        Membre m = new Membre(ref,nom,prenom,email,phone);
	        impl.inserer(m);
	    }

}

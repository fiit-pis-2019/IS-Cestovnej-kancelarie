package controller;

//import view.AdminView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

@SuppressWarnings("unused")
public class LoginEventHandler implements EventHandler<ActionEvent> {
	private TextField userTextField;
	private PasswordField passwordField;

	public LoginEventHandler(TextField userTextField, PasswordField passwordField) {
		this.userTextField = userTextField;
		this.passwordField = passwordField;
	}

	@Override
	public void handle(ActionEvent arg0) {
//		new AdminView(db, c);
	}
}

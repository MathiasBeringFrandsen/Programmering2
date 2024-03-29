package architecture1Semester.guifx;

import architecture1Semester.application.controller.Controller;
import architecture1Semester.application.model.Company;
import architecture1Semester.application.model.Employee;
import javafx.beans.value.ChangeListener;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class EmployeeWindow extends Stage {
	private Employee employee;
	private Controller controller;
	private TextField txfName, txfWage;
	private CheckBox chbCompany;

	// -------------------------------------------------------------------------
	private ComboBox<Company> cbbCompany;
	private Label lblError;
	public EmployeeWindow(String title, Employee employee) {
		initStyle(StageStyle.UTILITY);
		initModality(Modality.APPLICATION_MODAL);
		setResizable(false);

		controller = Controller.getController();
		controller.loadStorage();

		this.employee = employee;

		setTitle(title);
		GridPane pane = new GridPane();
		initContent(pane);

		Scene scene = new Scene(pane);
		setScene(scene);
	}
	public EmployeeWindow(String title) {
		this(title, null);
	}

	private void initContent(GridPane pane) {
		pane.setPadding(new Insets(10));
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setGridLinesVisible(false);

		Label lblName = new Label("Name");
		pane.add(lblName, 0, 0);

		txfName = new TextField();
		pane.add(txfName, 0, 1);
		txfName.setPrefWidth(200);

		Label lblHours = new Label("Hourly Wage");
		pane.add(lblHours, 0, 2);

		txfWage = new TextField();
		pane.add(txfWage, 0, 3);

		chbCompany = new CheckBox("Company");
		pane.add(chbCompany, 0, 4);
		ChangeListener<Boolean> listener = (ov, oldValue, newValue) -> selectedCompanyChanged(newValue);
		chbCompany.selectedProperty().addListener(listener);

		cbbCompany = new ComboBox<>();
		pane.add(cbbCompany, 0, 5);
		cbbCompany.getItems().addAll(controller.getCompanies());
		cbbCompany.setDisable(true);

		Button btnCancel = new Button("Cancel");
		pane.add(btnCancel, 0, 6);
		GridPane.setHalignment(btnCancel, HPos.LEFT);
		btnCancel.setOnAction(event -> cancelAction());

		Button btnOK = new Button("OK");
		pane.add(btnOK, 0, 6);
		GridPane.setHalignment(btnOK, HPos.RIGHT);
		btnOK.setOnAction(event -> okAction());

		lblError = new Label();
		pane.add(lblError, 0, 7);
		lblError.setStyle("-fx-text-fill: red");

		initControls();
	}

	private void initControls() {
		if (employee != null) {
			txfName.setText(employee.getName());
			txfWage.setText("" + employee.getWage());
			if (employee.getCompany() != null) {
				chbCompany.setSelected(true);
				cbbCompany.getSelectionModel().select(employee.getCompany());
			} else {
				cbbCompany.getSelectionModel().select(0);
			}
		} else {
			txfName.clear();
			txfWage.clear();
			cbbCompany.getSelectionModel().select(0);
		}
	}

	// -------------------------------------------------------------------------

	private void cancelAction() {
		hide();
	}

	private void okAction() {
		String name = txfName.getText().trim();
		if (name.length() == 0) {
			lblError.setText("Name is empty");
		} else {
			int wage = -1;
			try {
				wage = Integer.parseInt(txfWage.getText().trim());
			} catch (NumberFormatException ex) {
				// do nothing
			}
			if (wage < 0) {
				lblError.setText("Wage is not a positive number");
			} else {

				boolean companyIsSelected = chbCompany.isSelected();
				Company newCompany = cbbCompany.getSelectionModel().getSelectedItem();

				// Call controller methods
				if (employee != null) {
					controller.updateEmployee(employee, name, wage);
					if (companyIsSelected) {
						controller.addEmployeeToCompany(employee, newCompany);
					} else {
						controller.removeEmployeeFromCompany(employee, employee.getCompany());
					}
				} else {
					if (companyIsSelected) {
						controller.createEmployee(name, wage, newCompany);
					} else {
						controller.createEmployee(name, wage);
					}
				}
				hide();
			}
		}
	}

	// -------------------------------------------------------------------------

	private void selectedCompanyChanged(boolean checked) {
		cbbCompany.setDisable(!checked);
	}

}

package javaFXApplication;

import javafx.beans.property.IntegerPropertyBase;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Szemely {
	
	private SimpleIntegerProperty id;
	private SimpleStringProperty vezeteknev;
	private SimpleStringProperty keresztnev;
	
	public final String getVezeteknev(String vezeteknev) {
		return this.vezeteknev.get();
	}
	
	public final void setVezeteknev(String vezeteknev) {
		this.vezeteknevProperty().set(vezeteknev);
	}

	public final SimpleStringProperty vezeteknevProperty() {
		return this.vezeteknev;
	}
	
	
	public final String getKeresztnev(String keresztnev) {
		return this.keresztnev.get();
	}
	
	public final void setKeresztnev(String keresztnev) {
		this.keresztnevProperty().set(keresztnev);
	}
	
	public final SimpleStringProperty keresztnevProperty() {
		return this.keresztnev;
	}

	public final Integer getId(int id) {
		return this.id.get();
	}

	public final void setId(int id) {
		this.idProperty().set(id);
	}
	
	public final SimpleIntegerProperty idProperty() {
		return this.id;
	}
}

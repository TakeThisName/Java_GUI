package javaFXApplication;

import javafx.beans.property.IntegerPropertyBase;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Szemely {
	
	private SimpleIntegerProperty id;
	private SimpleStringProperty vezeteknev;
	private SimpleStringProperty keresztnev;
	
	
	public final SimpleIntegerProperty idProperty() {
		return this.id;
	}
	
	public final int getId() {
		return this.idProperty().get();
	}
	
	public final void setId(final int id) {
		this.idProperty().set(id);
	}
	
	public final SimpleStringProperty vezeteknevProperty() {
		return this.vezeteknev;
	}
	
	public final String getVezeteknev() {
		return this.vezeteknevProperty().get();
	}
	
	public final void setVezeteknev(final String vezeteknev) {
		this.vezeteknevProperty().set(vezeteknev);
	}
	
	public final SimpleStringProperty keresztnevProperty() {
		return this.keresztnev;
	}
	
	public final String getKeresztnev() {
		return this.keresztnevProperty().get();
	}
	
	public final void setKeresztnev(final String keresztnev) {
		this.keresztnevProperty().set(keresztnev);
	}
	
	
	
}

package com.sapient.week2.models;

import java.time.LocalDate;

public class Datepojo {
   LocalDate localdate;
   String date;

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
	this.localdate = LocalDate.parse(date);
}

public LocalDate getLocaldate() {
	return localdate;
}

public Datepojo(String date) {
	super();
	this.localdate = LocalDate.parse(date);
	this.date = date;
}

}

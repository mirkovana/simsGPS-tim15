package model;

/***********************************************************************
 * Module:  Field.java
 * Author:  Ana
 * Purpose: Defines the Class Field
 ***********************************************************************/

import java.util.*;

public class Field {
   private String name;
   private String label;
   private String data;
   private String type;
   public Field(String name, String label, String data, String type) {
	   super();
	   this.name = name;
	   this.label = label;
	   this.data = data;
	   this.type = type;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

   
}

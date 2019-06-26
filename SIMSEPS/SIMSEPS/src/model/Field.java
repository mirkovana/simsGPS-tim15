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

}

package model;

/***********************************************************************
 * Module:  Action.java
 * Author:  Ana
 * Purpose: Defines the Class Action
 ***********************************************************************/

import java.util.*;

import enumType.Semantika;

public class Action {
   private String name;
   private String label;
   private Semantika semantika;
   public Action(String name, String label, Semantika semantika) {
	   super();
	   this.name = name;
	   this.label = label;
	   this.semantika = semantika;
   }
}

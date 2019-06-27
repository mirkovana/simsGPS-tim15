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

	public Semantika getSemantika() {
		return semantika;
	}

	public void setSemantika(Semantika semantika) {
		this.semantika = semantika;
	}

}

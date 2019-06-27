package model;

/***********************************************************************
 * Module:  Transition.java
 * Author:  Ana
 * Purpose: Defines the Class Transition
 ***********************************************************************/

import java.util.*;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import enumType.Semantika;


public class TransitionState {

   private String id;

   private String label;
  
   private Action akcija;
   
   public State fromState;
   public State toState;
   
   public TransitionState(String id, String label, Action akcija, State fromState, State toState) {
	   super();
	   this.id = id;
	   this.label = label;
	   this.akcija = akcija;
	   this.fromState = fromState;
	   this.toState = toState;
   }

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getLabel() {
	return label;
}

public void setLabel(String label) {
	this.label = label;
}

public Action getAkcija() {
	return akcija;
}

public void setAkcija(Action akcija) {
	this.akcija = akcija;
}

public State getFromState() {
	return fromState;
}

public void setFromState(State fromState) {
	this.fromState = fromState;
}

public State getToState() {
	return toState;
}

public void setToState(State toState) {
	this.toState = toState;
} 
   
   
}

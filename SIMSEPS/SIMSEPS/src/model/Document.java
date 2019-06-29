package model;

/***********************************************************************
 * Module:  Document.java
 * Author:  Ana
 * Purpose: Defines the Class Document
 ***********************************************************************/

import java.util.*;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;


public class Document {

	public java.util.List<State> states = new ArrayList<>();
	public java.util.List<TransitionState> transitions = new ArrayList<>();

	private String name = "AccessPermit";
	private boolean transitionExists;
	private boolean mandatoryFilled;

	public java.util.List<Action> actions = new ArrayList<>();
	public java.util.List<Field> fields = new ArrayList<>();
	public State state;

	public Document(List<State> states, List<TransitionState> transitions, String name, boolean transitionExists,
			boolean mandatoryFilled, List<Action> actions, List<Field> fields, State state) {
		super();
		this.states = states;
		this.transitions = transitions;
		this.name = name;
		this.transitionExists = transitionExists;
		this.mandatoryFilled = mandatoryFilled;
		this.actions = actions;
		this.fields = fields;
		this.state = state;
	}

	public void changeState(State state) {
		this.state = state;
	}

	
	public void openDoc() {
		// TODO: implement
	}

	
	public void pushButton() {
		// TODO: implement
	}

	
	public void showErrorMessage() {
		// TODO: implement
	}

	
	public void save() {
		// TODO: implement
	}

	
	public void delete() {
		// TODO: implement
	}

	
	public void submit() {
		// TODO: implement
	}

	
	public void publish() {
		// TODO: implement
	}

	
	public void finnish() {
		// TODO: implement
	}

	
	public void updateActions() {
		// TODO: implement
	}

	
	public void updateFields() {
		// TODO: implement
	}

	
	public java.util.List<Action> getActions() {
		if (actions == null)
			actions = new java.util.ArrayList<Action>();
		return actions;
	}

	
	public java.util.Iterator getIteratorActions() {
		if (actions == null)
			actions = new java.util.ArrayList<Action>();
		return actions.iterator();
	}

	
	public void setActions(java.util.List<Action> newActions) {
		removeAllActions();
		for (java.util.Iterator iter = newActions.iterator(); iter.hasNext();)
			addActions((Action) iter.next());
	}

	
	public void addActions(Action newAction) {
		if (newAction == null)
			return;
		if (this.actions == null)
			this.actions = new java.util.ArrayList<Action>();
		if (!this.actions.contains(newAction))
			this.actions.add(newAction);
	}

	
	public void removeActions(Action oldAction) {
		if (oldAction == null)
			return;
		if (this.actions != null)
			if (this.actions.contains(oldAction))
				this.actions.remove(oldAction);
	}

	
	public void removeAllActions() {
		if (actions != null)
			actions.clear();
	}

	
	public java.util.List<Field> getFields() {
		if (fields == null)
			fields = new java.util.ArrayList<Field>();
		return fields;
	}

	
	public java.util.Iterator getIteratorFields() {
		if (fields == null)
			fields = new java.util.ArrayList<Field>();
		return fields.iterator();
	}

	
	public void setFields(java.util.List<Field> newFields) {
		removeAllFields();
		for (java.util.Iterator iter = newFields.iterator(); iter.hasNext();)
			addFields((Field) iter.next());
	}

	
	public void addFields(Field newField) {
		if (newField == null)
			return;
		if (this.fields == null)
			this.fields = new java.util.ArrayList<Field>();
		if (!this.fields.contains(newField))
			this.fields.add(newField);
	}

	
	public void removeFields(Field oldField) {
		if (oldField == null)
			return;
		if (this.fields != null)
			if (this.fields.contains(oldField))
				this.fields.remove(oldField);
	}

	
	public void removeAllFields() {
		if (fields != null)
			fields.clear();
	}

	public java.util.List<State> getStates() {
		return states;
	}

	public void setStates(java.util.List<State> states) {
		this.states = states;
	}

	public java.util.List<TransitionState> getTransitions() {
		return transitions;
	}

	public void setTransitions(java.util.List<TransitionState> transitions) {
		this.transitions = transitions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTransitionExists() {
		return transitionExists;
	}

	public void setTransitionExists(boolean transitionExists) {
		this.transitionExists = transitionExists;
	}

	public boolean isMandatoryFilled() {
		return mandatoryFilled;
	}

	public void setMandatoryFilled(boolean mandatoryFilled) {
		this.mandatoryFilled = mandatoryFilled;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}

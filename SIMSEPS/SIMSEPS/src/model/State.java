package model;

/***********************************************************************
 * Module:  State.java
 * Author:  Ana
 * Purpose: Defines the Class State
 ***********************************************************************/

import java.util.*;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import enumType.Semantika;


public class State {

	private String id;

	private String name;

	private ArrayList<Semantika> semantike;

	public Document document;

	
	public java.util.ArrayList<TransitionState> transitions = new ArrayList<>();
	
	public java.util.ArrayList<Field> mandatoryFields = new ArrayList<>();
	
	public java.util.ArrayList<Field> hiddenFields = new ArrayList<>();
	
	public java.util.ArrayList<Field> denyModifyFields = new ArrayList<>();

	public State(String id, String name, ArrayList<Semantika> semantike, ArrayList<Field> mandatoryFields,
			ArrayList<Field> hiddenFields, ArrayList<Field> denyModifyFields) {
		super();
		this.id = id;
		this.name = name;
		this.semantike = semantike;
		this.mandatoryFields = mandatoryFields;
		this.hiddenFields = hiddenFields;
		this.denyModifyFields = denyModifyFields;
	}

	
	public void entry() {
		// TODO: implement
	}

	
	public void pushButton() {
		// TODO: implement
	}

	
	public java.util.List<TransitionState> getTransitions() {
		if (transitions == null)
			transitions = new java.util.ArrayList<TransitionState>();
		return transitions;
	}

	
	public java.util.Iterator getIteratorTransitions() {
		if (transitions == null)
			transitions = new java.util.ArrayList<TransitionState>();
		return transitions.iterator();
	}

	public void setTransitions(java.util.List<TransitionState> newTransitions) {
		removeAllTransitions();
		for (java.util.Iterator iter = newTransitions.iterator(); iter.hasNext();)
			addTransitionsState((TransitionState) iter.next());
	}

	
	public void addTransitionsState(TransitionState newTransition) {
		if (newTransition == null)
			return;
		if (this.transitions == null)
			this.transitions = new java.util.ArrayList<TransitionState>();
		if (!this.transitions.contains(newTransition))
			this.transitions.add(newTransition);
	}

	
	public void removeTransitions(TransitionState oldTransition) {
		if (oldTransition == null)
			return;
		if (this.transitions != null)
			if (this.transitions.contains(oldTransition))
				this.transitions.remove(oldTransition);
	}

	
	public void removeAllTransitions() {
		if (transitions != null)
			transitions.clear();
	}

	
	public java.util.List<Field> getMandatoryFields() {
		if (mandatoryFields == null)
			mandatoryFields = new java.util.ArrayList<Field>();
		return mandatoryFields;
	}

	
	public java.util.Iterator getIteratorMandatoryFields() {
		if (mandatoryFields == null)
			mandatoryFields = new java.util.ArrayList<Field>();
		return mandatoryFields.iterator();
	}

	
	public void setMandatoryFields(java.util.List<Field> newMandatoryFields) {
		removeAllMandatoryFields();
		for (java.util.Iterator iter = newMandatoryFields.iterator(); iter.hasNext();)
			addMandatoryFields((Field) iter.next());
	}

	
	public void addMandatoryFields(Field newField) {
		if (newField == null)
			return;
		if (this.mandatoryFields == null)
			this.mandatoryFields = new java.util.ArrayList<Field>();
		if (!this.mandatoryFields.contains(newField))
			this.mandatoryFields.add(newField);
	}

	
	public void removeMandatoryFields(Field oldField) {
		if (oldField == null)
			return;
		if (this.mandatoryFields != null)
			if (this.mandatoryFields.contains(oldField))
				this.mandatoryFields.remove(oldField);
	}

	
	public void removeAllMandatoryFields() {
		if (mandatoryFields != null)
			mandatoryFields.clear();
	}

	
	public java.util.List<Field> getHiddenFields() {
		if (hiddenFields == null)
			hiddenFields = new java.util.ArrayList<Field>();
		return hiddenFields;
	}

	
	public java.util.Iterator getIteratorHiddenFields() {
		if (hiddenFields == null)
			hiddenFields = new java.util.ArrayList<Field>();
		return hiddenFields.iterator();
	}

	public void setHiddenFields(java.util.List<Field> newHiddenFields) {
		removeAllHiddenFields();
		for (java.util.Iterator iter = newHiddenFields.iterator(); iter.hasNext();)
			addHiddenFields((Field) iter.next());
	}

	
	public void addHiddenFields(Field newField) {
		if (newField == null)
			return;
		if (this.hiddenFields == null)
			this.hiddenFields = new java.util.ArrayList<Field>();
		if (!this.hiddenFields.contains(newField))
			this.hiddenFields.add(newField);
	}

	public void removeHiddenFields(Field oldField) {
		if (oldField == null)
			return;
		if (this.hiddenFields != null)
			if (this.hiddenFields.contains(oldField))
				this.hiddenFields.remove(oldField);
	}

	
	public void removeAllHiddenFields() {
		if (hiddenFields != null)
			hiddenFields.clear();
	}

	
	public java.util.List<Field> getDenyModifyFields() {
		if (denyModifyFields == null)
			denyModifyFields = new java.util.ArrayList<Field>();
		return denyModifyFields;
	}

	
	public java.util.Iterator getIteratorDenyModifyFields() {
		if (denyModifyFields == null)
			denyModifyFields = new java.util.ArrayList<Field>();
		return denyModifyFields.iterator();
	}

	
	public void setDenyModifyFields(java.util.List<Field> newDenyModifyFields) {
		removeAllDenyModifyFields();
		for (java.util.Iterator iter = newDenyModifyFields.iterator(); iter.hasNext();)
			addDenyModifyFields((Field) iter.next());
	}

	
	public void addDenyModifyFields(Field newField) {
		if (newField == null)
			return;
		if (this.denyModifyFields == null)
			this.denyModifyFields = new java.util.ArrayList<Field>();
		if (!this.denyModifyFields.contains(newField))
			this.denyModifyFields.add(newField);
	}

	
	public void removeDenyModifyFields(Field oldField) {
		if (oldField == null)
			return;
		if (this.denyModifyFields != null)
			if (this.denyModifyFields.contains(oldField))
				this.denyModifyFields.remove(oldField);
	}

	
	public void removeAllDenyModifyFields() {
		if (denyModifyFields != null)
			denyModifyFields.clear();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Semantika> getSemantike() {
		return semantike;
	}

	public void setSemantike(ArrayList<Semantika> semantike) {
		this.semantike = semantike;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public void setTransitions(java.util.ArrayList<TransitionState> transitions) {
		this.transitions = transitions;
	}

	public void setMandatoryFields(java.util.ArrayList<Field> mandatoryFields) {
		this.mandatoryFields = mandatoryFields;
	}

	public void setHiddenFields(java.util.ArrayList<Field> hiddenFields) {
		this.hiddenFields = hiddenFields;
	}

	public void setDenyModifyFields(java.util.ArrayList<Field> denyModifyFields) {
		this.denyModifyFields = denyModifyFields;
	}

}

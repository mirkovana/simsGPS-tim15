package model;

/***********************************************************************
 * Module:  State.java
 * Author:  Ana
 * Purpose: Defines the Class State
 ***********************************************************************/

import java.util.*;

import enumType.Semantika;

/** @pdOid 6d1b6a96-9edd-40f8-846b-46878c46e2f7 */
public class State {
   /** @pdOid cd8af41f-ac1d-4b5a-9d22-eaace4dbdc24 */
   private ArrayList<Semantika> semantike;
   
   /** @pdRoleInfo migr=no name=Document assc=association11 mult=0..1 */
   public Document document;
   /** @pdRoleInfo migr=no name=Transition assc=association12 coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition */
   public java.util.List<TransitionState> transitions;
   /** @pdRoleInfo migr=no name=Field assc=association7 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Field> mandatoryFields;
   /** @pdRoleInfo migr=no name=Field assc=association8 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Field> hiddenFields;
   /** @pdRoleInfo migr=no name=Field assc=association9 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Field> denyModifyFields;
   
   /** @pdOid ee5def9e-9700-4a0a-a1df-0239be542221 */
   public void entry() {
      // TODO: implement
   }
   
   /** @pdOid 6265f620-fc8f-4b20-8bf3-63186ca17545 */
   public void pushButton() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<TransitionState> getTransitions() {
      if (transitions == null)
         transitions = new java.util.ArrayList<TransitionState>();
      return transitions;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTransitions() {
      if (transitions == null)
         transitions = new java.util.ArrayList<TransitionState>();
      return transitions.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTransitions */
   public void setTransitions(java.util.List<TransitionState> newTransitions) {
      removeAllTransitions();
      for (java.util.Iterator iter = newTransitions.iterator(); iter.hasNext();)
         addTransitionsState((TransitionState)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTransition */
   public void addTransitionsState(TransitionState newTransition) {
      if (newTransition == null)
         return;
      if (this.transitions == null)
         this.transitions = new java.util.ArrayList<TransitionState>();
      if (!this.transitions.contains(newTransition))
         this.transitions.add(newTransition);
   }
   
   /** @pdGenerated default remove
     * @param oldTransition */
   public void removeTransitions(TransitionState oldTransition) {
      if (oldTransition == null)
         return;
      if (this.transitions != null)
         if (this.transitions.contains(oldTransition))
            this.transitions.remove(oldTransition);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTransitions() {
      if (transitions != null)
         transitions.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Field> getMandatoryFields() {
      if (mandatoryFields == null)
         mandatoryFields = new java.util.ArrayList<Field>();
      return mandatoryFields;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMandatoryFields() {
      if (mandatoryFields == null)
         mandatoryFields = new java.util.ArrayList<Field>();
      return mandatoryFields.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMandatory fields */
   public void setMandatoryFields(java.util.List<Field> newMandatoryFields) {
      removeAllMandatoryFields();
      for (java.util.Iterator iter = newMandatoryFields.iterator(); iter.hasNext();)
         addMandatoryFields((Field)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newField */
   public void addMandatoryFields(Field newField) {
      if (newField == null)
         return;
      if (this.mandatoryFields == null)
         this.mandatoryFields = new java.util.ArrayList<Field>();
      if (!this.mandatoryFields.contains(newField))
         this.mandatoryFields.add(newField);
   }
   
   /** @pdGenerated default remove
     * @param oldField */
   public void removeMandatoryFields(Field oldField) {
      if (oldField == null)
         return;
      if (this.mandatoryFields != null)
         if (this.mandatoryFields.contains(oldField))
            this.mandatoryFields.remove(oldField);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMandatoryFields() {
      if (mandatoryFields != null)
         mandatoryFields.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Field> getHiddenFields() {
      if (hiddenFields == null)
         hiddenFields = new java.util.ArrayList<Field>();
      return hiddenFields;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHiddenFields() {
      if (hiddenFields == null)
         hiddenFields = new java.util.ArrayList<Field>();
      return hiddenFields.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHiddenFields */
   public void setHiddenFields(java.util.List<Field> newHiddenFields) {
      removeAllHiddenFields();
      for (java.util.Iterator iter = newHiddenFields.iterator(); iter.hasNext();)
         addHiddenFields((Field)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newField */
   public void addHiddenFields(Field newField) {
      if (newField == null)
         return;
      if (this.hiddenFields == null)
         this.hiddenFields = new java.util.ArrayList<Field>();
      if (!this.hiddenFields.contains(newField))
         this.hiddenFields.add(newField);
   }
   
   /** @pdGenerated default remove
     * @param oldField */
   public void removeHiddenFields(Field oldField) {
      if (oldField == null)
         return;
      if (this.hiddenFields != null)
         if (this.hiddenFields.contains(oldField))
            this.hiddenFields.remove(oldField);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllHiddenFields() {
      if (hiddenFields != null)
         hiddenFields.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Field> getDenyModifyFields() {
      if (denyModifyFields == null)
         denyModifyFields = new java.util.ArrayList<Field>();
      return denyModifyFields;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDenyModifyFields() {
      if (denyModifyFields == null)
         denyModifyFields = new java.util.ArrayList<Field>();
      return denyModifyFields.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDenyModifyFields */
   public void setDenyModifyFields(java.util.List<Field> newDenyModifyFields) {
      removeAllDenyModifyFields();
      for (java.util.Iterator iter = newDenyModifyFields.iterator(); iter.hasNext();)
         addDenyModifyFields((Field)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newField */
   public void addDenyModifyFields(Field newField) {
      if (newField == null)
         return;
      if (this.denyModifyFields == null)
         this.denyModifyFields = new java.util.ArrayList<Field>();
      if (!this.denyModifyFields.contains(newField))
         this.denyModifyFields.add(newField);
   }
   
   /** @pdGenerated default remove
     * @param oldField */
   public void removeDenyModifyFields(Field oldField) {
      if (oldField == null)
         return;
      if (this.denyModifyFields != null)
         if (this.denyModifyFields.contains(oldField))
            this.denyModifyFields.remove(oldField);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDenyModifyFields() {
      if (denyModifyFields != null)
         denyModifyFields.clear();
   }

}

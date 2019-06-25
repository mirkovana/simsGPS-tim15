package model;

/***********************************************************************
 * Module:  Document.java
 * Author:  Ana
 * Purpose: Defines the Class Document
 ***********************************************************************/

import java.util.*;

/** @pdOid d60d5527-b2a0-468d-a591-a3f2fe492bc1 */
public class Document {
   /** @pdOid e8b38823-4baf-4fe9-8f36-fdcb65113f26 */
   private String name;
   /** @pdOid 7247d465-077f-44f2-8681-5b78acfc93ce */
   private boolean transitionExists;
   /** @pdOid d32a2d8d-fbdb-4743-91ce-8d0cffb52888 */
   private boolean mandatoryFilled;
   
   /** @pdRoleInfo migr=no name=Action assc=association4 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Action> actions;
   /** @pdRoleInfo migr=no name=Field assc=association18 coll=java.util.List impl=java.util.ArrayList mult=0..* */
   public java.util.List<Field> fields;
   /** @pdRoleInfo migr=no name=State assc=association11 mult=1..1 side=A */
   public State state;
   
   /** @param state
    * @pdOid b7b81ce6-daac-4d10-a6d9-705b63b3969e */
   public void changeState(State state) {
      // TODO: implement
   }
   
   /** @pdOid 8d4e7e58-f9ae-4b0c-805f-eec63a9cd54a */
   public void openDoc() {
      // TODO: implement
   }
   
   /** @pdOid 48d0a0d0-bea8-4d02-b2fa-56a701e25fcf */
   public void pushButton() {
      // TODO: implement
   }
   
   /** @pdOid a8702cd7-d2bf-473e-b52a-071d878006a8 */
   public void showErrorMessage() {
      // TODO: implement
   }
   
   /** @pdOid 46c2cf46-ec27-4dd4-a964-2fa2d938bc6b */
   public void save() {
      // TODO: implement
   }
   
   /** @pdOid 2abdd9ed-4395-46da-a7b3-b0d32ac7b42e */
   public void delete() {
      // TODO: implement
   }
   
   /** @pdOid b6b2d04b-9b82-477d-8b52-82b2ce11aa83 */
   public void submit() {
      // TODO: implement
   }
   
   /** @pdOid 7e36a200-83d9-42d2-88d9-ecaafca531f6 */
   public void publish() {
      // TODO: implement
   }
   
   /** @pdOid 3cc09812-9e36-445c-843f-4c1e643bbd3d */
   public void finnish() {
      // TODO: implement
   }
   
   /** @pdOid af69e7b2-2494-464f-a603-e48b761a28dc */
   public void updateActions() {
      // TODO: implement
   }
   
   /** @pdOid 85cab743-dc6c-4379-a0d0-b1cc1a430d9b */
   public void updateFields() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Action> getActions() {
      if (actions == null)
         actions = new java.util.ArrayList<Action>();
      return actions;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorActions() {
      if (actions == null)
         actions = new java.util.ArrayList<Action>();
      return actions.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newActions */
   public void setActions(java.util.List<Action> newActions) {
      removeAllActions();
      for (java.util.Iterator iter = newActions.iterator(); iter.hasNext();)
         addActions((Action)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAction */
   public void addActions(Action newAction) {
      if (newAction == null)
         return;
      if (this.actions == null)
         this.actions = new java.util.ArrayList<Action>();
      if (!this.actions.contains(newAction))
         this.actions.add(newAction);
   }
   
   /** @pdGenerated default remove
     * @param oldAction */
   public void removeActions(Action oldAction) {
      if (oldAction == null)
         return;
      if (this.actions != null)
         if (this.actions.contains(oldAction))
            this.actions.remove(oldAction);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllActions() {
      if (actions != null)
         actions.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Field> getFields() {
      if (fields == null)
         fields = new java.util.ArrayList<Field>();
      return fields;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFields() {
      if (fields == null)
         fields = new java.util.ArrayList<Field>();
      return fields.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFields */
   public void setFields(java.util.List<Field> newFields) {
      removeAllFields();
      for (java.util.Iterator iter = newFields.iterator(); iter.hasNext();)
         addFields((Field)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newField */
   public void addFields(Field newField) {
      if (newField == null)
         return;
      if (this.fields == null)
         this.fields = new java.util.ArrayList<Field>();
      if (!this.fields.contains(newField))
         this.fields.add(newField);
   }
   
   /** @pdGenerated default remove
     * @param oldField */
   public void removeFields(Field oldField) {
      if (oldField == null)
         return;
      if (this.fields != null)
         if (this.fields.contains(oldField))
            this.fields.remove(oldField);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFields() {
      if (fields != null)
         fields.clear();
   }

}

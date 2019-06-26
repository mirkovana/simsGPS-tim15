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

//@XStreamAlias("Transition")
public class TransitionState {
   //@XStreamAlias("entityId")
   //@XStreamAsAttribute
   private String id;
   //@XStreamAlias("LIFECYCLE_NAME")
   private String label;
  
   private Semantika semantika;
   
   //@XStreamAlias("TRANSITION_ON_FAIL")
   public State fromState;
   //@XStreamAlias("TRANSITION_ON_SUCCEED")
   public State toState;
   public TransitionState(String id, String label, Semantika semantika, State fromState, State toState) {
	   super();
	   this.id = id;
	   this.label = label;
	   this.semantika = semantika;
	   this.fromState = fromState;
	   this.toState = toState;
   } 
}

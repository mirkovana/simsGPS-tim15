package model;

/***********************************************************************
 * Module:  Transition.java
 * Author:  Ana
 * Purpose: Defines the Class Transition
 ***********************************************************************/

import java.util.*;

import enumType.Semantika;

/** @pdOid 08630c32-6b67-4042-83b9-b76a82d59b55 */
public class TransitionState {
   /** @pdOid 8e9d81b4-64cd-4633-a87e-59add3094133 */
   private String label;
   /** @pdOid cc2c8ecc-54a5-4d44-bcce-0ac1ffca1d56 */
   private Semantika semantika;
   
   /** @pdRoleInfo migr=no name=State assc=association13 mult=1..1 */
   public State fromState;
   /** @pdRoleInfo migr=no name=State assc=association14 mult=1..1 */
   public State toState;

}

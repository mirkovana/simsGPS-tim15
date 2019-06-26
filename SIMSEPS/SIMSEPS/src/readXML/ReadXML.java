package readXML;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.*;

import enumType.Semantika;
import model.Action;
import model.Document;
import model.Field;
import model.State;
import model.TransitionState;

public class ReadXML {
	public void generateXML() throws IOException {
		Action action1 = new Action("Save", "Action1", Semantika.saveEnabled);
		Action action2 = new Action("Delete", "Action2", Semantika.deleteEnabled);
		Action action3 = new Action("Submit", "Action3", Semantika.submitted);
		Action action4 = new Action("Publish", "Action4", Semantika.published);
		Action action5 = new Action("Finish", "Action5", Semantika.finall);
		Field field1 = new Field("Status", "Field1", " ", " ");
		Field field2 = new Field("Name", "Field2", " ", " ");
		Field field3 = new Field("DateTime", "Field3", " ", " ");
		Field field4 = new Field("Answers", "Field4", " ", " ");
		Field field5 = new Field("SafetyDocument", "Field5", " ", " ");
		Field field6 = new Field("PrevState", "Field6", " ", " ");
		Field field7 = new Field("DenyingReason", "Field7", " ", " ");
		Field field8 = new Field("Equipment", "Field8", " ", " ");
		Field field9 = new Field("Points", "Field9", " ", " ");
		Field field10 = new Field("PhoneNo", "Field10", " ", " ");
		
		ArrayList<Field> mand1 = new ArrayList<>();
		ArrayList<Field> hid1 = new ArrayList<>();
		hid1.add(field2);
		hid1.add(field3);
		hid1.add(field5);
		hid1.add(field6);
		hid1.add(field7);
		ArrayList<Field> den1 = new ArrayList<>();
		den1.add(field1);
		den1.add(field2);
		den1.add(field3);
		den1.add(field4);
		ArrayList<Semantika> sem1 = new ArrayList<>();
		sem1.add(Semantika.init);
		sem1.add(Semantika.saveEnabled);
		sem1.add(Semantika.deleteEnabled);
		State state1 = new State("1", "Init", sem1, mand1, hid1, den1);
		
		ArrayList<Field> mand2 = new ArrayList<>();
		mand2.add(field8);
		ArrayList<Field> hid2 = new ArrayList<>();
		hid2.add(field2);
		hid2.add(field3);
		hid2.add(field5);
		hid2.add(field6);
		hid2.add(field7);
		ArrayList<Field> den2 = new ArrayList<>();
		den2.add(field1);
		den2.add(field2);
		den2.add(field3);
		den2.add(field4);
		ArrayList<Semantika> sem2 = new ArrayList<>();
		sem2.add(Semantika.saveEnabled);
		sem2.add(Semantika.submitted);
		sem2.add(Semantika.published);
		State state2 = new State("2", "Submitted", sem2, mand2, hid2, den2);
		
		ArrayList<Field> mand3 = new ArrayList<>();
		mand3.add(field8);
		mand3.add(field9);
		ArrayList<Field> hid3 = new ArrayList<>();
		hid3.add(field6);
		hid3.add(field7);
		ArrayList<Field> den3 = new ArrayList<>();
		den3.add(field1);
		den3.add(field2);
		den3.add(field3);
		den3.add(field9);
		ArrayList<Semantika> sem3 = new ArrayList<>();
		sem3.add(Semantika.saveEnabled);
		sem3.add(Semantika.published);
		sem3.add(Semantika.finall);
		State state3 = new State("3", "Published", sem3, mand3, hid3, den3);
		
		ArrayList<Field> mand4 = new ArrayList<>();
		mand4.add(field8);
		mand4.add(field9);
		mand4.add(field4);
		ArrayList<Field> hid4 = new ArrayList<>();
		hid4.add(field6);
		hid4.add(field7);
		ArrayList<Field> den4 = new ArrayList<>();
		den4.add(field1);
		den4.add(field2);
		den4.add(field3);
		den4.add(field10);
		ArrayList<Semantika> sem4 = new ArrayList<>();
		sem4.add(Semantika.saveEnabled);
		sem4.add(Semantika.finall);
		State state4 = new State("4", "Final", sem4, mand4, hid4, den4);
		
		TransitionState trans1 = new TransitionState("1", "Init to Submit", Semantika.submitted, state1, state2);
		TransitionState trans2 = new TransitionState("2", "Submit to Publish", Semantika.published, state2, state3);
		TransitionState trans3 = new TransitionState("3", "Publish to Finish", Semantika.finall, state3, state4);
		
		state1.transitions.add(trans1);
		state2.transitions.add(trans2);
		state3.transitions.add(trans3);
		state4.transitions.add(null);
		
		ArrayList<State> stanja = new ArrayList<>();
		stanja.add(state1);
		stanja.add(state2);
		stanja.add(state3);
		stanja.add(state4);
		ArrayList<TransitionState> tranzicije = new ArrayList<>();
		tranzicije.add(trans1);
		tranzicije.add(trans2);
		tranzicije.add(trans3);
		ArrayList<Field> polja = new ArrayList<>();
		polja.add(field1);
		polja.add(field2);
		polja.add(field3);
		polja.add(field4);
		polja.add(field5);
		polja.add(field6);
		polja.add(field7);
		polja.add(field8);
		polja.add(field9);
		polja.add(field10);
		ArrayList<Action> akcije = new ArrayList<>();
		akcije.add(action1);
		akcije.add(action2);
		akcije.add(action3);
		akcije.add(action4);
		akcije.add(action5);
		Document doc = new Document(stanja, tranzicije, "AccessPermit", false, false, akcije, polja, state1);
		
		XStream xstream = new XStream();
		String dataXML = xstream.toXML(doc);
		
		String path = "NasXML.xml";
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		bw.write(dataXML);
		bw.close();
	}
	public void openXML() {
		XStream xstream1 = new XStream();
		Object readObject = xstream1.fromXML(new File("./NasXML.xml"));
		System.out.println(readObject);
	}
}

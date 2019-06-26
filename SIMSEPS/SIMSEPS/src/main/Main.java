package main;

import gui.MainWindow;

import java.io.IOException;
//import model.Korisnik;
//import utility.Utility;
import java.util.*;

import model.Document;
import model.State;
import readXML.ReadXML;

public class Main {
	public static ArrayList<State> stanja;
	public static Document doc;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadXML readxml = new ReadXML();
		readxml.generateXML();
		doc = readxml.openXML();
		start();
	}
	
	public static void start() {
		MainWindow w = new MainWindow(doc);
		
	}
}

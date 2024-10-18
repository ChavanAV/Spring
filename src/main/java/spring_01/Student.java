package spring_01;

import java.util.*;

public class Student {

	private String name;
	private Trainer t;
	private List<String> subs;
	private Map<String , Integer> subMarks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Trainer getT() {
		return t;
	}
	public void setT(Trainer t) {
		this.t = t;
	}
	public List<String> getSubs() {
		return subs;
	}
	public void setSubs(List<String> subs) {
		this.subs = subs;
	}
	public Map<String, Integer> getSubMarks() {
		return subMarks;
	}
	public void setSubMarks(Map<String, Integer> subMarks) {
		this.subMarks = subMarks;
	}
	
}

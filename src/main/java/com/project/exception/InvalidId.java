package com.project.exception;

public class InvalidId extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;

	public InvalidId() {
//		id = "";
	}

	public InvalidId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Invalid " + id + "ID !!!";
	}
}
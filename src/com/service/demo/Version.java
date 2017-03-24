package com.service.demo;

import java.io.Serializable;

public class Version implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2878788732014066708L;
	private String number;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBuild_hash() {
		return build_hash;
	}
	public void setBuild_hash(String build_hash) {
		this.build_hash = build_hash;
	}
	public String getBuild_date() {
		return build_date;
	}
	public void setBuild_date(String build_date) {
		this.build_date = build_date;
	}
	public boolean isBuild_snapshot() {
		return build_snapshot;
	}
	public void setBuild_snapshot(boolean build_snapshot) {
		this.build_snapshot = build_snapshot;
	}
	public String getLucene_version() {
		return lucene_version;
	}
	public void setLucene_version(String lucene_version) {
		this.lucene_version = lucene_version;
	}
	private String build_hash;
	private String build_date;
	private boolean build_snapshot;
	private String lucene_version;
	
}

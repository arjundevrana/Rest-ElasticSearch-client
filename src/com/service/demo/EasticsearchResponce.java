package com.service.demo;

import java.io.Serializable;

public class EasticsearchResponce implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCluster_name() {
	return cluster_name;
}
public void setCluster_name(String cluster_name) {
	this.cluster_name = cluster_name;
}
public String getCluster_uuid() {
	return cluster_uuid;
}
public void setCluster_uuid(String cluster_uuid) {
	this.cluster_uuid = cluster_uuid;
}
public Version getVersion() {
	return version;
}
public void setVersion(Version version) {
	this.version = version;
}
public String getTagline() {
	return tagline;
}
public void setTagline(String tagline) {
	this.tagline = tagline;
}
private String cluster_name;
private String cluster_uuid;
private Version version;
private String tagline;
	
}

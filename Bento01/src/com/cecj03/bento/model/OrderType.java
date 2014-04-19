package com.cecj03.bento.model;

public class OrderType {

	private int id;
	private String type;
	private String showName;
	private java.sql.Time startTime;
	private java.sql.Time endTime;
	private char deductSalary;
	private char notifyManager;
	private int updateBy;
	private java.sql.Timestamp updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public java.sql.Time getStartTime() {
		return startTime;
	}

	public void setStartTime(java.sql.Time startTime) {
		this.startTime = startTime;
	}

	public java.sql.Time getEndTime() {
		return endTime;
	}

	public void setEndTime(java.sql.Time endTime) {
		this.endTime = endTime;
	}

	public char getDeductSalary() {
		return deductSalary;
	}

	public void setDeductSalary(char deductSalary) {
		this.deductSalary = deductSalary;
	}

	public char getNotifyManager() {
		return notifyManager;
	}

	public void setNotifyManager(char notifyManager) {
		this.notifyManager = notifyManager;
	}

	public int getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(int updateBy) {
		this.updateBy = updateBy;
	}

	public java.sql.Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.sql.Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}

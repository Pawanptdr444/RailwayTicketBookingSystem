package com.springrest.springrest.entities;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;


@Entity
public class train {
	
	
   @Id
  
   private long UserId;
   private double Tno;
   private double PNR_No ;
   private String UserName;
   private String Class_bogi;
   private int Seat_No;
   
public train(long userId, double pNR_No, double train_No, String userName, String class_bogi, int seat_No) {
	super();
	UserId = userId;
	PNR_No = pNR_No;
	Tno = train_No;
	UserName = userName;
	Class_bogi = class_bogi;
	Seat_No = seat_No;
}

public train() {
	super();
	// TODO Auto-generated constructor stub
}

public long getUserId() {
	return UserId;
}

public void setUserId(long userId) {
	UserId = userId;
}

public double getPNR_No() {
	return PNR_No;
}

public void setPNR_No(double pNR_No) {
	PNR_No = pNR_No;
}

public double getTno() {
	return Tno;
}

public void setTno(double tno) {
	Tno = tno;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public String getClass_bogi() {
	return Class_bogi;
}

public void setClass_bogi(String class_bogi) {
	Class_bogi = class_bogi;
}

public int getSeat_No() {
	return Seat_No;
}

public void setSeat_No(int seat_No) {
	Seat_No = seat_No;
}

@Override
public String toString() {
	return "Train [UserId=" + UserId + ", PNR_No=" + PNR_No + ", Train_No=" + Tno + ", UserName=" + UserName
			+ ", Class_bogi=" + Class_bogi + ", Seat_No=" + Seat_No + "]";
}





	
	
   
   
	
}


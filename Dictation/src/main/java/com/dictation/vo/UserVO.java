package com.dictation.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserVO {
	private String user_id;
	private String pw;
	private String school_cd;
	private String position_cd;
	private String kor_nm;
	private String end_nm;
	private int grade;
	private String ban;
	private String birth_dt;
	private String cel_phone_no;
	private String hom_phone_no;
	private String gender_cd;
	private String email;
}

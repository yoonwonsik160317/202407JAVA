package com.board.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MemberDto {
	
	private int id;
	private String name;
	private String email;
	private String pss;
	private String tell;

}

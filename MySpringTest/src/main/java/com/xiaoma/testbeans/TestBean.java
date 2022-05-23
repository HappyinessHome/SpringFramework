package com.xiaoma.testbeans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class TestBean {
	private String id;
	private String desc;
	public TestBean(String id){
		this.id=id;
	}
}

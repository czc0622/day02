package cn.jiyun.pojo;

import java.util.Arrays;

public class Stu {
	
	private String name;
	private String sex;
	private String[] hobby;
	@Override
	public String toString() {
		return "Stu [name=" + name + ", sex=" + sex + ", hobby=" + Arrays.toString(hobby) + ", clazz="
				+ clazz + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	private String clazz;
}

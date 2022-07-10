package com.ex.hash;

public class HashTest {

	public static void main(String[] args) {
		MyHash mainObject = new MyHash(20);
		mainObject.saveData("DaveLee", "01022222222");
		mainObject.saveData("fun-coding", "0104444444");  //가져올 네임 출값;
		mainObject.getData("fun-coding");  //맨앞글자 하나만 인식 또같은 경우 덮어씌워짐 
		System.out.println(mainObject.getData("fun-coding"));
	}

}

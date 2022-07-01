package com.ex.hash;

public class HashTest {

	public static void main(String[] args) {
		MyHash mainObject = new MyHash(20);
		mainObject.saveData("DaveLee", "01022222222");
		mainObject.saveData("fun-coding", "0104444444");  //가져올 네임 출값;
		mainObject.getData("fun-coding");
		System.out.println(mainObject.getData("fun-coding"));
	}

}

package com.generic.ex3;

import com.generic.animal.Cat;
import com.generic.animal.Dog;

public class AnimalHospitalMainV0 {

	public static void main(String[] args) {

		DogHospital dogHospital = new DogHospital();
		CatHospital catHospital = new CatHospital();

		Dog dog = new Dog("멍멍이1" , 100);
		Cat cat = new Cat("냐용이1", 300);

		// 개 병원
		dogHospital.set(dog);
		dogHospital.checkup();

		//고양이 병원
		catHospital.set(cat);
		catHospital.checkup();

		//문제1 개병원에 고양이 전달 안됨

		//문제2: 개 타입 변환
		dogHospital.set(dog);
		Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
		System.out.println("biggerDog = "+ biggerDog);
	}
}

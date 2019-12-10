package com.web.app;

public class AnimalType {

	public String getAnimalType(String animal)
	{
		
		String animalType="";
		if("Lion".equals(animal))
		{
			animalType="wild";
		}
		else if("Dog".equals(animal))
		{
			animalType="Domestic";
		}
		else
		{
			animalType="Not found";
		}
		return animalType;
	}

}


class Syam{
	public static void main(String[] args) {
		
	}
}
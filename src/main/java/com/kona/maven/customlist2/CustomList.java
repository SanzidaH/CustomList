package com.kona.maven.customlist2;

import java.lang.reflect.Array;

public class CustomList<T> {

	private int INITIAL_ARRAY_LENGTH = 3;
	T[] genericObject = (T[]) new Object[INITIAL_ARRAY_LENGTH];
	int objCount;

	public CustomList(T[] genericObject, int objCount) {
		super();
		this.genericObject = genericObject;
		this.objCount = objCount;
	}

	public CustomList() {
		//super();
		//this.objCount = 0;
		// TODO Auto-generated constructor stub
	}

	public void add(T objAdd) {

		if (objCount >= INITIAL_ARRAY_LENGTH) {

			T[] newGenericObject = (T[]) new Object[genericObject.length + 1];
			INITIAL_ARRAY_LENGTH++;

			for (int i = 0; i < genericObject.length; i++) {

				newGenericObject[i] = genericObject[i];

			}

			this.genericObject = newGenericObject;

			genericObject[objCount++] = objAdd;

		} else {

			genericObject[objCount++] = objAdd;

		}

	}

	public int size() {

		System.out.println("object count: " + objCount);
		System.out.println("genericObject.length: " + genericObject.length);
		System.out.println("INITIAL_ARRAY_LENGTH " + INITIAL_ARRAY_LENGTH);

		return objCount;
	}

	public void displayCustomList() {

		for (int i = 0; i < genericObject.length; i++) {

			System.out.println(genericObject[i]);
		}
	}

	// Removes first occurrence of objRemove
	public void remove(T objRemove) {
		for (int i = 0; i < genericObject.length; i++) {
			if (objRemove.equals(genericObject[i])) {

				T[] newGenericObject = (T[]) new Object[genericObject.length - 1];
				
				for (int j = i; j < genericObject.length-1 ; j++) {
					newGenericObject[j] = genericObject[j + 1];
				}

				for (int k = 0; k < i; k++) {
					newGenericObject[k] = genericObject[k];
				}
				
				genericObject = newGenericObject;
				
				objCount--;

				if (objCount > 3) {
					INITIAL_ARRAY_LENGTH--;
				}


				
			}
		}

	}

	public T get(int index) {

		if (index >= genericObject.length || index < 0) {
			return null;
		}

		return genericObject[index];
	}
	

	public void clear() {

		INITIAL_ARRAY_LENGTH = 3;
		objCount = 0;
		T[] newGenericObject = (T[]) new Object[INITIAL_ARRAY_LENGTH];
		genericObject = null;
		genericObject = newGenericObject;

	}

	public void addAll(CustomList<T> addlist) {
		
		if(addlist == null) {
			
		}
		
		else {
		
			int additionalCapacity = 0, initObjCount = this.objCount;
//			if(INITIAL_ARRAY_LENGTH ==3 && objCount<3) {
//				additionalCapacity = INITIAL_ARRAY_LENGTH - objCount;
//			}
//			else 
//				additionalCapacity = 0;
			
			System.out.println("objCount: "+objCount);
			objCount = objCount + addlist.size();
			System.out.println("objCount: "+objCount);
			
			T[] newGenericObject = (T[]) new Object[objCount];
//			INITIAL_ARRAY_LENGTH = INITIAL_ARRAY_LENGTH + addlist.size() - additionalCapacity;
			INITIAL_ARRAY_LENGTH = objCount;		
			
			for(int j = 0; j < initObjCount; j++) {
				newGenericObject[j] = genericObject[j];
			}
			
            int temp = 0;
			for(int k=initObjCount; k<objCount; k++) {
				newGenericObject[k] = addlist.get(temp);
				temp++;
			}


			
			genericObject = newGenericObject;
			
		}
		
		

	}
}

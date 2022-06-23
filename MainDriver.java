package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.stack_crud_operation.StackCrudOperation;

public class MainDriver
{
	static StackCrudOperation stackCrudOperation = new StackCrudOperation();
	public static void main(String[] args)
	{
		stackCrudOperation.createTheData();
		
		stackCrudOperation.readTheData();
		
		stackCrudOperation.updateTheData();
		
		stackCrudOperation.deleteTheData();
	}
}
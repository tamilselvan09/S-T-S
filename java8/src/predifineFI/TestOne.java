package predifineFI;

import java.util.function.Predicate;

import functionClsInterface.Test;

//Given number is greater then 100 or not ? 

public class TestOne {

	//Lambda
	public static void main(String[] args) {
 Predicate<Integer>p = a->a>100;
		
 //  Test	t=new Test();
   
   System.out.println(p.test(101));
	}

}

  //Predicate written  always boolean value 
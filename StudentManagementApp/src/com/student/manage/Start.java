package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to ADD STUDENT");
			System.out.println("PRESS 2 to DELETE STUDENT");
			System.out.println("PRESS 3 to DISPLAY STUDENT");
			System.out.println("PRESS 4 to EXIT APP");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add student.
			}
			else if(c==2) {
				//Delete student.
			}
			else if(c==3) {
				//display student.
			}
			else if(c==4) {
				//exit.
			}
			else {
				//not found.
			}
			
		}

	}

}

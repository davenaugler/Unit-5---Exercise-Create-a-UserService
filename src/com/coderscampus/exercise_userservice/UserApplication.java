package com.coderscampus.exercise_userservice;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		User[] users = new User[1];
		for (int i = 0; i < 1; i++) {
			users[i] = userService.createUser("aUsernameHere", "aPasswordHere", "Somebodies Name");
		}
		System.out.println(users);

	}

}

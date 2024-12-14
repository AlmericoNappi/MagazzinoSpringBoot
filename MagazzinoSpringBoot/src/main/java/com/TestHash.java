package com;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class TestHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pwd ="PIPPO";
		
		String hash = BCrypt.hashpw(pwd, BCrypt.gensalt());
	System.out.println(hash);
	
	if(BCrypt.checkpw(pwd, hash))
		System.out.println("utente loggato");
	else
		System.out.println("credenziali errate");
	}

}

package br.com.whs.javaredis;

import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisKeyJava {

	public static void main(String[] args) {
		//Connecting to Redis server on localhost 
	      Jedis jedis = new Jedis("localhost"); 
	      System.out.println("Connection to server sucessfully"); 
	      //store data in redis list 
	      // Get the stored data and print it 
	      List<String> list = new ArrayList<>(jedis.keys("*")); 
	      for(int i = 0; i<list.size(); i++) { 
	         System.out.println("List of stored keys:: "+list.get(i)); 
	      } 
	}

}

package com.progettounivpm.SpringAPP.service;

import org.json.simple.JSONObject;


/* INTERFACCIA CHE DEFINISCE (STANDARDIZZA) I METODI CHE USEREMO NELLE CLASSI CHE LA EREDITERANNO 
 * 
 */

public interface TwitterService {
	  
	/* dichiarazione del metodo toJSON (di tipo JSONObject) che fornisce L'OUTPUT DEL NOSTRO PROGRAMMA
	 * 
	 */
	public abstract JSONObject toJSON(); 
	/* dichiarazione del metodo getJSONTweet che restituirà un oggetto Tweets 
	 * prendendo in input il parametro hastag da cercare
	 */
	public abstract JSONObject getJSONTweets(String hashtag);
	
	
}

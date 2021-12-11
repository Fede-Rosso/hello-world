package com.progettounivpm.SpringAPP.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.core.codec.AbstractDataBufferDecoder;
import org.springframework.stereotype.Service;

@Service // deve implementare tutti i metodi usati sull'interfaccia che eredita
public class TwitterServiceImpl implements TwitterService{
	
	private String url= "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?q=";
	private String ApiKey = ""; // Da implementare poi quando sostituiremo il url
	
	@Override
	public JSONObject getJSONTweets(String hashtag) {
		JSONObject Tweets = null; //oggetto locale che servirà per il return
		
		URLConnection openConnection= new URL( url + hashtag ).openConnection(); // Open connection crea la connessione con il URL indicato
		/*POSSIBILE IMPLEMENTAZIONE:
		 *	int count; //stabilisce quanti tweet cercare
		 *  new URL( url + hastag + "&count=" + conunt ).openConnection()
		 */
		
		// Volendo è possibile ridefinire openConnection come lettura di un file json o txt da un percorso stabilito
		
		InputStream in = openConnection.getInputStream();  //legge la connessione creando un oggetto in di tipo InputStream
		String data= "";
		String line = "";
		
		try {
			InputStreamReader inR= new InputStreamReader(in);
			BufferedReader buf = new BufferedReader(inR);
			while((line= buf.readLine())!= null) {
				data+=line;
			}
			// dopo aver salvato tutto quello letto su data facciamo un cast di tipo JSONObject e salviamo sull'oggetto che restituiremo
			Tweets = (JSONObject)JSONValue.parseWithException(data);	
		}
		catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
		finally { // in finally ci entra: sia dopo il try se esegito correttamente, sia se ha trovato delle eccezioni 
			in.close(); 
		}
		return Tweets;
	}
	
	@Override
	public JSONObject toJSON() {
		return null;
	}

}

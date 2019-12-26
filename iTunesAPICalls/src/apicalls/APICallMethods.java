package apicalls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.ITunesItem;
import model.ResponseObject;

public class APICallMethods {

	//Holds the API URL
	String apiUrl;
	
	private static APICallMethods instance = null; 
	
	private APICallMethods()
	{ 
		//API URL initialization
		apiUrl = "https://itunes.apple.com/search?";
	}
	
	public static APICallMethods getInstance()
	{ 
		if (instance == null)
			{
				instance = new APICallMethods(); 
			}
		return instance;
	} 
	
	//Search 
	public ArrayList <ITunesItem> search(String searchText) throws IOException
	{
		searchText = searchText.replace(" ", "+");
		String query = "term=" + searchText;
		return searchQuery(query);
	}
	
	//Search with more than 1 key 
	public ArrayList <ITunesItem> searchMultipleKey(String searchText, String country, String media) throws IOException
	{
		searchText = searchText.replace(" ", "+");
		String query = "term=" + searchText;
		if(!country.isEmpty())
		{
			query = query + "&country=" + country;
		}
		if(!media.isEmpty())
		{
			query = query + "&media=" + media;
		}
		return searchQuery(query);
	}
	
	//Get Albums 1 and more 
	public ArrayList <ITunesItem> getAlbums(String searchText) throws IOException
	{
		searchText = searchText.replace(" ", "+");
		String query = "term=" + searchText + "&entity=album&attribute=albumTerm";
		return searchQuery(query);
	}
	
	//Get Artist 1 and more
	public ArrayList <ITunesItem> getArtists(String searchText) throws IOException
	{
		searchText = searchText.replace(" ", "+");
		String query = "term=" + searchText + "&entity=musicArtist&attribute=artistTerm";
		return searchQuery(query);
	}
	
	private ArrayList <ITunesItem> searchQuery(String query) throws IOException
	{
		URL url = new URL(apiUrl + query);
		ResponseObject responseObject = null;
		ArrayList <ITunesItem> result = null;
		
		String readLine = null;
	    HttpURLConnection conection = (HttpURLConnection) url.openConnection();
	    conection.setRequestMethod("GET");
	    conection.setRequestProperty("Accept", "application/json");
	    
	    int responseCode = conection.getResponseCode();
	    if (responseCode == HttpURLConnection.HTTP_OK) {
	        BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
	        StringBuffer response = new StringBuffer();
	        while ((readLine = in .readLine()) != null)
	        {
	            response.append(readLine);
	        }
	        in .close();
	        
	        Gson gson = new Gson();
	        Type type = new TypeToken<ResponseObject>(){}.getType();
	        responseObject = gson.fromJson(response.toString(), type);
	        result = (ArrayList<ITunesItem>) responseObject.getResults();
	        
	    } else {
	        System.out.println("ERROR: Connection refused");
	    }
	    
	    return result;
	}
}

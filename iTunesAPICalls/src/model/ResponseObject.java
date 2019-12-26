package model;

import java.util.List;

//The object that iTunes API response
public class ResponseObject {

	//Number of results it the list
	int resultCount;
	//List of results
	List<ITunesItem> results;
	
	ResponseObject()
	{
		
	}
	
	public int getResultCount() {
		return resultCount;
	}
	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}
	public List<ITunesItem> getResults() {
		return results;
	}
	public void setResults(List<ITunesItem> results) {
		this.results = results;
	}
}

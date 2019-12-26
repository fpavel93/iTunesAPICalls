package apicalls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import model.ITunesItem;

public class ITunesAPICalls {

	public static void main(String [ ] args)
	{

		APICallMethods api = APICallMethods.getInstance();
		System.out.println("Welcome to ITunes search API");
		
		int num = 1;
		while(num != 0)
		{
			System.out.println("Please choose what kind of search do tou want:");
			System.out.println("1. Regular search");
			System.out.println("2. Search with more than 1 key");
			System.out.println("3. Search Albums 1 and more");
			System.out.println("4. Search Artist 1 and more");
			System.out.println("0. For exit.");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			Scanner in = new Scanner(System.in);
			
			num = in.nextInt();
			
			switch(num) {
				case 1:
				{
					try {
						System.out.println();
						System.out.println("Enter text for search: ");
				        String text = reader.readLine();
						ArrayList <ITunesItem> result = api.search(text);
						if(result != null)
						{
							for(ITunesItem item:result)
							{
								System.out.println(item.toString());
							}
						}
						else
						{
							System.out.println("No results");
						}
						
						System.out.println();
						System.out.println("Press Enter to continiue");
						text = reader.readLine();
						
					} catch (IOException e) {
						System.out.println("Error: conection problems");
					}
					
					break;
				}
				case 2:
				{
					try {
						System.out.println();
						System.out.println("Enter text for search: ");
						String text = reader.readLine();
						System.out.println("Enter country code for for search (optional): ");
						String country = reader.readLine();
						System.out.println("Enter media type for for search (optional): ");
						System.out.println("Media type could be: movie, podcast, music, musicVideo, audiobook, shortFilm, tvShow, software, ebook or all");
						String media = reader.readLine();
						ArrayList <ITunesItem> result = api.searchMultipleKey(text,country,media);
						if(result != null)
						{
							for(ITunesItem item:result)
							{
								System.out.println(item.toString());
							}
						}
						else
						{
							System.out.println("No results");
						}
						
						System.out.println();
						System.out.println("Press Enter to continiue");
						text = reader.readLine();
						
					} catch (IOException e) {
						System.out.println("Error: conection problems");
					}
					break;
				}
				case 3:
				{
					try {
						System.out.println();
						System.out.println("Enter text for search Albums: ");
						String text = reader.readLine();
						ArrayList <ITunesItem> result = api.getAlbums(text);
						if(result != null)
						{
							for(ITunesItem item:result)
							{
								System.out.println(item.toString());
							}
						}
						else
						{
							System.out.println("No results");
						}
						
						System.out.println();
						System.out.println("Press Enter to continiue");
						text = reader.readLine();
						
					} catch (IOException e) {
						System.out.println("Error: conection problems");
					}
					break;
				}
				case 4:
				{
					try {
						System.out.println();
						System.out.println("Enter text for search Artists: ");
						String text = reader.readLine();
						ArrayList <ITunesItem> result = api.getArtists(text);
						if(result != null)
						{
							for(ITunesItem item:result)
							{
								System.out.println(item.toString());
							}
						}
						else
						{
							System.out.println("No results");
						}
						
						System.out.println();
						System.out.println("Press Enter to continiue");
						text = reader.readLine();
						
					} catch (IOException e) {
						System.out.println("Error: conection problems");
					}
					break;
				}
			}
		}
	}
}

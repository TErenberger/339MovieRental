package Runtime;
import java.io.File;
import java.util.ArrayList;

import Products.Movie;
public class Library {

	ArrayList<Movie> movies;
	public Library(String sourceUrl)
	{
		movies = new ArrayList<Movie>();
		
		File sourceFile = new File(sourceUrl);
		
	}
	
}

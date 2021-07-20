package Practise;

import java.net.URI;
import java.net.URISyntaxException;

public class CompareSiteURLWithItsIpAddress {

	public static void main(String[] args) {

		try {
			System.out.println(new URI("https://naveenautomationlabs.com").equals("https://45.130.228.5"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
} 

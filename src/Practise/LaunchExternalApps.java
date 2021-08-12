package Practise;

import java.io.IOException;

public class LaunchExternalApps {
	/*Runtime is a class which will help us to open external application
	such as browser, VLC player,Notepad etc*/

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Runtime run = Runtime.getRuntime();
		Process pr = run.exec("notepad.exe D:/input-2.txt");
		Thread.sleep(4000);
		pr.destroy();
		
		String[] str = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", 
				"http://www.google.com"};
		run.exec(str);
	}

}

package gson_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
	public static String readTextFile(String fPath) throws FileNotFoundException {
		File file = new File(fPath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		String res = sc.next();
		sc.close();
		return res;
	}
}

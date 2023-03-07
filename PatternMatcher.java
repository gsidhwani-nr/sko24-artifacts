import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * The PatternMatcher program help you to understand how to parse a line.
 * There are multiple samples with regular expressions are given below and you may uncomment and run the same.
 * Once, the parsing is done correctly then same working regular expression may be used in newrelic-unix-monitor's json file.
 * @author  Gulab Sidhwani
 * @version SKO
 * @since   2023-03-09 
 */
public class PatternMatcher {

	public static void main(String[] args) {
	
       
		//SKO Sample 1
				Pattern patternToMatch = Pattern.compile("(\\d+)\\s+(\\w+)\\s+(\\d+)\\s+(\\d+)");   
				//Pattern patternToMatch = Pattern.compile("(12)       (L23)     (43)      (76)"); 
				Matcher lineMatch = patternToMatch.matcher("12       L23     43      76".trim());
		//SKO Sample 1		

		//SKO Sample 2
//				Pattern patternToMatch = Pattern.compile("(\\d+)\\s+(.*)");
//				//Pattern patternToMatch = Pattern.compile("(123) (field1)");			   
//				Matcher lineMatch = patternToMatch.matcher("123 field1".trim());						
		//SKO Sample 2
				
		// SKO Sample 3 
//				 Pattern patternToMatch = Pattern.compile("(\\d+)\\s*K\\s*(.*)");
//				 //Pattern patternToMatch = Pattern.compile("(1126984) K (active memory)");
//				 Matcher lineMatch = patternToMatch.matcher("1126984 K active memory".trim());
		// SKO Sample 3 
		
		// SKO Sample 4 
				
//				Pattern patternToMatch = Pattern.compile("(\\d+)\\s*(\\S{1})(\\S{3})(\\S{3})(\\S{3})\\s*(\\d+)\\s*(\\w+)\\s*(\\w+)\\s*(\\d+)\\s*([a-zA-Z 0-9]+)\\s(.*)");
//				//Pattern patternToMatch = Pattern.compile("(3) (d)(rwx)(r-x)(r-x)   (2) (root)     (sys)            (2) (Aug 20  2018) (zones)");
//				Matcher lineMatch = patternToMatch.matcher("3 drwxr-xr-x   2 root     sys            2 Aug 20  2018 zones".trim());		
		// SKO Sample 4
		
		int iCount = lineMatch.groupCount(); // Total Matching Groups
		System.out.println("Total Matching Groups " + iCount);
		int i =1;

		if (lineMatch.matches())
		{
			while (iCount >= i ) {
				System.out.println("Matching Column " + "[" + i + "]  " + lineMatch.group(i++) );
			}


		}

	}

}

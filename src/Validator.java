import java.util.regex.*;


public class Validator{
	
	public static final String INVALID_KEYWORD = "<invalid keyword>";
	public static final String INVALID_START_LETTER = "<invalid order>";
	public static final String MISSING_SEPERATOR="Missing Seperator : ";
	public static final String INVALID_INPUT="No Input";
	public static final String SUCCESS = "success";
	public static final String FAIL = "failed";
	public static final	String pattern1 = "[ehk!?]+";
	public static final	String pattern2 = "e.*";
	public static final	String filter = "[^a-zA-Z!?]+";
	
	public String validate(String input){
		
		try{
 		
			boolean matchKey = Pattern.matches(pattern1, input); 
			if(!matchKey){
				return INVALID_KEYWORD;
			}
			
			boolean matchLetter = Pattern.matches(pattern2,input); 
			if(!matchLetter){
				return INVALID_START_LETTER;
			}
			 
 			return SUCCESS;

		}catch(Exception e){
			e.printStackTrace();
			return FAIL;
		}
		
	}
	
	public String validateInput(String input) throws Exception{
		
		try{
			
			if(input == null || input.trim().equals("")){
				return INVALID_INPUT;
 			}
			
			if(!input.contains(":")){
				return MISSING_SEPERATOR;
			}

		}catch(Exception e){
			e.printStackTrace();
 		}
		
		return SUCCESS;

	}
	
	
}
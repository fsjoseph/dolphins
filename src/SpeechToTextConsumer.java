import java.util.Map;
import java.util.function.Consumer;

public class SpeechToTextConsumer extends Validator implements Consumer<String>{
	
	public void accept(String input){
		
		try{	
		
			String result = validateInput(input);
			if(!SUCCESS.equals(result)){
				System.out.println(result);
				return;
			}
			
			Map<String,String> mapper = new SoundMapper().getMap();
			
			String[] token = input.split(":"); 
			String user = token[0];
			String[] keywords = token[1].split(" ");
			StringBuilder output = new StringBuilder();
			output.append(user+": ");
			
			for(String keyword : keywords){
				    if(keyword.trim().equals(""))continue;

					String text = keyword.replaceAll(filter,"");
					result = validate(text);
					if(SUCCESS.equals(result)){
						String value = mapper.get(text);
						output.append(value + " ");
					}else{
						output.append(result + " ");
					}		
			}
			output.append("\n");
			System.out.println(output);

		}catch(Exception e){
			System.out.println("Error1:");
			e.printStackTrace();
			System.out.println("Error2:");
			
		}
	}
	
}
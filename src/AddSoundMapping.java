import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AddSoundMapping extends Validator{
	
	public static void main(String... args){
		
		new AddSoundMapping().add(args);
	}
	
	public void add(String... args){
		
		try{
			
			validateEntry(args);

			String key = args[0];
			String value = args[1];
			String line = "\n"+ key + "=" + value;
			Files.write(Paths.get("SoundInfo.properties"), line.getBytes(),StandardOpenOption.APPEND); 
			System.out.println("Entry added successfully!");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void validateEntry(String... args){
	    if(args.length < 2){
			System.out.println("Please enter Sound Keyword and Meaning\nEg: java AddSoundMapping ehhhk hi");
			System.exit(1);
		}
		String keyword = args[0];
		String result = validate(keyword);
		if(!SUCCESS.equals(result)){
			System.out.println(result);
			System.exit(1);
		}	
		
	}
	
}
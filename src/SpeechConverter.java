import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class SpeechConverter{

	public void process(String inputFile){
		
		try{
			
			SpeechToTextConsumer consumer = new SpeechToTextConsumer();
			Stream<String> lines = Files.lines(Paths.get(inputFile));
			lines.forEach(consumer);			
			
		}catch(Exception e){
				e.printStackTrace();
		}
		
	}
	
	public static void main(String... args){
		
 		if(args.length == 0){
			System.out.println("Please specify \"input.txt\"");
			System.exit(1);
		}
		
		String file = args[0];
		
		new SpeechConverter().process(file);
	}
	
}
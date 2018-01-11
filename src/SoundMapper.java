import java.util.Map;
import java.util.HashMap;
import java.util.Properties;
import java.io.InputStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.FileInputStream;

public class SoundMapper{
 		
		private Properties prop = new Properties();
		
		public Map<String,String> getMap(){
			
			try{
				
				FileInputStream fileInputStream = new FileInputStream("SoundInfo.properties");
 				prop.load(fileInputStream);
				
				Map<String,String> map = prop.entrySet().stream().collect(Collectors.toMap(e-> String.valueOf(e.getKey()), e->String.valueOf(e.getValue())));
				
 				return map;
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return null;
		}
		
		public static void main(String... args){
			System.out.println(new SoundMapper().getMap());
		}
		
}		
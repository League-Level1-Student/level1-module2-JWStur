import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String result = "";
		
		if (isWoman == true) {
			if (isKnighted == true) {
				if (isWoman == true) {
					result = "Hello Lady " + name;
				}
				else {
					result = "Hello Sir " + name;
				}
			}
			else {
				if (isWoman == true) {
					result = "Hello Ms " + name;
				}
				
				else {
					result = "Hello Mr " + name;
			}
				
			}
			
		return result;
	}

}
package _06_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String result = "";

		if (isWoman && isKnighted)
			result = "Hello Lady " + name;
		
		else if (isWoman && !isKnighted)
			result = "Hello Ms. " + name;
		
		else if (!isWoman && isKnighted)
			result = "Hello Sir " + name;
		
		else result = "Hello Mr. " + name;
		
		/*
		if (isWoman == true) {
			if (isKnighted == true) {
				if (isWoman == true) {
					result = "Hello Lady " + name;
				} else {
					result = "Hello Sir " + name;
				}
			} else {
				if (isWoman == true) {
					result = "Hello Ms " + name;
				}

				else {
					result = "Hello Mr " + name;
				}

			}

		}
		*/
		return result;
	}

}
package randomData
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths

import com.kms.katalon.core.annotation.Keyword
/*import com.thedeanda.lorem.Lorem
import com.thedeanda.lorem.LoremIpsum*/

public class dataGeneator {

	@Keyword
	private String randomNumber(int digits) {
		StringBuilder str = new StringBuilder();
		Random random = new Random();
		for(int i = 0; i < digits; i++) {
			str.append(random.nextInt(10));
		}
		return str.toString();
	}

}

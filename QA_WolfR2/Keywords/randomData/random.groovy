package randomData
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths


import com.kms.katalon.core.annotation.Keyword
import com.thedeanda.lorem.Lorem
import com.thedeanda.lorem.LoremIpsum
//import com.thedeanda.lorem.Lorem
//import com.thedeanda.lorem.LoremIpsum

public class dataGeneator {

	@Keyword
	def randomENString(int length) {
		String chars = lorem.getLastName().replaceAll("[^a-zA-Z]+", "");
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}

	@Keyword
	def randomTHString(int length) {
		String chars = "กขฃคตฆงจฉชซฌญฎฏฐฑฒณดตถทธนบปผฝพฟภมยรลวศษสหฬอฮ"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}

	@Keyword
	private String randomNumber(int digits) {
		StringBuilder str = new StringBuilder();
		Random random = new Random();
		for(int i = 0; i < digits; i++) {
			str.append(random.nextInt(10));
		}
		return str.toString();
	}

	public static Lorem lorem = LoremIpsum.getInstance();

	@Keyword
	public String getRandomParagraphs(int a, int b) {
		String ranPar = lorem.getParagraphs(a, b);
		return ranPar;
	}

	@Keyword
	public String getRandomName(int a, int b) {
		String ranPar = lorem.getName().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}

	@Keyword
	public String getRandomFemaleName() {
		String ranPar = lorem.getNameFemale().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}

	@Keyword
	public String getRandomMaleName() {
		String ranPar = lorem.getNameMale().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}

	@Keyword
	public String getRandomFirstName() {
		String ranPar = lorem.getFirstName().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}

	@Keyword
	public static String getRandomLastName() {
		String ranPar = lorem.getLastName().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}

	@Keyword
	public String getRandomCity() {
		String ranPar = lorem.getCity().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}

	@Keyword
	public String getRandomHeading(int numberofWords) {
		String ranPar = lorem.getTitle(numberofWords);
		return ranPar;
	}

	@Keyword
	public String getRandomHeading_two(int Wordsfrom, int wordstwo) {
		String ranPar = lorem.getTitle(Wordsfrom, wordstwo);
		return ranPar;
	}

	@Keyword
	public String getRandomEmail() {
		String ranPar = lorem.getEmail();
		return ranPar;
	}

	@Keyword
	public String getRandomString() {
		String ranPar = lorem.getFirstName().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}
}

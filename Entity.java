import java.util.Date;
import java.io.Serializable;

public class Entity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String meanings;
	private Date date;
	
	Entity (String meanings) {
		this.meanings = meanings;
		this.date = new Date();
	}
	
	String getMeanings() {
		return meanings;
	}
	
	String getDate() {
		return date.toString();
	}
}

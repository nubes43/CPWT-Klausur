package uhrenanzeige;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Launcher {
	
	
	public static void main(String[] args) {
		
		Uhr u = new Uhr(null, null);
	
		u.aktivieren();
		u.beenden();
		
		System.out.println(new SimpleDateFormat(("'Es ist gerade' HH:mm 'Uhr und' ss 'Sekunden.'")).format(new Date()));
	}
}

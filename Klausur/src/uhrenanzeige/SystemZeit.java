package uhrenanzeige;

import java.util.Date;

public class SystemZeit implements Uhrwerk {
	
	public Date getZeit() {
		
		return new Date();
	}
	
	
	public void setZeit(Date z) throws UnsupportedOperationException {
		
		
	}
}

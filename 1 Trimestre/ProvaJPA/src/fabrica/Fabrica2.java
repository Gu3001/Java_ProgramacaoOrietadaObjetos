package fabrica;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica2 {
	public static EntityManagerFactory fabrica;
	public static EntityManagerFactory get() {
		if (fabrica==null) {
			fabrica = Persistence.createEntityManagerFactory("provaPersistencia");
		}
		return fabrica;
	}
}

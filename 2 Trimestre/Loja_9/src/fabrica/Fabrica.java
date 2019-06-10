package fabrica;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {

	public static EntityManagerFactory fabrica;// criando atributo desse tipo com o nome factory
	//bloco estático, quando a fabrica ser chamada vai construir esse objeto
	public static EntityManagerFactory get() {
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("projetoPersistence"); // criada a conexão
		}
		return fabrica;
	}
}
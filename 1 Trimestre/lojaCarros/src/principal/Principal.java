package principal;
import dao.DAOCarros;
public class Principal {
	public static void main(String[] args) {
		DAOCarros dao = new DAOCarros();
		dao.manipularCarros();
	}
	
}

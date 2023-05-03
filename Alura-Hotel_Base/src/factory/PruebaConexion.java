package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexion {
	
	public static void main(String[] args) throws SQLException {
		ConexionBase con = new ConexionBase();
		Connection cone = con.ConexionBase();
		
		System.out.println("Probando conexion");
		
		cone.close();
		System.out.println("cerrando conexion");
	}

}

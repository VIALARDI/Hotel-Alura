package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConexionBase {
public DataSource dataSou;


public ConexionBase() {
	ComboPooledDataSource comboPool = new ComboPooledDataSource();
	comboPool.setJdbcUrl("jdbc:mysql://localhost/Hotel_Alura?serverTimezone=UTC&useLegacyDatetimeCode=false");
	comboPool.setUser("root");
	comboPool.setPassword("Vialard1");
	
	this.dataSou = comboPool;
}
public Connection ConexionBase() {
	try {
		return this.dataSou.getConnection();
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}
}

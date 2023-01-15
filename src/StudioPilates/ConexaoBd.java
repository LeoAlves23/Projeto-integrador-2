package StudioPilates;
import java.sql.*;

public class ConexaoBd {
	  public static void main(String[] args) throws Exception {
	        String dbURL = "jdbc:postgresql://localhost:5432/studiodb";
	        String username = "studiodb";
	        String password = "studiodb";

	        Connection conn = DriverManager.getConnection(dbURL, username, password);

	        if (conn != null) {
	            System.out.println("Conectado ao BD com sucesso!");
	        }
	    }
	}
	


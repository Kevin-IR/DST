package view;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Vue {

	public void showView(ResultSet result) throws SQLException {

		try {
			System.out.println("Bateau : ");

			while (result.next()) {
				//Traitement requête
				int id = result.getInt("id");
				int poidsMax = result.getInt("poidsMax");
				System.out.println(id+"\t\t\t"+poidsMax) ;
			}
		}
		catch(SQLException se) {
			se.getMessage();
		}
	}
}

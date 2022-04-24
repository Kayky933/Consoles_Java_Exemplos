package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import database.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		try {
			conn = DB.getConnection();

			st = conn.prepareStatement(

					"INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
							+ "VALUES  (?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, "Carlos");
			st.setString(2, "carlos@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("10/01/2019").getTime()));
			st.setDouble(4, 3000.00);
			st.setInt(5, 1);

			int affectedRows = st.executeUpdate();
			if (affectedRows > 0) {
				ResultSet resultAffectedRows = st.getGeneratedKeys();
				while(resultAffectedRows.next()) {
					int id = resultAffectedRows.getInt(1);
					System.out.println("Done! Generated id equals to: "+id);
				}
			}
			rs = st.executeQuery("select * from seller");

			while (rs.next()) {
				System.out.print(rs.getInt("Id") + ", " + rs.getString("Name") + ", " + rs.getString("Email"));
				System.out.println(", " + rs.getDate("BirthDate") + ", " + rs.getDouble("BaseSalary") + ", "
						+ rs.getInt("DepartmentId"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {

			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}

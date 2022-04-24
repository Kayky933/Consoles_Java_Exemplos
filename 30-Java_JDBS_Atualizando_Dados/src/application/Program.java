package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			conn = DB.getConnection();

			st = conn.prepareStatement(

					"UPDATE seller " + "SET BaseSalary = BaseSalary + ? " + "WHERE " + "(DepartmentId = ?)");

			st.setDouble(1, 200.0);
			st.setInt(2, 1);

			int rowsAffected = st.executeUpdate();

			System.out.println("Done! Rows affected: " + rowsAffected);

			rs = st.executeQuery("select * from seller");

			while (rs.next()) {
				System.out.print(rs.getInt("Id") + ", " + rs.getString("Name") + ", " + rs.getString("Email"));
				System.out.println(", " + rs.getDate("BirthDate") + ", " + rs.getDouble("BaseSalary") + ", "
						+ rs.getInt("DepartmentId"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}

package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DB;
import database.DbException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);

			st = conn.createStatement();

			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

			conn.commit();

			System.out.println("rows1 = " + rows1);
			System.out.println("rows2 = " + rows2);

			rs = st.executeQuery("select * from seller WHERE DepartmentId <=2");

			while (rs.next()) {
				System.out.print(rs.getInt("Id") + "| " + rs.getString("Name") + "| " + rs.getString("Email"));
				System.out.println("| " + rs.getDate("BirthDate") + "| " + rs.getDouble("BaseSalary") + "| "
						+ rs.getInt("DepartmentId"));

			}
		}

		catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}

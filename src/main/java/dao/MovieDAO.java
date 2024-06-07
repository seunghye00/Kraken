package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.MovieDTO;

public class MovieDAO {
	public static MovieDAO instance;

	public static synchronized MovieDAO getInstance() {
		if (instance == null) {
			instance = new MovieDAO();
		}
		return instance;
	}

	private MovieDAO() {
	}

	private Connection getConnection() throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection();
	}

	public int insert(MovieDTO dto) throws Exception {

		String sql = "insert into movies values (movies_seq.nextval, ?, ?)";

		try (Connection con = this.getConnection(); PreparedStatement pstat = con.prepareStatement(sql);) {
			pstat.setString(1, dto.getTitle());
			pstat.setString(2, dto.getGenre());
			int result = pstat.executeUpdate();
			return result;
		}
	}
	public int delete(int id) throws Exception {

		String sql = "delete from movies where id = ?";

		try (Connection con = this.getConnection(); PreparedStatement pstat = con.prepareStatement(sql);) {
			pstat.setInt(1, id);
			int result = pstat.executeUpdate();
			return result;
		}
	}
	
	public int update(MovieDTO dto) throws Exception {

		String sql = "update movies set title = ?, genre = ? where id = ?";

		try (Connection con = this.getConnection(); PreparedStatement pstat = con.prepareStatement(sql);) {
			pstat.setString(1, dto.getTitle());
			pstat.setString(2, dto.getGenre());
			pstat.setInt(3, dto.getId());
			int result = pstat.executeUpdate();
			return result;
		}
	}

	public List<MovieDTO> selectAll() throws Exception {

		String sql = "select * from movies order by 1";
		List<MovieDTO> list = new ArrayList<>();

		try (Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				ResultSet rs = pstat.executeQuery();) {
			while (rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				String genre = rs.getString(3);
				list.add(new MovieDTO(id, title, genre));
			}
			return list;
		}
	}
}

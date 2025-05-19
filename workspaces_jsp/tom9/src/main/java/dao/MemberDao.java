package dao;

import java.lang.module.ModuleDescriptor.Builder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Member;
import util.DBUtil;

// DAO
// Data Access Object
public class MemberDao {
	// insert
	// select
//	public static void main(String[] args) {
//		new MemberDao().insert(Member.builder().id("sample").pw("1234").name("개똥이").build());
//	}
	
	public void insert(Member member) {
		// 1. 접속객체 취득 2. 문장생성 3. 실행 후 처리
		Connection conn = DBUtil.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO MEMBER (id, pw, name) VALUES (?, ?, ?)");
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			
			pstmt.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public Member selectOne(String id) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("select * from MEMBER where id = ?");
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Member member = Member.builder()
						.num(rs.getLong("NUM"))
						.id(rs.getString("id"))
						.pw(rs.getString("pw"))
						.name(rs.getString("name"))
						.regDate(rs.getDate("regdate"))
						.build();
					return member;
			
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	// insert
	// select
	public static void main(String[] args) {
		//
		System.out.println(new MemberDao().selectOne(1L));
		System.out.println(new MemberDao().selectOne(2L));
	}
	
	public Member selectOne(Long num) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("select * from MEMBER where num = ?");
			pstmt.setLong(1, num);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Member member = Member.builder()
						.num(rs.getLong("num"))
						.id(rs.getString("id"))
						.pw(rs.getString("pw"))
						.name(rs.getString("name"))
						.regDate(rs.getDate("regdate"))
						.build();
					return member;
			
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
}









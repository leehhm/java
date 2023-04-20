package exampletest;

public class MySqlDao implements DataAccessObject{
	public void select() {
		System.out.println("오라클 DB 검색");
	}
	public void insert() {
		System.out.println("오라클 DB 삽입");
	}
	public void update() {
		System.out.println("오라클 DB 수정");
	}
	public void delete() {
		System.out.println("오라클 DB 삭제");
	}
}

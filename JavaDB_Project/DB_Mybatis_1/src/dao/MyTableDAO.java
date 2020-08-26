package dao;

import org.apache.ibatis.session.*;
import java.util.List;
import dto.MyTableDTO;

public class MyTableDAO {

	private SqlSessionFactory sqlSessionFactory = null; // 이미 스태틱으로 선언된 커넥션 풀을 참조해서 사용한다.
	
	
	// 생성자
	// DAO 인스턴스가 생성될 때
	// 이미 생성되어있는 MyBatisConnectionFactory에서 생성한 커넥션 풀을 획득한다.
	public MyTableDAO(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	
	// select * from TABLE;
	// List<> 제네릭 타입 <>안에 정의된 자료형만 배열로 저장하겠다는 의미
	public List<MyTableDTO> selectAll() {
		List<MyTableDTO> list = null;
		
		// 쿼리문 가져오기
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			//list = session.selectList(QUERY문);
			list = session.selectList("MyTable.selectAll");
		} finally {
			session.close();
		}
		
		return list;
	}
	
	
	// insert into (name) value (value1);
	
	public int insert(String name) {
		int rows = -1;
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			rows = session.insert("MyTable.insert", name);
		} finally {
			session.commit();
			session.close();
		}
		return rows;
	}
	
	// insert into (name, subjectName) values (value1, value2);
	
	public int insertNameSubjectName(MyTableDTO mytable) {
		int rows = -1;
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			rows = session.insert("MyTable.insertNameSubjectName", mytable);
		} finally {
			session.commit();
			session.close();
		}
		return rows;
	}
	
	
}

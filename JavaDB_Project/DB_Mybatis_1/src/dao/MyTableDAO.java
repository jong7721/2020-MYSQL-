package dao;

import org.apache.ibatis.session.*;
import java.util.List;
import dto.MyTableDTO;

public class MyTableDAO {

	private SqlSessionFactory sqlSessionFactory = null; // �̹� ����ƽ���� ����� Ŀ�ؼ� Ǯ�� �����ؼ� ����Ѵ�.
	
	
	// ������
	// DAO �ν��Ͻ��� ������ ��
	// �̹� �����Ǿ��ִ� MyBatisConnectionFactory���� ������ Ŀ�ؼ� Ǯ�� ȹ���Ѵ�.
	public MyTableDAO(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	
	// select * from TABLE;
	// List<> ���׸� Ÿ�� <>�ȿ� ���ǵ� �ڷ����� �迭�� �����ϰڴٴ� �ǹ�
	public List<MyTableDTO> selectAll() {
		List<MyTableDTO> list = null;
		
		// ������ ��������
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			//list = session.selectList(QUERY��);
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

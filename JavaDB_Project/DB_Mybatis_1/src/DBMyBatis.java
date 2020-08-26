
import dao.MyTableDAO;
import dto.MyTableDTO;
import mybatis.MyBatisConnectionFactory;
import java.util.List;

public class DBMyBatis {
	
	MyTableDAO mytableDAO = null;
	MyTableDTO mytable = null;
	
	// 생성자에서 DAO, DTO 객체 생성
	public DBMyBatis() {
		// DAO 객체가 생성될 때 DB 커넥션 풀을 획득한다.)
		mytableDAO = new MyTableDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		mytable = new MyTableDTO();
	}
	
	// call select query
	public void selectAll() {
		List<MyTableDTO> list = mytableDAO.selectAll();
		
		
		for(MyTableDTO record : list) {
			System.out.printf("[%2d] %s \t %s \t \n",
								record.getNo(), 
								record.getName(), 
								record.getSubjectName());
			
		}
	}
	
	// call insert
	public void insert(String name) {
		mytableDAO.insert(name);
	}
	
	// call insertNameSubjectName
	public void insertNameSubjectName(String name, String subjectName) {
		// DTO 클래스의 세터 메서드로 필드값을 설정한 후
		// DAO 클래스의 insert 쿼리문의 파라메터로 전달한다.
		mytable.setName(name);
		mytable.setSubjectName(subjectName);
		mytableDAO.insertNameSubjectName(mytable);
	}
	
	
	
}

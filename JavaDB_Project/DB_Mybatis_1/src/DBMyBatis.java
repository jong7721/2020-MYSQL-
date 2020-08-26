
import dao.MyTableDAO;
import dto.MyTableDTO;
import mybatis.MyBatisConnectionFactory;
import java.util.List;

public class DBMyBatis {
	
	MyTableDAO mytableDAO = null;
	MyTableDTO mytable = null;
	
	// �����ڿ��� DAO, DTO ��ü ����
	public DBMyBatis() {
		// DAO ��ü�� ������ �� DB Ŀ�ؼ� Ǯ�� ȹ���Ѵ�.)
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
		// DTO Ŭ������ ���� �޼���� �ʵ尪�� ������ ��
		// DAO Ŭ������ insert �������� �Ķ���ͷ� �����Ѵ�.
		mytable.setName(name);
		mytable.setSubjectName(subjectName);
		mytableDAO.insertNameSubjectName(mytable);
	}
	
	
	
}

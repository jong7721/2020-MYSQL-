
public class ExRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBMyBatis db = new DBMyBatis();
		
		// select * from table;
		db.selectAll();
		
		// insert name
		db.insert("�ں���");
		
		// insert name, subject
		db.insertNameSubjectName("�嵿��", "��ȭ�а���");
	}

}


public class ExRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBMyBatis db = new DBMyBatis();
		
		// select * from table;
		db.selectAll();
		
		// insert name
		db.insert("박보검");
		
		// insert name, subject
		db.insertNameSubjectName("장동건", "영화학개론");
	}

}

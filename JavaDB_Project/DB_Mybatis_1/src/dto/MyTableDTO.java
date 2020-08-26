package dto;


// DTO 객체는
// DATABASE 의 TABLE 레코드를 정의하고
// getter, setter 메서드로 하나의 레코드 값을 입출력 한다.

public class MyTableDTO {
	
	// MyTable 의 레코드에 해당하는 변수 선언
	private int no;
	private String name;
	private String subjectName;
	
	
	
	
	// getter, setter 메소드 생성
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	// toString() 메서드 오버라이딩
	public String toString() {
		return "no: " + no + " name: " + name + " subject: " +
						subjectName;
	}
	
	
}

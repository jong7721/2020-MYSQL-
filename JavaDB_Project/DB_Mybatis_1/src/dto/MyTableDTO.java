package dto;


// DTO ��ü��
// DATABASE �� TABLE ���ڵ带 �����ϰ�
// getter, setter �޼���� �ϳ��� ���ڵ� ���� ����� �Ѵ�.

public class MyTableDTO {
	
	// MyTable �� ���ڵ忡 �ش��ϴ� ���� ����
	private int no;
	private String name;
	private String subjectName;
	
	
	
	
	// getter, setter �޼ҵ� ����
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
	
	// toString() �޼��� �������̵�
	public String toString() {
		return "no: " + no + " name: " + name + " subject: " +
						subjectName;
	}
	
	
}

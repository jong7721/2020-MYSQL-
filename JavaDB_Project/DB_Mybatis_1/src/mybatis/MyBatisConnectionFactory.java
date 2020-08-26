package mybatis;

import java.io.*;

import org.apache.ibatis.session.*;
import org.apache.ibatis.io.Resources;

public class MyBatisConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			// database ���� ������ config.xml ���Ϸκ��� �о�´�.
			String resource = "config/config.xml";
			Reader reader = Resources.getResourceAsReader(resource); // ���� ����
			
			// ���� �Ѱ��� Ŀ�ؼ� Ǯ�� �����Ѵ�.
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	// getSqlSessionFactory() �޼ҵ带 ȣ���Ͽ�
	// DB ������ �������� �����ϴ� ������ sqlSessionFactory Ŀ�ؼ� Ǯ ��ü�� ȹ���ϰ�,
	// �̸� ���� query ���� ����, ó���Ѵ�.
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
}

package mybatis;

import java.io.*;

import org.apache.ibatis.session.*;
import org.apache.ibatis.io.Resources;

public class MyBatisConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			// database 연결 정보를 config.xml 파일로부터 읽어온다.
			String resource = "config/config.xml";
			Reader reader = Resources.getResourceAsReader(resource); // 파일 리더
			
			// 오직 한개의 커넥션 풀을 생성한다.
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	// getSqlSessionFactory() 메소드를 호출하여
	// DB 연결을 전적으로 관리하는 유일한 sqlSessionFactory 커넥션 풀 객체를 획득하고,
	// 이를 통해 query 문을 실행, 처리한다.
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
}

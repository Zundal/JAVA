package mapTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	/*
	 * Properties : 어떤 프로그램을 실행할 때 함께 읽어오는 설정들(언어설정, 화면사이즈 등등)
	 * 				을 저장하는 파일을 말한다.
	 * 				Properties는 Key와 Value로 이루어진 Map형식을 가지고 있으나 Key와 
	 * 				Value로 모두 문자열 형태로 저장 한다.
	 */
	
	// 값을 저장 할 때에는 setProperty()메소드를 사용한다.
	
	public static void main (String []args) {
		// java의  import java.util.Properties; 으로 불러오는 class이다.
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url","jdbc:oracle:thin@localhost:1521:XE");
		prop.setProperty("username","JoungSik");
		prop.setProperty("password","aaa1234");
		
		System.out.println(prop); //prop 에 담은 값이 key value 값으로 출력된다.
		
		// Properties 를 업데이트하고 재 저장 하려고 하면 store() 메소드를 사용한다.
		try {
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "jdbc driver");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾 을 수 없습니다.");
		} catch (IOException e) {
			
		}
		
	}
}

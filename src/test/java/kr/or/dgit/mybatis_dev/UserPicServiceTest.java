package kr.or.dgit.mybatis_dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.services.UserPicService;

public class UserPicServiceTest {
	private static UserPicService userPicService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		userPicService = new UserPicService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
		userPicService = null;
	}

	@Test
	public void aTestInsertUserPic() {
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir")+"\\DataFiles\\babara.jpg");
		try (InputStream is = new FileInputStream(file);){ //1.8버전이라서 close안하고 이렇게 써도 됨
			pic = new byte[is.available()];
			is.read(pic);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		UserPic userPic = new UserPic(1, "바바라", pic, "hot");
		int res = userPicService.insertUserPic(userPic);
		Assert.assertEquals(1, res);
	}

}

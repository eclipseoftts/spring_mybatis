package spring_mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.AutoRetryHttpClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mybatis.model.Users;
import com.mybatis.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class MybatisTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void tests() throws ClientProtocolException, IOException{
		List<Users> findUserAll = userService.findUserAll();
		for (Users users : findUserAll) {
			System.out.println(users.getAddress()+"======="+users.getUsername());
		}
		HttpClient client = new AutoRetryHttpClient();
		//HttpPost post = new HttpPost("");
		HttpGet get = new HttpGet("http://www.360doc.com/content/10/0225/09/57735_16745577.shtml");
		HttpResponse execute = client.execute(get);
		HttpEntity entity = execute.getEntity();
		InputStream content = entity.getContent();
		
		byte[] b = new byte[content.available()];
		
		int len = content.read(b);
		System.out.println(new String(b,0,len));
	}

}

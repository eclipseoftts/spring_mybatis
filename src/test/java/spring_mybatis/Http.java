package spring_mybatis;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.AutoRetryHttpClient;
import org.apache.http.impl.client.DecompressingHttpClient;
import org.dom4j.Document;

public class Http {

	public static void main(String[] args)throws Exception {
		HttpClient client = new DecompressingHttpClient();
		//HttpPost post = new HttpPost("");
		HttpGet get = new HttpGet(""
				+ "https://www.baidu.com/");
		get.reset();
		HttpResponse execute = client.execute(get);
		HttpEntity entity = execute.getEntity();
		InputStream content = entity.getContent();
		
		byte[] b = new byte[content.available()];
		
		int len = content.read(b);
		System.out.println(new String(b,0,len));
		
		

	}

}

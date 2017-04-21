package spring_mybatis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class UrlTest {

	public static void main(String[] args) {
		
		Properties p = new Properties();
		String file = UrlTest.class.getClassLoader().getResource("log4j.properties").getFile();
		try {
			p.load(new FileInputStream(new File(file)));
			String property = p.getProperty("log4j.appender.R");
			System.out.println(property);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getUrlToString(Map<String, String> map,String path){
		StringBuffer sbf = new StringBuffer(path);
		sbf.append("?");
		for(Map.Entry<String, String> set : map.entrySet()){
			sbf.append(set.getKey()).append("=").append(set.getValue()).append("&");
		}
		String url = sbf.toString().substring(0, sbf.toString().length()-1);
		
		return url;
	}

	public static String getUrlToXml(String path){
		
		String arr = "";
		try {
			URLConnection openConnection = new URL(path).openConnection();
			HttpURLConnection http = (HttpURLConnection)openConnection;
			
			http.setRequestMethod("GET");
			
			http.connect();
			
			InputStream input = http.getInputStream();
			
			BufferedReader buff = new BufferedReader(new InputStreamReader(input, "GBK"));
			arr = buff.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}
}

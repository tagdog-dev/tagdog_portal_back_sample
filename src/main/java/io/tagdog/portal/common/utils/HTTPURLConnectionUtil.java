package io.tagdog.portal.common.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HTTPURLConnectionUtil {

	// PUSH
	private String protocol;
	private String url;
	private String port;
	private String code;
	private Map<String, String> dataMap;

	/**
	 * build 이후 type 분류 처리
	 */
	public void connection() {
		try {
			URL u = new URL(makeUrl());
			start(u);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * url 직접 받아서 처리
	 * @param url
	 */
	public void connection(String url) {
		try {
			URL u = new URL(url);
			start(u);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	private void start(URL u) {
		try {
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setUseCaches(false);
			conn.setConnectTimeout(1000);
			conn.setReadTimeout(1000);
			conn.setRequestMethod("GET");
			System.out.println(conn.getResponseMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String makeUrl() {
		String rs = this.protocol + "://" + this.url + ":" + this.port;
		if (code != null && code != "") rs += "/" + code;
		rs += "?";
		boolean firstFlag = true;
		for (Map.Entry<String, String> entry: dataMap.entrySet()) {
			if(firstFlag) firstFlag = false;
			else rs+= "&";
			rs += entry.getKey() + "=" + encode(entry.getValue());
		}
		return rs;
	}

	private String encode(String in) {
		String out = "";
		try {
			out = URLEncoder.encode(in, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return out;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		result.append(this.getClass().getName());
		result.append("{");
		result.append(newLine);
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			result.append(" ");
			try {
				result.append(field.getName());
				result.append(": ");
				result.append(field.get(this));
			} catch (IllegalAccessException ex) {
				System.out.println(ex);
			}
			result.append(newLine);
		}
		result.append("}");
		return result.toString();
	}

}

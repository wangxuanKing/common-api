package com.pawx.common_api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello world!
 *
 */
@Controller
@RequestMapping(value="/common")
public class CommonController {
   
	
	@RequestMapping(value="/saveVoice",method=RequestMethod.POST)
	public String saveVoiceFile(HttpServletRequest request) {
		File file = new File("D:\\test.wav");
		FileOutputStream fop = null;
		try {
			fop = new FileOutputStream(file);
			InputStream  inputStream = request.getInputStream();
			   // get the content in bytes
			   int remain = -1;
			   while((remain = inputStream.read())
                       != -1) {
				   fop.write(remain);
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fop.flush();
				fop.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return "";
	}
}

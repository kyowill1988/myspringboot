package com.zlw.springboot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	
//	@Test
//    public void generateAsciiDocs() throws Exception {
//        //    输出Ascii格式
//        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
//                .withMarkupLanguage(MarkupLanguage.ASCIIDOC)
//                .build();
//
//        Swagger2MarkupConverter.from(new URL("http://localhost:8881/v2/api-docs"))
//                .withConfig(config)
//                .build()
//                .toFolder(Paths.get("src/docs/asciidoc/generated"));
//    }
	
}

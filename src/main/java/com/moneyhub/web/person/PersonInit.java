package com.moneyhub.web.person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.moneyhub.web.proxy.Proxy;

@Component
public class PersonInit extends Proxy implements ApplicationRunner{
	private PersonRepository PersonRepository;
	private static final DateFormat df = new SimpleDateFormat("yyyy-mm-dd");

	@Autowired
	public PersonInit(PersonRepository PersonRepository) {
		this.PersonRepository = PersonRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = PersonRepository.count();
		if(count == 0) {
			Person person = null;
			String[][] mtx = {
					{"hong","1","홍길동","1980-01-01","M","1","1","50"},
					{"kim","1","김유신","1980-05-05","M","2","1","60"},
					{"park","1","박지성","1981-06-05","M","3","1","70"},
					{"you","1","유관순","1985-09-09","W","4","1","80"},
					{"aaa","1","박보검","1993-06-16","M","1","2","90"},
					{"bbb","1","송혜교","1981-11-22","W","2","2","80"},
					{"ccc","1","김태희","1980-03-29","W","3","2","100"},
					{"ddd","1","유재석","1972-08-14","M","4","2","90"},
					{"eee","1","강동원","1981-01-18","M","1","3","70"},
					{"fff","1","전지현","1981-10-30","W","2","3","60"},
					{"ggg","1","이효리","1979-05-10","W","3","3","50"},
					{"hhh","1","김혜수","1970-09-05","W","4","3","60"},
					{"iii","1","하정우","1978-03-11","M","1","3","70"},
					{"jjj","1","송지효","1981-08-15","W","2","4","80"},
					{"kkk","1","장나라","1981-03-18","W","3","4","90"},
					{"lll","1","이정재","1973-03-15","M","4","4","100"},
					{"mmm","1","정우성","1973-03-20","M","1","4","90"}
					};
			for(String[] arr : mtx) {
				person = new Person();
				person.setUserid(arr[0]);
				person.setPasswd(arr[1]);
				person.setName(arr[2]);
				person.setBirthday(df.parse(arr[3]));
				person.setGender(arr[4]);
				person.setHak(integer(arr[5]));
				person.setBan(integer(arr[6]));
				person.setScore(integer(arr[7]));
				PersonRepository.save(person);
			}
		}
	}
}

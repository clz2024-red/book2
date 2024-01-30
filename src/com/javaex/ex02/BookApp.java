package com.javaex.ex02;

import java.util.List;

public class BookApp {

	public static void main(String[] args) {

		AuthorDao authorDao = new AuthorDao();
		authorDao.authorInsert("서장훈", "농구선수");
		authorDao.authorInsert("안정환", "축구선수");
		
		authorDao.authorDelete(26);
		authorDao.authorDelete(27);
		authorDao.authorDelete(28);

		List<AuthorVo> authorList= authorDao.authorList();
		for(AuthorVo authorVo : authorList) {
			System.out.println(authorVo.getAuthorId() + ","
		                     + authorVo.getAuthorName() + ", "
					         + authorVo.getAuthorDesc());
		}
		
	}

}

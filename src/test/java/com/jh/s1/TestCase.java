package com.jh.s1;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;


import com.jh.notice.NoticeDAO;


public class TestCase extends TestAbstractCase{

	@Inject
	private NoticeDAO noticeDAO;
	
	@Test
	public void test() {
		assertNotNull(noticeDAO);
	}
	
	

}

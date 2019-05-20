package com.collaboration.daotest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaboration.dao.FriendDAO;
import com.collaboration.model.Friend;

public class FriendDAOTest {

	static FriendDAO friendDAO;
	
	@BeforeClass
	public static void executefirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.collaboration");
		context.refresh();
		friendDAO=(FriendDAO)context.getBean("friendDAO");
	}
	@Ignore
	@Test
	public void addfriendtest() {
		Friend friend=new Friend();
		friend.setFriendName("immanuel");
		friend.setFriendusername("imman");
		friend.setUsername("immadmin");
		friend.setStatus("NA");
		assertTrue("problem in adding friend",friendDAO.addFriend(friend));
	}
	@Ignore
	@Test
	public void getfriendtest() {
		assertNotNull("problem in getting user",friendDAO.getFriend(501));
	}

	@Test
	public void deletefriendtest() {
		Friend friend=friendDAO.getFriend(502);
		assertTrue("problem in adding friend",friendDAO.deleteFriend(friend));
	}
	@Test
	public void getfriendstest() {
		List<Friend> listFriends=friendDAO.getFriends("immadmin");
		for(Friend friend:listFriends) {
			System.out.println("friendname:"+friend.getFriendName());
		}
	}
}

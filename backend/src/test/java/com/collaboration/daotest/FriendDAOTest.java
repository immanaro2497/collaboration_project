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
import com.collaboration.model.UserDetail;

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
	public void sendfriendrequesttest() {
		Friend friend=new Friend();
		friend.setFriendFirstName("immanuel");
		friend.setFriendLastName("imm");
		friend.setFriendusername("imman");
		friend.setUsername("immadmin");
		friend.setStatus("NA");
		assertTrue("problem in adding friend",friendDAO.sendFriendRequest(friend));
	}
	@Ignore
	@Test
	public void getfriendtest() {
		assertNotNull("problem in getting user",friendDAO.getFriend(521));
	}
	@Ignore
	@Test
	public void acceptfriendrequesttest() {
		Friend friend=friendDAO.getFriend(521);
		assertTrue("problem in adding friend",friendDAO.acceptFriendRequest(friend));
	}
    @Ignore
	@Test
	public void deletefriendrequesttest() {
		Friend friend=friendDAO.getFriend(523);
		assertTrue("problem in adding friend",friendDAO.deleteFriendRequest(friend));
	}
    @Ignore
	@Test
	public void showfriendlisttest() {
		List<Friend> listFriends=friendDAO.showFriendList("immadmin");
		for(Friend friend:listFriends) {
			System.out.println("username:"+friend.getFriendusername());
		}
	}
	@Ignore
	@Test
	public void showpendingfriendrequesttest() {
		List<Friend> listFriends=friendDAO.showPendingFriendRequest("immadmin");
		for(Friend friend:listFriends) {
			System.out.println("username:"+friend.getFriendusername());
		}
	}
	@Test
	public void showsuggestedfriendstest() {
		List<UserDetail> listUsers=friendDAO.showSuggestedFriends("immadmin");
		for(UserDetail userDetail:listUsers) {
			System.out.println("username:"+userDetail.getUsername());
		}
	}
}

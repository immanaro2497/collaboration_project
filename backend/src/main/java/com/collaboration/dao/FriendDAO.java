package com.collaboration.dao;

import java.util.List;

import com.collaboration.model.Friend;

public interface FriendDAO {

public boolean addFriend(Friend friend);
public boolean deleteFriend(Friend friend);
public Friend getFriend(int friendid);
public List<Friend> getFriends(String username);
}

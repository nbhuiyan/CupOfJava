package com.cmput301f17t11.cupofjava;

import java.util.ArrayList;

/**
 * This class tracks names of users that the user
 * follows, has requested to follow, and following
 * the main user.
 */
public class User {
    private String username;
    private ArrayList<String> followingList;


    private ArrayList<String> followerList;
    private ArrayList<String> followRequestList;
    private HabitList myHabits;  //all the habits of the user

    /**
     * Setter method to set the list of users that the current user is following
     * @param followingList
     */
    public void setFollowingList(ArrayList<String> followingList) {
        this.followingList = followingList;
    }

    /**
     * Setter method to set the list of users who are following the current user.
     * @param followerList
     */
    public void setFollowerList(ArrayList<String> followerList) {
        this.followerList = followerList;
    }


    /**
     * getter method to get the list of all habits of the user
     * @return myHabits
     */
    public HabitList getMyHabits() {
        return myHabits;
    }


    /**
     * setter method to set the list of all habits of the user
     * @param myHabits
     */
    public void setMyHabits(HabitList myHabits) {
        this.myHabits = myHabits;
    }

    /**
     * Constructor
     * @param name
     */
    public User(String name) {
        setUsername(name);
    }

    //Setter
    public void setUsername(String name){
        this.username = name;
    }

    //Getter
    public String getUsername(){
        return this.username;
    }

    public void addFollower(String id){
        followerList.add(id);
    }

    public void addFollowing(String id){
        followingList.add(id);
    }

    public void newFollowRequest(String id){
        followRequestList.add(id);
    }

    //TODO
    public void acceptFollowRequest(String id){}


    public boolean isFollowing(String id){
        return followingList.contains(id);
    }

    public boolean isFollower(String id){
        return followerList.contains(id);
    }

    public ArrayList<String> getFollowRequestList(){
        return this.followRequestList;
    }

    public ArrayList<String> getFollowingList(){
        return this.followingList;
    }

    public ArrayList<String> getFollowerList(){
        return this.followerList;
    }
}
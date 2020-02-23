package day47_inheritance_02;

public class SlackAdminUser extends SlackUser {
    int adminID;

    public void sendAtChannelMessage(String msg) {
        System.out.println("SlackAdmin ["+name+"]["+adminID+"]" + " sending  @channel "+msg+ "...");
    }

    public void deleteMessage(){
        System.out.println("SlackAdmin ["+name+"]["+adminID+"]" + " deleted message");
    }

}

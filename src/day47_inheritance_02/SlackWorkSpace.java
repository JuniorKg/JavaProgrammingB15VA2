package day47_inheritance_02;

public class SlackWorkSpace {
    public static void main(String[] args) {
        SlackUser user1 = new SlackUser();

        user1.name = "Zhumgalbek";
        user1.status = "Online";

        user1.addEmoji("Smile");
        user1.callSomeone();
        user1.sendMessage("Hello, How are you?");

        SlackAdminUser admin1 = new SlackAdminUser();

        admin1.adminID = 1234567;
        admin1.name = "Murodil";
        admin1.status = "If Murodil did it, you can do it";
        admin1.sendAtChannelMessage("Quiz Today");
        admin1.callSomeone();
        admin1.addEmoji(":)");
        admin1.sendAtChannelMessage("Keep coding and Talking");
        admin1.deleteMessage();
    }
}

package day52_interface;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable {
    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp - sending a message - " + msg + "...");

    }

    @Override
    public void accept() {
        System.out.println("Nadir finally ");

    }

    @Override
    public void call(String contact) {



    }

    @Override
    public void videoCall() {
        System.out.println("WhatsApp - doing a video call to Mr Nadir...");

    }
}

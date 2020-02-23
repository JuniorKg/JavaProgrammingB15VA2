package OfficeHours;

public class Email {
    String receiver;
    String cc;
    String subject;
    String body;
    String signature;
    String date;
    String folderName;
    boolean attachments;


    public void setReceiver(String email){
        folderName = "Draft";

            if (email.contains("@")) { //first.last@domain.com
                if (email.substring(email.indexOf("@")).contains(".")) {
                    receiver = email;
                } else {
                    System.out.println("ERROR: Invalid domain extension. \nPlease enter valid email");
                }

            } else {
                System.out.println("Email is not valid. \nPlease enter valid email");
            }


        }

        public void setCc(String email){

                if (email.contains("@")) { //first.last@domain.com
                    if (email.substring(email.indexOf("@")).contains(".")) {
                        cc = email;
                    } else {
                        System.out.println("ERROR: Invalid domain extension. \nPlease enter valid email");
                    }

                } else {
                    System.out.println("Email is not valid. \nPlease enter valid email");
                }

    }
        public void setSubject(String subject_value){
            subject = subject_value;

        }

        public void setBody (String body_value){
            body = body_value +"\n" +signature;

        }

        public void setSignature(String signature_value){
            signature = signature_value;
        }

        public void setDate(String date_value){
        date = date_value;
        }

        public void setAttachments(boolean attachments_value){
            attachments = attachments_value;
        }

        public void getEmailInfo(){
            System.out.println(receiver + "\n" +
                                cc+ "\n" + subject  +"\n" + body +"\n" + "Attachments: " + attachments + "\n" +
                                "folderName:" + folderName + "\n" + date);
        }

    }

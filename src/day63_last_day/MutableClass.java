package day63_last_day;

public class MutableClass {
    private String comment;

    public MutableClass append(String moreComment){
        comment += moreComment;
        return this;

    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "MutableClass{" +
                "comment='" + comment + '\'' +
                '}';
    }

    public MutableClass(String comment) {
        this.comment = comment;




    }
}

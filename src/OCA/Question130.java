package OCA;

public class Question130 {
    abstract class Planet{
        protected void resolve(){
        }
        abstract void rotate();
    }
    class Earth extends Planet{
        public void revolve(){  // We should add public or protected access modifiers in order the code to compile

        }
        protected void rotate(){

        }

    }
}
        //Answer is : Public at line n3 and Protected at line n3

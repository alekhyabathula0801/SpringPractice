package autowire;

public class Human {

    private Heart heart1;
//    @Autowired
//    public Human(Heart heart) {
//        this.heart = heart;
//    }
//
//    public Human() {
//    }

    public Heart getHeart() {
        return heart1;
    }

    public void setHeart(Heart heart) {
        this.heart1 = heart;
    }

    public void startPumping() {
        heart1.pump();
    }
}

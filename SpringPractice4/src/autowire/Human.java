package autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    private Heart heart;
    @Autowired
    public Human(Heart heart) {
        this.heart = heart;
    }

    public Human() {
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping() {
        heart.pump();
    }
}

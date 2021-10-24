package krolic.Lesson28;
/**
 * https://www.youtube.com/watch?v=5gU2wrQnbJs
 */


public class main {
    public static void main(String[] args) {
        Body body = new Body();

        SmallHead smallHead = new SmallHead();
        BigHead bigHead = new BigHead();

        Robot <SmallHead>robot = new Robot<SmallHead>(body, smallHead);
        Robot <BigHead>robot1 = new Robot<BigHead>(body, bigHead);

        robot.getHead().burn();
        robot1.getHead().turn();

    }

}

class Robot <Hd extends Head>{
    private Body body;
    private Hd head;

    public Robot(Body body, Hd head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Hd getHead() {
        return head;
    }

    public void setHead(Hd head) {
        this.head = head;
    }
}

class Head {

}

class Body {

}

class SmallHead extends Head {
    public void burn() {
        System.out.println("Burn");
    }
}

class BigHead extends Head {
    public void turn() {
        System.out.println("Turn");
    }
}
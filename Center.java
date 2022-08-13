public class Center extends BasketballPlayer {
    Center(String name) {
        super(name);
    }

    @Override
    public void dribbleBall() {
        System.out.println("The center dribbles the ball, bounces it off someone's shoe, and rolls out of bounds...");
        System.out.println("The crowd boos loudly.");
    }
}
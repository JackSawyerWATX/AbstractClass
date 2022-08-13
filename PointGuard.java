class PointGuard extends BasketballPlayer {

    public PointGuard(String name) {
        super(name);
}

    @Override
    public void dribbleBall() {
        System.out.println(name + " dribbles the ball.");
    }
    
}

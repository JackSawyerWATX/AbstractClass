abstract class BasketballPlayer {

    //instance variable
    String name;

    //Constructor
    public BasketballPlayer(String name) {
        this.name = name;
    }

        //abstract method
        public abstract void dribbleBall();

        //abstract concrete method
        public void makeShot() {
            System.out.println(name + " shoots and scores!!");
        }
}

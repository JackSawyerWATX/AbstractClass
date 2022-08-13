public class Main {
    public static void main (String[] args) {

        System.out.println("|=---~---> Abstract Class <---~---=|");

        PointGuard pointGuard = new PointGuard("Magic Johnson");
        Center center = new Center("Hakeem Olajuwon");

        System.out.println(pointGuard.name);
        System.out.println(center.name);

        pointGuard.makeShot();
        center.makeShot();

        pointGuard.dribbleBall();
        center.dribbleBall();
    }
}
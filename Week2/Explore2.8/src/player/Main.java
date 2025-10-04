package player;

public class Main {
    public static void main(String[] args) throws Exception {
        Player player = new Player(0);

        player.moveForward();
        player.moveBackward();
        System.out.println(player);

        player.moveBackward();
        player.moveBackward();
        player.moveBackward();
        System.out.println(player);

        player.moveForward();
        player.moveForward();
        System.out.println(player);
    }
}

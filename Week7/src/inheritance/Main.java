package inheritance;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application  {
    private Canvas canvas;
    private GraphicsContext graphics;

    /**
     * Starts the application, which has only an empty canvas where we can draw
     * once per second. Don't worry too much about the details: we will explain
     * JavaFX in more detail in a later lecture.
     */
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        canvas = new Canvas(500, 500);
        root.getChildren().add(canvas);
        graphics = canvas.getGraphicsContext2D();

        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();

        // Asks drawScene() to be run 30 times per second, Processing-style
        draw();
        Timeline drawEverySecond = new Timeline(
                new KeyFrame(Duration.millis(1000/30), (event) -> {
                    draw();
                })
        );
        drawEverySecond.setCycleCount(Timeline.INDEFINITE);
        drawEverySecond.play();
    }

    private int iFrame = 0;

    private void draw() {
        graphics.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        GraphicsContextWrapper gcw = new GraphicsContextWrapper(graphics);

        Rectangle r = new Rectangle(10 * iFrame, 10 * iFrame, 50, 50);
        r.draw(gcw);

        Circle c = new Circle(200, 300 - iFrame*5, 100);
        c.draw(gcw);

        Ellipse e = new Ellipse(150, 300, 90 + iFrame, 160);
        e.draw(gcw);

        iFrame = (iFrame + 1) % 30;
    }

    /**
     * Entry point of the application.
     *
     * @param args Arguments provided from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

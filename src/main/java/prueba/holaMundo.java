package prueba;
import static spark.Spark.*;

public class holaMundo {
    public static void main(String[] args) {
        staticFiles.location("/public");
        get("/helloworld", (req, res) -> { res.redirect("index.html"); return 0; });
    }
}
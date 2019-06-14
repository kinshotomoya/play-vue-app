// ここにサインアップの処理を書いていく
package v1.signup;


import play.mvc.*;
import play.libs.Json;

import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class SignupController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result test(Http.Request request) {
        System.out.println(request);
        return ok(Json.toJson("{id: 1, name: 'tomoya'}"));
    }

    public Result create(Http.Request request) {
        String name = request().getQueryString("name");
        System.out.println(name);

        return ok("成功したよ");
    }


}

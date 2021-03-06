// ここにサインアップの処理を書いていく
package v1.signup;


import com.fasterxml.jackson.databind.JsonNode;
import play.filters.csrf.RequireCSRFCheck;
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

    @RequireCSRFCheck
    public Result create(Http.Request request) {
        JsonNode accountInfo = request.body().asJson();
        System.out.println(accountInfo);

        return ok("成功したよ");
    }


}

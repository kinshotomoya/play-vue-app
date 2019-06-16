package controllers;


import play.mvc.*;
import views.html.login;

import java.util.Optional;

import static play.mvc.Results.ok;

public class LoginController {

    public Result index(Http.Request request) {
        // accountInfoという名前で、セッションを管理しているので、それを取り出す
        System.out.println();
        Optional<String> optAccountInfo = request.session().getOptional("accountInfo");
        optAccountInfo.ifPresentOrElse(
                // loginセッションがあれば、topページに遷移する
                // TODO:  publicのindex.htmlを表示するのは、どうするのか？
                session -> System.out.println("publicのindex.htmlを表示する"),
                // セッションがなければ、login画面に遷移する
                // この時に、csrfトークンをresponse付与する
                () -> ok(views.html.login.render())
        );

        return ok(login.render());
    }
}

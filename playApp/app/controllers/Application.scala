package controllers

import play.api._
import play.api.mvc._
import me.lightspeed7.dsug.scala.build.Hello

object Application extends Controller {

  def index = Action {
    val welcome = Hello.getHelloPhrase("DaVe.")
    Ok(views.html.index(welcome))
  }

}

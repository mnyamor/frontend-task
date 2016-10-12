package controllers

import play.api.data.Forms._
import play.api.data._
import play.api.i18n.Messages
import play.api.mvc._

object Application extends Controller {

  case class UserData(fullName: String, email: String, addressStreet: String,
                      addressPostalCode: Int, addressPostOffice: String, message: String)

  val title = "My supercool app."

  val userForm = Form(
    mapping(
      "fullName" -> nonEmptyText,
      "email" -> email,
      "addressStreet" -> nonEmptyText,
      "addressPostalCode" -> number,
      "addressPostOffice" -> nonEmptyText,
      "message" -> text
    )(UserData.apply)(UserData.unapply)
  )

  def index = Action {
    Ok(views.html.main(title, false,Map(), Map()))
  }

  def handleForm = Action { implicit request =>
    val form = userForm.bindFromRequest()
    val success = !form.hasErrors
    Ok(views.html.main(title, success, form.data, form.errors.map(x => (x.key,Messages(x.message))).toMap))
  }
}
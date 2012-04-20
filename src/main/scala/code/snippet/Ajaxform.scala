package code.snippet

import scala.xml.{NodeSeq, Text}
import net.liftweb.http._
import js.JsCmd
import net.liftweb.common._
import net.liftweb.util.Helpers._
import code.lib._
import net.liftweb._

/**
 * Created with IntelliJ IDEA.
 * User: readman
 * Date: 4/20/12
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */

class Ajaxform {
  def render ={
  case class Person(first_name:String, last_name:String)
  var first_name = ""
  var last_name = ""
  def process()={
    var b = Person(first_name,last_name)
     println(b.toString)

  }
  "#first_name" #> SHtml.text(first_name, first_name = _)&
  "#last_name" #> SHtml.text(last_name, last_name = _)&
  "#hidden" #> SHtml.hidden(process)
  }
}

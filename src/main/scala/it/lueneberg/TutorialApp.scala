package it.lueneberg

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

import org.scalajs.dom
import dom.document
import scalatags.JsDom.all._

object TutorialApp extends JSApp {
  def main(): Unit = {
    document.body.appendChild(

      div(
        h1(id:="header", "Hello World!"),
        p("This was written in a typesafe way!")
      ).render

    )
  }
}

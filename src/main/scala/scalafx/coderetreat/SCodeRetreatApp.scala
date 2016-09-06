package scalafx.coderetreat

import scalafx.Includes._
import java.io.IOException

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafxml.core.{FXMLView, NoDependencyResolver}

object SCodeRetreatApp extends JFXApp {

  val resource = getClass.getResource("CoderetreatBoard.fxml")
  if (resource == null) {
    throw new IOException("Cannot load resource: CoderetreatBoard.fxml")
  }

  val root = FXMLView(resource, NoDependencyResolver)

  stage = new PrimaryStage() {
    title = "CodeRetreat"
    scene = new Scene(root)
  }
}

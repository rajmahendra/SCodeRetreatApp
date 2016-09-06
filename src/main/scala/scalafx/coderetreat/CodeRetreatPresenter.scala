package scalafx.coderetreat

/**
  * Created by rhegde on 9/5/2016.
  */
import java.net.URL
import java.util.ResourceBundle

import scalafx.event.ActionEvent
import scalafx.scene.layout.Pane
import scalafxml.core.macros.sfxml

@sfxml
class CodeRetreatPresenter(private val batteryPane: Pane) {

  def startNext(event: ActionEvent) {
    println ("Clicked")
  }

  def  initialize (url: URL, builder: ResourceBundle) : Unit {

  }

}

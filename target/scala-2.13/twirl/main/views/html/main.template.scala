
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Computers database</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*9.66*/routes/*9.72*/.Assets.at("stylesheets/bootstrap/bootstrap.min.css")),format.raw/*9.125*/("""">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.at("stylesheets/main.css")),format.raw/*12.90*/(""""/>
  </head>
  <body>

    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
      <a class="navbar-brand" href=""""),_display_(/*17.38*/routes/*17.44*/.HomeController.index()),format.raw/*17.67*/("""">Play sample application &mdash; Computer database</a>
    </nav>

    <main role="main" class="container-fluid">
    """),_display_(/*21.6*/content),format.raw/*21.13*/("""
    """),format.raw/*22.5*/("""</main>

  </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-23T12:22:06.079739
                  SOURCE: /Users/vinay/Projects/playsamples/play-samples/play-java-ebean-example/app/views/main.scala.html
                  HASH: e2ab46a222b4fd86253a78182cd57b746b0a8d63
                  MATRIX: 905->1|1014->17|1041->18|1320->271|1334->277|1408->330|1593->488|1608->494|1663->528|1813->651|1828->657|1872->680|2018->800|2046->807|2078->812
                  LINES: 27->1|32->2|33->3|39->9|39->9|39->9|42->12|42->12|42->12|47->17|47->17|47->17|51->21|51->21|52->22
                  -- GENERATED --
              */
          
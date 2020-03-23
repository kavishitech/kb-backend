
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

object editForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Long,Form[Computer],Map[String, String],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, computerForm: Form[Computer], companies: Map[String, String])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

implicit def /*5.2*/implicitField/*5.15*/ = {{ FieldConstructor(tags.forms.field_constructor.render) }};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.76*/("""

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

    """),format.raw/*9.5*/("""<h1 class="my-3" id="page-title">Edit computer</h1>

    """),_display_(/*11.6*/form(routes.HomeController.update(id))/*11.44*/ {_display_(Seq[Any](format.raw/*11.46*/("""

        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""
        """),format.raw/*14.9*/("""<div class="row">
            <div class="col-md-3 mb-3">
            """),_display_(/*16.14*/inputText(computerForm("name"), Symbol("_label") -> "Computer name", Symbol("_help") -> "")),format.raw/*16.105*/("""
            """),format.raw/*17.13*/("""</div>
        </div>
        <div class="row">
            <div class="col-md-3 mb-3">
            """),_display_(/*21.14*/inputDate(computerForm("introduced"), Symbol("_label") -> "Introduced date", Symbol("_help") -> "")),format.raw/*21.113*/("""
            """),format.raw/*22.13*/("""</div>
        </div>
        <div class="row">
            <div class="col-md-3 mb-3">
            """),_display_(/*26.14*/inputDate(computerForm("discontinued"), Symbol("_label") -> "Discontinued date", Symbol("_help") -> "")),format.raw/*26.117*/("""
            """),format.raw/*27.13*/("""</div>
        </div>

        <div class="row">
            <div class="col-md-3 mb-3">
            """),_display_(/*32.14*/select(
                computerForm("company.id"),
                options(companies),
                Symbol("_label") -> "Company", Symbol("_default") -> "-- Choose a company --",
                Symbol("_showConstraints") -> false
            )),format.raw/*37.14*/("""
            """),format.raw/*38.13*/("""</div>
        </div>

        <div class="actions">
            <button class="btn btn-success" type="submit">Save this computer</button>
            <span class="mx-2">or</span>
            <a href=""""),_display_(/*44.23*/routes/*44.29*/.HomeController.list()),format.raw/*44.51*/("""" id="add" class="btn btn-light" role="button">Cancel</a>
        </div>

    """)))}),format.raw/*47.6*/("""

    """),_display_(/*49.6*/form(routes.HomeController.delete(id), Symbol("class") -> "top-right")/*49.76*/ {_display_(Seq[Any](format.raw/*49.78*/("""
        """),_display_(/*50.10*/CSRF/*50.14*/.formField),format.raw/*50.24*/("""
        """),format.raw/*51.9*/("""<button class="btn btn-danger" type="submit">Delete this computer</button>
    """)))}),format.raw/*52.6*/("""

""")))}),format.raw/*54.2*/("""
"""))
      }
    }
  }

  def render(id:Long,computerForm:Form[Computer],companies:Map[String, String],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(id,computerForm,companies)(request,messages)

  def f:((Long,Form[Computer],Map[String, String]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (id,computerForm,companies) => (request,messages) => apply(id,computerForm,companies)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-23T12:22:06.129712
                  SOURCE: /Users/vinay/Projects/playsamples/play-samples/play-java-ebean-example/app/views/editForm.scala.html
                  HASH: 82d9058df102dada71e62df9a8c8907b392a366e
                  MATRIX: 976->1|1183->138|1220->156|1241->169|1331->136|1358->154|1386->230|1414->233|1425->237|1463->239|1495->245|1579->303|1626->341|1666->343|1704->354|1717->358|1748->368|1784->377|1882->448|1995->539|2036->552|2164->653|2285->752|2326->765|2454->866|2579->969|2620->982|2749->1084|3018->1332|3059->1345|3288->1547|3303->1553|3346->1575|3455->1654|3488->1661|3567->1731|3607->1733|3644->1743|3657->1747|3688->1757|3724->1766|3834->1846|3867->1849
                  LINES: 27->1|30->3|32->5|32->5|33->2|34->4|35->5|37->7|37->7|37->7|39->9|41->11|41->11|41->11|43->13|43->13|43->13|44->14|46->16|46->16|47->17|51->21|51->21|52->22|56->26|56->26|57->27|62->32|67->37|68->38|74->44|74->44|74->44|77->47|79->49|79->49|79->49|80->50|80->50|80->50|81->51|82->52|84->54
                  -- GENERATED --
              */
          
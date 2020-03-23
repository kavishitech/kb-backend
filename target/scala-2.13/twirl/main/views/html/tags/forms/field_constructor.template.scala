
package views.html.tags.forms

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

object field_constructor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements : helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import views.tags.forms.FormHelper.addClassValue

def /*5.2*/input/*5.7*/ = {{
  if(elements.hasErrors) {
    addClassValue(elements.input.toString(), "form-control is-invalid")
  } else {
    addClassValue(elements.input.toString(), "form-control")
  }
}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<label for=""""),_display_(/*13.14*/elements/*13.22*/.id),format.raw/*13.25*/("""">"""),_display_(/*13.28*/elements/*13.36*/.label),format.raw/*13.42*/("""</label>
<div id="input-for-"""),_display_(/*14.21*/elements/*14.29*/.id),format.raw/*14.32*/("""" class="input">
  """),_display_(/*15.4*/Html(input)),format.raw/*15.15*/("""
  """),format.raw/*16.3*/("""<span class="invalid-feedback">"""),_display_(/*16.35*/elements/*16.43*/.errors.mkString(", ")),format.raw/*16.65*/("""</span>
  <small class="form-text text-muted">"""),_display_(/*17.40*/elements/*17.48*/.infos.mkString(", ")),format.raw/*17.69*/("""</small>
</div>

"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-23T12:22:06.120877
                  SOURCE: /Users/vinay/Projects/playsamples/play-samples/play-java-ebean-example/app/views/tags/forms/field_constructor.scala.html
                  HASH: abaa9eb99d6e6e53fb605a0c9363af1766c41641
                  MATRIX: 945->1|1051->37|1112->88|1124->93|1335->35|1362->86|1390->275|1419->277|1459->290|1476->298|1500->301|1530->304|1547->312|1574->318|1630->347|1647->355|1671->358|1717->378|1749->389|1779->392|1838->424|1855->432|1898->454|1972->501|1989->509|2031->530
                  LINES: 27->1|30->3|32->5|32->5|39->2|40->4|41->11|43->13|43->13|43->13|43->13|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|46->16|46->16|46->16|46->16|47->17|47->17|47->17
                  -- GENERATED --
              */
          
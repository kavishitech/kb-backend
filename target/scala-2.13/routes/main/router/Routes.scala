// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vinay/Projects/playsamples/play-samples/play-java-ebean-example/conf/routes
// @DATE:Sat Mar 14 12:59:03 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_8: controllers.HomeController,
  // @LINE:7
  DriverController_9: controllers.DriverController,
  // @LINE:16
  FarmerController_1: controllers.FarmerController,
  // @LINE:26
  LandController_6: controllers.LandController,
  // @LINE:36
  UserCropController_4: controllers.UserCropController,
  // @LINE:46
  TransactionController_0: controllers.TransactionController,
  // @LINE:57
  CropController_5: controllers.CropController,
  // @LINE:67
  TransactionReasonController_3: controllers.TransactionReasonController,
  // @LINE:77
  SoilController_2: controllers.SoilController,
  // @LINE:101
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_8: controllers.HomeController,
    // @LINE:7
    DriverController_9: controllers.DriverController,
    // @LINE:16
    FarmerController_1: controllers.FarmerController,
    // @LINE:26
    LandController_6: controllers.LandController,
    // @LINE:36
    UserCropController_4: controllers.UserCropController,
    // @LINE:46
    TransactionController_0: controllers.TransactionController,
    // @LINE:57
    CropController_5: controllers.CropController,
    // @LINE:67
    TransactionReasonController_3: controllers.TransactionReasonController,
    // @LINE:77
    SoilController_2: controllers.SoilController,
    // @LINE:101
    Assets_7: controllers.Assets
  ) = this(errorHandler, HomeController_8, DriverController_9, FarmerController_1, LandController_6, UserCropController_4, TransactionController_0, CropController_5, TransactionReasonController_3, SoilController_2, Assets_7, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_8, DriverController_9, FarmerController_1, LandController_6, UserCropController_4, TransactionController_0, CropController_5, TransactionReasonController_3, SoilController_2, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """driver""", """controllers.DriverController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """driver/""" + "$" + """id<[^/]+>""", """controllers.DriverController.get(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """driver""", """controllers.DriverController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """driver/update""", """controllers.DriverController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """farmer""", """controllers.FarmerController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """farmer/""" + "$" + """id<[^/]+>""", """controllers.FarmerController.get(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """farmer""", """controllers.FarmerController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """farmer""", """controllers.FarmerController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """land/""" + "$" + """farmerId<[^/]+>""", """controllers.LandController.list(farmerId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """land/""" + "$" + """id<[^/]+>""", """controllers.LandController.get(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """land""", """controllers.LandController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """land""", """controllers.LandController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userCrops/""" + "$" + """farmerId<[^/]+>""", """controllers.UserCropController.list(farmerId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userCrop/""" + "$" + """id<[^/]+>""", """controllers.UserCropController.get(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userCrop""", """controllers.UserCropController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userCrop""", """controllers.UserCropController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactions/""" + "$" + """farmerId<[^/]+>""", """controllers.TransactionController.list(farmerId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transaction/""" + "$" + """id<[^/]+>""", """controllers.TransactionController.get(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transaction""", """controllers.TransactionController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transaction""", """controllers.TransactionController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crop""", """controllers.CropController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crop/""" + "$" + """id<[^/]+>""", """controllers.CropController.get(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crop""", """controllers.CropController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crop""", """controllers.CropController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionReason""", """controllers.TransactionReasonController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionReason/""" + "$" + """id<[^/]+>""", """controllers.TransactionReasonController.get(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionReason""", """controllers.TransactionReasonController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionReason""", """controllers.TransactionReasonController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """soil""", """controllers.SoilController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """soil/""" + "$" + """id<[^/]+>""", """controllers.SoilController.get(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """soil""", """controllers.SoilController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """soil""", """controllers.SoilController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers""", """controllers.HomeController.list(request:Request, p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/new""", """controllers.HomeController.create(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers""", """controllers.HomeController.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>""", """controllers.HomeController.edit(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>""", """controllers.HomeController.update(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>/delete""", """controllers.HomeController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_8.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Default path will just redirect to the computer list""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_DriverController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("driver")))
  )
  private[this] lazy val controllers_DriverController_list1_invoker = createInvoker(
    DriverController_9.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "list",
      Nil,
      "GET",
      this.prefix + """driver""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_DriverController_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("driver/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DriverController_get2_invoker = createInvoker(
    DriverController_9.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """driver/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_DriverController_create3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("driver")))
  )
  private[this] lazy val controllers_DriverController_create3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      DriverController_9.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """driver""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_DriverController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("driver/update")))
  )
  private[this] lazy val controllers_DriverController_update4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      DriverController_9.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """driver/update""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_FarmerController_list5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("farmer")))
  )
  private[this] lazy val controllers_FarmerController_list5_invoker = createInvoker(
    FarmerController_1.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FarmerController",
      "list",
      Nil,
      "GET",
      this.prefix + """farmer""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_FarmerController_get6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("farmer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FarmerController_get6_invoker = createInvoker(
    FarmerController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FarmerController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """farmer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_FarmerController_create7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("farmer")))
  )
  private[this] lazy val controllers_FarmerController_create7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      FarmerController_1.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FarmerController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """farmer""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_FarmerController_update8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("farmer")))
  )
  private[this] lazy val controllers_FarmerController_update8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      FarmerController_1.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FarmerController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """farmer""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_LandController_list9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("land/"), DynamicPart("farmerId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LandController_list9_invoker = createInvoker(
    LandController_6.list(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LandController",
      "list",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """land/""" + "$" + """farmerId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_LandController_get10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("land/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LandController_get10_invoker = createInvoker(
    LandController_6.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LandController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """land/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_LandController_create11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("land")))
  )
  private[this] lazy val controllers_LandController_create11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      LandController_6.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LandController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """land""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_LandController_update12_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("land")))
  )
  private[this] lazy val controllers_LandController_update12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      LandController_6.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LandController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """land""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_UserCropController_list13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userCrops/"), DynamicPart("farmerId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserCropController_list13_invoker = createInvoker(
    UserCropController_4.list(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserCropController",
      "list",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """userCrops/""" + "$" + """farmerId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_UserCropController_get14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userCrop/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserCropController_get14_invoker = createInvoker(
    UserCropController_4.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserCropController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """userCrop/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_UserCropController_create15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userCrop")))
  )
  private[this] lazy val controllers_UserCropController_create15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UserCropController_4.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserCropController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """userCrop""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_UserCropController_update16_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userCrop")))
  )
  private[this] lazy val controllers_UserCropController_update16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UserCropController_4.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserCropController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """userCrop""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_TransactionController_list17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactions/"), DynamicPart("farmerId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TransactionController_list17_invoker = createInvoker(
    TransactionController_0.list(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "list",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """transactions/""" + "$" + """farmerId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_TransactionController_get18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TransactionController_get18_invoker = createInvoker(
    TransactionController_0.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """transaction/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_TransactionController_create19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transaction")))
  )
  private[this] lazy val controllers_TransactionController_create19_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      TransactionController_0.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """transaction""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_TransactionController_update20_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transaction")))
  )
  private[this] lazy val controllers_TransactionController_update20_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      TransactionController_0.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """transaction""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_CropController_list21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crop")))
  )
  private[this] lazy val controllers_CropController_list21_invoker = createInvoker(
    CropController_5.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CropController",
      "list",
      Nil,
      "GET",
      this.prefix + """crop""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_CropController_get22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crop/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CropController_get22_invoker = createInvoker(
    CropController_5.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CropController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """crop/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_CropController_create23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crop")))
  )
  private[this] lazy val controllers_CropController_create23_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CropController_5.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CropController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """crop""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_CropController_update24_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crop")))
  )
  private[this] lazy val controllers_CropController_update24_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CropController_5.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CropController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """crop""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_TransactionReasonController_list25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionReason")))
  )
  private[this] lazy val controllers_TransactionReasonController_list25_invoker = createInvoker(
    TransactionReasonController_3.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionReasonController",
      "list",
      Nil,
      "GET",
      this.prefix + """transactionReason""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_TransactionReasonController_get26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionReason/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TransactionReasonController_get26_invoker = createInvoker(
    TransactionReasonController_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionReasonController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """transactionReason/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_TransactionReasonController_create27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionReason")))
  )
  private[this] lazy val controllers_TransactionReasonController_create27_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      TransactionReasonController_3.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionReasonController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """transactionReason""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_TransactionReasonController_update28_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionReason")))
  )
  private[this] lazy val controllers_TransactionReasonController_update28_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      TransactionReasonController_3.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionReasonController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """transactionReason""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_SoilController_list29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("soil")))
  )
  private[this] lazy val controllers_SoilController_list29_invoker = createInvoker(
    SoilController_2.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoilController",
      "list",
      Nil,
      "GET",
      this.prefix + """soil""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_SoilController_get30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("soil/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SoilController_get30_invoker = createInvoker(
    SoilController_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoilController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """soil/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_SoilController_create31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("soil")))
  )
  private[this] lazy val controllers_SoilController_create31_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoilController_2.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoilController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """soil""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_SoilController_update32_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("soil")))
  )
  private[this] lazy val controllers_SoilController_update32_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoilController_2.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoilController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """soil""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_HomeController_list33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers")))
  )
  private[this] lazy val controllers_HomeController_list33_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_8.list(fakeValue[play.mvc.Http.Request], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "list",
      Seq(classOf[play.mvc.Http.Request], classOf[Int], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """computers""",
      """ Computers list (look at the default values for pagination parameters)""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_HomeController_create34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/new")))
  )
  private[this] lazy val controllers_HomeController_create34_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_8.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """computers/new""",
      """ Add computer""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_HomeController_save35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers")))
  )
  private[this] lazy val controllers_HomeController_save35_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_8.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """computers""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_HomeController_edit36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_edit36_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_8.edit(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "edit",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "GET",
      this.prefix + """computers/""" + "$" + """id<[^/]+>""",
      """ Edit existing computer""",
      Seq()
    )
  )

  // @LINE:95
  private[this] lazy val controllers_HomeController_update37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_update37_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_8.update(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "update",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "POST",
      this.prefix + """computers/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val controllers_HomeController_delete38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_HomeController_delete38_invoker = createInvoker(
    HomeController_8.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """computers/""" + "$" + """id<[^/]+>/delete""",
      """ Delete a computer""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_Assets_at39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at39_invoker = createInvoker(
    Assets_7.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_8.index())
      }
  
    // @LINE:7
    case controllers_DriverController_list1_route(params@_) =>
      call { 
        controllers_DriverController_list1_invoker.call(DriverController_9.list())
      }
  
    // @LINE:8
    case controllers_DriverController_get2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DriverController_get2_invoker.call(DriverController_9.get(id))
      }
  
    // @LINE:9
    case controllers_DriverController_create3_route(params@_) =>
      call { 
        controllers_DriverController_create3_invoker.call(
          req => DriverController_9.create(req))
      }
  
    // @LINE:10
    case controllers_DriverController_update4_route(params@_) =>
      call { 
        controllers_DriverController_update4_invoker.call(
          req => DriverController_9.update(req))
      }
  
    // @LINE:16
    case controllers_FarmerController_list5_route(params@_) =>
      call { 
        controllers_FarmerController_list5_invoker.call(FarmerController_1.list())
      }
  
    // @LINE:17
    case controllers_FarmerController_get6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FarmerController_get6_invoker.call(FarmerController_1.get(id))
      }
  
    // @LINE:18
    case controllers_FarmerController_create7_route(params@_) =>
      call { 
        controllers_FarmerController_create7_invoker.call(
          req => FarmerController_1.create(req))
      }
  
    // @LINE:19
    case controllers_FarmerController_update8_route(params@_) =>
      call { 
        controllers_FarmerController_update8_invoker.call(
          req => FarmerController_1.update(req))
      }
  
    // @LINE:26
    case controllers_LandController_list9_route(params@_) =>
      call(params.fromPath[Long]("farmerId", None)) { (farmerId) =>
        controllers_LandController_list9_invoker.call(LandController_6.list(farmerId))
      }
  
    // @LINE:27
    case controllers_LandController_get10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LandController_get10_invoker.call(LandController_6.get(id))
      }
  
    // @LINE:28
    case controllers_LandController_create11_route(params@_) =>
      call { 
        controllers_LandController_create11_invoker.call(
          req => LandController_6.create(req))
      }
  
    // @LINE:29
    case controllers_LandController_update12_route(params@_) =>
      call { 
        controllers_LandController_update12_invoker.call(
          req => LandController_6.update(req))
      }
  
    // @LINE:36
    case controllers_UserCropController_list13_route(params@_) =>
      call(params.fromPath[Long]("farmerId", None)) { (farmerId) =>
        controllers_UserCropController_list13_invoker.call(UserCropController_4.list(farmerId))
      }
  
    // @LINE:37
    case controllers_UserCropController_get14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserCropController_get14_invoker.call(UserCropController_4.get(id))
      }
  
    // @LINE:38
    case controllers_UserCropController_create15_route(params@_) =>
      call { 
        controllers_UserCropController_create15_invoker.call(
          req => UserCropController_4.create(req))
      }
  
    // @LINE:39
    case controllers_UserCropController_update16_route(params@_) =>
      call { 
        controllers_UserCropController_update16_invoker.call(
          req => UserCropController_4.update(req))
      }
  
    // @LINE:46
    case controllers_TransactionController_list17_route(params@_) =>
      call(params.fromPath[Long]("farmerId", None)) { (farmerId) =>
        controllers_TransactionController_list17_invoker.call(TransactionController_0.list(farmerId))
      }
  
    // @LINE:47
    case controllers_TransactionController_get18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TransactionController_get18_invoker.call(TransactionController_0.get(id))
      }
  
    // @LINE:48
    case controllers_TransactionController_create19_route(params@_) =>
      call { 
        controllers_TransactionController_create19_invoker.call(
          req => TransactionController_0.create(req))
      }
  
    // @LINE:49
    case controllers_TransactionController_update20_route(params@_) =>
      call { 
        controllers_TransactionController_update20_invoker.call(
          req => TransactionController_0.update(req))
      }
  
    // @LINE:57
    case controllers_CropController_list21_route(params@_) =>
      call { 
        controllers_CropController_list21_invoker.call(CropController_5.list())
      }
  
    // @LINE:58
    case controllers_CropController_get22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CropController_get22_invoker.call(CropController_5.get(id))
      }
  
    // @LINE:59
    case controllers_CropController_create23_route(params@_) =>
      call { 
        controllers_CropController_create23_invoker.call(
          req => CropController_5.create(req))
      }
  
    // @LINE:60
    case controllers_CropController_update24_route(params@_) =>
      call { 
        controllers_CropController_update24_invoker.call(
          req => CropController_5.update(req))
      }
  
    // @LINE:67
    case controllers_TransactionReasonController_list25_route(params@_) =>
      call { 
        controllers_TransactionReasonController_list25_invoker.call(TransactionReasonController_3.list())
      }
  
    // @LINE:68
    case controllers_TransactionReasonController_get26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TransactionReasonController_get26_invoker.call(TransactionReasonController_3.get(id))
      }
  
    // @LINE:69
    case controllers_TransactionReasonController_create27_route(params@_) =>
      call { 
        controllers_TransactionReasonController_create27_invoker.call(
          req => TransactionReasonController_3.create(req))
      }
  
    // @LINE:70
    case controllers_TransactionReasonController_update28_route(params@_) =>
      call { 
        controllers_TransactionReasonController_update28_invoker.call(
          req => TransactionReasonController_3.update(req))
      }
  
    // @LINE:77
    case controllers_SoilController_list29_route(params@_) =>
      call { 
        controllers_SoilController_list29_invoker.call(SoilController_2.list())
      }
  
    // @LINE:78
    case controllers_SoilController_get30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SoilController_get30_invoker.call(SoilController_2.get(id))
      }
  
    // @LINE:79
    case controllers_SoilController_create31_route(params@_) =>
      call { 
        controllers_SoilController_create31_invoker.call(
          req => SoilController_2.create(req))
      }
  
    // @LINE:80
    case controllers_SoilController_update32_route(params@_) =>
      call { 
        controllers_SoilController_update32_invoker.call(
          req => SoilController_2.update(req))
      }
  
    // @LINE:87
    case controllers_HomeController_list33_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_HomeController_list33_invoker.call(
          req => HomeController_8.list(req, p, s, o, f))
      }
  
    // @LINE:90
    case controllers_HomeController_create34_route(params@_) =>
      call { 
        controllers_HomeController_create34_invoker.call(
          req => HomeController_8.create(req))
      }
  
    // @LINE:91
    case controllers_HomeController_save35_route(params@_) =>
      call { 
        controllers_HomeController_save35_invoker.call(
          req => HomeController_8.save(req))
      }
  
    // @LINE:94
    case controllers_HomeController_edit36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_edit36_invoker.call(
          req => HomeController_8.edit(req, id))
      }
  
    // @LINE:95
    case controllers_HomeController_update37_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_update37_invoker.call(
          req => HomeController_8.update(req, id))
      }
  
    // @LINE:98
    case controllers_HomeController_delete38_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_delete38_invoker.call(HomeController_8.delete(id))
      }
  
    // @LINE:101
    case controllers_Assets_at39_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at39_invoker.call(Assets_7.at(path, file))
      }
  }
}

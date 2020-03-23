// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vinay/Projects/playsamples/play-samples/play-java-ebean-example/conf/routes
// @DATE:Sat Mar 14 12:59:03 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:101
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:101
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseLandController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LandController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "land"})
        }
      """
    )
  
    // @LINE:28
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LandController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "land"})
        }
      """
    )
  
    // @LINE:27
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LandController.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "land/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:26
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LandController.list",
      """
        function(farmerId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "land/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("farmerId", farmerId0))})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseUserCropController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserCropController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "userCrop"})
        }
      """
    )
  
    // @LINE:38
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserCropController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userCrop"})
        }
      """
    )
  
    // @LINE:37
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserCropController.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userCrop/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:36
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserCropController.list",
      """
        function(farmerId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userCrops/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("farmerId", farmerId0))})
        }
      """
    )
  
  }

  // @LINE:67
  class ReverseTransactionReasonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionReasonController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "transactionReason"})
        }
      """
    )
  
    // @LINE:69
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionReasonController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "transactionReason"})
        }
      """
    )
  
    // @LINE:68
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionReasonController.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactionReason/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:67
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionReasonController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactionReason"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:98
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:91
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers"})
        }
      """
    )
  
    // @LINE:87
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.list",
      """
        function(p0,s1,o2,f3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3))])})
        }
      """
    )
  
    // @LINE:95
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:90
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/new"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:94
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:57
  class ReverseCropController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CropController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "crop"})
        }
      """
    )
  
    // @LINE:59
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CropController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crop"})
        }
      """
    )
  
    // @LINE:58
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CropController.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crop/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:57
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CropController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crop"})
        }
      """
    )
  
  }

  // @LINE:77
  class ReverseSoilController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:80
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoilController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "soil"})
        }
      """
    )
  
    // @LINE:79
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoilController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "soil"})
        }
      """
    )
  
    // @LINE:78
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoilController.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "soil/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:77
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoilController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "soil"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseDriverController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "driver/update"})
        }
      """
    )
  
    // @LINE:9
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "driver"})
        }
      """
    )
  
    // @LINE:8
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "driver/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:7
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "driver"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseFarmerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FarmerController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "farmer"})
        }
      """
    )
  
    // @LINE:18
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FarmerController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "farmer"})
        }
      """
    )
  
    // @LINE:17
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FarmerController.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "farmer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FarmerController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "farmer"})
        }
      """
    )
  
  }

  // @LINE:46
  class ReverseTransactionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "transaction"})
        }
      """
    )
  
    // @LINE:48
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "transaction"})
        }
      """
    )
  
    // @LINE:47
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:46
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.list",
      """
        function(farmerId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactions/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("farmerId", farmerId0))})
        }
      """
    )
  
  }


}

// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vinay/Projects/playsamples/play-samples/play-java-ebean-example/conf/routes
// @DATE:Sat Mar 14 12:59:03 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:101
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:101
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:26
  class ReverseLandController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "land")
    }
  
    // @LINE:28
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "land")
    }
  
    // @LINE:27
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "land/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:26
    def list(farmerId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "land/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("farmerId", farmerId)))
    }
  
  }

  // @LINE:36
  class ReverseUserCropController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "userCrop")
    }
  
    // @LINE:38
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userCrop")
    }
  
    // @LINE:37
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userCrop/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:36
    def list(farmerId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userCrops/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("farmerId", farmerId)))
    }
  
  }

  // @LINE:67
  class ReverseTransactionReasonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "transactionReason")
    }
  
    // @LINE:69
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "transactionReason")
    }
  
    // @LINE:68
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transactionReason/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:67
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transactionReason")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:98
    def delete(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "computers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:91
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "computers")
    }
  
    // @LINE:87
    def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "computers" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)))))
    }
  
    // @LINE:95
    def update(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "computers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:90
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "computers/new")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:94
    def edit(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "computers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:57
  class ReverseCropController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "crop")
    }
  
    // @LINE:59
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "crop")
    }
  
    // @LINE:58
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "crop/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:57
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "crop")
    }
  
  }

  // @LINE:77
  class ReverseSoilController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:80
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "soil")
    }
  
    // @LINE:79
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "soil")
    }
  
    // @LINE:78
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "soil/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:77
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "soil")
    }
  
  }

  // @LINE:7
  class ReverseDriverController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "driver/update")
    }
  
    // @LINE:9
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "driver")
    }
  
    // @LINE:8
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "driver/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "driver")
    }
  
  }

  // @LINE:16
  class ReverseFarmerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "farmer")
    }
  
    // @LINE:18
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "farmer")
    }
  
    // @LINE:17
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "farmer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:16
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "farmer")
    }
  
  }

  // @LINE:46
  class ReverseTransactionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "transaction")
    }
  
    // @LINE:48
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "transaction")
    }
  
    // @LINE:47
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:46
    def list(farmerId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transactions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("farmerId", farmerId)))
    }
  
  }


}

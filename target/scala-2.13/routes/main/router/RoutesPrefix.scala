// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vinay/Projects/playsamples/play-samples/play-java-ebean-example/conf/routes
// @DATE:Sat Mar 14 12:59:03 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

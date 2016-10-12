// @SOURCE:/Users/mnyamor/Desktop/front-end-dev-recruitment-task/conf/routes
// @HASH:2316349d19193cc284b4716aed259ab03e7dcfab
// @DATE:Tue Oct 04 13:24:40 BST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
// @LINE:10
class ReverseAssets {


// @LINE:13
// @LINE:10
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:10
case (file) if file == "photos.json" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "photos.json")))
  Call("GET", _prefix + { _defaultPrefix } + "api/photos")
                                         
// @LINE:13
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def handleForm(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "handleForm")
}
                        

// @LINE:8
// @LINE:6
def index(): Call = {
   () match {
// @LINE:6
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix)
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:13
// @LINE:10
class ReverseAssets {


// @LINE:13
// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (file == """ + implicitly[JavascriptLitteral[String]].to("photos.json") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/photos"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def handleForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.handleForm",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "handleForm"})
      }
   """
)
                        

// @LINE:8
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "handleForm"})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
// @LINE:10
class ReverseAssets {


// @LINE:10
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """api/photos""")
)
                      

}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def handleForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.handleForm(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "handleForm", Seq(), "POST", """""", _prefix + """handleForm""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    
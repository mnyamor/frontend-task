
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Boolean,Map[String, String],Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, formSuccess: Boolean, values: Map[String,String], errors: Map[String,String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.95*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>"""),_display_(/*9.13*/title),format.raw/*9.18*/("""</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" media="screen" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.at("stylesheets/css.css")),format.raw/*12.89*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.at("stylesheets/less.css")),format.raw/*13.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.55*/routes/*14.61*/.Assets.at("images/favicon.png")),format.raw/*14.93*/("""">

     <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
     <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
     <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!--[if (gte IE 6)&(lte IE 8)]>
      <script src="https://cdn.jsdelivr.net/selectivizr/1.0.3b/selectivizr.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <!-- Fixed navbar -->
    <header>
      <nav class="navbar navbar-inverse navbar-fixed-top navbar-tall">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand title" href="#">Some really cool title font here</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#photos">Photos</a></li>
            <li class=""><a href="#signup">Sign up <span class="sr-only">(current)</span></a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
      </nav>
    </header>
    <!-- /.End Fixed navbar -->

    <!-- Content container -->
    <div class="container">
      <!-- photos  -->
      <div class="row photo-container">
        <div id="photos">
        </div>
      </div>

      <!-- text -->
       <div class="row">
         <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="text-content">
            <p class="custom-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas lobortis ligula sit amet sodales eleifend. Ut ut consequat nisl, vitae ultrices mi. Nam aliquam sagittis magna, ac pulvinar tellus cursus sed. Nulla pretium est ligula, ut dictum odio vestibulum vel. Donec tincidunt metus eget convallis cursus. Mauris in purus sapien. Ut ut imperdiet elit, quis lacinia mauris. Vivamus nec justo fermentum, commodo risus nec, venenatis orci. Sed ac sapien sed urna varius laoreet. Aliquam convallis, ligula nec pharetra imperdiet, risus arcu vestibulum turpis, a lacinia ex massa ut ante. Maecenas commodo ligula non efficitur pretium. Quisque scelerisque suscipit sapien, id pellentesque turpis porttitor ut.</p>
        </div>
      </div>
       <!-- form  -->
      <div class="row" >
        <!-- form contents  -->
        <div class="form-contnets" id="signup">
          <!-- form title  -->
          <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" >
            <div class="page-header custom-page-header"><h4>Sign Up</h4></div>
          </div>
          <form class="form col-xs-12 col-sm-12 col-md-12 col-lg-12" action="handleForm" method="post" class="form-horizontal">
              <!--messages -->
              <div class="errorContainer """),_display_(/*75.43*/if(errors.nonEmpty)/*75.62*/{_display_(Seq[Any](format.raw/*75.63*/("""hasErrors""")))}),format.raw/*75.73*/("""">There were some errors in the sign-up form you submitted.</div>
              <div class="successContainer """),_display_(/*76.45*/if(formSuccess)/*76.60*/{_display_(Seq[Any](format.raw/*76.61*/("""success""")))}),format.raw/*76.69*/("""">Congratulations!</div>
              <div class="row"> 
                <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 form-column">
                  <div class="row">  
                   <!--left -->
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 left-column"> 
                      <!--fullname   -->
                      <div class="form-group">
                        <label for="fullName" class=""""),_display_(/*84.55*/if(errors.contains("fullName"))/*84.86*/{_display_(Seq[Any](format.raw/*84.87*/("""error""")))}),format.raw/*84.93*/(""" """),format.raw/*84.94*/("""col-lg-4 custom-row">Full name</label>
                          <input id="fullName" type="text" name="fullName" class="form-control """),_display_(/*85.97*/if(errors.contains("fullName"))/*85.128*/{_display_(Seq[Any](format.raw/*85.129*/("""error""")))}),format.raw/*85.135*/(""" """),format.raw/*85.136*/("""col-lg-8" required="required" value=""""),_display_(/*85.174*/values/*85.180*/.getOrElse("fullName","")),format.raw/*85.205*/("""" data-error="Full name is required.">
                          <div class="help-block with-errors"> 
                            """),_display_(/*87.30*/errors/*87.36*/.getOrElse("fullName","")),format.raw/*87.61*/("""
                          """),format.raw/*88.27*/("""</div>
                      </div>
                      <!--Email -->
                       <div class="form-group">
                        <label for="email" class=""""),_display_(/*92.52*/if(errors.contains("email"))/*92.80*/{_display_(Seq[Any](format.raw/*92.81*/("""error""")))}),format.raw/*92.87*/(""" """),format.raw/*92.88*/("""col-lg-4 custom-row" >Email</label>
                          <input id="email" type="email" name="email" class="form-control """),_display_(/*93.92*/if(errors.contains("email"))/*93.120*/{_display_(Seq[Any](format.raw/*93.121*/("""error""")))}),format.raw/*93.127*/(""" """),format.raw/*93.128*/("""col-lg-8"  required="required" value=""""),_display_(/*93.167*/values/*93.173*/.getOrElse("email","")),format.raw/*93.195*/(""""  data-error="Valid email is required.">
                        <div class="help-block with-errors"> 
                          """),_display_(/*95.28*/errors/*95.34*/.getOrElse("email","")),format.raw/*95.56*/("""
                        """),format.raw/*96.25*/("""</div>
                      </div>
                      <!--Street address -->
                      <div class="form-group">
                        <label for="addressStreet" class=""""),_display_(/*100.60*/if(errors.contains("addressStreet"))/*100.96*/{_display_(Seq[Any](format.raw/*100.97*/("""error""")))}),format.raw/*100.103*/(""" """),format.raw/*100.104*/("""col-lg-4 custom-row">Street address </label>
                          <input id="addressStreet" type="text" name="addressStreet" class="form-control """),_display_(/*101.107*/if(errors.contains("addressStreet"))/*101.143*/{_display_(Seq[Any](format.raw/*101.144*/("""error""")))}),format.raw/*101.150*/(""" """),format.raw/*101.151*/("""col-lg-8" required="required" value=""""),_display_(/*101.189*/values/*101.195*/.getOrElse("addressStreet","")),format.raw/*101.225*/(""""  data-error=""""),_display_(/*101.241*/errors/*101.247*/.getOrElse("addressStreet","")),format.raw/*101.277*/("""" >
                        <div class="help-block with-errors">
                           """),_display_(/*103.29*/errors/*103.35*/.getOrElse("addressStreet","")),format.raw/*103.65*/("""
                        """),format.raw/*104.25*/("""</div>
                      </div>
                    </div>
                    <!--right -->
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 right-column">
                      <!--Postal code   -->
                      <div class="form-group">
                        <label for="addressPostalCode" class=""""),_display_(/*111.64*/if(errors.contains("addressPostalCode"))/*111.104*/{_display_(Seq[Any](format.raw/*111.105*/("""error""")))}),format.raw/*111.111*/(""" """),format.raw/*111.112*/("""col-lg-4 custom-row">Postal code</label>
                        <input id="addressPostalCode" type="text" name="addressPostalCode" class="form-control """),_display_(/*112.113*/if(errors.contains("addressPostalCode"))/*112.153*/{_display_(Seq[Any](format.raw/*112.154*/("""error""")))}),format.raw/*112.160*/(""" """),format.raw/*112.161*/("""col-lg-8"  required="required" value=""""),_display_(/*112.200*/values/*112.206*/.getOrElse("addressPostalCode","")),format.raw/*112.240*/("""" data-error=""""),_display_(/*112.255*/errors/*112.261*/.getOrElse("addressPostalCode","")),format.raw/*112.295*/("""" >
                        <div class="help-block with-errors">
                          """),_display_(/*114.28*/errors/*114.34*/.getOrElse("addressPostalCode","")),format.raw/*114.68*/("""
                        """),format.raw/*115.25*/("""</div>
                      </div>
                      <!--Post office -->
                      <div class="form-group">
                        <label for="addressPostOffice" class=""""),_display_(/*119.64*/if(errors.contains("addressPostOffice"))/*119.104*/{_display_(Seq[Any](format.raw/*119.105*/("""error""")))}),format.raw/*119.111*/(""" """),format.raw/*119.112*/("""col-lg-4 custom-row">Post office</label>
                        <input id="addressPostOffice" type="text" name="addressPostOffice" class="form-control """),_display_(/*120.113*/if(errors.contains("addressPostOffice"))/*120.153*/{_display_(Seq[Any](format.raw/*120.154*/("""error""")))}),format.raw/*120.160*/(""" """),format.raw/*120.161*/("""col-lg-8" required="required" value=""""),_display_(/*120.199*/values/*120.205*/.getOrElse("addressPostOffice","")),format.raw/*120.239*/(""""  data-error=""""),_display_(/*120.255*/errors/*120.261*/.getOrElse("addressPostOffice","")),format.raw/*120.295*/("""" >
                        <div class="help-block with-errors">
                          """),_display_(/*122.28*/errors/*122.34*/.getOrElse("addressPostOffice","")),format.raw/*122.68*/("""
                        """),format.raw/*123.25*/("""</div>  
                      </div>
                      <!--Message -->
                      <div class="form-group">
                        <label for="message" class=""""),_display_(/*127.54*/if(errors.contains("message"))/*127.84*/{_display_(Seq[Any](format.raw/*127.85*/("""error""")))}),format.raw/*127.91*/(""" """),format.raw/*127.92*/("""col-lg-4 custom-row">Message</label>
                        <textarea id="message" name="message" class="form-control """),_display_(/*128.84*/if(errors.contains("message"))/*128.114*/{_display_(Seq[Any](format.raw/*128.115*/("""error""")))}),format.raw/*128.121*/(""" """),format.raw/*128.122*/("""col-lg-8" rows="4"  required="required" data-error="Please,leave us a message."></textarea>
                        <div class="help-block with-errors">
                          """),_display_(/*130.28*/errors/*130.34*/.getOrElse("message","")),format.raw/*130.58*/("""
                        """),format.raw/*131.25*/("""</div>        
                      </div>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 custom-btn">
                      <input type="submit" class="btn btn-success btn-send pull-right " value="Submit">
                    </div><!-- ./col-md-12  -->       
                  </div><!-- ./row  -->
                </div><!-- ./col-xs-12 col-sm-12 col-md-6 col-lg-6  -->
              </div><!-- ./row  -->
          </form><!-- ./form  -->
        </div><!-- ./form contents  -->
      </div><!-- ./row  -->
    </div>
    <!-- ./ end content container  -->

    <!-- footer  -->
    <footer>
      <div class="container">
        <div class="row">
          <div class="col-xs-6">&copy; Mary Nyamor</div>
          <div class="col-xs-6 text-right">Canter Oy</div>
        </div>
      </div>
    </footer>
    <!-- ./ end footer  -->

    <!-- jQuery, Bootstrap and Photos.js scripts -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src=""""),_display_(/*159.19*/routes/*159.25*/.Assets.at("javascripts/photos.js")),format.raw/*159.60*/("""" type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.1/js/bootstrap.min.js"></script>
  </body>
</html>
"""))}
  }

  def render(title:String,formSuccess:Boolean,values:Map[String, String],errors:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(title,formSuccess,values,errors)

  def f:((String,Boolean,Map[String, String],Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (title,formSuccess,values,errors) => apply(title,formSuccess,values,errors)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 12 14:23:13 BST 2016
                  SOURCE: /Users/mnyamor/Desktop/front-end-dev-recruitment-task/app/views/main.scala.html
                  HASH: 814110211244815abdfca869df339fcea0fc66e0
                  MATRIX: 552->1|733->94|760->95|999->308|1024->313|1246->508|1261->514|1315->547|1394->599|1409->605|1464->639|1548->696|1563->702|1616->734|4817->3908|4845->3927|4884->3928|4925->3938|5062->4048|5086->4063|5125->4064|5164->4072|5626->4507|5666->4538|5705->4539|5742->4545|5771->4546|5933->4681|5974->4712|6014->4713|6052->4719|6082->4720|6148->4758|6164->4764|6211->4789|6370->4921|6385->4927|6431->4952|6486->4979|6684->5150|6721->5178|6760->5179|6797->5185|6826->5186|6980->5313|7018->5341|7058->5342|7096->5348|7126->5349|7193->5388|7209->5394|7253->5416|7411->5547|7426->5553|7469->5575|7522->5600|7737->5787|7783->5823|7823->5824|7862->5830|7893->5831|8073->5982|8120->6018|8161->6019|8200->6025|8231->6026|8298->6064|8315->6070|8368->6100|8413->6116|8430->6122|8483->6152|8604->6245|8620->6251|8672->6281|8726->6306|9090->6642|9141->6682|9182->6683|9221->6689|9252->6690|9434->6843|9485->6883|9526->6884|9565->6890|9596->6891|9664->6930|9681->6936|9738->6970|9782->6985|9799->6991|9856->7025|9976->7117|9992->7123|10048->7157|10102->7182|10318->7370|10369->7410|10410->7411|10449->7417|10480->7418|10662->7571|10713->7611|10754->7612|10793->7618|10824->7619|10891->7657|10908->7663|10965->7697|11010->7713|11027->7719|11084->7753|11204->7845|11220->7851|11276->7885|11330->7910|11534->8086|11574->8116|11614->8117|11652->8123|11682->8124|11830->8244|11871->8274|11912->8275|11951->8281|11982->8282|12190->8462|12206->8468|12252->8492|12306->8517|13386->9569|13402->9575|13459->9610
                  LINES: 19->1|22->1|23->2|30->9|30->9|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|96->75|96->75|96->75|96->75|97->76|97->76|97->76|97->76|105->84|105->84|105->84|105->84|105->84|106->85|106->85|106->85|106->85|106->85|106->85|106->85|106->85|108->87|108->87|108->87|109->88|113->92|113->92|113->92|113->92|113->92|114->93|114->93|114->93|114->93|114->93|114->93|114->93|114->93|116->95|116->95|116->95|117->96|121->100|121->100|121->100|121->100|121->100|122->101|122->101|122->101|122->101|122->101|122->101|122->101|122->101|122->101|122->101|122->101|124->103|124->103|124->103|125->104|132->111|132->111|132->111|132->111|132->111|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|135->114|135->114|135->114|136->115|140->119|140->119|140->119|140->119|140->119|141->120|141->120|141->120|141->120|141->120|141->120|141->120|141->120|141->120|141->120|141->120|143->122|143->122|143->122|144->123|148->127|148->127|148->127|148->127|148->127|149->128|149->128|149->128|149->128|149->128|151->130|151->130|151->130|152->131|180->159|180->159|180->159
                  -- GENERATED --
              */
          
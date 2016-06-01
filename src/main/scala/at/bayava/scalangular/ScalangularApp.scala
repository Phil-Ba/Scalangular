package at.bayava.scalangular

import at.bayava.scalangular.controller.UserController
import biz.enef.angulate._

import scala.scalajs.js.JSApp

/**
	* Created by philba on 6/1/16.
	*/
object ScalangularApp extends JSApp {

	def main() = {
		val module = angular.createModule("app", Seq("ui.bootstrap"))
//		val module = angular.createModule("app", Seq("ui.bootstrap", "ngRoute"))

		//	module.serviceOf[UserService]
		// - or, setting the service name explicitly:
		// module.serviceOf[UserService]("uservice")

		module.controllerOf[UserController]("usrCtrl")
		// - or, setting the controller name explicitly:
		// module.controllerOf[UserCtrl]("Users")

		//C	module.directiveOf[UserDirective]
		// - or, setting the directive name explicitly:
		// module.directiveOf[UserDirective]("person")

//		module.config(($routeProvider: RouteProvider) => {
//			$routeProvider.
//				when("/user/:id", Route(templateUrl = "/tpl/userDetails.html")).
//				otherwise(Route(redirectTo = "/"))
//		})

//				module.run(initApp _)


	}
}

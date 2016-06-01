package at.bayava.scalangular.controller

import at.bayava.scalangular.model.User
import biz.enef.angulate.Controller

/**
	* Created by philba on 6/1/16.
	*/
class UserController extends Controller {

	var user: User = new User

	var count = 0

	def inc() = count += 1

	def dec() = count -= 1

}

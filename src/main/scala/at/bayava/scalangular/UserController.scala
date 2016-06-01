package at.bayava.scalangular.controller


import biz.enef.angulate.Controller

/**
	* Created by philba on 6/1/16.
	*/
class UserController extends Controller {

	var count = 0

	def inc() = count += 1

	def dec() = count -= 1

}

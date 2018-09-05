(function() {
	'use strict';
	angular.module('tasksManager', [ 'ngRoute' ]).config(
			function($routeProvider) {
				$routeProvider.when('/', {
					templateUrl : 'views/tasksTable.html',
					controller : 'TasksController',
					controllerAs : 'TasksCtrl'
				}).otherwise({
					redirectTo : '/'
				});

			});

})();
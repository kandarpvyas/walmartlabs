(function() {
	'use strict';
	angular
			.module('tasksManager')
			.controller(
					'TasksController',
					[
							'$scope',
							'tasksFactory',
							function($scope, tasksFactory) {
								// Initial page will be 1 and initial size will
								// be 10
								tasksFactory.findPageable(1, 10, function(
										response) {
									$scope.tasks = response;
								});
								$scope.sortBy = function(propertyName) {
									$scope.reverse = ($scope.propertyName === propertyName) ? !$scope.reverse
											: false;
									$scope.propertyName = propertyName;
								};
							} ]);
})();
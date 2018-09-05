(function() {
	'use strict';

	angular.module('tasksManager').factory(
			'tasksFactory',
			[
					'$http',
					function($http) {
						return {
							findPageable : function(page, size, callback) {
								$http.get('/page/' + page + '/size/' + size)
										.success(callback);
							}
						}
					} ]);
})();
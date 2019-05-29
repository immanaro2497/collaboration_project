myApp.controller("JobController", function($scope,$location,$rootScope) {
	$scope.job={jobDesignation:'',companyName:'',CTC:'',jobLocation:'',lastDate:'',skills:''};
	$scope.addJob=function() {
	      console.log($scope.job);
	      $location.path("/job");
      }
});
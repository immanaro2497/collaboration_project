myApp.controller("ForumController", function($scope,$location,$rootScope) {
	$scope.forum={forumName:'', forumContent:'',username:'',createDate:'',status:''};
	$scope.addForum=function() {
	      console.log($scope.forum);
	      $location.path("/forum");
      }
});
myApp.controller("BlogController", function($scope,$location,$rootScope) {
	$scope.blog={blogName:'', blogContent:'',username:'',createDate:'',status:'',likes:'',dislikes:''};
	$scope.addBlog=function() {
	      console.log($scope.blog);
	      $location.path("/blog");
      }
});
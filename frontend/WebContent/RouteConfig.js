var myApp=angular.module("myApp",['ngRoute']);

myApp.config(function($routeProvider) {
	
	$routeProvider.when("/login",{templateUrl:"c_user/Login.html"})
                  .when("/register",{templateUrl:"c_user/Register.html"})
	              .when("/blog",{templateUrl:"c_blog/Blog.html"})
	              .when("/blogcomment",{templateUrl:"c_blog/BlogComment.html"})
	              .when("/forum",{templateUrl:"c_forum/Forum.html"})
	              .when("/forumcomment",{templateUrl:"c_forum/ForumComment.html"})
	              .when("/job",{templateUrl:"c_job/Job.html"})
	              .when("/friend",{templateUrl:"c_friend/Friend.html"})
	              .when("/contactus",{templateUrl:"c_view/ContactUs.html"})
	              .when("/aboutus",{templateUrl:"c_view/AboutUs.html"});
	              
	
});
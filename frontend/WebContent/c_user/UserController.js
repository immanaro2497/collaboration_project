myApp.controller("UserController", function($scope,$location,$rootScope) {
	$scope.userDetail={username:'', firstname:'', lastname:'', password:'', emailId:'', role:'', status:'', isOnline:''};
    $scope.checkUser=function() {
	      console.log($scope.userDetail);
        }
     $scope.addUser= function() {
	  $scope.userDetail.role="ROLE_USER;"
	  $scope.userDetail.status='Y';
      $scope.userDetail.isOnline='N';
      console.log($scope.userDetail);
      $location.path("/login");
     } 
});

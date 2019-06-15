myApp.controller("FriendController",function($scope,$location,$rootScope,$http,$cookieStore) {
	
	$scope.friend={friendId:0, username:'', friendusername:'', friendFirstName:'', friendLastName:'', status:''};
    $scope.showFriends;
	
    function showFriends() {
    	 $http.get('http://localhost:8080/middleware/showFriendList/'+$rootScope.currentUser.username)
    	 .then(function(response) {
    		 console.log("Showing Friends");
    		 $scope.showFriends=response.data;
    	 },
    	 function(errresponse) {
    		 console.log("Error showing Friends");
    	 }); 			 
    }
    
    showFriends();

});
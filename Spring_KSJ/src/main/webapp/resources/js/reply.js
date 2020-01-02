var bno = 1;

$.getJSON("../replies/all/"+bno,function(data){
	alert(data);
	console.log(data.length);
})

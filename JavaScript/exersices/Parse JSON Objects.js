function solve(input) {
	let result = [];
	for (var i = 0; i < input.length; i++) {
		result.push(JSON.parse(input[i]));
	}
	
	for (let i = 0; i < result.length; i++) {
		for ( var key in result[i]) {
			console.log(`${key[0].toUpperCase() + key.slice(1)}: ${result[i][key]}` )
		}	
	}
}

solve(['{"name":"Gosho","age":10,"date":"19/06/2005"}', 
	'{"name":"Tosho","age":11,"date":"04/04/2005"}'])
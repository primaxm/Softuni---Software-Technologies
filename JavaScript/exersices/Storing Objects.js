function solve(input) {
	let result = [];
	for (let i = 0; i < input.length; i++) {
		let sp = input[i].split(' -> ');
		let obj = {};
		obj.Name = sp[0];
		obj.Age = sp[1];
		obj.Grade = Number(sp[2]).toFixed(2);
		result.push(obj);
	}
	
	for (let i = 0; i < result.length; i++) {
		for ( var key in result[i]) {
			console.log(`${key}: ${result[i][key]}` )
		}	
	}
}

solve(['Pesho -> 13 -> 6.0', 'Ivan -> 12 -> 5.57', 'Toni > 13 -> 4.90'])
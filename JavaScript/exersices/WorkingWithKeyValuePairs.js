function solve(input) {
	let result = [];
	for (var i = 0; i < input.length - 1; i++) {
		let sp = input[i].split(' ');
		result[sp[0]] = sp[1];
	}
	if(input[input.length - 1] in result) {
		console.log(result[input[input.length - 1]]);
	} else {
		console.log('None');
	}
	
}

solve(['kluch stoinost', 'kluch druga', 'test tset', 'kluch']);
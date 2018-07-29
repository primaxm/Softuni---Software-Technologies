function solve(input) {
	let result = [];
	
	for (var i = 0; i < input.length - 1; i++) {
		let sp = input[i].split(' ');
		if (!(sp[0] in result)) {
			result[sp[0]] = [];
		}
		result[sp[0]].push(sp[1]);
	}
	
	
	if(input[input.length - 1] in result) {
		console.log(result[input[input.length - 1]].join('\n'));
	} else {
		console.log('None');
	}
	
}

solve(['kluch stoinost', 'kluch druga', 'test tset', 'kluch']);
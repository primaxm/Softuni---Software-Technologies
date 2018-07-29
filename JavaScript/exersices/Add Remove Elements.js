function solve(input) {
	let result = [];
	
	for (let i = 0; i < input.length; i++) {
		let sp = input[i].split(' ');
		
		if (sp[0] === 'add') {
			result.push(Number(sp[1]));
		} else if (sp[0] === 'remove') {
			if (sp[1] in result) {
				result.splice(sp[1], 1);
			}
		}
	}
	
	console.log(result.join('\n'));
}

//solve(['add 0', 'add 3', 'remove 2', 'add 4', 'add 2']);
//solve(['add 3', 'add 5', 'remove 1', 'add 2']);
solve(['add 3', 'add 5', 'remove 2', 'remove 0', 'add 7']);
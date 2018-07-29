function solve(input) {
	let result = {};
	for (var i = 0; i < input.length; i++) {
		let sp = input[i].split(' -> ');
		if (sp[0] === 'age' || sp[0] === 'grade') {
			sp[1] = Number(sp[1]);
		}
		result[sp[0]] = sp[1];
	}
	
	console.log(JSON.stringify(result));
}

solve(['name -> Angel',
	'surname -> Georgiev',
	'age -> 20',
	'grade -> 6.00',
	'date -> 23/05/1995',
	'town -> Sofia'])

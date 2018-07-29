function solve(input) {
	for ( var element of input) {
		if (element !== 'Stop') {
			console.log(element);
		} else {
			break;
		}
	}
}

solve(['Line 1', 'Line 2', 'Line 3', 'Line 4', 'stop', 'line 6']);
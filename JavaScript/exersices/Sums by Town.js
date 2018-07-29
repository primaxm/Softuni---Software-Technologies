function solve(input) {
	let towns = [];
	
	for (let i = 0; i < input.length; i++) {
		let arr = JSON.parse(input[i]);
		
		objIndex = towns.findIndex((towns => towns.town === arr.town));
		
		if (objIndex >= 0) {
			towns[objIndex].income += arr.income;
		} else {
			towns.push(arr);
		}
	}

	towns.sort(function(a, b) {
		  let nameA = a.town.toUpperCase(); // ignore upper and lowercase
		  let nameB = b.town.toUpperCase(); // ignore upper and lowercase
		  if (nameA < nameB) {
		    return -1;
		  }
		  if (nameA > nameB) {
		    return 1;
		  }

		  // names must be equal
		  return 0;
		});
	for (let element in towns) {
		console.log(`${towns[element].town} -> ${towns[element].income}`)
	}
}

solve([
	'{"town":"Sofia","income":200}',
	'{"town":"Varna","income":120}',
	'{"town":"Pleven","income":60}',
	'{"town":"Varna","income":70}'	
])
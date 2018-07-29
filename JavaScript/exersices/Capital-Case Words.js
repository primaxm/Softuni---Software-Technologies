function solve(input) {
	let result = [];
	for (let b = 0; b < input.length; b++) {
		let arr = input[b].split(/[^A-Za-z]/).filter((val) => val != '');
		
		
		for (let i = 0; i < arr.length; i++) {
			let cap = true;
			for (let s = 0; s < arr[i].length; s++) {
				if (arr[i][s] == arr[i][s].toLowerCase()) {
					cap = false;
				}
			}
			if (cap === true) {
				result.push(arr[i]);
			}
		}
	}

	
	console.log(result.join(", "));
}

solve(['We start by HTML, CSS, JavaScript, JSON and REST. Later we touch some PHP, MySQL and SQL. Later we play with C#, EF, SQL Server and ASP.NET MVC. Finally, we touch some Java, Hibernate and Spring.MVC.']);